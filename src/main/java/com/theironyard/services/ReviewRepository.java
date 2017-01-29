package com.theironyard.services;


import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by gilbertakpan on 1/29/17.
 */
public interface ReviewRepository extends CrudRepository<Review, Integer>{
    List<Review> findByLecturer(Lecturer lecturer);
}
