package hbi.core.demo.mapper;

import com.hand.hap.core.IRequest;
import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.dto.OrderLines;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 陈伟 on 2017/1/11.
 */
public interface OrderLinesMapper extends Mapper<OrderLines>{

    public int insertOrderLines(OrderLines orderLines);

    public Integer selectMaxLineNumber(IRequest iRequest,
                                       @Param("header") OrderHeaders headers);

    public boolean deleteLineByHeaderId(IRequest iRequest,
                                        @Param("header") OrderHeaders headers);

    public boolean updateOrderLines(IRequest iRequest,
                                    @Param("line") OrderLines orderLines);
}
