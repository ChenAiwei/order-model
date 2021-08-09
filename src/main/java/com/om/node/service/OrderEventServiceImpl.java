package com.om.node.service;

import com.om.enums.NodeType;
import com.om.node.detail.OrderEventDetailSaver;
import com.om.node.event.NodeEvent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:11
 */
@Service
public class OrderEventServiceImpl implements OrderEventService{

    @Resource
    private OrderEventDetailSaver orderEventDetailSaver;

    @Override
    public <D> void orderEvent(NodeType nodeType, D data) {
        NodeEvent<D> nodeEvent = new NodeEvent<>(nodeType, data);
        orderEventDetailSaver.saveEventDetail(nodeEvent);
    }
}
