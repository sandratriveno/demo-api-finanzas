package pe.edu.idat.demo_api_finanzas.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-api-academico")
public interface ServiceDocenteClient {
    @GetMapping("/docente")
    String obtenerDocente();


}
