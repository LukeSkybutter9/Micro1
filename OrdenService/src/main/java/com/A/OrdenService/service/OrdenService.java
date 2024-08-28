package com.A.OrdenService.service;

import com.A.OrdenService.entity.Orden;

public interface OrdenService {

    public Orden registrarOrden(Orden orden);

    public Orden buscarOrdenPorId(Long id);

    public Orden actualizarOrden(Long id, Orden ordenDetalles);

    public Orden modificarOrden(Long id);

    public void eliminarOrden(Long id);
}
