package com.com.azurepipeline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.azurepipeline.entity.Device;



public interface DeviceRepository extends JpaRepository<Device,Integer> {


}
