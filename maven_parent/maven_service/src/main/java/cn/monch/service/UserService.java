package cn.monch.service;

import cn.monch.domain.User;

import java.util.List;

/**
 * User的业务层接口
 */
public interface UserService
{
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    List<User> findById(Integer id);

    /**
     * 根据名称模糊查询用户
     * @param name
     * @return
     */
    List<User> findByName(String name);

    /**
     * 根据性别查询用户
     * @param sex
     * @return
     */
    List<User> findBySex(Character sex);
}
