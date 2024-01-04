package mx.edu.utez.DiagnosticoAdan.entidad.bean;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "antiheroe")
public class AHBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idantiheroe;
    @Column(name = "nombre", nullable = false, length = 45, unique = true)
    private String nombre;
    @Column(name = "poder", nullable = false, length = 45)
    private String poder;
    @Column(name = "debilidad", nullable = false, length = 45)
    private String debilidad;
}
