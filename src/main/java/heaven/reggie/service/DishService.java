package heaven.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import heaven.reggie.dto.DishDto;
import heaven.reggie.entity.Dish;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 17:41 2022/8/5
 * @Modified By:
 */
public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public void updateWithFlavor(DishDto dishDto);
}

