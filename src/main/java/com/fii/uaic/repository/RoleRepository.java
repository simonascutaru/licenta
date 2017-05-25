package com.fii.uaic.repository;

import com.fii.uaic.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sscutaru on 5/24/2017.
 */

@Repository
//@Transactional
public interface RoleRepository extends JpaRepository<Role, Long>{

}
