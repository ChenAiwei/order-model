package com.om.node.detail;

import com.om.node.event.NodeEvent;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:35
 */
public abstract class AbstractNodeEventDetailSaver<D> {
    /**
     * 事件转事件明细
     * @param event
     * @return
     */
    abstract D event2Detail(NodeEvent event);

    /**
     * 保存事件明细
     * @param eventDetail
     */
    abstract void save(D eventDetail);


    /**
     * 保存事件明细
     * @param event
     */
    public void saveEventDetail(NodeEvent event) {
        D eventDetail = event2Detail(event);
        save(eventDetail);
    }
}
