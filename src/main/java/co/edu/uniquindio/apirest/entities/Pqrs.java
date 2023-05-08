package co.edu.uniquindio.apirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="pqrs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pqrs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String asunto;

    @Column
    private String descripcion;

    @Column
    private String estado;

    @Column
    private String tipo;

    @Column
    private LocalDate fechaCreacion = LocalDate.now();
}
