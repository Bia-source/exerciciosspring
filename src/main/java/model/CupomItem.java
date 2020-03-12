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
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cupom")
    private  Long idCupomItem;

    @OneToOne
    @JoinColumn(name = "id_produto")
    private Long idCupomProduto;

    @Column(name = "qt_produto")
    private Long qtProduto;

    @Column(name = "vl_Produto")
    private BigDecimal vlProduto;

}
