package spring.test;

/**
 * @ClassName UserDaoProxy
 * @Description
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao iUserDao){
        this.target = iUserDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务");
        target.save();
        System.out.println("关闭事务");
    }

}
