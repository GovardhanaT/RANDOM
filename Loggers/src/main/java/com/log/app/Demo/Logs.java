package com.log.app.Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Logs {
	
Logger log = LoggerFactory.getLogger(Controller.class);
@RequestMapping("/")
public String demo()
{
	log.info("info msge");
	log.warn("warn msge");
	log.error("err msge");
	log.debug("debug msge");
	log.trace("trace msge");
	return "completed";
}
}
