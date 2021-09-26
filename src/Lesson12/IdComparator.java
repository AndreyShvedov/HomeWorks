package Lesson12;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
    public int compare(Product a, Product b){
        PriceComparator.Operationable operation;
        operation = Integer::compareTo;
        return operation.calculate(a.getId(), b.getId());
    }
    interface Operationable{
        Integer calculate(Integer x, Integer y);
    }
}
