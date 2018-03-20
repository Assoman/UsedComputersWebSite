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

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "ram")
    private String ram;

    @Column(name = "hdd")
    private String hdd;

    @Column(name = "conditions")
    private String conditions;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Column(name = "approved")
    private int approved;

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
     * @param cpu         the cpu
     * @param ram         the ram
     * @param hdd         the hdd
     * @param conditions  the conditions
     * @param description the description
     * @param price       the price
     * @param approved    the approved
     * @param user        the user
     */
    public Product(String brand, String modelNumber, String cpu, String ram, String hdd, String conditions, String description, String price, int approved, User user) {
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.conditions = conditions;
        this.description = description;
        this.price = price;
        this.approved = approved;
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
     * Gets cpu.
     *
     * @return the cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * Sets cpu.
     *
     * @param cpu the cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * Gets ram.
     *
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * Sets ram.
     *
     * @param ram the ram
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * Gets hdd.
     *
     * @return the hdd
     */
    public String getHdd() {
        return hdd;
    }

    /**
     * Sets hdd.
     *
     * @param hdd the hdd
     */
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    /**
     * Gets conditions.
     *
     * @return the conditions
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets conditions.
     *
     * @param conditions the conditions
     */
    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Gets approved.
     *
     * @return the approved
     */
    public int getApproved() {
        return approved;
    }

    /**
     * Sets approved.
     *
     * @param approved the approved
     */
    public void setApproved(int approved) {
        this.approved = approved;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Objects.equals(price, product.price) &&
                approved == product.approved &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(modelNumber, product.modelNumber) &&
                Objects.equals(cpu, product.cpu) &&
                Objects.equals(ram, product.ram) &&
                Objects.equals(hdd, product.hdd) &&
                Objects.equals(conditions, product.conditions) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brand, modelNumber, cpu, ram, hdd, conditions, description, price, approved);
    }
}
