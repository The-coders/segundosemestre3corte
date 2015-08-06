/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

/**
 *
 * @author yebrail
 */
public class Equipo {
 
private String Nombrepais;
private long CodigoFIFA;
private long Numerodemundialesjugados;
private long Numerodegolesrecibidosenlosmundialesanteriores;
private long Numerodegolesrealizadosenelmundialactual;
private String directortecnico;

    public String getNombrepais() {
        return Nombrepais;
    }

    public void setNombrepais(String Nombrepais) {
        this.Nombrepais = Nombrepais;
    }

    public long getCodigoFIFA() {
        return CodigoFIFA;
    }

    public void setCodigoFIFA(long CodigoFIFA) {
        this.CodigoFIFA = CodigoFIFA;
    }

    public long getNumerodemundialesjugados() {
        return Numerodemundialesjugados;
    }

    public void setNumerodemundialesjugados(long Numerodemundialesjugados) {
        this.Numerodemundialesjugados = Numerodemundialesjugados;
    }

    public long getNumerodegolesrecibidosenlosmundialesanteriores() {
        return Numerodegolesrecibidosenlosmundialesanteriores;
    }

    public void setNumerodegolesrecibidosenlosmundialesanteriores(long Numerodegolesrecibidosenlosmundialesanteriores) {
        this.Numerodegolesrecibidosenlosmundialesanteriores = Numerodegolesrecibidosenlosmundialesanteriores;
    }

    public long getNumerodegolesrealizadosenelmundialactual() {
        return Numerodegolesrealizadosenelmundialactual;
    }

    public void setNumerodegolesrealizadosenelmundialactual(long Numerodegolesrealizadosenelmundialactual) {
        this.Numerodegolesrealizadosenelmundialactual = Numerodegolesrealizadosenelmundialactual;
    }

    public String getDirectortecnico() {
        return directortecnico;
    }

    public void setDirectortecnico(String directortecnico) {
        this.directortecnico = directortecnico;
    }

    public Equipo(String Nombrepais, long CodigoFIFA, long Numerodemundialesjugados, long Numerodegolesrecibidosenlosmundialesanteriores, long Numerodegolesrealizadosenelmundialactual, String directortecnico) {
        this.Nombrepais = Nombrepais;
        this.CodigoFIFA = CodigoFIFA;
        this.Numerodemundialesjugados = Numerodemundialesjugados;
        this.Numerodegolesrecibidosenlosmundialesanteriores = Numerodegolesrecibidosenlosmundialesanteriores;
        this.Numerodegolesrealizadosenelmundialactual = Numerodegolesrealizadosenelmundialactual;
        this.directortecnico = directortecnico;
    }
    
    
}
