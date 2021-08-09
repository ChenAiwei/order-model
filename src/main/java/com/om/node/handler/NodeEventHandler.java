package com.om.node.handler;

import com.om.enums.NodeType;
import com.om.node.event.NodeEvent;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:22
 */
public interface NodeEventHandler<D> {

    /**
     * 节点类型
     * @return
     */
    NodeType getNodeType();

    /**
     * 转换事件明细
     * @param event
     * @return
     */
    D convert(NodeEvent<?> event);
}
