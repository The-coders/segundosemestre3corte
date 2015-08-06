/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

import java.util.Date;

/**
 *
 * @author yebrail
 */
public class Tecnico {
private String Nombre;
private long Numerodepasaporte;
private String Paisdeorigen;
private Date Fechadenacimiento;
private long numerodemundialesenquehaparticipado;
private long CantidaddevecesquehasidoTecnicocomoganadordeunmundial;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getNumerodepasaporte() {
        return Numerodepasaporte;
    }

    public void setNumerodepasaporte(long Numerodepasaporte) {
        this.Numerodepasaporte = Numerodepasaporte;
    }

    public String getPaisdeorigen() {
        return Paisdeorigen;
    }

    public void setPaisdeorigen(String Paisdeorigen) {
        this.Paisdeorigen = Paisdeorigen;
    }

    public Date getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(Date Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public long getNumerodemundialesenquehaparticipado() {
        return numerodemundialesenquehaparticipado;
    }

    public void setNumerodemundialesenquehaparticipado(long numerodemundialesenquehaparticipado) {
        this.numerodemundialesenquehaparticipado = numerodemundialesenquehaparticipado;
    }

    public long getCantidaddevecesquehasidoTecnicocomoganadordeunmundial() {
        return CantidaddevecesquehasidoTecnicocomoganadordeunmundial;
    }

    public void setCantidaddevecesquehasidoTecnicocomoganadordeunmundial(long CantidaddevecesquehasidoTecnicocomoganadordeunmundial) {
        this.CantidaddevecesquehasidoTecnicocomoganadordeunmundial = CantidaddevecesquehasidoTecnicocomoganadordeunmundial;
    }





    public Tecnico(String Nombre, long Numerodepasaporte, String Paisdeorigen, Date Fechadenacimiento, long numerodemundialesenquehaparticipado, long CantidaddevecesquehasidoTecnicocomoganadordeunmundial) {
        this.Nombre = Nombre;
        this.Numerodepasaporte = Numerodepasaporte;
        this.Paisdeorigen = Paisdeorigen;
        this.Fechadenacimiento = Fechadenacimiento;
        this.numerodemundialesenquehaparticipado = numerodemundialesenquehaparticipado;
        this.CantidaddevecesquehasidoTecnicocomoganadordeunmundial = CantidaddevecesquehasidoTecnicocomoganadordeunmundial;
    }
 

}
