package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormService {

    @Autowired
    private DormRepository dormRepository;



    public String createDorm(Dorm dorm) {
        if (dorm.getImages() != null) {
            for (String imageUrl : dorm.getImages()) {
                if (!imageUrl.startsWith("http")) {
                    throw new IllegalArgumentException("รูปภาพต้องเป็น URL ที่ถูกต้อง");
                }
            }
        }
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


    // ✅ ดึงหอพักตาม ID (ใช้ String เพราะ MongoDB ใช้ id แบบ string)
    public Dorm getDormById(String id) {
        return dormRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ไม่พบหอพักที่มี ID: " + id));


    }

}
