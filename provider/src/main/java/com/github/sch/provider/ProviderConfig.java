package com.github.sch.provider;

import com.github.sch.types.DataImpl;
import com.github.sch.types.DataInt;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfig {

    @Bean
    public DataInt dataService() {
        DataInt ref = new DataImpl();
        ProtocolConfig protocol = new ProtocolConfig("dubbo", 12345);
        protocol.setSerialization("kryo");
        ServiceConfig<DataInt> serviceConfig = new ServiceConfig<>();
        serviceConfig.setApplication(new ApplicationConfig("test-provider"));
        serviceConfig.setRegistry(new RegistryConfig("N/A"));
        serviceConfig.setProtocol(protocol);
//        serviceConfig.setSerialization("kryo");
        serviceConfig.setInterface(DataInt.class);
        serviceConfig.setRef(ref);
        serviceConfig.setTimeout(100000);
        serviceConfig.export();
        return ref;
    }
}
