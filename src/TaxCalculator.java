public class TaxCalculator {

    public static void main(String[] args) {


        final int standardCutOff = 35_300;

        final double lowerTaxRate = 0.2;

        final double higherTaxRate = 0.4;
        double tax = 0;


        double income = 40_000; // imagine from keyboard


        if (income > standardCutOff) {
            tax = standardCutOff*lowerTaxRate;
            double higherTaxableIncome = income - standardCutOff;
            tax += higherTaxableIncome*higherTaxRate;
 
        } else
            tax = income * lowerTaxRate;

        System.out.println(tax);


    }
}
