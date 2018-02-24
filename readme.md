**Problem Statement:**\
If you are a seller and want to make some extra money or if you are a buyer and want to save some money by buying used computers from people that don't need them anymore.
While it is hard to locate those people and to connect with them, this web application tries to make local online shopping for used computers easier. 

**Project Technologies/Techniques**
* Security/Authentication\
1- Tomcat's JDBC Realm Authentication\
2- Admin role: create/read/update/delete (CRUD) of all data.\
3- Seller role: create/read/update/delete (CRUD) for products.\
4- Buyer: anyone can view products information (no login).
* Database\
MySQL Store users, products and roles

* ORM Framework\
Hibernate 5
Dependency Management
Maven
* CSS\
Bootstrap or Materialize
* Data Validation\
Bootstrap Validator for front end\
Explore Hibernate's validation
* Logging\
Configurable logging using Log4J2. In production, only errors will normally be logged, but logging at a debug level can be turned on to facilitate trouble-shooting.
* Hosting\
AWS

* Project Lombok to eliminate boilerplate code like getters/setters/equals
* Unit Testing\
JUnit tests to achieve 80%+ code coverage
* IDE: IntelliJ IDEA

