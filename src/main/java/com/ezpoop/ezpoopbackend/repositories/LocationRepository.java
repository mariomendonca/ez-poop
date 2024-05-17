package com.ezpoop.ezpoopbackend.repositories;

import com.ezpoop.ezpoopbackend.domains.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
