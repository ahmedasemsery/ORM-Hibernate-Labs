package dao;
// Generated Mar 21, 2021, 12:48:35 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Seller generated by hbm2java
 */
public class Seller implements java.io.Serializable {

    private int id;
    private User user;
    private String value;
    private Set<Product> products = new HashSet<>(0);

    public Seller() {
    }

    public Seller(User user, String value) {
        this.user = user;
        this.value = value;
    }

    public Seller(User user, String value, Set<Product> products) {
        this.user = user;
        this.value = value;
        this.products = products;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }


}


