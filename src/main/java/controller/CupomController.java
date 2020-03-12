package controller;

import model.Cupom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CupomRepository;


import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CupomController {
    @Autowired
    private CupomRepository cupomRepository;


    @GetMapping("/cupom")
    public ResponseEntity<List<Cupom>> buscarCupom(@PathParam("idCliente") Long idCliente) {
        return (ResponseEntity<List<Cupom>>) cupomRepository.findByIdCliente(idCliente);
    }

    @GetMapping("/dtVenda")
    public ResponseEntity<List<Cupom>> buscarDtVenda(@PathParam("dtVenda") Long dtVenda) {
        return (ResponseEntity<List<Cupom>>) cupomRepository.findByDtVenda(dtVenda);
    }

    @GetMapping("/consulta")
    public ResponseEntity<List<Cupom>> buscarCupom(@PathParam("idCliente") Long idCliente,
                                                   @PathParam("dtVenda") Long dtVenda) {

    }



}




