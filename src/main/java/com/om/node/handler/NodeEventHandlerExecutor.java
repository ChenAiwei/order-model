package com.om.node.handler;

import com.om.node.event.NodeEvent;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:22
 */
public class NodeEventHandlerExecutor {
    private NodeEventHandler nodeEventHandler;

    public NodeEventHandlerExecutor(NodeEventHandler nodeEventHandler) {
        this.nodeEventHandler = nodeEventHandler;
    }

    /**
     * 转换为事件明细
     * @param event
     * @param <D>
     * @return
     */
    public <D> D convert(NodeEvent event) {
        return (D) nodeEventHandler.convert(event);
    }

}
