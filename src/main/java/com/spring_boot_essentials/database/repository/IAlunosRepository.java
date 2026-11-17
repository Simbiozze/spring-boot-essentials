package com.spring_boot_essentials.database.repository;

import com.spring_boot_essentials.database.model.AlunosEntity;
import com.spring_boot_essentials.database.model.AvaliacoesFisicasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAlunosRepository extends JpaRepository<AlunosEntity,Integer> {

}
