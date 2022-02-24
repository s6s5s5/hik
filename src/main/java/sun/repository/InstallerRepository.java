package sun.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sun.repository.entity.Installer;

import java.io.Serializable;
import java.util.List;


@Repository
public interface InstallerRepository extends JpaRepository<Installer, Serializable>, JpaSpecificationExecutor<Installer> {
    List<Installer> findAll();
}
