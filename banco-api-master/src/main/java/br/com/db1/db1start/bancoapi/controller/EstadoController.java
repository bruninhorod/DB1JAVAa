package br.com.db1.db1start.bancoapi.controller;

import br.com.db1.db1start.bancoapi.adapter.EstadoAdapter;
import br.com.db1.db1start.bancoapi.dto.EstadoDto;
import br.com.db1.db1start.bancoapi.dto.EstadoFormDto;
import br.com.db1.db1start.bancoapi.entity.Estado;
import br.com.db1.db1start.bancoapi.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estados")
    public List<EstadoDto> buscarTodosEstados() {
        List<Estado> estados = estadoService.buscarTodos();
        List<EstadoDto> listaDeRetorno = new ArrayList();

        estados.forEach(estado -> {
            EstadoDto meuEstadoDto = EstadoAdapter.transformaEstadoParaDto(estado);
            listaDeRetorno.add(meuEstadoDto);
        });

        return listaDeRetorno;
    }

    @PostMapping("/estado")
    public void cadastrarNovoEstado(@RequestBody EstadoFormDto form){
        estadoService.criar(form.getNome());
    }

    @PutMapping ("/estado/{estadoId}")
    public void atualizaEstado(@PathVariable Long estadoId, @RequestBody EstadoFormDto form){
        estadoService.atualizar(estadoId, form);
    }

    @DeleteMapping("/estado/{estadoId}")
    public void deleteEstado(@PathVariable Long estadoId){
        estadoService.deletarPorId(estadoId);
    }
}




