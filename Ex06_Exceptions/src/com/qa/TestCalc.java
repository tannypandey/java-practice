package com.qa;

public class TestCalc {
        public static void main(String[] args) {
            BadCalc bc = new BadCalc();
                    try {
                        System.out.println("Div result: " + bc.div(6, 0));
                    } catch (ArithmeticException ae) {
                        System.out.println("Calculation error caught");
                    }
        }
}
