package org.springframework.samples.petclinic.messagingemulator.web;

<<<<<<< HEAD
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.samples.petclinic.messagingemulator.entity.PetClinicMessageRequest;
import org.springframework.samples.petclinic.messagingemulator.entity.PetClinicMessageResponse;
import org.springframework.samples.petclinic.messagingemulator.service.PetClinicVisitRequestSender;
import org.springframework.samples.petclinic.messagingemulator.model.VisitRequest;
import org.springframework.samples.petclinic.messagingemulator.model.VisitRequestRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
=======
import java.util.List;

import javax.jms.JMSException;

import org.springframework.http.HttpStatus;
import org.springframework.samples.petclinic.messagingemulator.entity.PetClinicMessageRequest;
import org.springframework.samples.petclinic.messagingemulator.model.VisitRequest;
import org.springframework.samples.petclinic.messagingemulator.model.VisitRequestRepository;
import org.springframework.samples.petclinic.messagingemulator.service.PetClinicVisitRequestSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178

import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/asb")
@RestController
@Timed("emulator.servicebus")
@RequiredArgsConstructor
@Slf4j
class AzureServiceBusResource {
    private final PetClinicVisitRequestSender petClinicVisitRequestSender;
    private final VisitRequestRepository visitRequestRepository;
<<<<<<< HEAD
    
    @PostMapping
=======

    @PostMapping(produces = "application/text")
    @ResponseStatus(HttpStatus.CREATED)
>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
    public String postMessage(@RequestBody PetClinicMessageRequest message) {
        log.info("Sending message: {}", message);
        String correlationId;
        try {
            correlationId = petClinicVisitRequestSender.sendVisitRequest(message);
<<<<<<< HEAD
            return "Message sent: " + correlationId;
        } catch (JMSException e) {
            return "JMS error: " + e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
=======
            return "Message sent with correlationId: " + correlationId;
            // return new MessageStatus(correlationId,  "Message sent");
        } catch (JMSException e) {
            // return new MessageStatus(false, "JMX error: " + e.getMessage());
            return "JMX error: " + e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
            // return new MessageStatus(false, "Unexpected error: " + e.getMessage());
            return "Unexpected error: " + e.getMessage();
>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
        }
    }

    @GetMapping
    public List<VisitRequest> getAllVisitRequests() {
        return visitRequestRepository.findAll();
    }
<<<<<<< HEAD
    
=======

>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
}
