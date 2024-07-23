import javax.swing.*;

public class CarbonFootPrintCalculator {

    public static void main(String[] args) {

        String model_of_car = JOptionPane.showInputDialog("Enter Model of car");
        String number_of_miles = JOptionPane.showInputDialog("Enter the number of miles per week");
        String fuel_effi = JOptionPane.showInputDialog("Enter your cars fuel effiency");

        double Miles = Double.parseDouble(number_of_miles);
        double Fuel = Double.parseDouble(fuel_effi);

        double C02Emissions = Miles*52 / Fuel;

                System.out.println(C02Emissions);

    }
}
