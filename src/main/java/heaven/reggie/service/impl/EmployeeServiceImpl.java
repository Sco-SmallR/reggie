package heaven.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import heaven.reggie.entity.Employee;
import heaven.reggie.mapper.EmployeeMapper;
import heaven.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;


/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 15:16 2022/8/1
 * @Modified By:
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
