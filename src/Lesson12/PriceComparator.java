package Lesson12;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compare(Product a, Product b){
        Operationable operation;
        operation = Integer::compareTo;
        return operation.calculate(a.getPrice(), b.getPrice());
    }

    interface Operationable{
        Integer calculate(Integer x, Integer y);
    }
}
