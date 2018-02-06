package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The type User.
 * @author Osamah Shareef
 * @since 2/5/2018
 */

@Entity(name = "User")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private int zipcode;

    @Column(name = "join_date")
    private LocalDate join_date;

    @Column(name = "approved")
    private int approved;

    /**
     * Instantiates a new User.
     */
    public User() {

    }

    /**
     * Instantiates a new User.
     *
     * @param id         the id
     * @param user_name  the user name
     * @param password   the password
     * @param first_name the first name
     * @param last_name  the last name
     * @param city       the city
     * @param state      the state
     * @param zipcode    the zipcode
     * @param join_date  the join date
     * @param approved   the approved
     */
    public User(int id, String user_name, String password, String first_name, String last_name, String city,
                String state, int zipcode, LocalDate join_date, int approved) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.join_date = join_date;
        this.approved = approved;
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
     * Gets user name.
     *
     * @return the user name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * Sets user name.
     *
     * @param user_name the user name
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Sets first name.
     *
     * @param first_name the first name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * Sets last name.
     *
     * @param last_name the last name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets zipcode.
     *
     * @return the zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * Sets zipcode.
     *
     * @param zipcode the zipcode
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * Gets join date.
     *
     * @return the join date
     */
    public LocalDate getJoin_date() {
        return join_date;
    }

    /**
     * Sets join date.
     *
     * @param join_date the join date
     */
    public void setJoin_date(LocalDate join_date) {
        this.join_date = join_date;
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
}
