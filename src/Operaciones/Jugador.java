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
public class Jugador {
private String Nombre;
private long Numerodepasaporte;
private Date Fechadenacimiento;
private long Númerodesucamiseta;
private long Numerodemundialesenquehaparticipado;
private long Cantidaddegolesanotadosenelmundial;



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

    public Date getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(Date Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }

    public long getNúmerodesucamiseta() {
        return Númerodesucamiseta;
    }

    public void setNúmerodesucamiseta(long Númerodesucamiseta) {
        this.Númerodesucamiseta = Númerodesucamiseta;
    }

    public long getNumerodemundialesenquehaparticipado() {
        return Numerodemundialesenquehaparticipado;
    }

    public void setNumerodemundialesenquehaparticipado(long Numerodemundialesenquehaparticipado) {
        this.Numerodemundialesenquehaparticipado = Numerodemundialesenquehaparticipado;
    }

    public long getCantidaddegolesanotadosenelmundial() {
        return Cantidaddegolesanotadosenelmundial;
    }

    public void setCantidaddegolesanotadosenelmundial(long Cantidaddegolesanotadosenelmundial) {
        this.Cantidaddegolesanotadosenelmundial = Cantidaddegolesanotadosenelmundial;
    }




    public Jugador(String Nombre, long Numerodepasaporte, Date Fechadenacimiento, long Númerodesucamiseta, long Numerodemundialesenquehaparticipado, long Cantidaddegolesanotadosenelmundial) {
        this.Nombre = Nombre;
        this.Numerodepasaporte = Numerodepasaporte;
        this.Fechadenacimiento = Fechadenacimiento;
        this.Númerodesucamiseta = Númerodesucamiseta;
        this.Numerodemundialesenquehaparticipado = Numerodemundialesenquehaparticipado;
        this.Cantidaddegolesanotadosenelmundial = Cantidaddegolesanotadosenelmundial;
    }
    
 
    
}
