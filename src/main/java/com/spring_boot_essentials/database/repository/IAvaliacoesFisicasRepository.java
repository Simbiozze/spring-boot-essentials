package com.spring_boot_essentials.database.repository;

import com.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import com.spring_boot_essentials.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAvaliacoesFisicasRepository extends JpaRepository<AvaliacoesFisicasEntity,Integer> {

}
