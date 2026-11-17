package com.spring_boot_essentials.database.repository;

import com.spring_boot_essentials.database.model.ExerciciosEntity;
import com.spring_boot_essentials.database.model.TreinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ITreinosRepository extends JpaRepository<TreinoEntity,Integer> {

}
