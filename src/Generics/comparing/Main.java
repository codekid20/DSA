package Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student adi = new Student(69, 89.94f);
        Student rahul = new Student(79, 97.44f);
        Student nitta = new Student(49, 95.94f);
        Student rishab = new Student(39, 88.94f);
        Student ayush = new Student(89, 93.94f);

        Student[] list = {adi, rahul, nitta, rishab, ayush};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if (adi.compareTo(rahul) < 0) {
//            System.out.println("rahul has more marks");
//        }

    }
}
