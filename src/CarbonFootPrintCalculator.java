import javax.swing.*;

public class CarbonFootPrintCalculator {


    public static void main(String[] args) {
        final int WEEKS_PER_YEAR = 52;
        final double C02_PER_GALLON = 19.4;
        final double OTHER_EMMISIONS = 100/95.0;


        String carModel = (JOptionPane.showInputDialog("Enter Model of car"));
        double miles = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of miles per week"));
        double fuelEffiency = Double.parseDouble(JOptionPane.showInputDialog("Enter your cars fuel effiency"));


        double co2Emissions = (miles*WEEKS_PER_YEAR)/ fuelEffiency * C02_PER_GALLON * OTHER_EMMISIONS;

        String output =  "%s Has a fuel effiecy of %.1f".formatted(carModel,co2Emissions);
        JOptionPane.showMessageDialog(null, output, "CO2 EMISS", JOptionPane.INFORMATION_MESSAGE);

    }
}
