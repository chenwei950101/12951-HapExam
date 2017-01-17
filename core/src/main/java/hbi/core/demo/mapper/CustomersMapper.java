package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.Customers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 陈伟 on 2017/1/11.
 */
public interface CustomersMapper extends Mapper<Customers>{
    public List<Customers> selectCustomersByCompanyId(@Param("companyId") Long companyId);
}
