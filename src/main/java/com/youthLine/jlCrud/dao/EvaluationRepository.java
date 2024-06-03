package com.youthLine.jlCrud.dao;

import com.youthLine.jlCrud.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {
}
