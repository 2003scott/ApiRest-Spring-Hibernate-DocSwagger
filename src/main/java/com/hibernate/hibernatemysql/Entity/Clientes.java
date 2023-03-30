package com.hibernate.hibernatemysql.Entity;

import javax.persistence.*;

/**
 * Diego Scott
 */
@Entity
@Table(name = "clientes")
public class Clientes  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long codcli;

    @Column
    private String nombres;

    @Column
    private String apellidos;

    @Column
    private String usuario;

    @Column
    private Integer password;

    public Clientes() {

    }

    public Clientes(Long codcli, String nombres, String apellidos, String usuario, Integer password) {
        this.codcli = codcli;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.password = password;
    }

    public Long getCodcli() {
        return codcli;
    }

    public void setCodcli(Long codcli) {
        this.codcli = codcli;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
