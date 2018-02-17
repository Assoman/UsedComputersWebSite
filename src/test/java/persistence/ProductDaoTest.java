package persistence;

import entity.User;
import test.util.Database;
import entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Product dao test.
 */
class ProductDaoTest {

    ProductDao dao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        dao = new ProductDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies Search all products success.
     */
    @Test
    void getAllProductsSuccess() {
        List<Product> products = dao.getAllProducts();
        assertEquals(3, products.size());
    }


    /**
     * Verifies Search by ID success.
     */
    @Test
    void getByIdSuccess() {
        Product retrievedProduct = dao.getById(2);
        assertNotNull(retrievedProduct);
        assertEquals("Dell", retrievedProduct.getBrand());
    }


    /**
     * Verify successful insert of a product
     */
    @Test
    void insertSuccess() {

        UserDao userDao = new UserDao();
        User user = userDao.getById(1);
        Product newProduct = new Product("Acer", "Iconia", user);
        user.addProduct(newProduct);

        int id = dao.insert(newProduct);

        assertNotEquals(0,id);
        Product insertedProduct = dao.getById(id);
        assertEquals("Acer", insertedProduct.getBrand());
        assertEquals("Joe", insertedProduct.getUser().getFirstName());
        assertNotNull(insertedProduct.getUser());
    }

    /**
     * Verify successful delete of product
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

    /**
     * Verify successful update of product
     */
    @Test
    void updateSuccess() {
        String condition = "Like New";
        Product productToUpdate = dao.getById(3);
        productToUpdate.setCondition(condition);
        dao.saveOrUpdate(productToUpdate);
        Product retrievedProduct = dao.getById(3);
        assertEquals(condition, retrievedProduct.getCondition());
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Product> products = dao.getByPropertyEqual("condition", "Used");
        assertEquals(1, products.size());
        //assertEquals(2, products.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Product> products = dao.getByPropertyLike("brand", "HP");
        assertEquals(1, products.size());
    }
}