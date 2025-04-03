package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormService {

    @Autowired
    private DormRepository dormRepository;



    public String createDorm(Dorm dorm) {
        dormRepository.save(dorm);
        return "เพิ่มหอพักสำเร็จ";
    }

    public List<Dorm> getAllDorms() {
        return dormRepository.findAll();
    }

    public List<Dorm> searchByName(String keyword) {
        return dormRepository.findByName(keyword);
    }

    public List<Dorm> searchByMaxDistance(int maxDistance) {
        return dormRepository.findByMaxDistance(maxDistance);
    }

    public List<Dorm> searchByMaxPrice(int maxPrice) {
        return dormRepository.findByMaxPrice(maxPrice);
    }

}
