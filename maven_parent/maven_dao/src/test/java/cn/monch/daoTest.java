package cn.monch;

import cn.monch.dao.UserDao;
import cn.monch.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:daoContext.xml")
public class daoTest
{
    @Autowired
    UserDao userDao;

    @Test
    public void forTest()
    {
        List<User> all = userDao.findAll();
        all.forEach(System.out::println);
    }
}
