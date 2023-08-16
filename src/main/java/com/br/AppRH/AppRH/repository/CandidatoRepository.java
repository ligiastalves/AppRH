package com.br.AppRH.AppRH.repository;

import org.springframework.data.repository.CrudRepository;
import com.br.AppRH.AppRH.models.Candidato;
import com.br.AppRH.AppRH.models.Vaga;

import java.util.List;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
    Iterable<Candidato> findByVaga(Vaga vaga);

    Candidato findByRg(String rg);

    Candidato findById(long id);

    List<Candidato> findByNomeCandidato(String nomeCandidato);


}