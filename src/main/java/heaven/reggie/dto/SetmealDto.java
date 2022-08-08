package heaven.reggie.dto;

import heaven.reggie.entity.Setmeal;
import heaven.reggie.entity.SetmealDish;
import heaven.reggie.service.SetmealDishService;
import jdk.nashorn.internal.ir.debug.PrintVisitor;
import lombok.Data;

import java.security.PrivateKey;
import java.util.List;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 18:56 2022/8/6
 * @Modified By:
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;

}
