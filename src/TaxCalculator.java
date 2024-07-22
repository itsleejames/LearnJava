import javax.swing.*;

public class TaxCalculator {

    public static void main(String[] args) {


        final int standardCutOff = 35_300;

        final double lowerTaxRate = 0.2;

        final double higherTaxRate = 0.4;
        double tax = 0;

        String jobOne = JOptionPane.showInputDialog("Enter Your 1st Job Weekly Income");



        double incomeOne = Integer.parseInt(jobOne); // imagine from keyboard

        String jobTwo = JOptionPane.showInputDialog("Enter Your 2nd Job Co Weekly Income");
        double incomeTwo = Integer.parseInt(jobOne); // imagine from keyboard

        double totalIncome = incomeOne+incomeTwo*52;


        if (totalIncome > standardCutOff) {
            tax = standardCutOff*lowerTaxRate;
            double higherTaxableIncome = incomeOne - standardCutOff;
            tax += higherTaxableIncome*higherTaxRate;

        } else
            tax = totalIncome * lowerTaxRate;

        JOptionPane.showMessageDialog(null,"Your Tax is" + tax);



        //TODO: Q2(B)

    }
}
