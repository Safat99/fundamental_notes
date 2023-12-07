# JasperReport generation with Spring Boot

Steps:
1.  Download and install Jaspersoft Studio	
2.  Design a report on it. This video is super helpful. [How to fill Jasper Table using Collection of data using Java?](https://www.youtube.com/watch?v=fZtnoQpPzaw&t=1417s&ab_channel=CoolITHelp)
	* create a project
	*  Add tables, headers, and footers and create the design according to the requirements.
	* Add the parameters and fields for showing and receiving dynamic input-outputs.
	* Preview and generate the source file. JasperReport Studio will make the source file automatically according to the design
3. Copy the source file. It will be a .jrxml file. Suppose we have named that `invoice-report-test.jrxml`.
4. Place that JRXML file under the spring boot project’s resource file. Like this:
```
resources/
├── application.properties
├── error_code.json
├── mail.properties
└── templates
    ├── emailTemplate.html
    └── invoice-report-test.jrxml >>> here is the source file
```
5.  Add the following dependencies to the `pom.xml` file: 
```
<!--       jasperReport dependency-->  
<dependency>  
    <groupId>net.sf.jasperreports</groupId>  
    <artifactId>jasperreports</artifactId>  
    <version>6.20.6</version>  
</dependency>
  
<!--       needs this dependency for jasper report barcode processing-->  
<dependency>  
    <groupId>net.sf.barcode4j</groupId>  
    <artifactId>barcode4j</artifactId>  
    <version>2.1</version>  
</dependency>  

<!-- needs this dependency for jasper report fill>-->  
<dependency>  
    <groupId>com.google.zxing</groupId>  
    <artifactId>core</artifactId>  
    <version>3.5.2</version>  
</dependency>  

<!--       This dependency is part of Apache Batik, a library for working with Scalable Vector Graphics (SVG)-->  
<dependency>  
    <groupId>org.apache.xmlgraphics</groupId>  
    <artifactId>batik-bridge</artifactId>  
    <version>1.11</version>  
</dependency>  

<!--       need thymeleaf for using emailTemplate.html -->  
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-thymeleaf</artifactId>  
    <version>3.1.4</version>  
</dependency>
```
6.  This is the main necessary code for the generation of the PDF.  Here I am receiving a list of table-row data from the client(Postman) and then wrapping them into my output invoice table(generated in the PDF file):
```
public static byte[] generatePdfBytes(List<InvoiceDataDto> invoiceDataDtoList) throws JRException {  
    // PDF generation logic  
  InputStream templateInputStream = FileUtil.class.getResourceAsStream("/templates/invoice-report-test.jrxml");  
    JasperReport jasperReport = JasperCompileManager.compileReport(templateInputStream);  
  
    // Create data source (if needed)  
  JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(invoiceDataDtoList);  
  
    // Set parameters (if needed)  
  Map<String, Object> params = new HashMap<>();  
    String invoiceNo = generateInvoiceID();  
    String date = formattedCurrentDate();  
  
    params.put("invoice_no", invoiceNo);  
    params.put("CollectionBeanParam", dataSource);  
    params.put("date", date);  
  
    // Fill the report  
  JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());  
  
    // Export the report to a PDF file  
  byte[] pdfBytes;  
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {  
        JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);  
        pdfBytes = outputStream.toByteArray();  
    } catch (IOException e) {  
        throw new BadRequestException("IOException occurred during generating PDF");  
    }  
    return pdfBytes;  
}
```
7. Then use this pdfBytes(byte file) to generate a PDF file. Also, we can extend this as an attachment of a mail.
```
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfFileGenerator {

    public static void main(String[] args) {
        try {
            List<InvoiceDataDto> invoiceDataDtoList = // Initialize your data
            byte[] pdfBytes = generatePdfBytes(invoiceDataDtoList);
            writePdfToFile(pdfBytes, "output.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] generatePdfBytes(List<InvoiceDataDto> invoiceDataDtoList) throws JRException {
        // Your existing PDF generation logic...
    }

    public static void writePdfToFile(byte[] pdfBytes, String filePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
            fos.write(pdfBytes);
        }
    }
}
```