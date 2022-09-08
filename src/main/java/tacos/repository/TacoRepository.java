package tacos.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.Taco;

public interface TacoRepository extends CrudRepository<Taco,Long> {
    Iterable<Taco> findAll();
    Iterable<Taco> findAll(Pageable pageable);
}
