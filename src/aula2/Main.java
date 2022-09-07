package aula2;

public class Main {

	public static void main(String[] args) {
		//System.out.print("");
		System.out.print("Raiz: " + Math.sqrt(64));
		Double valor;
		valor = Math.exp(1/2 * Math.log(64));
		System.out.print("\nRaiz com exp e log e realint: " + valor.intValue());
		System.out.print("\nRaiz com exp e log sem realint: " + Math.exp(1/2 * Math.log(64)));
		System.out.print("\n " + Math.sin((45*Math.PI)/180)+0.0001);
		System.out.print("\nPotencia com exp e log e formatar: " + Math.round(Math.exp(3*Math.log(8))+0.001));
		System.out.print("\nPotencia com exp e log sem formatar: " + Math.exp(3*Math.log(8)));
		System.out.print("\nPotencia com operador ** e formatar: " + Math.pow(8, 3));
		System.out.print("\nRaiz cubica: " + Math.exp(1/3*Math.log(8)));
		System.out.print("\nAbsoluto: " + Math.abs(-8));
		System.out.print("\nAbsoluto: " + Math.abs(8));
		System.out.print("\nConvertendo para inteiro 5.5: " + Math.round(5.5));
		System.out.print("\nConvertendo para inteiro 6.5: " + Math.round(6.5));
		System.out.print("\nConvertendo para inteiro 6.5 + 0.0001: " + Math.round(6.5 + 0.0001));
		System.out.print("\nConvertendo para inteiro 5.45: " + Math.round(5.45));
		System.out.print("\nConvertendo para inteiro 5.51: " + Math.round(5.51));
		System.out.print("\nConvertendo para real 87: " + Double.parseDouble("87"));
		System.out.print("\nConvertendo para int 3/4: " + Math.round(0.75));
	}
}
