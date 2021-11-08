import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ProductManager lists = new ProductManager();
        lists.add(new Product(0,"Milk",20000));
        lists.add(new Product(1,"Coffee",15000));
        lists.add(new Product(2,"Cake",30000));
     Product product  = lists.getByName("Milk");
        System.out.println(product);
        lists.update(0,"Milks");
        lists.showList();
        lists.remove(2);
        lists.showList();
    }
}
