package view;

import manager.ProductManager;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProduct {
    ProductManager productManager = new ProductManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMenu() {

        int choice;
        do {
            System.out.println("******Menu Product******");
            System.out.println("Enter Your Option");
            System.out.println("1)Add Product\n" +
                    "2)Edit Product By Id\n" +
                    "3)Delete Product By Id\n" +
                    "4)Show All Product\n" +
                    "5)Find Product By Id\n" +
                    "6)Find Product By Name\n" +
                    "7)Enter Type Product Find Type Product\n" +
                    "0)Out ");

            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteById();
                    break;
                case 4:
                    showAll();
                    break;
                case 5:
                    findById();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    break;

            }

        } while (choice != 0);
    }

    public void addProduct() {
        System.out.println("******Menu Add Product******");
        System.out.println("Enter new id product: ");
        int id = inputInt.nextInt();
        System.out.println("Enter new product: ");
        String name = inputString.nextLine();
        System.out.println("Enter quantity product:");
        int quantity = inputInt.nextInt();
        System.out.println("Enter price product: ");
        double price = inputInt.nextFloat();
        System.out.println("Enter type product: ");
        String typeProduct = inputString.nextLine();
        Product addProduct = new Product(id, name, quantity, price, typeProduct);
        productManager.add(addProduct);
        System.out.println("Add product complete (^.^)");
        System.out.println("--------------------------");

    }

    public void editProduct() {
        System.out.println("******Menu Edit Product******");
        System.out.println("Enter new idEdit product: ");
        int idEdit = inputInt.nextInt();
        System.out.println("Enter new product: ");
        String name = inputString.nextLine();
        System.out.println("Enter quantity product:");
        int quantity = inputInt.nextInt();
        System.out.println("Enter price product: ");
        double price = inputInt.nextDouble();
        System.out.println("Enter type product: ");
        String typeProduct = inputString.nextLine();
        Product addProduct = new Product(idEdit, name, quantity, price, typeProduct);
        productManager.edit(idEdit, addProduct);
        System.out.println("Edit product compelet :~~~~~~");
        System.out.println("-----------------------------");
    }

    public void findById() {
        System.out.println("Enter id product need find:");
        int id = inputInt.nextInt();
        ArrayList<Product> list = productManager.findAll();
        int index = productManager.findById(id);
        System.out.println(list.get(index));
        System.out.println("Complete-------------------");
    }

    public void deleteById(){
        System.out.println("Enter id product need delete: ");
        int idDelete = inputInt.nextInt();
        productManager.delete(idDelete);
        System.out.println("Complete delete id");
        System.out.println("------------------");
    }

    public void showAll() {
        System.out.println("List student is:");
        ArrayList<Product> showAllList = productManager.findAll();
        if (showAllList.isEmpty()) {
            System.out.println("List product is Empty X_x");
        } else {
            for (Product product : showAllList) {
                System.out.println(product);
            }
        }
    }
}
