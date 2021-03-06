
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.Score;
import com.usa.ciclo3.ciclo3.repository.crud.ScoreCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lilia
 */
@Repository
public class ScoreRepository {
   @Autowired
    private ScoreCrudRepository scoreCrudRepository;
    
    public List<Score> getAll(){
        return (List<Score>)scoreCrudRepository.findAll();
    }
    
    public Optional<Score> getScore(int id){
        return scoreCrudRepository.findById(id);
    }
    public Score save(Score scr){
        return scoreCrudRepository.save(scr);
    }
}
