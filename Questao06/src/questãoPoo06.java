import java.util.Scanner;

public class questãoPoo06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int horaDormir = 0, horaAcordar = 0, minutoDormir = 0,minutoAcordar = 0;
		
		System.out.println("Hora e minuto de dormir(00 00):");
		horaDormir = scan.nextInt();
		minutoDormir = scan.nextInt();
		
		while((horaDormir < 0 || horaDormir > 23) || (minutoDormir < 0 || minutoDormir > 59))
		{
			System.out.println("Hora e minuto de dormir novamente:");
			horaDormir = scan.nextInt();
			minutoDormir = scan.nextInt();
		}
		
		System.out.println("Hora e minuto de acordar (00 00):");
		horaAcordar = scan.nextInt();
		minutoAcordar = scan.nextInt();
		
		while((horaAcordar < 0 || horaAcordar > 23) || (minutoAcordar < 0 || minutoAcordar > 59))
		{
			System.out.println("Hora e minuto de Acordar novamente:");
			horaAcordar = scan.nextInt();
			minutoAcordar = scan.nextInt();
		}
		
		int HMDormir = 0, HMAcordar = 0;
		
		HMDormir = horaDormir * 60 + minutoDormir;
		HMAcordar = horaAcordar * 60 + minutoAcordar;
		
		int MinutosSono = 0;
		
		MinutosSono = HMAcordar - HMDormir;
		
		System.out.print("total de " + MinutosSono + " minutos de sono");;
		
		
		
		
	}
}
