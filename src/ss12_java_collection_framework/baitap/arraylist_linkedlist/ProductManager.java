package ss12_java_collection_framework.baitap.arraylist_linkedlist;

import ss5_accessmodifier_static_method_static_property.thuchanh.StudentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "hung", 10000));
        products.add(new Product(2, "hung2", 20000));
        products.add(new Product(3, "hung3", 30000));
    }

    public void displayProduct() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void addProduct() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
        displayProduct();
    }

    public void editProduct() {
        System.out.println("Nhập id cân sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==id){
                System.out.println("nhập id muốn sửa");
                products.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhâp name muốn sửa");
                products.get(i).setName(scanner.nextLine());
                System.out.println("nhập price muốn sửa");
                products.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
                displayProduct();
                return;
            }
        }
        System.out.println("Id bạn nhập ko có");
    }

    public void removeProduct(){
        System.out.println("nhập id để xóa");
        int id=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==id){
                products.remove(i);
            }
        }
        displayProduct();
    }

    public void searchProduct(){
        System.out.println("nhập tên muốn tìm kiếm");
        String name=scanner.nextLine();
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getName().equals(name)){
                System.out.println(products.get(i));
            }
        }
    }

    public void sortProduct(){
        Collections.sort(products);
        displayProduct();
    }

    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();

        productManager.sortProduct();

    }
}



