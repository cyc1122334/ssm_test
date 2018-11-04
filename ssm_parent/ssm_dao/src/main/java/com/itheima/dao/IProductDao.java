package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao {

    //根据id查询产品
    @Select("select * from product where id = #{id}")
    public Product findById(String id)throws Exception;

    @Select("select * from product")
    List<Product> findAll();

    @Insert("insert into product values(#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
