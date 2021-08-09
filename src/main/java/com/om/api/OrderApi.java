package com.om.api;

import com.om.enums.NodeType;
import com.om.enums.SourceType;
import com.om.node.service.OrderEventService;
import com.om.vo.OrderPayVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:15
 */
@RestController
@RequestMapping("/order")
public class OrderApi {

    @Autowired
    private OrderEventService orderEventService;

    @GetMapping("/pay")
    private void orderPay(){
        OrderPayVo orderPayVo = new OrderPayVo();
        orderPayVo.setTimeStamp(System.currentTimeMillis());
        orderPayVo.setSourceType(SourceType.SOURCE_ALIPAY);
        orderPayVo.setNum(1);
        orderPayVo.setUnitPrice(new BigDecimal(10));
        orderPayVo.setActPay(new BigDecimal(9.5));
        orderPayVo.setTotalAmount(new BigDecimal(orderPayVo.getNum()).multiply(orderPayVo.getUnitPrice()));
        orderEventService.orderEvent(NodeType.ORDER_PAY,orderPayVo);
    }
}
