package de.berlin.beuth.calc.impl;

import de.berlin.beuth.calc.api.CalculatorApi;
import de.berlin.beuth.calc.util.Util;

public class CalculatorImpl implements CalculatorApi {
    @Override
    public int computePaymentByText(String fileName) throws Exception {

        String text = Util.readFileAsText(fileName);

        return 0;
    }

    @Override
    public int countPictures(String inputText) throws Exception {
        return 0;
    }
}
