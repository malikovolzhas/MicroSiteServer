package kz.almondo.server.controller;

import kz.almondo.server.entity.Microsite;
import kz.almondo.server.repository.MicrositeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by User on 14.03.2016.
 */
@RestController
@RequestMapping("/microsite")
public class MicrositeController {


    @Autowired
    private MicrositeRepository micrositeRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Microsite getMicrosite() {
        List<Microsite> list = micrositeRepository.findAll();
        return createMockMicrosite();
    }

    private Microsite createMockMicrosite() {
        Microsite microsite = new Microsite();

        microsite.setId(1);
        microsite.setName("6-участок");
        return microsite;
    }
}
