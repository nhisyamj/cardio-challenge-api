package io.swagger.repository;

import io.swagger.model.Category;
import io.swagger.model.Challenge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepository extends CrudRepository<Challenge, Integer> {

    @Query("SELECT c FROM Challenge c WHERE c.title LIKE CONCAT('%',:title,'%') ")
    List<Challenge> findAllByTitleLike(@Param("title") String title);

    List<Challenge> findAllByCategory(Category category);
}
