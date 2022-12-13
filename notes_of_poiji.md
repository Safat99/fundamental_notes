# Poiji
A tiny thread safe java library that provides **one way** mapping from Excel sheets to java classes

## gradle dependencies
In spring project we have to add this line inside build.gradle file

```
implementation group: 'com.github.ozlerhakan', name: 'poiji', version: '3.1.9'
```

## Annotations
Usage of the basic annotations are given below:

* `@ExcelRow` --> Annotated variable should be type `int`, `long`, `double`, `float` or `long`.

* `@ExcelCell(0), @ExcelCell(1)`, etc --> A field(column) must be annotated with in order to get the value of right coordinate in the sheet (column number)

* `@ExcelCellName("cell_name")` -->> case sensitive, if the excel has duplicate column poiji will not accept it and throw an error.
* `@ExcelSheet("sheet_name")` --> to change sheet in the excel, by default it chooses the sheet1
* `@ExcelCellRange` --> this annotations lets us aggregate a range of information in one objuct model. (it can group some columns to an specific object)

## How to obtain the excel data using poiji

poiji options is useful if we want to to something with the datas like:

* ignore the first row of data
* if we want a date field to return `null` rather than a default value `preferNullOverDefault(true)`


```
PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings()
				.addListDelimiter(";")
				.build();// by default it ignores the first row of the excel file
List<Employee> employee = Poiji.fromExcel(new File("employees.xls"),    Employee.class, options);

employees.size();
// 3
Employee firstEmployee = employees.get(0);
// Employee{rowIndex=1, employeeId=123923, name='Joe', surname='Doe', age=30, single=true, emails=[joe@doe.com, joedoe@gmail.com], biils=[123,10, 99.99]}

```


