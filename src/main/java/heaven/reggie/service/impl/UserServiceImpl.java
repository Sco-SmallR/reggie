package heaven.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import heaven.reggie.entity.User;
import heaven.reggie.mapper.UserMapper;
import heaven.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 12:49 2022/8/7
 * @Modified By:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
