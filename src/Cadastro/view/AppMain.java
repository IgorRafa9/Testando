package Cadastro.view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import Cadastro.model.Cadastro;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner (System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String resp;
		List<Cadastro> cad = new ArrayList<>();
		Cadastro cads;
		do {
			System.out.println("Selecione a opção desejada: ");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Ver Contatos");
			int opc = key.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Informe o nome: ");
				String nome = br.readLine();
				System.out.println("Informe idade: ");
				int idade = key.nextInt();
				cads = new Cadastro(nome,idade);
				cad.add(cads);
				break;
			case 2:
				for(Cadastro c : cad) {
					System.out.println(c.getNome()+"/"+c.getIdade());
				}
				break;

			}
			System.out.println("Deseja algo mais?");
			resp = br.readLine();
		}while(resp.equalsIgnoreCase("s"));
	}
}
