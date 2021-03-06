package persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * A generic DAO somewhat inspired by http://rodrigoucha.wordpress.com
 *
 * @author Osamah Shareef
 * @param <T> the type parameter
 */
public class GenericDao<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the entity type for example User, Order, or anything else
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Gets by id.
     *
     * @param <T> the type parameter
     * @param id  the id
     * @return the by id
     */
    public <T>T getById(int id) {
        Session session = getSession();
        T entity = (T)session.get(type, id);
        session.close();
        return entity;
    }

    /**
     * Deletes the entity.
     *
     * @param entity entity to be deleted
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Search by product name.
     *
     * @param value the value
     * @return the list
     */
    public List<T> searchByProductName(String value) {

        logger.debug("Searching for: {}", value);

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get("brand");
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<T> products = session.createQuery(query).getResultList();
        session.close();
        return products;
    }

    /**
     * Search  approved product.
     *
     * @param value the value
     * @return the list
     */
    public List<T> searchByProductNameAndApproved(String value) {

        logger.debug("Searching for: {}", value);

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPathBrand = root.get("brand");
        Expression<String> propertyPathApproved = root.get("approved");
        query.select(root).where(builder.and(builder.like(propertyPathBrand, "%" + value + "%")), builder.equal(propertyPathApproved, 1));
        List<T> products = session.createQuery(query).getResultList();
        session.close();
        return products;
    }

    /**
     * Gets only approved products.
     *
     * @return the approved products
     */
    public List<T> getApprovedProducts() {

        logger.debug("Searching for: {}", 1);

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get("approved");
        query.where(builder.equal(propertyPath, 1));
        List<T> products = session.createQuery(query).getResultList();
        session.close();
        return products;
    }

    /**
     * Gets user id.
     *
     * @param value the value
     * @return the user id
     */
    public List<T> getUserID(String value) {

        logger.debug("Searching for: {}", value);

        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root =query.from(type);
        Expression<String> propertyPath = root.get("userName");
        query.where(builder.like(propertyPath, "%" + value + "%"));
        List<T> userID = session.createQuery(query).getResultList();
        session.close();
        return userID;
    }

    /**
     * Gets all users or products.
     *
     * @return the all users or products
     */
    public List<T> getAllUsersOrProducts() {
        Session session = getSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        query.from(type);
        List<T> usersOrProducts = session.createQuery(query).getResultList();
        session.close();
        return usersOrProducts;
    }

    /**
     * Insert int.
     *
     * @param entity the entity
     * @return the int
     */
    public int insert(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(entity);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Save or update.
     *
     * @param entity the entity
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Gets by property equal.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property equal
     */
    public List<T> getByPropertyEqual(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for order with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<T> usersOrProducts = session.createQuery(query).getResultList();

        session.close();
        return usersOrProducts;
    }

    /**
     * Gets by property like.
     *
     * @param propertyName the property name
     * @param value        the value
     * @return the by property like
     */
    public List<T> getByPropertyLike(String propertyName, String value) {
        Session session = getSession();

        logger.debug("Searching for order with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(type);
        Root<T> root = query.from(type);
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<T> usersOrProducts = session.createQuery(query).getResultList();
        session.close();
        return usersOrProducts;
    }

    /**
     * Gets Session open and ready to use.
     * @return openSession()
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

}
