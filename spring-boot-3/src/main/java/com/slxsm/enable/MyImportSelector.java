package com.slxsm.enable;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata.getAnnotationAttributes(EnableLog.class.getName()));
        return new String[]{User.class.getName(),role.class.getName()};
    }
}
