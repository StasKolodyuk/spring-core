package com.epam.jmp.service;

import com.epam.jmp.dao.*;
import com.epam.jmp.dao.factory.FactoryInjectedDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DummyService {

    @Value("${app.name}")
    String appName;

    @Resource(name = "customlyNamedDAO")
    NamedDAO namedDAO;
    @Autowired
    FieldInjectedDAO fieldInjectedDAO;
    @Autowired
    PrototypeDAO prototypeDAO;
    @Autowired
    FactoryInjectedDAO factoryInjectedDAO;

    ConstructorInjectedDAO constructorInjectedDAO;
    SetterInjectedDAO setterInjectedDAO;

    @Autowired
    public DummyService(ConstructorInjectedDAO constructorInjectedDAO) {
        this.constructorInjectedDAO = constructorInjectedDAO;
    }

    @Autowired
    public void setSetterInjectedDAO(SetterInjectedDAO setterInjectedDAO) {
        this.setterInjectedDAO = setterInjectedDAO;
    }
}
