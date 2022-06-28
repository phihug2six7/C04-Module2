package ss12_java_collection_framework.view;

import ss12_java_collection_framework.controller.ProductController;
import ss12_java_collection_framework.service.ProductManager;

public class ViewProduct {
    public static void main(String[] args) {
    ProductManager productManager=new ProductManager();
        ProductController.displayMenu();
    }
}
