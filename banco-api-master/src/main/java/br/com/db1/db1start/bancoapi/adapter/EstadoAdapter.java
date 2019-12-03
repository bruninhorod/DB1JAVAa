package br.com.db1.db1start.bancoapi.adapter;

import br.com.db1.db1start.bancoapi.dto.EstadoDto;
import br.com.db1.db1start.bancoapi.entity.Estado;

public class EstadoAdapter {

    public static EstadoDto transformaEstadoParaDto(Estado estado){

        EstadoDto dto = new EstadoDto();
        dto.setId(estado.getId());
        dto.setNome(estado.getNome());
        dto.setNome(estado.getNome());
        return dto;
    }
}
