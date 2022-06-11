package LL.Questions;

public class Main {
    public static void main(String[] args) {

        // REMOVE DUPLICATES
//        removeDuplicates list = new removeDuplicates();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//
//        list.duplicates();
//
//        list.display();


        // MERGE TWO LISTS
        // TIME: SIZE OF FIRST LIST + SIZE OF SECOND LIST

        mergeLL first = new mergeLL();
        mergeLL second = new mergeLL();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(4);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(4);

        mergeLL ans = mergeLL.merge(first, second);
        ans.display();











    }
}
