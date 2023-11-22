package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
// Esto lo que hace es que en cada lugar donde jdbcConnection es usado,comenzará a usar proxy
// cada vez que haya una solicitud será una nueva instancia
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JDBC Connection");
    }


}
