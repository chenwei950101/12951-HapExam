package hbi.core.demo.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.Customers;

/**
 * Created by 陈伟 on 2017/1/14.
 */
public interface ICustomersService extends IBaseService<Customers>,ProxySelf<Customers>{
}
