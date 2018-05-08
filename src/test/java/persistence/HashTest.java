package persistence;

import org.junit.jupiter.api.Test;
import org.apache.catalina.realm.RealmBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashTest {
    @Test
    // Version: Apache Tomcat (TomEE)/8.5.3 (7.0.1)
    //See http://tomcat.apache.org/tomcat-8.0-doc/realm-howto.html#Digested_Passwords
    public void testHash() throws Exception {
        String stringToHash = "testing";
        String hashedString = RealmBase.Digest(stringToHash,"sha-256", "UTF-8");
        assertEquals(hashedString, "cf80cd8aed482d5d1527d7dc72fceff84e6326592848447d2dc0b0e87dfc9a90"); //"dc724af18fbdd4e59189f5fe768a5f8311527050"
    }
}
