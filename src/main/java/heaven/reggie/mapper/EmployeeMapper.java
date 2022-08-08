package heaven.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import heaven.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 15:11 2022/8/1
 * @Modified By:
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
