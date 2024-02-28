package EjercicioPropuestoN12;

public class EjercicioPropuestoN12 {

	public static void main(String[] args) {
		
		double horasTrabajadas, valorHora, porcentajeRetencion, salarioBruto, retencionFuente, salarioNeto;
		
		horasTrabajadas = 48;
		valorHora = 5000;
		porcentajeRetencion = 12.5 / 100;
		salarioBruto = horasTrabajadas * valorHora;
		retencionFuente = salarioBruto * porcentajeRetencion;
		salarioNeto = salarioBruto - retencionFuente;
		
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("Retencion de la fuente: " + retencionFuente);
		System.out.println("Salario neto: " + salarioNeto);

	}

}
