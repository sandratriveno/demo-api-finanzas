package pe.edu.idat.demo_api_finanzas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionPagoController {
    @GetMapping("/pago")
    public String obtenerPago(){
        return "Respuesta del servicio de Finanzas-Pago";

    }
}
