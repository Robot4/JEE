package ma.enset.jpaenset.web;

import ma.enset.jpaenset.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        ma.enset.jpaenset.entites.User user= userService.findUserByUserName(username);
        return (User) user;
    }
}
