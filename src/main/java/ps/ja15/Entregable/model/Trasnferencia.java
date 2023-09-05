package ps.ja15.Entregable.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data

public class Trasnferencia {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

@ManyToOne
@JoinColumn(name=)
    private Cuenta cuentaOrigen;


    private Cuenta cuentaDestino;


    private BigDecimal monto;


    private LocalDateTime fechaTransferencia;

}
