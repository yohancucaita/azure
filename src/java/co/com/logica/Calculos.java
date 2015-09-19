/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.logica;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ESTACION
 */
@WebService(serviceName = "Calculos")
public class Calculos {

    @WebMethod(operationName = "VelocidadFinal")
    public Double VelocidadFinal(@WebParam(name = "VelocidadInicial") final double VelocidadInicial, @WebParam(name = "Aceleracion") final double Aceleracion, @WebParam(name = "Tiempo") final double Tiempo) {
        return VelocidadInicial+(Aceleracion*Tiempo) ;    
    }
    
    @WebMethod(operationName = "Velocidad")
    public Double Velocidad(@WebParam(name = "Distancia") final double Distancia, @WebParam(name = "Tiempo") final double Tiempo) {
        return Distancia/Tiempo ;
    }
    
    @WebMethod(operationName = "Distancia")
    public Double Distancia(@WebParam(name = "VelocidadInicial") final double VelocidadInicial, @WebParam(name = "VelocidadFinal") final double VelocidadFinal,@WebParam(name = "Tiempo")final double Tiempo){
        double resul=(VelocidadFinal+VelocidadInicial)*Tiempo;
        double total=0.5*resul;
        return total;
    }
    
}
