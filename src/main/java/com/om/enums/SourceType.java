package com.om.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:35
 */
@Getter
public enum SourceType {

    SOURCE_WECHAT(1,"微信平台"),
    SOURCE_ALIPAY(2,"淘宝平台"),
    SOURCE_PDD(3,"拼多多平台"),
    SOURCE_JD(4,"京东平台"),
    SOURCE_MERCHANT(5,"客户平台"),
    SOURCE_ELSE(6,"其他平台");

    @JsonValue
    private int code;
    private String desc;

    SourceType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @JsonCreator
    public static SourceType valueOf(int code) {
        for (SourceType value : values()) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }
}
