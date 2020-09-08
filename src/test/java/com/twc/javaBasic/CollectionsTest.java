package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import java.util.*;




import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class CollectionsTest {
    //Hint: https://beginnersbook.com/2013/12/java-arraylist/
    @Test
    void should_go_through_an_iterator() {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        Iterator<String> iterator = collection.iterator();

        // Hint: You should implement createList() in this class.

        assertIterableEquals(Arrays.asList("Hello", "World", "!"), createList(iterator));
    }

    @SuppressWarnings({"unused", "UnnecessaryLocalVariable"})
    private static List<String> createList(Iterator<String> iterator) {
        List<String> list = new ArrayList<>();

        // TODO:
        //  This function will create a list from an iterator. You could ONLY use
        //  `Iterator.hasNext` and `Iterator.next` API to copy items to a `List`.
        //  No `for` is allowed.
        //
        // <--start
        while (iterator.hasNext()){//判断是否存在下一个元素
            list.add(iterator.next());
        }
        // --end-->

        return list;
    }



    @Test
    void should_predict_linked_list_operation_result() {
        LinkedList<String> staff = new LinkedList<>();
        staff.add("Amy");
        staff.add("Bob");
        staff.add("Carl");
        ListIterator<String> iterator = staff.listIterator();
        // iterator.next();
        iterator.add("Juliet");
        iterator.previous();
        iterator.remove();

        // TODO:
        //  Please write your answer directly.
        //
        // <--start
        final List<String> expected = Arrays.asList("Amy","Bob","Carl");

        // --end-->

        assertIterableEquals(expected, staff);
    }

    @Test
    void should_reflects_back_to_original_list_for_sub_range() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 12; ++i) {
            integers.add(i);
        }

       // List<Integer> subList = integers.subList(3, 10);//取左不取右

        //subList.clear();//将list集合中的所有对象都释放了，而且集合也都空了


        // TODO:
        //  Please write down your answer directly.
        //
        // <--start
        final List<Integer> expected = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11);
        // --end-->

        assertIterableEquals(expected, integers);
    }


}
