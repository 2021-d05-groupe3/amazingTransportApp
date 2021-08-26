package com.example.disturbingparadox.role;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public List<Role> findByNom(String nom);
}
