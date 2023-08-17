package br.artemisproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArtemisProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtemisProducerApplication.class, args);
    }

//    @Value( "${activemq.url}" )
//    private String brokerUrl;
//
//    @Value( "${activemq.user}" )
//    private String user;
//
//    @Value( "${activemq.password}" )
//    private String password;
//
//    @Bean
//    public ActiveMQConnectionFactory connectionFactory() {
//        if ("".equals(user)) {
//            return new ActiveMQConnectionFactory(brokerUrl);
//        }
//        return new ActiveMQConnectionFactory(user, password, brokerUrl);
//    }
//
//    @Bean
//    public JmsListenerContainerFactory jmsFactoryTopic(ConnectionFactory connectionFactory,
//                                                       DefaultJmsListenerContainerFactoryConfigurer configurer) {
//        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
//        configurer.configure(factory, connectionFactory);
//        factory.setPubSubDomain(true);
//        factory.setClientId("produtor");
//        factory.setSubscriptionDurable(true);
//        return factory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplateTopic() {
//        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory());
//        jmsTemplate.setPubSubDomain(true);
//        return jmsTemplate;
//    }
}
