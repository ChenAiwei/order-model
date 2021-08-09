package com.om.node.dto;

import com.om.enums.NodeType;
import com.om.enums.SourceType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:33
 */
@Getter
@Setter
@ToString
public class OrderEventDetail {
    /**
     * 事件发生时间
     */
    private Long timeStamp;

    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 事件源
     */
    private SourceType sourceType;

    /**
     * 业务节点
     */
    private NodeType nodeType;

}
