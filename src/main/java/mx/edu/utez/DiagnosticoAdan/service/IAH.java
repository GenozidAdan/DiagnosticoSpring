package mx.edu.utez.DiagnosticoAdan.service;

import mx.edu.utez.DiagnosticoAdan.entidad.bean.AHBean;
import mx.edu.utez.DiagnosticoAdan.entidad.dto.AHDto;

import java.util.List;

public interface IAH {
    AHBean save(AHDto ah);

    AHBean findById(Integer id);

    List<AHBean> findAll();

    void delete(AHBean ah);
}

