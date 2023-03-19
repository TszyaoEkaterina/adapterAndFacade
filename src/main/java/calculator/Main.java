package calculator;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println("2+2= " + intsCalc.sum(2, 2));
        System.out.println("10+22= " + intsCalc.sum(10, 22));
        System.out.println("2^10= " + intsCalc.pow(2, 10));
        System.out.println("50*20= " + intsCalc.mult(50, 20));
    }
}
