package cn.edu.guet.backendmanagement.controller.wx;

import cn.edu.guet.backendmanagement.bean.SysOrder;
import cn.edu.guet.backendmanagement.http.HttpResult;
import cn.edu.guet.backendmanagement.service.SysOrderService;
import cn.edu.guet.backendmanagement.service.SysWxOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author HJK
 * @date 2022/8/6 15:37
 * @Version 1.0
 */

@RequestMapping("wx")
@RestController
public class WXSysOrderController {


    @Autowired
    private SysWxOrderService sysWxOrderService;

    //微信小程序的查询当前订单，
    @GetMapping("/getCurrentOrder")
    public HttpResult getCurrentOrder() {
        return HttpResult.ok(sysWxOrderService.getCurrentOrder());
    }

    //微信小程序查询历史订单
    @GetMapping("/getHistoryOrder")
    public HttpResult getHistoryOrder() {
        return HttpResult.ok(sysWxOrderService.getHistoryOrder());
    }




    //微信小程序退单
    @PostMapping("/moderOrderState")
    public HttpResult moderOrderState(String id,int state){
        return sysWxOrderService.moderOrderState(id,state);
    }

}
