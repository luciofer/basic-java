package lf.dev.basic.selectionprocess.domain;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcess {

    //Case 1 -> Select 5 candidates of an array. Their salary expectation must be >= than the base salary

    public void candidateSelection(){
        String[] candidates = {"Jhon","Mary", "Peter", "William","Jessie", "Selena","Chris", "Bruno", "Drew", "Lucio"};

        int selectedCandidates = 0;
        int currentCandidate = 0;
        double baseSalary = 2000.0;

        while(selectedCandidates < 5 && currentCandidate < candidates.length){
            String candidate = candidates[currentCandidate];
            double expectedSalary = expectedValue();

            if(baseSalary >= expectedSalary){
                System.out.println("The candidate "+candidate+" was selected for the postion.");
                selectedCandidates++;
            }
            currentCandidate++;
        }

    }

    public double expectedValue() {
        //simulates each candidate's salary expectation
        return ThreadLocalRandom.current().nextDouble(1800, 2200);    }


    // Case 2 - Print each element from an array and its respective index.

    public void printSelectedCandidates(){
        String[] candidates = {"Peter", "Selena", "Chris", "Bruno", "Lucio"};
        for(int i=0; i < candidates.length; i++){
            System.out.println("The candidate number " + (i+1) + " is " + candidates[i]);
        }

    }

}
