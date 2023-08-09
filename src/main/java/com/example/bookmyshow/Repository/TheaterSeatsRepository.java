package com.example.bookmyshow.Repository;

import com.example.bookmyshow.Models.TheaterSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatEntity,Integer> {
}
