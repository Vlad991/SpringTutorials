package com.spring_core.configuration;

import com.spring_core.robot.ModelT1000;
import com.spring_core.sony.SonyHand;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class ProcessBean implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass() == ModelT1000.class) {
            ((SonyHand)((ModelT1000)bean).getHand()).setColor("white");
        }
        return bean;
    }
}
