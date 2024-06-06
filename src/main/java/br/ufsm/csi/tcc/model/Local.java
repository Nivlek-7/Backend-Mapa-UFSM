package br.ufsm.csi.tcc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.*;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Local")
public class Local {

    @Id
    @GeneratedValue
    String id;
    String nome;
    double lat;

    @Property("long")
    double longi;

    @Relationship(type = "OFERECE", direction = Relationship.Direction.OUTGOING)
    private Set<Area> areas = new HashSet<>();
}
