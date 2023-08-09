package com.example.bookmyshow.Repository;

import com.example.bookmyshow.Models.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatsRepository extends JpaRepository<ShowSeatEntity,Integer> {
}
