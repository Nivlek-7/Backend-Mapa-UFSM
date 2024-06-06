package br.ufsm.csi.tcc.repository;

import br.ufsm.csi.tcc.model.Carrapicho;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrapichoRepository extends Neo4jRepository<Carrapicho, String> {

    @Query("MATCH (c:Carrapicho) RETURN c LIMIT 20")
    List<Carrapicho> findFirst20Carrapichos();

    @Query("""
            MATCH (c:Carrapicho)
            WHERE toFloat(c.umidade) <= $umidade
            RETURN c""")
    List<Carrapicho> findCarrapichosByUmidadeLessThanEqual(Double umidade);
}
