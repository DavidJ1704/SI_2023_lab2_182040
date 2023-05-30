import org.junit.Test;
import org.junit.BeforeEach;

import static org.junit.Assert.*;

public class SILab2Test {
    @Test
    public void everyBranchTest() {
        assertThrows(RuntimeException.class,() -> {
            SILab2.function(null,null);
        });

        User user = new User(null, "pass123", "david@david.com");
        assertThrows(RuntimeException.class,() -> {
            SILab2.function(user,null);
        });

        User user2 = new User("David", "passpass1", "david2@david.com");
        assertEquals(SILab2.function(user2, null), false);

        User user3 = new User("David", "paswword1*", "david@david.com");
        ArrayList<User> userList = new ArrayList();
        userList.add(user)
        userList.add(user2)
        assertEquals(SILab2.function(user3,userList), false);

        User user4 = new User("David", "passpass1*", "david@david.com");
        assertEquals(SILab2.function(user3, null), true);


    }

    @Test
    public void multipleConditionTest() {
        User user1 = new User("David", null, "");
        assertThrows(RuntimeException.class, ()-> {
            SILab2.function(user1, null)
        });

        User user2 = new User(null, "password", null);
        assertThrows(RuntimeException.class, ()-> {
            SILab2.function(user2, null)
        });
    }
}