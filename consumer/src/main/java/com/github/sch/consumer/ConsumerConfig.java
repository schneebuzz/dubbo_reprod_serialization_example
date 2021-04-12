package com.github.sch.consumer;

import com.github.sch.types.DataInt;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {

    @Bean
    public DataInt dataServiceConsumer() {
        ReferenceConfig<DataInt> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("test-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("N/A"));
        referenceConfig.setProtocol("dubbo");
        referenceConfig.setInterface(DataInt.class);
        referenceConfig.setUrl("localhost:12345");
        referenceConfig.setTimeout(100000);
        return referenceConfig.get();
    }


}
