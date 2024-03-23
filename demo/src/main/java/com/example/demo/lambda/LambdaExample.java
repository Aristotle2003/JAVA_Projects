package com.example.demo.lambda;

public class LambdaExample {


    public static void main(String[] args) {
//        MyFunction function = new MyFunctionImpl();
//        function.doSomething();

//        MyFunction function = new MyFunction() {
//            @Override
//            public void doSomething() {
//                System.out.println("Hello World!");
//            }
//
//            @Override
//            public void doAnotherthing() {
//                System.out.println(new Date());
//            }
//        };
//
//        function.doSomething();

        MyFunction function = s -> {
            System.out.println(s);
        };
//        MyFunction function1 = ;
//        doExample(function);
//        doExample(function1);
    }

//    public static void doExample(MyFunction function) {
//        function.doSomething();
//    }

}
