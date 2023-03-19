package facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("10 + 10101 in binary= " + bins.sum("10", "10101"));
        System.out.println("11101 + 10101 in binary= " + bins.sum("11101", "10101"));
        System.out.println("1001 * 1100 in binary= " + bins.mult("1001", "1100"));
        System.out.println("10 * 10101 in binary= " + bins.mult("10", "10101"));
    }
}
