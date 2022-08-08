package heaven.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import heaven.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 12:52 2022/8/7
 * @Modified By:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
