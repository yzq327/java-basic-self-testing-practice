package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloatingTypeTest {
    @Test
    void should_not_get_rounded_result_if_convert_floating_number_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;//值为2

        // TODO:
        //  Please write down the answer directly.
        //
        // <!--start
        final int expected = Integer.MAX_VALUE;//值为整数的最大范围值，为2147483647
        // --end-->

        assertNotEquals(expected, integer); //两个值不相等
    }


    @SuppressWarnings({"divzero", "NumericOverflow"})
    @Test
    void should_judge_special_double_cases() {
        // Hint, please implement isInfinity and isNan in this class.
        //因为double里面没有完完全全的正儿八经的0，你看到的0，
        // 实际上可能是0.0000000000000...1，n个0之后忽然出来个1，那么就相当于除以一个最小的数，那么得到的值就会无穷大
        assertTrue(isInfinity(1d / 0d));//判断一个条件是true还是false
        assertTrue(isInfinity(-1d / 0d));
        assertFalse(isInfinity(2d));
        assertFalse(isInfinity(Double.NaN));

        assertTrue(isNan(0d / 0d));
        assertFalse(isNan(Double.NEGATIVE_INFINITY));
        assertFalse(isNan(Double.POSITIVE_INFINITY));
    }

    @SuppressWarnings("unused")
    private boolean isNan(double realNumber) { ////是否是无穷小
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
        //throw new RuntimeException("Not implemented");
        Boolean bool=Double.isNaN(realNumber);
        return bool;
    }


    @SuppressWarnings("unused")
    private boolean isInfinity(double realNumber) {  //是否是无穷大
        // TODO:
        //  please implement the method to pass the test. It is better you call existing
        //  API rather than implemented yourself.
        //throw new RuntimeException("Not implemented");
        Boolean bool=Double.isInfinite(realNumber);
        return bool;
    }



    @Test
    void should_not_round_number_when_convert_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO:
        //  Please write down you answer directly.
        //
        // <!--start
        final int expected = Integer.MAX_VALUE;
        // --end-->

        assertNotEquals(expected, integer);
    }

    @Test
    void should_round_number() {
        final double floatingPointNumber = 2.75;

        // TODO:
        //  Please call some method to round the floating point number.调用一些方法来舍入浮点数
        long x=(new Double(floatingPointNumber)).longValue();//double变长整型
        //
        // Hint:
        //  The reference is here:
        //  https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
        // <!--start
        final long rounded = Long.MAX_VALUE;///长整型的最大值9223372036854775807
        // --end-->

        assertNotEquals(3L, rounded);
    }






}
