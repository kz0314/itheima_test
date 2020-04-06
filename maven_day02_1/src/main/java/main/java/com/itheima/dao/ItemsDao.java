package main.java.com.itheima.dao;

import main.java.com.itheima.domain.Items;

/**
 * @Author Ay-z
 * @Date: 2020/4/5 15:47
 */
public interface ItemsDao {
    public Items findById(Integer id);
}
