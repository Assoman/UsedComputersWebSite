package persistence;

import entity.User;
import test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {

    GenericDao genericDao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(User.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies Search all users success.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = genericDao.getAllUsersOrProducts();
        assertEquals(6, users.size());
    }

    /**
     * Verifies Search by last name success.
     */
    /*@Test
    void searchByLastNameSuccess() {
        List<User> users = genericDao.searchByLastName("c");
        assertEquals(3, users.size());
    }*/

    /**
     * Verifies Search by ID success.
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = (User)genericDao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Barney", retrievedUser.getFirstName());
    }


    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User("fflintstone", "supersecure","Fred", "Flintstone", "ff@madison.com","Madison", "Wisconsin", 53704, LocalDate.parse("1968-01-01"), 0);
        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User) genericDao.getById(id);
        assertEquals("Fred", insertedUser.getFirstName());
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    /**
     * Verify successful update of user
     */
    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        User userToUpdate = (User)genericDao.getById(3);
        userToUpdate.setLastName(newLastName);
        genericDao.saveOrUpdate(userToUpdate);
        User retrievedUser = (User) genericDao.getById(3);
        assertEquals(newLastName, retrievedUser.getLastName());
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = genericDao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, users.size());
        //assertEquals(2, products.get(0).getId()); ask Paula about this
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = genericDao.getByPropertyLike("lastName", "Curry");
        assertEquals(1, users.size());
    }

}