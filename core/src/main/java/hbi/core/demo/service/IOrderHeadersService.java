package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.OrderHeaders;

import java.util.List;

/**
 * Created by 陈伟 on 2017/1/15.
 */
public interface IOrderHeadersService extends IBaseService<OrderHeaders>,ProxySelf<OrderHeaders> {
    public List<OrderHeaders> selectHeaderInfoList(IRequest iRequest, OrderHeaders headers, int page, int pageSize);

    public OrderHeaders insertHeader(IRequest iRequest, OrderHeaders headers);

    public OrderHeaders selectHeaderByHeaderId(IRequest iRequest, OrderHeaders headers);

    public boolean deleteHeaderByHeaderId(IRequest iRequest, OrderHeaders headers);

    public boolean updateHeaderStatus(IRequest iRequest, OrderHeaders headers);

    public boolean updateHeader(IRequest iRequest, OrderHeaders headers);
}
