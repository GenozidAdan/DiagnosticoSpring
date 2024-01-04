package mx.edu.utez.DiagnosticoAdan.entidad.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AHDto {
    private Integer idantiheroe;
    private String nombre;
    private String poder;
    private String debilidad;
}
