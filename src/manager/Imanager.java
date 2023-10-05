package manager;

import model.Product;

import java.util.ArrayList;

public interface Imanager<S> {
    void add(S s);

    boolean delete(int id);

    boolean edit(int id, S s);

    int findById(int id);
    String findByName(String name, Product product);

    ArrayList<S> findAll();

}
