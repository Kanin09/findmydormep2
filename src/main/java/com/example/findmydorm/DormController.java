package com.example.findmydorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dorms")
public class DormController {

    @Autowired
    private DormService dormService;

    @PostMapping("/add")
    public String addDorm(@RequestBody Dorm dorm) {
        return dormService.createDorm(dorm);
    }

    @GetMapping("/all")
    public List<Dorm> getAllDorms() {
        return dormService.getAllDorms();
    }

    // ค้นหาหอพักตามชื่อ
    @GetMapping("/search/name")
    public List<Dorm> searchDormsByName(@RequestParam String keyword) {
        return dormService.searchByName(keyword);
    }

    // ค้นหาหอพักตามระยะทางที่ไม่เกินค่าที่กำหนด
    @GetMapping("/search/distance")
    public List<Dorm> searchDormsByDistance(@RequestParam int maxDistance) {
        return dormService.searchByMaxDistance(maxDistance);
    }

    // ค้นหาหอพักตามราคาที่ไม่เกินค่าที่กำหนด
    @GetMapping("/search/price")
    public List<Dorm> searchDormsByPrice(@RequestParam int maxPrice) {
        return dormService.searchByMaxPrice(maxPrice);
    }

}
