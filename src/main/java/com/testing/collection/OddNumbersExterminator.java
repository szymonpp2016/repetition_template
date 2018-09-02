package com.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        for(Integer even : evenNumbers){
           // System.out.println("testtttttttttt");
            //System.out.println(even);
        }
        return evenNumbers;

    }
}

