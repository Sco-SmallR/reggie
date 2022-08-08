package heaven.reggie.dto;

import heaven.reggie.entity.Dish;
import heaven.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 11:19 2022/8/6
 * @Modified By:
 */
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
