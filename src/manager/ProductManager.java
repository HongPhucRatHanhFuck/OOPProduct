package manager;

import model.Product;
import readAndWriteFile.RAWFile;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Imanager<Product> {
    List<Product> productArrayList;
    private final RAWFile rawFile = new RAWFile();

    public ProductManager() {
        productArrayList = rawFile.readFile();
    }

    @Override
    public void add(Product product) {
        productArrayList.add(product);
        rawFile.writeFile(productArrayList);
    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if (index == -1) {
            return false;
        }
        this.productArrayList.remove(id);
        rawFile.writeFile(productArrayList);
        return true;
    }

    @Override
    public boolean edit(int id, Product product) {
        int index = findById(id);
        if (index == -1) {
            return false;
        }
        this.productArrayList.set(index, product);
        rawFile.writeFile(productArrayList);
        return true;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (i == productArrayList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String findByName(String name, Product product) {
        List<Product> matchingProducts = new ArrayList<>();
        String lowercaseName = name.toLowerCase();
        for (Product products : productArrayList) {
            String lowercaseProductName = products.getName().toLowerCase();
            if (lowercaseProductName.contains(lowercaseName)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts.toString();
    }

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) productArrayList;
    }
}
