package service;

import controller.CupomController;
import model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class Service {

    @Autowired
    private CupomController cupomController;

    public ResponseEntity buscarCupom (Cupom cupom){
        List<Cupom> listaCupom = new ArrayList<>();
        Cupom cupom1 = new Cupom();
        cupom1.setIdCliente(cupom.getIdCliente());
        cupom1.setDtVenda(cupom.getDtVenda());
        listaCupom.add(cupom1);
        return (ResponseEntity) listaCupom;
    }
}
