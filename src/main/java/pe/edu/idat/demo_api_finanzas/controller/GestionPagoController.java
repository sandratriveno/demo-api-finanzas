package pe.edu.idat.demo_api_finanzas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_api_finanzas.service.ServiceDocenteClient;

@RestController
public class GestionPagoController {

    private final ServiceDocenteClient serviceDocenteClient;

    public GestionPagoController(ServiceDocenteClient serviceDocenteClient) {
        this.serviceDocenteClient = serviceDocenteClient;
    }

    @GetMapping("/pago")
    public String obtenerPago(){
        return "Respuesta del servicio de Finanzas-Pago";

    }

    @GetMapping("/pago-docente")
    public String obtenerPagoDelDocente(){
        return serviceDocenteClient.obtenerDocente();

    }
}
