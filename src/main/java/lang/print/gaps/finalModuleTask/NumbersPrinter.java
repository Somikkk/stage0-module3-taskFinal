package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        boolean isPositive = (number > 0);
        System.out.println(isPositive);
    }

    public static void main(String[] args) {
        new NumbersPrinter().printIsPositive(0);
    }
}
