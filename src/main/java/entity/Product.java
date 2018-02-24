package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * The type Product.
 */
@Entity(name = "Product")
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model_number")
    private String modelNumber;

    private String conditions;

    @ManyToOne
    private User user;

    /**
     * Instantiates a new Product.
     */
    public Product() {

    }

    /**
     * Instantiates a new Product.
     *
     * @param brand       the brand
     * @param modelNumber the model number
     * @param user        the user
     */
    public Product(String brand, String modelNumber, User user) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.user = user;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Gets model number.
     *
     * @return the model number
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets model number.
     *
     * @param modelNumber the model number
     */
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Sets description.
     *
     * @param conditions the description
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getConditions() {
        return conditions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(modelNumber, product.modelNumber) &&
                Objects.equals(conditions, product.conditions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brand, modelNumber, conditions);
    }
}
