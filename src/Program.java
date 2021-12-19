import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date ano = sdf.parse("01/01/2021");

		float valEmpA = 1.13f, valEmpB = 18.4f;

		System.out.printf("Empresa X - " + sdf.format(ano) + " - Valor da empresa: %.2fm \n", valEmpA);
		System.out.printf("Empresa Y - " + sdf.format(ano) + " - Valor da empresa: %.2fm \n", valEmpB);
		System.out.println();

		do {

			Calendar cal = Calendar.getInstance();
			cal.setTime(ano);
			cal.add(Calendar.YEAR, 1); // Adiciona um ano
			ano = cal.getTime();

			valEmpA += valEmpA * 1.48;
			valEmpB += valEmpB * 0.32;

			System.out.printf("Empresa X - " + sdf.format(ano) + " - Valor da empresa: %.2fm \n", valEmpA);
			System.out.printf("Empresa Y - " + sdf.format(ano) + " - Valor da empresa: %.2fm \n", valEmpB);
			System.out.println();

		} while (valEmpA < valEmpB);

	}
}
