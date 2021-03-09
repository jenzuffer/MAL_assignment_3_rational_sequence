package FunctionLayer;

import java.util.Iterator;

public class main {

    public static void main(String[] args) {
        long example = 20L;
        Rationals rationals = new Rationals(example);
        for (String str : rationals.sequenceOfFractions){
            System.out.println(str);
        }

    }
}
