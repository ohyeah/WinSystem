package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.BizGoodsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BizAccountDao extends BaseDao<BizGoodsEntity> {

    List<BizGoodsEntity> queryAllGoods();
    int addItem(final BizGoodsEntity item);
    int updateItem(final BizGoodsEntity item);
}
