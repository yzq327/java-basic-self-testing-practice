package com.twc.javaBasic;

import com.twc.javaBasic.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericTest { //泛型
  @Test
  void should_auto_resolve_generic_method() {
    final String[] words = {"Hello", "Good", "Morning"};

    // TODO:
    //  The getMiddle method is a generic method. Now, please call getMiddle method for string
    //  type.
    // <--start
   // 里面的var类型为String类型

    final String middle =  getMiddle(words);
    // --end-->
    assertEquals("Good", middle);

  }
  private static <T> T getMiddle(T[] args) {
    return args[args.length / 2];
  }


  @Test
  void should_specify_a_type_restriction_on_typed_parameters() {
    // Hint: please implement the min() method in this class.
    int minimumInteger = min(new Integer[] {1, 2, 3});
    System.out.println(minimumInteger);

    double minimumReal = min(new Double[] {1.2, 2.2, -1d});
    System.out.println(minimumInteger);

    assertEquals(1, minimumInteger);
    assertEquals(-1d, minimumReal, 1.0E-05);
  }
  // TODO:
  //  please implement the following code to pass the test. It should be generic
  //  after all. The method should only accept `Number` and the number should
  //  implement `Comparable<T>`.
  //  You should not change the signature of the function. But you can change
  //  the declaration of the generic type parameter.
  // <--start
  private static <T extends Comparable<T>> T min(T[] values) {
    T min=values[0];
    for (int i=0;i<values.length;i++){
      if(min.compareTo(values[i])>0){
          min=values[i];
      }
    }
    return min;
  }
  // --end-->


  @Test
  void should_swap() {
    Pair<String> pair = new Pair<>("Hello", "World");

    // Hint: please implement swap() method in this class.
    swap(pair);

    assertEquals("World", pair.getFirst());
    assertEquals("Hello", pair.getSecond());
  }

  // TODO:
  //  please implement following method to pass the test. The method should be able
  //  to swap fields in a pair. But you cannot change the signature of the function.
  //
  // Hint:
  //  A wildcard is not a type variable, so we can’t write code that uses ? as a type.
  // <--start
  private static void swap(Pair<String> pair) { //<?>泛型通配符
    String temp;
    temp=pair.getFirst();
    pair.setFirst(pair.getSecond());
    pair.setSecond(temp);

  }





  // TODO: You can add additional method within the range if you like

  // --end--


}
