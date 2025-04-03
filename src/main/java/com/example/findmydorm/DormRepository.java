package com.example.findmydorm;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface DormRepository extends MongoRepository<Dorm, String> {

    // ค้นหาหอพักด้วย keyword ใน name
    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    List<Dorm> findByName(String keyword);

    // ค้นหาหอพักจากระยะทางที่ไม่เกินค่าที่กำหนด
    @Query("{ 'distance': { $lte: ?0 } }")
    List<Dorm> findByMaxDistance(int maxDistance);

    // ค้นหาหอพักจากราคาที่ไม่เกินค่าที่กำหนด
    @Query("{ 'price': { $lte: ?0 } }")
    List<Dorm> findByMaxPrice(int maxPrice);


}
