package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import hbi.core.demo.dto.Items;
import hbi.core.demo.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@RestController
@RequestMapping("/items")
public class ItemsController extends BaseController{

    @Autowired
    private IItemsService itemsService;

    @RequestMapping("selectItem")
    public Items selectItemsByItemsId(Items items,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        return itemsService.selectByPrimaryKey(iRequest,items);
    }
}
