package com.coderhouse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository <Producto,Long> {

}
