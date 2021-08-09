package com.om.node.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPay extends OrderEventDetail{
    private Integer num;
    private BigDecimal unitPrice;
    private BigDecimal totalAmount;
    private BigDecimal actPay;
}
