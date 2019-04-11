package com.yrova.app.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name="Exo_Planets", uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "p_name"
    }),
})
public class ExoPlanet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @NotBlank
    @Size(max=20)
    @Column(name="planet_name")
    private String planetName;

    @Size(max=20)
    @Column(name="host_star")
    private String hostStar;

    @Column(name="disc_method")
    private String discoveryMethod;

    @NotBlank
    @Column(name="planet_mass")
    private Long planetMass;

    public ExoPlanet(){
        
    }

    public ExoPlanet(String planetName, String hostStar, String discoveryMethod, Long planetMass ){
        this.planetName = planetName;
        this.hostStar = hostStar;
        this.discoveryMethod = discoveryMethod;
        this.planetMass = planetMass;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPlanetName(){
        return planetName;
    }

    public void setPlanetName(String planetName){
        this.planetName = planetName;
    }

    public String getHostStar(){
        return hostStar;
    }

    public void setHostStar(String hostStar){
        this.hostStar = hostStar;
    }

    

}