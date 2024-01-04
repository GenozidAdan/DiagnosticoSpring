package mx.edu.utez.DiagnosticoAdan.service.Impl;

import mx.edu.utez.DiagnosticoAdan.entidad.bean.AHBean;
import mx.edu.utez.DiagnosticoAdan.entidad.dao.AHDao;
import mx.edu.utez.DiagnosticoAdan.entidad.dto.AHDto;
import mx.edu.utez.DiagnosticoAdan.service.IAH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImplAH implements IAH {

    @Autowired
    private AHDao ahDao;
    @Override
    public AHBean save(AHDto ah) {

        AHBean Antiheroe = AHBean.builder()
                .idantiheroe(ah.getIdantiheroe())
                .nombre(ah.getNombre())
                .poder(ah.getPoder())
                .debilidad(ah.getDebilidad())
                .build();
        return ahDao.save(Antiheroe);
    }

    @Override
    @Transactional(readOnly = true)
    public AHBean findById(Integer id) {
        return ahDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AHBean> findAll() {
        return (List<AHBean>) ahDao.findAll();
    }

    @Override
    public void delete(AHBean ah) {
    ahDao.delete(ah);
    }
}
