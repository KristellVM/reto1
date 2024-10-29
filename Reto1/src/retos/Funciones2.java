package retos;

public class Funciones2 {
	
	public static int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	
	public static double dividir(int num1, int num2) {
		if(num1==0||num2==0) {
			return 0;
		}
		else return num1/num2;
	}
	
	public static boolean esPositivo(int num) {
		if(num>=0) {
		return true;
		} else {
			return false;
		}
	}
	
	public static boolean esNegativo(int num) {
		if(num<0) {
		return true;
		} else {
			return false;
		}
	}
	
}
