package comparator;

import circle.Circle;
import shape.Shape;

public interface Comparator<C extends Shape> extends java.util.Comparator <Circle> {

    @Override
    int compare(Circle o1, Circle o2);

    @Override
    boolean equals(Object obj);
}
