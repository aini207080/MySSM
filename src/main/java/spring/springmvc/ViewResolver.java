package spring.springmvc;

import lombok.Data;

/**
 * @ClassName ViewResolver
 * @Description 视图解析器 前缀和后缀
 */
@Data
public class ViewResolver {

    private String prefix = "";
    private String suffix = "";


}
