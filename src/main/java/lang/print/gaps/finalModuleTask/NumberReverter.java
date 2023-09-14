package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void reverse(int number) {
        int a, result = 0;
        while(number != 0) {
            a = number % 10;
            result = (result * 10) + a;
            number = number / 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new NumberReverter().reverse(0);
    }
}
