package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangsaihao
 * @email 938730935@qq.com
 * @date 2022-07-16 20:27:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
