package com.epam.jmp.dao.factory;


import org.springframework.beans.factory.FactoryBean;

public class DAOFactoryBean implements FactoryBean<FactoryInjectedDAO>
{
    @Override
    public FactoryInjectedDAO getObject() throws Exception
    {
        return new FactoryInjectedDAO();
    }

    @Override
    public Class<?> getObjectType()
    {
        return FactoryInjectedDAO.class;
    }

    @Override
    public boolean isSingleton()
    {
        return true;
    }
}
