package com.example.demoparkapi.service;

import com.example.demoparkapi.entity.Vaga;
import com.example.demoparkapi.exception.CodigoUniqueViolationException;
import com.example.demoparkapi.exception.EntityNotFoundException;
import com.example.demoparkapi.repository.VagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.demoparkapi.entity.Vaga.StatusVaga.LIVRE;

@RequiredArgsConstructor
@Service
public class VagaService {

    private final VagaRepository vagaRepository;

    @Transactional
    public Vaga salvar(Vaga vaga){
        try {
            return vagaRepository.save(vaga);
        } catch (DataIntegrityViolationException ex) {
            throw new CodigoUniqueViolationException(String.format("Vaga com código '%s' já cadastrada", vaga.getCodigo()));
        }
    }

    public Vaga buscarPorCodigo(String codigo) {
        return vagaRepository.findByCodigo(codigo).orElseThrow(
                () -> new EntityNotFoundException(String.format("Vaga com código '%s' não foi encontrada", codigo))
        );
    }

    @Transactional(readOnly = true)
    public Vaga buscarPorVagaLivre() {
        return vagaRepository.findFirstByStatus(LIVRE).orElseThrow(
                () -> new EntityNotFoundException(String.format("Nenhuma vaga livre foi encontrada"))
        );
    }
}
