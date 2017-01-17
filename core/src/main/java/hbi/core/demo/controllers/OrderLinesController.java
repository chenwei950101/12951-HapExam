package hbi.core.demo.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.demo.dto.OrderHeaders;
import hbi.core.demo.dto.OrderLines;
import hbi.core.demo.service.IOrderLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 陈伟 on 2017/1/13.
 */
@RestController
@RequestMapping("/orderLine")
public class OrderLinesController extends BaseController{

    @Autowired
    private IOrderLinesService orderLinesService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public OrderLines insertOrderLines(HttpServletRequest request,OrderLines orderLines){
        IRequest iRequest = this.createRequestContext(request);
        return orderLinesService.insertOrderLines(iRequest,orderLines);
    }

    @RequestMapping(value = "/maxLineNum")
    public Integer selectMaxLineNumber(OrderHeaders headers,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        return orderLinesService.selectMaxLineNumber(iRequest,headers);
    }

    @RequestMapping(value = "/deleteLine")
    public ResponseData deleteLineByLineId(OrderLines line, HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        return new ResponseData(orderLinesService.deleteByPrimaryKey(line) > 0 ? true : false);
    }

    @RequestMapping(value = "/updateLine")
    public ResponseData updateLine(OrderLines lines,HttpServletRequest request){
        IRequest iRequest = this.createRequestContext(request);
        orderLinesService.updateOrderLines(iRequest,lines);
        return new ResponseData(true);
    }
}
