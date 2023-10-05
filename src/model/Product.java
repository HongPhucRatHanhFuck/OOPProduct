package model;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String typeProduct;
    public static int idIncrement = 1;

    public Product(String name, int quantity, double price, String typeProduct) {
        this.id = idIncrement;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.typeProduct = typeProduct;
        idIncrement++;
    }

    public Product(int idEdit, String name, int quantity, double price, String typeProduct) {
        this.id = idEdit;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

    public static int getIdIncrement() {
        return idIncrement;
    }

    public static void setIdIncrement(int idIncrement) {
        Product.idIncrement = idIncrement;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", typeProduct='" + typeProduct + '\'' +
                '}';
    }
    public String getData(){
        return id + "," + name + "," + quantity + "," + price + "," + typeProduct;

    }
}
