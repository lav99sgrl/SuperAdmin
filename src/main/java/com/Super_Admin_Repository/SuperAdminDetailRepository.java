package com.Super_Admin_Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Super_Admin_Entity.SuperAdminDetail;

@Repository
public interface SuperAdminDetailRepository extends JpaRepository<SuperAdminDetail, Long> {

	
}
