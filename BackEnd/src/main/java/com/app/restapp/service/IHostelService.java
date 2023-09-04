package com.app.restapp.service;

import java.util.List;

import com.app.restapp.entities.Hostel;

public interface IHostelService {
    Hostel insertNewHostel(Hostel hostel);

    List<Hostel> getAllHostel();
}
