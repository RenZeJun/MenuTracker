package com.project.MenuTracker.repository;

import com.project.MenuTracker.model.MenuDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuDTO, Long> {

}
