package entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type User.
 *
 * @author Osamah Shareef
 * @since 2/5/2018
 */
@Entity(name = "User")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "pass")
    @Getter @Setter private String password;

    @Column(name = "first_name")
    @Getter @Setter private String firstName;

    @Column(name = "last_name")
    @Getter @Setter private String lastName;

    @Column(name = "email")
    @Getter @Setter private String email;

    @Column(name = "city")
    @Getter @Setter private String city;

    @Column(name = "state")
    @Getter @Setter private String state;

    @Column(name = "zipcode")
    @Getter @Setter private int zipcode;

    @Column(name = "join_date")
    @Getter @Setter private LocalDate joinDate;

    @Column(name = "approved")
    @Getter @Setter private int approved;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Getter @Setter private Set<Product> products = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @Getter @Setter private Set<Role> roles = new HashSet<>();

    /**
     * Instantiates a new User.
     */
    public User() {

    }

    /**
     * Instantiates a new User.
     *
     * @param userName  the user name
     * @param password   the password
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     * @param city       the city
     * @param state      the state
     * @param zipcode    the zipcode
     * @param joinDate  the join date
     * @param approved   the approved
     */
    public User(String userName, String password, String firstName, String lastName, String email, String city,
                String state, int zipcode, LocalDate joinDate, int approved) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.joinDate = joinDate;
        this.approved = approved;
    }

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        roles.add(role);
        role.setUser(this);
    }

    /**
     * Remove role.
     *
     * @param role the role
     */
    public void removeRole(Role role) {
        roles.remove(role);
        role.setUser(null);
    }

    /**
     * Add product.
     *
     * @param product the order
     */
    public void addProduct(Product product) {
        products.add(product);
        product.setUser(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", joinDate=" + joinDate +
                ", approved=" + approved +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                zipcode == user.zipcode &&
                approved == user.approved &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(city, user.city) &&
                Objects.equals(state, user.state) &&
                Objects.equals(joinDate, user.joinDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, password, firstName, lastName, email, city, state, zipcode, joinDate, approved);
    }
}