package spring.mybatis;

import java.lang.reflect.Proxy;

/**
 * @ClassName MySqlSession
 * @Description
 */
public class MySqlSession {


    public <T> T selectOne(MapperInfo mapperInfo ,Object[] paremeters){
        MyExecutor myexecutor = new MyExecutor();
        return myexecutor.query(mapperInfo,paremeters);
    }

    public <T> T getMapper(Class<?> aClass,String mybatisXmlName){

        return (T) Proxy.newProxyInstance(aClass.getClassLoader(),new Class[]{aClass},new MyMapperProxy(this,mybatisXmlName));


    }


}
