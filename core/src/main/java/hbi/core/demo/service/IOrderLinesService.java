package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.dto.OrderLines;

/**
 * Created by 陈伟 on 2017/1/15.
 */
public interface IOrderLinesService extends IBaseService<OrderLines>,ProxySelf<OrderLines>{
    public OrderLines insertOrderLines(IRequest iRequest, OrderLines orderLines);

    public Integer selectMaxLineNumber(IRequest iRequest, OrderHeaders headers);

    public boolean deleteLineByHeaderId(IRequest iRequest, OrderHeaders headers);

    public boolean updateOrderLines(IRequest iRequest, OrderLines orderLines);

}
