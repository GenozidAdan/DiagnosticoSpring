package mx.edu.utez.DiagnosticoAdan.entidad.dao;

import mx.edu.utez.DiagnosticoAdan.entidad.bean.AHBean;
import org.springframework.data.repository.CrudRepository;

public interface AHDao extends CrudRepository<AHBean, Integer> {
}
