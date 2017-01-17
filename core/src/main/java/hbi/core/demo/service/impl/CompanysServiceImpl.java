package hbi.core.demo.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.Companys;
import hbi.core.demo.mapper.CompanysMapper;
import hbi.core.demo.service.ICompanysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 陈伟 on 2017/1/11.
 */
@Service
@Transactional
public class CompanysServiceImpl extends BaseServiceImpl<Companys> implements ICompanysService{
}
