package com.zeng;

import com.zeng.domain.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zeng on 17-3-1.
 */
public interface GoodsMapper {
    //必须加param注解，不然只能通过param1，param2等没有绑定value的方式实现引用
    List<Goods> selectGoods(@Param(value="pageStart") int pageStart, @Param(value="pageSize") int pageSize, @Param(value = "platform") String platform,@Param(value = "fundType") String fundType);
}
