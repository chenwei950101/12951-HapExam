package hbi.core.demo.service.impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.dto.OrderLines;
import hbi.core.demo.mapper.OrderHeadersMapper;
import hbi.core.demo.service.IOrderHeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 陈伟 on 2017/1/15.
 */
@Service
@Transactional
public class OrderHeadersServiceImpl extends BaseServiceImpl<OrderHeaders> implements IOrderHeadersService{

    @Autowired
    private OrderHeadersMapper orderHeadersMapper;

    @Override
    public List<OrderHeaders> selectHeaderInfoList(IRequest iRequest,OrderHeaders headers, int page, int pageSize) {
        page = (page - 1) * pageSize;
        List<OrderHeaders> list =  orderHeadersMapper.selectHeaderInfoList(iRequest,headers,page,pageSize);
        for(OrderHeaders orderHeaders : list){
            double orderPrice = 0;
            List<OrderLines> linesList = orderHeaders.getOrderLinesList();
            for(OrderLines orderLines : linesList){
                orderPrice += orderLines.getOrderdQuantity() * orderLines.getUnitSellingPrice();
            }
            orderHeaders.setOrderPrice(new Double(orderPrice));
        }
        return list;
    }

    @Override
    public OrderHeaders insertHeader(IRequest iRequest, OrderHeaders headers) {
        orderHeadersMapper.insertHeader(headers);
        return headers;
    }

    @Override
    public OrderHeaders selectHeaderByHeaderId(IRequest iRequest, OrderHeaders headers) {
        OrderHeaders orderHeaders = orderHeadersMapper.selectHeaderByHeaderId(iRequest,headers);
        List<OrderLines> linesList = orderHeaders.getOrderLinesList();
        double orderPrice = 0;
        for(OrderLines orderLines : linesList){
            orderLines.setItemDescription(orderLines.getItems().getItemDescription());
            orderPrice += orderLines.getOrderdQuantity() * orderLines.getUnitSellingPrice();
        }
        orderHeaders.setOrderPrice(new Double(orderPrice));
        return orderHeaders;
    }

    @Override
    public boolean deleteHeaderByHeaderId(IRequest iRequest, OrderHeaders headers) {
        return orderHeadersMapper.deleteHeaderByHeaderId(iRequest,headers);
    }

    @Override
    public boolean updateHeaderStatus(IRequest iRequest, OrderHeaders headers) {
        return orderHeadersMapper.updateHeaderStatus(iRequest,headers);
    }

    @Override
    public boolean updateHeader(IRequest iRequest, OrderHeaders headers) {
        return orderHeadersMapper.updateHeader(iRequest,headers);
    }

}
