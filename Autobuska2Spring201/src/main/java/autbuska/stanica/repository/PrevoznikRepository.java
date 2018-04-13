package autbuska.stanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import autbuska.stanica.model.Prevoznik;

@Repository
public interface PrevoznikRepository 
	extends JpaRepository<Prevoznik, Long> {
		
}
