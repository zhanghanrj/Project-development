package com.code.dao;

import com.code.entity.Product;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Product)表数据库访问层
 *
 * @author yap
 * @since 2020-04-18 16:52:55
 */
public interface ProductDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Product queryById(Integer pid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Product> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    List<Product> queryAll(Product product);

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int insert(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 影响行数
     */
    int deleteById(Integer pid);

}