package spring.demo.repository;

import spring.dataObject.User;

/**
 * @ClassName UserMapper
 * @Description

 */
public interface UserMapper {

    User queryUser(String userName,String passWord);

}
