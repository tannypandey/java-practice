public class Main {
    public static void main(String[] args) {
       String answer = adder(3,4);
        System.out.println(answer);
    }

    public static String adder(int a , int b){
        int value = a+b;
        return a + "+" + b + "=" + value;

    }
}

