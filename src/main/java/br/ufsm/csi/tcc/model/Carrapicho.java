package br.ufsm.csi.tcc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Carrapicho")
public class Carrapicho {

    @Id
    @GeneratedValue
    String id;
    String produt_fil;
    String umidade;
    String latitude;
    String longitude;
}