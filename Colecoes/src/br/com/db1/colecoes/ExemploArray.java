package br.com.db1.colecoes;

import java.util.Arrays;

public class ExemploArray {

	public String[] getNomes() {
		String[] alunosTurmaDb1Start = new String [3];
		alunosTurmaDb1Start[0] = "alexander";
		alunosTurmaDb1Start[0] = "silas";
		alunosTurmaDb1Start[0] = "elielson";
		return null;
	}

	public Integer[] ordenaNumeros(Integer[] numeros) {
		Arrays.sort(numeros);
		return numeros;
		
		
		/*Integer x =0;
		Integer[] ordenaNumeros = new Integer[numeros.length];
			
		for(Integer i=0; i<numeros.length; i++){
			if(i==0){
				ordenaNumeros[i] = numeros[i];
			}
			else{
				if(ordenaNumeros[i-1] > numeros[i]){
					Integer valorMaior = ordenaNumeros[i-1];
					ordenaNumeros[i-1] = numeros[i];
					ordenaNumeros[i] = valorMaior;
				}
			}
			
		}
		return ordenaNumeros;
	}*/

	}
}
