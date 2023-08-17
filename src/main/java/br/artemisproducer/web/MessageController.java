package br.artemisproducer.web;

import br.artemisproducer.producer.ArtemisProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MessageController {

    private ArtemisProducer producer;

    public MessageController(final ArtemisProducer producer) {
        this.producer = producer;
    }

    // http://localhost:8080/api/v1/publish?message=hello
    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(final @RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok(".");
    }

    // http://localhost:8080/api/v1/multipublish?message=hello
    @GetMapping("/multipublish")
    public ResponseEntity<String> sendMessages(final @RequestParam("message") String message) {
        producer.sendMessages(message);
        return ResponseEntity.ok(".");
    }

}
