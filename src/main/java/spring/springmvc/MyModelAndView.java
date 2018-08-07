package spring.springmvc;

import lombok.Data;

/**
 * @ClassName MyModelAndView
 * @Description
 */
@Data
public class MyModelAndView {

    private String view;
    private MyModelMap modelMap;

    public MyModelAndView(String view) {
        this.view = view;
    }
}
