package heaven.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import heaven.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 14:39 2022/8/5
 * @Modified By:
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
