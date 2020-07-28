public class FunctionalInterfaceDemo {
}

//A Functional Interface is an interface which has only and only one abstract method and there is not any restriction on
//the number of default and static methods.

//Mentioned are the examples of valid functional interfaces

interface I1{

    default void demo(){

//        some code

    }

    void m1();

}

interface I2 extends I1{


}

interface I3 extends I1{

    default void demovoidmethod(){

//        some code

    }

}

interface I4{

   default void someMethod(){

//       someCode

   }

   static void anotherMethod(){

//       someMoreCode

   }

    default void someMethod1(){

//       someCode

    }

    static void anotherMethod1(){

//       someMoreCode

    }

    void m4();

}