package io.renren.modules.sys.service.impl;

import io.renren.modules.sys.dao.BizAccountDao;
import io.renren.modules.sys.entity.BizGoodsEntity;
import io.renren.modules.sys.service.BizAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("bizAccountService")
public class BizAccountServiceImpl implements BizAccountService {
    @Autowired
    private BizAccountDao bizAccountDao;

    @Override
    public List<BizGoodsEntity> queryAllGoods(Map<String, Object> paras) {
        return bizAccountDao.queryAllGoods();
    }

    @Override
    public int addItem(BizGoodsEntity entity) {
        return bizAccountDao.addItem(entity);
    }

    @Override
    public int updateItem(BizGoodsEntity entity) {
        return bizAccountDao.updateItem(entity);
    }
}
