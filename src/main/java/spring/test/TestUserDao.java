package spring.test;

/**
 * @ClassName TestUserDao
 * @Description
 */
public class TestUserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("已经保存数据...");
    }


    public static void main(String[] args) {
        UserDaoProxy userDaoProxy = new UserDaoProxy(new TestUserDao());
        userDaoProxy.save();
    }


}
