package spring.mybatis;

import lombok.Data;

/**
 * @ClassName MapperInfo
 * @Description
 */
@Data
public class MapperInfo {

    private String interfaceName;
    private String sqlContent;
    private String methodName;
    private String resultClassName;
}
