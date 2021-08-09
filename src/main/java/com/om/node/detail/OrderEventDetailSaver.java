package com.om.node.detail;

import com.om.node.dto.OrderEventDetail;
import com.om.node.event.NodeEvent;
import com.om.node.handler.NodeEventHandler;
import com.om.node.handler.NodeEventHandlerContext;
import com.om.node.handler.NodeEventHandlerExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:03
 */
@Component
@Slf4j
public class OrderEventDetailSaver extends AbstractNodeEventDetailSaver<OrderEventDetail>{
    @Resource
    private NodeEventHandlerContext nodeEventHandlerContext;

    @Override
    OrderEventDetail event2Detail(NodeEvent event) {
        NodeEventHandler nodeEventHandler = nodeEventHandlerContext.getNodeEventHandler(event.getNodeType());
        NodeEventHandlerExecutor eventHandlerExecutor = new NodeEventHandlerExecutor(nodeEventHandler);
        return eventHandlerExecutor.convert(event);
    }

    @Override
    void save(OrderEventDetail eventDetail) {
        log.info("发生订单节点事件,生成时间：{},来源：{},类型：{},订单号：{},事件明细：{}",eventDetail.getTimeStamp(),
                eventDetail.getSourceType().getDesc(),
                eventDetail.getNodeType().getDesc(),eventDetail.getOrderNum(),eventDetail.toString());
        switch (eventDetail.getNodeType()){
            case ORDER_PAY:
                break;
            case ORDER_SEND:
                break;
            case ORDER_TAKE:
                break;
            case ORDER_RETURN:
                break;
            default:
                return;
        }

    }
}
