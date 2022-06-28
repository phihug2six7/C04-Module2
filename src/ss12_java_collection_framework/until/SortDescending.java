package ss12_java_collection_framework.until;

import ss12_java_collection_framework.model.Product;

import java.util.Comparator;

public class SortDescending extends Product implements Comparator <Product> {
    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 1;
    }
}
