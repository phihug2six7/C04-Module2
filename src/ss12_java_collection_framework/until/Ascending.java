package ss12_java_collection_framework.until;

import ss12_java_collection_framework.model.Product;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Ascending extends Product implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return -1;
    }
}
