package com.coderhouse.modelo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cancion")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "INTERPRETE_ID")
    private Integer interpreteId;

    public Cancion() {
        super();
    }

    public Cancion(Integer id, String titulo, Integer interpreteId) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.interpreteId = interpreteId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getInterpreteId() {
        return interpreteId;
    }

    public void setInterpreteId(Integer interpreteId) {
        this.interpreteId = interpreteId;
    }

    @Override
    public String toString() {
        return "Cancion [id=" + id + ", titulo=" + titulo + ", interpreteId=" + interpreteId + "]";
    }

}
