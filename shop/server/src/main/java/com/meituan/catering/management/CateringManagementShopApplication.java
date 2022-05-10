package com.meituan.catering.management;

import com.meituan.catering.management.shop.dao.mapper.ShopMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 */
@MapperScan(basePackageClasses = ShopMapper.class)
@SpringBootApplication
public class CateringManagementShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CateringManagementShopApplication.class, args);
    }

}
