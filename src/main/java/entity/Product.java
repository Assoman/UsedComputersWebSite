package entity;

import lombok.Getter;
import lombok.Setter;
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
    @Getter @Setter private int id;

    @Column(name = "brand")
    @Getter @Setter private String brand;

    @Column(name = "model_number")
    @Getter @Setter private String modelNumber;

    @Column(name = "cpu")
    @Getter @Setter private String cpu;

    @Column(name = "ram")
    @Getter @Setter private String ram;

    @Column(name = "hdd")
    @Getter @Setter private String hdd;

    @Column(name = "conditions")
    @Getter @Setter private String conditions;

    @Column(name = "description")
    @Getter @Setter private String description;

    @Column(name = "price")
    @Getter @Setter private String price;

    @Column(name = "approved")
    @Getter @Setter private int approved;

    @ManyToOne
    @Getter @Setter private User user;

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", conditions='" + conditions + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", approved=" + approved +
                '}';
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