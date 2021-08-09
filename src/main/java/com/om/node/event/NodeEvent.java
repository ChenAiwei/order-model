package com.om.node.event;

import com.om.enums.NodeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:18
 */
@AllArgsConstructor
@Getter
public class NodeEvent<D> {
    /**
     * 节点类型
     */
    private NodeType nodeType;
    /**
     * 节点事件数据
     */
    private D data;
}
