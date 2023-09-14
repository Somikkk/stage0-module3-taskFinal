package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        //tF = 1.8tC + 35 tF - фаренгейт, tC - цельсий
        System.out.println(1.8 * temperatureCelsius + 32);
    }

    public static void main(String[] args) {
        new TemperatureConverter().toFahrenheit(5);
    }
}
