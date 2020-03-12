package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cupom {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long idCupom;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name ="dt_venda")
    private Long dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlVenda;


}
