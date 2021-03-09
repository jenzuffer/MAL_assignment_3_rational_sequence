package FunctionLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Rationals implements Iterable<String> {
    
    private int iterate_end;
    private int iterate_count = 0;
    public List<String> sequenceOfFractions = new ArrayList<>();

    public Rationals(long Nvalue) {
        this.iterate_end = (int) Nvalue;
        while (iterator().hasNext()) {
            String next = (String) iterator().next();
            sequenceOfFractions.add(next);
        }

    }

    private double nValueFloored(long Nvalue) {
        return Math.floor((-1 + (Math.sqrt(1 + (8 * Nvalue)))) / 2);
    }

    public String rational(long Nvalue) {
        double LN = nValueFloored(Nvalue);
        double SN = (LN * (LN + 1)) / 2;
        double numeratorN = (Nvalue - SN) + 1;
        double DenominatorN = LN - (Nvalue - SN) + 1;
        return String.valueOf(numeratorN) + "/" + String.valueOf(DenominatorN);
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return iterate_count <= iterate_end;
            }

            @Override
            public String next() {
                return rational((long) iterate_count++);
            }
        };
    }
}
