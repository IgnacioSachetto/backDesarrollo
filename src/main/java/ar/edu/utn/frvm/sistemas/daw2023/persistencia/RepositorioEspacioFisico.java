package ar.edu.utn.frvm.sistemas.daw2023.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frvm.sistemas.daw2023.model.EspacioFisico;

@Repository
public interface RepositorioEspacioFisico extends PagingAndSortingRepository<EspacioFisico, Integer> {

    Iterable<EspacioFisico> findAllByNombreIgnoreCase(String nombre);

    Iterable<EspacioFisico> findAllByNombreIgnoreCaseContaining(String nombre);

    Iterable<EspacioFisico> findAllByNombreIgnoreCaseContainingAndCapacidad(String nombre, Integer capacidad);

    Iterable<EspacioFisico> findAllByCapacidad(Integer capacidad);

}
