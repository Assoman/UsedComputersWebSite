package entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Role.
 */
@Entity(name = "Role")
@Table(name = "role")
@NoArgsConstructor
//@AllArgsConstructor
@ToString(callSuper = true, exclude = "user")
@EqualsAndHashCode(callSuper = false, exclude = "user")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "role_user_user_id_fk")
    )
    @Getter @Setter private User user;

    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "role_name")
    @Getter @Setter private String roleName;

    /**
     * Instantiates a new Role.
     */
    /*public Role() {

    }*/

    /**
     * Instantiates a new Role.
     *
     * @param user     the user
     * @param userName the user name
     * @param roleName the role name
     */
    public Role(User user, String userName, String roleName) {
        this.user = user;
        this.userName = userName;
        this.roleName = roleName;
    }


    /*@Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id &&
                Objects.equals(userName, role.userName) &&
                Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userName, roleName);
    }*/
}