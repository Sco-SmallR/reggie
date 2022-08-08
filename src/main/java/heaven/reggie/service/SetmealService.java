package heaven.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import heaven.reggie.dto.SetmealDto;
import heaven.reggie.entity.Setmeal;

import java.util.List;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 17:41 2022/8/5
 * @Modified By:
 */
public interface SetmealService extends IService<Setmeal> {

    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);

    SetmealDto getByIdWithDish(Long id);

    public void updateWithDish(SetmealDto setmealDto);
}
