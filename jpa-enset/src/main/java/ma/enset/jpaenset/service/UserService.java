package ma.enset.jpaenset.service;

import ma.enset.jpaenset.entites.Role;
import ma.enset.jpaenset.entites.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser (String username,String roleName);
    User authenticate(String userName ,String password);




}
