package edu.suct.test;


import edu.suct.pojo.User;
import org.junit.Test;

public class UserTest {

    @Test
    public void test1(){
        User user = new User();
        user.setId(1);
        user.setName("wmi");
        user.setAge(18);
        System.out.println(user);
    }


}
