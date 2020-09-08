package com.twc.javaBasic;

import com.twc.javaBasic.util.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InheritanceTest {
    @Test
   public  void should_be_derived_from_object_class() {
        // TODO:
        //  Please write down the class type directly.
        //
        // <--start
        //final Class<?> expectedSuperClass = null;
        final Class<?> expectedSuperClass = SimpleEmptyClass.class.getClass();
        //getClass(),返回该对象的运行时类的Java.lang.Class对象（API上的解释）
        //有方法类型可以知道，该方法只能由类的实例变量调用
        System.out.println(expectedSuperClass.getName());//输出java.lang.Class
        // --end-->
        System.out.println(SimpleEmptyClass.class.getSuperclass().getName());//输出java.lang.Object
        //输出不一致，所以不相等
        assertNotEquals(expectedSuperClass, SimpleEmptyClass.class.getSuperclass());//SimpleEmptyClass类的继承的父类的名字
    }

    @Test
    void should_call_super_class_constructor() {
        DerivedFromSuperClassWithDefaultConstructor instance = new DerivedFromSuperClassWithDefaultConstructor();

        // TODO:
        //  You should write the answer directly.
        // Hint: check https://beginnersbook.com/2013/03/constructors-in-java/
        //
        // <--start
        final String[] expected = {"SuperClassWithDefaultConstructor.constructor()","DerivedFromSuperClassWithDefaultConstructor.constructor()"};
        // --end-->

        String[] logs = instance.getLogs();

        assertArrayEquals(expected, logs);
    }



    @Test
    void should_call_most_derived_methods() {
        BaseClassForOverriding instance = new DerivedFromBaseClassForOverriding();

        // TODO:
        //  You should write the answer directly.
        // Hint: https://beginnersbook.com/2014/01/method-overriding-in-java-with-example/
        // <--start
        final String expectedName = "DerivedFromBaseClassForOverriding";
        // --end-->

        assertEquals(expectedName, instance.getName());//以String形式返回次Class对象所表示的实体名称
    }


    @Test
    void should_call_super_class_methods() {
        DerivedFromBaseClassForOverridingCallingSuper instance = new DerivedFromBaseClassForOverridingCallingSuper();

        // TODO: You should write the answer directly.
        // <--start
        final String expectedName = "BaseClassForOverriding->DerivedFromBaseClassForOverridingCallingSuper";
        // --end-->
        System.out.println("***");
        System.out.println(instance.getName()+"***");
        assertEquals(expectedName, instance.getName());
    }



}
