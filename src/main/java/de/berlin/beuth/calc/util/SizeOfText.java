package de.berlin.beuth.calc.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Getter
public enum SizeOfText {

    SMALL(50, 700),
    MEDIUM(150,1200),
    LARGE(250,1800);

    private final int textSize;

    private final  int money;


}
