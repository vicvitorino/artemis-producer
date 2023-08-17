package br.artemisproducer.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ArtemisProducer {

//    @Value("${rabbitmq.exchange.name}")
//    private String exchange;
//
//    @Value("${rabbitmq.routing.key}")
//    private String routingKey;
    private JmsTemplate jmsTemplate;

    public ArtemisProducer(final JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(final String message) {
        log.info(String.format("Enviado -> %s", message));
        jmsTemplate.convertAndSend("address.foo::q1", message);
    }

    public void sendMessages(final String message) {
        log.info(String.format("Enviado -> %s", message));
        jmsTemplate.setPubSubDomain(true);
        jmsTemplate.convertAndSend("address.bar", message);
    }

}
