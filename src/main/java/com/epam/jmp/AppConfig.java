package com.epam.jmp;

import com.epam.jmp.dao.factory.DAOFactoryBean;
import com.epam.jmp.dao.factory.FactoryInjectedDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.jmp")
@PropertySource("app.properties")
public class AppConfig
{
    @Bean
    public DAOFactoryBean daoFactoryBean() {
        return new DAOFactoryBean();
    }

    @Bean
    public FactoryInjectedDAO factoryInjectedDAO() throws Exception {
        return daoFactoryBean().getObject();
    }
}
