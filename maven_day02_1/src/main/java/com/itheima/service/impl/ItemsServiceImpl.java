package main.java.com.itheima.service.impl;

import main.java.com.itheima.dao.ItemsDao;
import main.java.com.itheima.domain.Items;
import main.java.com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Ay-z
 * @Date: 2020/4/5 15:51
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return null;
    }
}
