/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partidodefutbol;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class PartidoDeFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numPartidos,golAFavor,golEnContra,acumuladorEquipo1=0,acumuladorEquipo2=0,diferenciaEquipo1,diferenciaEquipo2;
        System.out.println("Campeonato de futbol");
        for(int i=1;i<=10;i++){
            System.out.println("Partido "+i);
            System.out.println("Cuantos goles a realizado el equipo 1");
            golAFavor=sc.nextInt();
            System.out.println("Cuantos goles a realizado el equipo 2");
            golEnContra=sc.nextInt();
            diferenciaEquipo1=golAFavor-golEnContra;
            diferenciaEquipo2=golEnContra-golAFavor;
            if(golAFavor>golEnContra){
                System.out.println("El equipo 1 a ganado");
                System.out.println("Diferencia de goles es "+diferenciaEquipo1+"\n");
            }
            if(golAFavor<golEnContra){
                System.out.println("El equipo 2 a ganado");
                System.out.println("Diferencia de goles es "+diferenciaEquipo2+"\n");
            }
            if(golAFavor==golEnContra){
                System.out.println("Los equipos han empatado\n");
            }
            acumuladorEquipo1=acumuladorEquipo1+golAFavor;
            acumuladorEquipo2=acumuladorEquipo2+golEnContra;
            
        }
        if(acumuladorEquipo1<10){
            System.out.println("Los puntos del equipo 1 es "+acumuladorEquipo1+"\nSu clasificaciòn es Liguilla de Promoción");
        }
        if((acumuladorEquipo1>=10)&&(acumuladorEquipo1<=20)){
            System.out.println("Los puntos del equipo 1 es "+acumuladorEquipo1+"\nSu clasificaciòn es No liguilla");
        }
        if(acumuladorEquipo1>20){
            System.out.println("Los puntos del equipo 1 es "+acumuladorEquipo1+"\nSu clasificaciòn es Liguilla de Campeonato");
        }
    }
    }
    

