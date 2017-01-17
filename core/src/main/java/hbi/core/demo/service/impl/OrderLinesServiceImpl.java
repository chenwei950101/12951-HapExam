package hbi.core.demo.service.impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.dto.OrderLines;
import hbi.core.demo.mapper.OrderLinesMapper;
import hbi.core.demo.service.IOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@Service
@Transactional
public class OrderLinesServiceImpl extends BaseServiceImpl<OrderLines> implements IOrderLinesService{

    @Autowired
    private OrderLinesMapper orderLinesMapper;

    @Override
    public OrderLines insertOrderLines(IRequest iRequest, OrderLines orderLines) {
        orderLinesMapper.insertOrderLines(orderLines);
        return orderLines;
    }

    @Override
    public Integer selectMaxLineNumber(IRequest iRequest, OrderHeaders headers) {
        return orderLinesMapper.selectMaxLineNumber(iRequest,headers);
    }

    @Override
    public boolean deleteLineByHeaderId(IRequest iRequest, OrderHeaders headers) {
        return orderLinesMapper.deleteLineByHeaderId(iRequest,headers);
    }

    @Override
    public boolean updateOrderLines(IRequest iRequest, OrderLines orderLines) {
        return orderLinesMapper.updateOrderLines(iRequest,orderLines);
    }
}
