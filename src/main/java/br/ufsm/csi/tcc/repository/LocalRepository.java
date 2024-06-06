package br.ufsm.csi.tcc.repository;

import br.ufsm.csi.tcc.model.Local;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends Neo4jRepository<Local, String> {

    @Query("""
            MATCH (l:Local)-[:OFERECE]->(a:Area {nome: $nome})
            RETURN l""")
    List<Local> findLocalsByArea(String nome);

/* Tentativa de fazer uma consulta parecida como o LIKE do SQL
    @Query("""
            MATCH (l:Local)-[:OFERECE]->(a:Area)
            WHERE a.nome =~ '(?i).*$nomeArea.*'
            RETURN l""")
    List<Local> findLocalsByArea(String nome); */

}
