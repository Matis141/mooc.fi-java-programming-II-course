package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;


public class CalculatorLogic {
    
    private Double interest;
    private int monthlySavings;
    
    public CalculatorLogic() {
        this.monthlySavings = 25;
        this.interest = 0.0;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public int getSavings() {
        return monthlySavings;
    }

    public void setSavings(int monthlySavings) {
        this.monthlySavings = monthlySavings;
    }
    
    public ArrayList<Integer> calculateSavings () {
        ArrayList<Integer> savingsList = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            savingsList.add(i * this.monthlySavings * 12);
        }
        return savingsList;
    }
    
    public ArrayList<Double> calculateInterest (ArrayList<Integer> savingsList) {
        ArrayList<Double> interestList = new ArrayList<>();
        Double interestSum = 0.0;
        for (int i = 0; i <= 30; i++) {
                Double unprecisedInterest = this.interest/100; 

                Double precisedInterest = BigDecimal.valueOf(unprecisedInterest)
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
                interestList.add(savingsList.get(i) * (1 + precisedInterest) + interestSum);
                interestSum += (interestList.get(i) * precisedInterest);
                System.out.println(interestList.get(i));
        }    
        return interestList;
    }
    
}
