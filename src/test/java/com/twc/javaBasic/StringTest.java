package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {
    //Hint: String https://beginnersbook.com/2013/12/java-strings/
    //@SuppressWarnings({"StringEquality", "ConstantConditions"})
    //@Test:该方法可以不用main方法调用就可以测试出运行结果，是一种测试方法
    @Test
    void should_be_immutable() {
        String originalString = "The original string";
        String modifiedString = originalString.replace("original", "new");
        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        //assertEquals(expected, actual)：查看两个对象是否相等。类似于字符串比较使用的equals()方法；
        //如果这两值相等的话（通过对象的equals方法比较），说明代码运行是正确的。
        //因为修改后，不相等，所以areSame = false
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The new string", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }


    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void all_modification_method_will_create_new_string() {
        String originalString = "The string with tailing space.     ";
        //trim():删除字符串的头尾空白符
        String modifiedString = originalString.trim();

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The string with tailing space.", modifiedString);
        //因为modifiedString删除了空白符，所以和originalString不相等
        assertEquals(areSame, originalString == modifiedString);
    }



    @SuppressWarnings("StringEquality")
    @Test
    void will_create_new_string_when_concat() {
        String originalString = "Part one. ";
        String copyOfOriginalString = originalString;
        //此时originalString=Part one. Part two.
        originalString += "Part two.";

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("Part one. Part two.", originalString);
        //因为copyOfOriginalString="Part one.",originalString="Part one. Part two."，所以不相等
        assertEquals(areSame, originalString == copyOfOriginalString);
    }

    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words() {
        final String sentence = "This is Mike";

        // TODO: Extract words in the sentence.
        // <--Start
        String cut=" ";
        //按空格分割字符串为字符串数组
        String[] words = sentence.split(cut);
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }



}
