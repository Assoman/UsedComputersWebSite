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

    GenericDao genericDao;

    /**
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Product.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies Search all products success.
     */
    @Test
    void getAllProductsSuccess() {
        List<Product> products = genericDao.getAllUsersOrProducts();
        assertEquals(4, products.size());
    }


    /**
     * Verifies Search by ID success.
     */
    @Test
    void getByIdSuccess() {
        Product retrievedProduct = (Product) genericDao.getById(2);
        assertNotNull(retrievedProduct);
        assertEquals("Dell", retrievedProduct.getBrand());
    }


    /**
     * Verify successful insert of a product
     */
    @Test
    void insertSuccess() {

        GenericDao userDao = new GenericDao(User.class);
        User user = (User)userDao.getById(1);
        Product newProduct = new Product( "Acer", "Iconia", "2.0", "4", "750", "Like New", "School Work", "250", 0, user);
        user.addProduct(newProduct);

        int id = genericDao.insert(newProduct);

        assertNotEquals(0,id);
        Product insertedProduct = (Product) genericDao.getById(id);
        assertEquals("Acer", insertedProduct.getBrand());
        assertEquals("Joe", insertedProduct.getUser().getFirstName());
        assertNotNull(insertedProduct.getUser());
    }

    /**
     * Verify successful delete of product
     */
    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    /**
     * Verify successful update of product
     */
    @Test
    void updateSuccess() {
        String condition = "Like New";
        Product productToUpdate = (Product)genericDao.getById(3);
        productToUpdate.setConditions(condition);
        genericDao.saveOrUpdate(productToUpdate);
        Product retrievedProduct = (Product)genericDao.getById(3);
        assertEquals(condition, retrievedProduct.getConditions());
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Product> products = genericDao.getByPropertyEqual("conditions", "Used");
        assertEquals(1, products.size());
        assertEquals(3, products.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Product> products = genericDao.getByPropertyLike("brand", "HP");
        assertEquals(2, products.size());
    }

    /**
     * Verifies Search by product name success.
     */
    @Test
    void searchByProductNameSuccess() {
        List<Product> products = genericDao.searchByProductName("hp");
        assertEquals(2, products.size());
    }

    /**
     * Verifies Search by approved product name success.
     */
    @Test
    void searchByProductNameAndApprovedSuccess() {
        List<Product> products = genericDao.searchByProductNameAndApproved("hp");
        assertEquals(1, products.size());
    }

    /**
     * Verifies Get approved products.
     */
    @Test
    void getApprovedProductsSuccess() {
        List<Product> approvedProducts = genericDao.getApprovedProducts();
        assertEquals(1, approvedProducts.size());
    }
}