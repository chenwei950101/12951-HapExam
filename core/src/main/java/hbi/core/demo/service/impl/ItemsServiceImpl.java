package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.Items;
import hbi.core.demo.mapper.ItemsMapper;
import hbi.core.demo.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@Service
@Transactional
public class ItemsServiceImpl extends BaseServiceImpl<Items> implements IItemsService{

    @Autowired
    private ItemsMapper itemsMapper;
}
