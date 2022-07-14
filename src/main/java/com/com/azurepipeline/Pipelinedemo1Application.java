package com.com.azurepipeline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.com.azurepipeline.entity.Device;
import com.com.azurepipeline.repository.DeviceRepository;

@SpringBootApplication
@RestController
public class Pipelinedemo1Application {
	@Autowired
	private DeviceRepository repository;

    @PostMapping("/device")
    public Device addDevice(@RequestBody Device devices) {
        return repository.save(devices);
    }

    @GetMapping("/devices")
    public List<Device> getDevices() {
        return repository.findAll();
    }

	public static void main(String[] args) {
		SpringApplication.run(Pipelinedemo1Application.class, args);
	}

}
