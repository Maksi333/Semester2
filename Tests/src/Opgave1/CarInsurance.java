package Opgave1;

public class CarInsurance {
    private final double basePremium;

    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */

    public CarInsurance (double basePremium){
        this.basePremium = basePremium;
    }
    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     * - 0 to 2 years, the basis premium is reduced with 0%,
     * - 3 to 5 years, the basis premium is reduced with 15%,
     * - 6 to 8 years, the basis premium is reduced with 25%,
     * - more than 8 years, the basis premium is reduced with 35%.
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */

    public double calculatePremium(int age, boolean isWoman, int yearsWithoutDamage){
        double premium = 0;
        if(age > 25){
            premium = basePremium * 1.25;
            if(isWoman = true){
                premium = premium * 0.95;
                if(yearsWithoutDamage <= 2){
                    return premium;
                } else if(yearsWithoutDamage > 2 && yearsWithoutDamage <= 5){

                }
            }
        }

        return premium;
    }

}
