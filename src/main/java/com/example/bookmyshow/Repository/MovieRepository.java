package com.example.bookmyshow.Repository;


import com.example.bookmyshow.Models.MovieEntity;
import com.example.bookmyshow.Models.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<ShowSeatEntity,Integer> {

    MovieEntity findByMovieName(String movieName);

    void save(MovieEntity movieEntity);
}
