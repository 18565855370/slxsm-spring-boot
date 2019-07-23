package com.slxsm.enable;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog.class.getName()));
        BeanDefinitionBuilder userBuilder = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        registry.registerBeanDefinition("user",userBuilder.getBeanDefinition());

        BeanDefinitionBuilder roleBuilder = BeanDefinitionBuilder.rootBeanDefinition(role.class);
        registry.registerBeanDefinition("role",roleBuilder.getBeanDefinition());
    }
}
