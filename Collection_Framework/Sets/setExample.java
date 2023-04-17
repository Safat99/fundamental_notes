package Sets;

import java.util.*;

public class setExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<String>();

        names.add("safat");
        names.add("rafat");
        names.add("rifat");
        names.add("arafat");

        System.out.println(names);
        System.out.println("size of the set: " + names.size());

        names.forEach(System.out::println);

        System.out.println("-----");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
           System.out.println(namesIterator.next());
        }

        // remove duplicates from list with Set
        System.out.println();
        System.out.println();
        List<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(100);
        nums.add(2);
        nums.add(2);
        nums.add(300);
        nums.add(300);
        System.out.println("nums as List: " + nums);

        Set<Integer> numsSet = new HashSet<>(nums);
        System.out.println("nums as HashSet: " + numsSet);

        Set<Integer> numsTreeSet = new TreeSet<>(nums);
        System.out.println("nums as TreeSet: " + numsTreeSet);

        Set<Integer> numsLinkedSet = new LinkedHashSet<>(nums);
        System.out.println("nums as LinkedHashSet: " + numsLinkedSet);
    }
}
