package com.A.OrdenService.controller;


import com.A.OrdenService.entity.Orden;
import com.A.OrdenService.service.OrdenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    private final OrdenService ordenService;

    public OrdenController(OrdenService ordenService) {
        this.ordenService = ordenService;
    }

    @PostMapping
    public ResponseEntity<Orden> registrarOrden(@RequestBody Orden orden) {
        return ResponseEntity.ok(ordenService.registrarOrden(orden));
    }

    @GetMapping
    public ResponseEntity<Orden> buscarOrdenPorId(@PathVariable Long id) {
        return ResponseEntity.ok(ordenService.buscarOrdenPorId(id));
    }

    @PutMapping
    public ResponseEntity<Orden> actualizarOrden(@PathVariable Long id, @RequestBody Orden orden) {
        return ResponseEntity.ok(ordenService.actualizarOrden(id, orden));
    }


    /*@PatchMapping
    public ResponseEntity<Orden> actualizarOrden(@RequestBody Orden orden) {
        
    }*/

    @DeleteMapping
    public ResponseEntity<Void> eliminarOrden(@PathVariable Long id) {
        ordenService.eliminarOrden(id);
        return null;
    }

}
