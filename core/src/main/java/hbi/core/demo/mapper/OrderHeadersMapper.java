package hbi.core.demo.mapper;

import com.hand.hap.core.IRequest;
import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderHeaders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 陈伟 on 2017/1/10.
 */
public interface OrderHeadersMapper extends Mapper<OrderHeaders>{
    public List<OrderHeaders> selectHeaderInfoList(IRequest iRequest,
                                                   @Param("header") OrderHeaders header,
                                                   @Param("page") int page,
                                                   @Param("pageSize") int pageSize);

    public int insertHeader(OrderHeaders headers);

    public OrderHeaders selectHeaderByHeaderId(IRequest iRequest,
                                               @Param("header") OrderHeaders header);

    public boolean deleteHeaderByHeaderId(IRequest iRequest,
                                          @Param("header") OrderHeaders headers);

    public boolean updateHeaderStatus(IRequest iRequest,
                                      @Param("header") OrderHeaders headers);

    public boolean updateHeader(IRequest iRequest,
                                @Param("header") OrderHeaders headers);
}
