package cn.monch;

import cn.monch.domain.User;
import cn.monch.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:serviceContext.xml")
public class serviceTest
{
    @Autowired
    private UserService userService;

    @Test
    public void forTest()
    {
        List<User> all = userService.findAll();
        all.forEach(System.out::println);
    }
}
