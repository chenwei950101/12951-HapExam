package hbi.core.demo.controllers;


import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.service.IOrderHeadersService;
import hbi.core.demo.service.IOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 陈伟 on 2017/1/10.
 */
@RestController
@RequestMapping("/order")
public class OrderHeadersController extends BaseController{

    @Autowired
    private IOrderHeadersService orderHeadersService;

    @Autowired
    private IOrderLinesService orderLinesService;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public ResponseData selectHeaderInfoList(HttpServletRequest request,
                                             @RequestParam(name = "page",required = false,defaultValue = "1") int page,
                                             @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize,
                                             OrderHeaders headers){
        IRequest iRequest = this.createRequestContext(request);
        List<OrderHeaders> list = orderHeadersService.selectHeaderInfoList(iRequest,headers,page,pageSize);
        return new ResponseData(list);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public OrderHeaders insertHeaderAndLines(HttpServletRequest request,OrderHeaders headers){
        IRequest iRequest = this.createRequestContext(request);
        OrderHeaders orderHeaders = orderHeadersService.insertHeader(iRequest,headers);
        return orderHeaders;
    }

    @RequestMapping(value = "/selectHeader")
    public OrderHeaders selectHeaderByHeaderId(HttpServletRequest request,OrderHeaders headers){
        IRequest iRequest = this.createRequestContext(request);
        OrderHeaders orderHeaders = orderHeadersService.selectHeaderByHeaderId(iRequest,headers);
        return orderHeaders;
    }

    @RequestMapping(value = "/deleteOrder")
    public ResponseData deleteHeaderByHeaderId(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        boolean isSuccess = orderHeadersService.deleteHeaderByHeaderId(iRequest,headers);
        boolean isSuccess2 = orderLinesService.deleteLineByHeaderId(iRequest,headers);
        return new ResponseData(isSuccess && isSuccess2);
    }

    @RequestMapping(value = "/updateSubmit")
    public ResponseData updateHeaderSubmit(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        headers.setOrderStatus("已提交");
        boolean isSuccess = orderHeadersService.updateHeaderStatus(iRequest,headers);
        return new ResponseData(isSuccess);
    }

    @RequestMapping(value = "/updateApprove")
    public ResponseData updateHeaderApprove(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        headers.setOrderStatus("已审批");
        boolean isSuccess = orderHeadersService.updateHeaderStatus(iRequest,headers);
        return new ResponseData(isSuccess);
    }

    @RequestMapping(value = "/updateReject")
    public ResponseData updateHeaderReject(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        headers.setOrderStatus("已拒绝");
        boolean isSuccess = orderHeadersService.updateHeaderStatus(iRequest,headers);
        return new ResponseData(isSuccess);
    }

    @RequestMapping(value = "/updateHeader")
    public ResponseData updateHeader(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        boolean isSuccess = orderHeadersService.updateHeader(iRequest,headers);
        return new ResponseData(isSuccess);
    }
}
