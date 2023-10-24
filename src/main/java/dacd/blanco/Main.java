package dacd.blanco;

import dacd.blanco.model.Product;
import dacd.blanco.model.Supermarket;

import javax.naming.NameNotFoundException;
import javax.swing.text.html.StyleSheet;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Supermarket> supermarkets = createSupermarkets();
        List<Product> products = createProducts();
        for (Supermarket s : supermarkets) {
            fillSupermarket(s, products);
        }
    }
    private  static void fillSupermarket(Supermarket supermarket, List<Product> products){
        products.forEach(p->supermarket.put(p, urlOf(supermarket,p)));
    }
    private static String urlOf(Supermarket s, Product p){
        return null;
    }
    private static List<Supermarket> createSupermarkets(){
        //TODO
        return List.of();
        }
    public static List<Product> createProducts(){
        //TODO
        return List.of();
    }
}