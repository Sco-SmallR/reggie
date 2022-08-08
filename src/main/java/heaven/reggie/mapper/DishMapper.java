package heaven.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import heaven.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 17:40 2022/8/5
 * @Modified By:
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
