package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerTypeTest {

    @Test
    public void just_prevent_lazy_implementation() {
        // Hint: you need to implement add() method in this class.
        assertEquals(3, add(1, 2));
    }

    private int add(int left, int right) {
        // TODO:
        //  Please implement the method. Adding two numbers. This method should throw
        //  ArithmeticException if overflow or underflow happens.
        //
        // Hint
        //  Java library contains method to do this. If you meet some difficulties
        //  here please refer to the following document:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#addExact-int-int-
        //throw new RuntimeException("Not implemented");
        int result = 0;
        try{
            result=left+right;

        }catch(ArithmeticException e) {

            System.out.println("出现异常");
        }
        return result;
    }


    @SuppressWarnings("PointlessArithmeticExpression")
    @Test
    public void should_take_care_of_number_type_when_doing_calculation() {
        final double result1 = 2 / 3 * 5;//2/3=0.0因为/这个表示整除，整除后结果是0，然后隐士转换成double型就是0.0
        final double result2 = 2 * 5 / 3;//结果为3

        // TODO:
        //  please modify the following lines to pass the test.
        //
        // Hint:
        //  If you want some reference please see page 59 of "Core Java Vol 1", section 3.5.2.
        // <!--start
        final double expectedResult1 = 0.0;
        final double expectedResult2 = 3.0;
        // --end-->

        assertEquals(expectedResult1, result1, +1.0E-05);
        assertEquals(expectedResult2, result2, +1.0E-05);
    }


    @Test
    public void should_truncate_number_when_casting() {
        final int integer = 0x0123_4567;//0X表示十六进制，输出19088743
        //一个int类型占32bits(4字节)，一个short占16bits(2字节)
        //强制转换时只取低16位(short类型占的那16位)，高16位(去掉低位多出来的那部分)属于溢出不计算，然后以二进制值与低16位的最大值执行按位与计算，得到最终结果
        final short smallerInteger = (short)integer;

        // TODO:
        //  please modify the following lines to pass the test. Please refer to page 60 of "Core Java Vol 1", section 3.5.3.
        // <!--start
        final short expected = 17767;
        // --end-->

        assertEquals(expected, smallerInteger);
    }

    @Test
    public void should_increment() {
        int integer = 3;

        int result = integer++;


        // TODO:
        //  please modify the following code to pass the test. You should write the
        //  result directly.
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 3;

        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @Test
    public void should_increment_2() {
        int integer = 3;

        int result = ++integer;

        // TODO:
        //   please modify the following code to pass the test. You should write the
        //   result directly.
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 4;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }



}
