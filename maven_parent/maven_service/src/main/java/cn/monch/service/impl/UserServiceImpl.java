package cn.monch.service.impl;

import cn.monch.dao.UserDao;
import cn.monch.domain.User;
import cn.monch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll()
    {
        List<User> all = userDao.findAll();
        return all;
    }

    @Override
    public List<User> findById(Integer id)
    {
        List<User> byId = userDao.findById(id);
        return byId;
    }

    @Override
    public List<User> findByName(String name)
    {
        List<User> byName = userDao.findByName("%" + name + "%");
        return byName;
    }

    @Override
    public List<User> findBySex(Character sex)
    {
        List<User> bySex = userDao.findBySex(sex);
        return bySex;
    }
}
