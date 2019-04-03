package com.yrova.app.repository;


import com.yrova.app.model.Role;
import com.yrova.app.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(RoleName roleName);


    //TODO: provide a wya to allow a search by role feature
    //Optional<Role> findByRole(String role);
}
