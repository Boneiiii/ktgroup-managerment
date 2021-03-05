package com.ktgroup.application.responsitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ktgroup.application.entities.AppRole;

@Repository
public interface AppRoleRespository extends JpaRepository<AppRole, Long>{

	@Query(value = "SELECT appRole.roleName FROM UserRole ur")
	public List<String> getRoleNames(Long userId);
}
