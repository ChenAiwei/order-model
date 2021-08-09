package com.om.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:12
 */
@Getter
public enum NodeType {
    ORDER_PAY(1, "订单支付"),
    ORDER_SEND(2, "订单发货"),
    ORDER_TAKE(3, "订单收获"),
    ORDER_RETURN(4, "订单退货");

    @JsonValue
    private int code;
    private String desc;

    NodeType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @JsonCreator
    public static NodeType valueOf(int code) {
        for (NodeType value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
}
