package dacd.blanco.model;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    private final String name;
    private final Map<Product, Float> prices;
    private final Map<Product, String> sources;

    public Supermarket(String name) {
        this.name = name;
        this.prices = new HashMap<>();
        this.sources = new HashMap<>();
    }
    public void put(Product product, String url){
        sources.put(product, url);
        prices.putIfAbsent(product, Float.NaN);
    }

}
