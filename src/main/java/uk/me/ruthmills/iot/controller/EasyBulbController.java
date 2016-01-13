package uk.me.ruthmills.iot.controller;

import java.io.IOException;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import de.toman.milight.MiLightWiFiBox;

@Controller
@RequestMapping("/easybulb")
public class EasyBulbController {
	
	private MiLightWiFiBox easyBulb;
	
	public EasyBulbController() {
		try {
			easyBulb = new MiLightWiFiBox("easybulb");
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
	}

	@RequestMapping(value = "/off", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void off() throws IOException {
		easyBulb.off();
	}
	
	@RequestMapping(value = "/off/{group}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void off(@PathVariable Integer group) throws IOException {
		easyBulb.off(group);
	}
	
	@RequestMapping(value = "/on", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void on() throws IOException {
		easyBulb.on();
	}
	
	@RequestMapping(value = "/on/{group}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void on(@PathVariable Integer group) throws IOException {
		easyBulb.on(group);
	}
	
	@RequestMapping(value = "/white", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void white() throws IOException {
		easyBulb.white();
	}
	
	@RequestMapping(value = "/white/{group}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void white(@PathVariable Integer group) throws IOException {
		easyBulb.white(group);
	}
	
	@RequestMapping(value = "/discoMode/{group}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void discoMode(@PathVariable Integer group) throws IOException {
		easyBulb.discoMode(group);
	}
	
	@RequestMapping(value = "/discoModeFaster", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void discoModeFaster() throws IOException {
		easyBulb.discoModeFaster();
	}
	
	@RequestMapping(value = "/discoModeSlower", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void discoModeSlower() throws IOException {
		easyBulb.discoModeSlower();
	}
	
	@RequestMapping(value = "/brightness/{group}/{value}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void brightness(@PathVariable Integer group, @PathVariable Integer value) throws IOException {
		easyBulb.brightness(group, value);
	}
	
	@RequestMapping(value = "/colour/{group}/{value}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public void colour(@PathVariable Integer group, @PathVariable Integer value) throws IOException {
		easyBulb.color(group, value);
	}
}
