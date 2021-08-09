package com.om.node.handler.impl;

import cn.hutool.core.bean.BeanUtil;
import com.om.enums.NodeType;
import com.om.node.dto.OrderPay;
import com.om.node.event.NodeEvent;
import com.om.node.handler.AbstractNodeEventHandler;
import com.om.vo.OrderPayVo;
import org.springframework.stereotype.Component;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:49
 */
@Component
public class OrderPayHandler extends AbstractNodeEventHandler<OrderPay> {
    @Override
    public NodeType getNodeType() {
        return NodeType.ORDER_PAY;
    }

    @Override
    public OrderPay convert(NodeEvent<?> event) {
        OrderPayVo orderPayVo = (OrderPayVo) event.getData();
        OrderPay orderPay = new OrderPay();
        BeanUtil.copyProperties(orderPayVo,orderPay);
        orderPay.setOrderNum("1627982296147614");
        orderPay.setNodeType(event.getNodeType());
        return orderPay;
    }
}
