package com.om.vo;

import com.om.enums.SourceType;
import lombok.Data;

/**
 * @author chenaiwei
 * @date 2021/8/3 16:42
 */
@Data
public class BaseOrderVo {
    private Long timeStamp;
    private SourceType sourceType;
}
