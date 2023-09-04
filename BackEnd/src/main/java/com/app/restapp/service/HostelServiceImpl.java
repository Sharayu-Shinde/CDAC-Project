package com.app.restapp.service;

import com.app.restapp.dao.HostelRepository;
import com.app.restapp.entities.Hostel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelServiceImpl implements IHostelService{

    @Autowired
    private HostelRepository hostelRepository;

    @Override
    public Hostel insertNewHostel(Hostel hostel) {
        hostelRepository.save(hostel);
        return hostel;
    }

    @Override
    public List<Hostel> getAllHostel() {
        List<Hostel> hostelList = hostelRepository.findAll();
        return hostelList;
    }


}
