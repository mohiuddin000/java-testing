package calculationstrategy;

public class strategyPattern {
    public static void main(String[] args) {
        calculation C = new addition();
        System.out.println(C.performeCalculation(5, 1));
    }
}
