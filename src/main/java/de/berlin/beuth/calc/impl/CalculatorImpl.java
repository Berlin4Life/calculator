package de.berlin.beuth.calc.impl;

import de.berlin.beuth.calc.api.CalculatorApi;
import de.berlin.beuth.calc.util.SizeOfText;
import de.berlin.beuth.calc.util.Util;

public class CalculatorImpl implements CalculatorApi {
    @Override
    public int computePaymentByText(String fileName) throws Exception {

        String text = Util.readFileAsText(fileName);

        int countWords = text.split(" ").length;

        if(countWords < SizeOfText.SMALL.getTextSize() && countWords > 10 ){
            return SizeOfText.SMALL.getMoney();
        }else if(countWords < SizeOfText.MEDIUM.getTextSize() && countWords > SizeOfText.SMALL.getTextSize()){
            return SizeOfText.MEDIUM.getMoney();
        }else if(countWords > SizeOfText.LARGE.getTextSize()){
            return SizeOfText.LARGE.getMoney();
        }else{
            throw new IllegalStateException("text to small");
        }
    }

    @Override
    public int countPictures(String fileName) throws Exception {

        String text = Util.readFileAsText(fileName);

        int countPicture = text.split("(?i)picture").length-1;



        return countPicture;
    }
}
