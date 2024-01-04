package mx.edu.utez.DiagnosticoAdan.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.DiagnosticoAdan.entidad.bean.AHBean;
import mx.edu.utez.DiagnosticoAdan.entidad.dto.AHDto;
import mx.edu.utez.DiagnosticoAdan.service.IAH;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("diagnostico/antiheroeadan/")
public class AHController {
    private final IAH ahService;


    @GetMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AHBean> getAH() {
        return ahService.findAll();
    }


    @GetMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public AHBean showById(@PathVariable Integer id) {
        return ahService.findById(id);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public void delete(@PathVariable Integer id){
        AHBean ah = ahService.findById(id);
        ahService.delete(ah);
    }

    @PostMapping("/")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public AHDto create(@RequestBody AHDto ahDto){
        AHBean ahSave = ahService.save(ahDto);
        return AHDto.builder()
                .idantiheroe(ahSave.getIdantiheroe())
                .nombre(ahSave.getNombre())
                .poder(ahSave.getPoder())
                .debilidad(ahSave.getDebilidad())
                .build();
    }


    @PutMapping("/put")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public AHDto update(@RequestBody AHDto ahDto){
        AHBean ahUpdate = ahService.save(ahDto);
        return AHDto.builder()
                .idantiheroe(ahUpdate.getIdantiheroe())
                .nombre(ahUpdate.getNombre())
                .poder(ahUpdate.getPoder())
                .debilidad(ahUpdate.getDebilidad())
                .build();
    }
}
