package com.om.node.handler;

import cn.hutool.core.map.MapUtil;
import com.om.enums.NodeType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author chenaiwei
 * @date 2021/8/3 15:22
 */
@Component
public class NodeEventHandlerContext implements ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    private Map<NodeType, NodeEventHandler> handlerMap = MapUtil.newHashMap();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, NodeEventHandler> beans = applicationContext.getBeansOfType(NodeEventHandler.class);
        handlerMap = MapUtil.newHashMap();
        for (NodeEventHandler nodeEventHandler : beans.values()) {
            handlerMap.put(nodeEventHandler.getNodeType(), nodeEventHandler);
        }
    }

    /**
     * 根据节点类型获取节点处理器
     * @param nodeType
     * @return
     */
    public NodeEventHandler getNodeEventHandler(NodeType nodeType) {
        return handlerMap.get(nodeType);
    }
}
