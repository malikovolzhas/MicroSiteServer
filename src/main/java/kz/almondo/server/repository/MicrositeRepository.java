package kz.almondo.server.repository;

import kz.almondo.server.entity.Microsite;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Школа on 17.03.2016.
 */
public interface MicrositeRepository extends JpaRepository<Microsite, Long> {
}
