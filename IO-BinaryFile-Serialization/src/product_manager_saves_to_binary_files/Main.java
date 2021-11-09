package product_manager_saves_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Product> list=new ArrayList<>();

    public static void add(Product product) {
        if (getById(product.getId())==null) {
            list.add(product);
        } else {
            System.out.println("Sản phẩm đã tồn tại");
        }

    }
    public static Product getById(int id) {
        for (Product product: list) {
            if (product.getId()==id) {
                return product;
            }
        }
        return null;
    }
    public static void show() {
        for (Product product:list) {
            System.out.println(product);
        }
    }
    public static List<Product> readFile(String filePath) {
        List<Product> list = null;
        try {
            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream obj = new ObjectInputStream(file);
            list = (List<Product>) obj.readObject();

            obj.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFile(String filePath, List<Product> list) {
        try {
            FileOutputStream file = new FileOutputStream(filePath);
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(list);
            obj.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
//        Product product = new Product(1001,"Iphone 6","China",30000000L,"128G");
//        list.add(product);
//        Product product1 = new Product(1002,"Iphone 7","China",35000000L,"128G");
//        list.add(product1);
//        writeFile("src/product_manager_saves_to_binary_files/listProduct.txt",list);
        list = readFile("src/product_manager_saves_to_binary_files/listProduct.txt");
       Product product = getById(1001);
        System.out.println(product);
        show();

    }
}
