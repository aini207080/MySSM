package spring.demo.service;

import spring.dataObject.User;


public interface UserService {

     User queryUser(String userName, String passWord);
}
