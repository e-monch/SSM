package cn.monch.controller;

import cn.monch.domain.User;
import cn.monch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    //@Resource(name = "userServiceImpl")
    @Autowired
    private UserService userService;

    @RequestMapping("/showAll")
    public String showAll(Model model)
    {
        List<User> all = userService.findAll();
        model.addAttribute("users", all);
        return "show";
    }

    @RequestMapping("/showById")
    public String showById(Integer id, Model model)
    {
        List<User> byId = userService.findById(id);
        model.addAttribute("users", byId);
        return "show";
    }

    @RequestMapping("/showByName")
    public String showByName(String name, Model model)
    {
        List<User> byName = userService.findByName(name);
        model.addAttribute("users", byName);
        return "show";
    }

    @RequestMapping("/showBySex")
    public String showBySex(Character sex, Model model)
    {
        List<User> bySex = userService.findBySex(sex);
        model.addAttribute("users", bySex);
        return "show";
    }
}
