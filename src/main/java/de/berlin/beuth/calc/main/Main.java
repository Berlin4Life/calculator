package de.berlin.beuth.calc.main;


import de.berlin.beuth.calc.api.CalculatorApi;
import de.berlin.beuth.calc.impl.CalculatorImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) throws Exception {

        CalculatorApi calculatorApi = new CalculatorImpl();

        int countPictures = calculatorApi.countPictures("src/main/resources/inputtext.txt");

        log.info("countPictures: "+countPictures);
    }
}
