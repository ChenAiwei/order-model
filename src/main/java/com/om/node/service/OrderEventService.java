package com.om.node.service;

import com.om.enums.NodeType;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:20
 */
public interface OrderEventService {
    <D> void orderEvent (NodeType nodeType, D data);
}
