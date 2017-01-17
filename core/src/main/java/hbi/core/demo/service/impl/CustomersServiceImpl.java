package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.Customers;
import hbi.core.demo.mapper.CustomersMapper;
import hbi.core.demo.service.ICustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 陈伟 on 2017/1/11.
 */
@Service
@Transactional
public class CustomersServiceImpl extends BaseServiceImpl<Customers> implements ICustomersService{
}
