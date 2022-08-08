package heaven.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import heaven.reggie.entity.Category;

/**
 * @Author: SmallRong
 * @Description:
 * @Date: Created in 14:40 2022/8/5
 * @Modified By:
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
