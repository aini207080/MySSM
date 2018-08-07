package spring.springmvc;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Parameter;

/**
 * @ClassName BindingRoles
 * @Description
 */
public interface BindingParamter {

     Object bindingParamter(Parameter parameter, HttpServletRequest request) throws IllegalAccessException, InstantiationException, NoSuchMethodException;

}
