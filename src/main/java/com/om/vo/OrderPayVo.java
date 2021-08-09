package com.om.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:41
 */
@Data
public class OrderPayVo extends BaseOrderVo{
    private Integer num;
    private BigDecimal unitPrice;
    private BigDecimal totalAmount;
    private BigDecimal actPay;
}
