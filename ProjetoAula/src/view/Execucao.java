package view;

import Aula.PessoaFisica;
import Aula.PessoaJuridica;

public class Execucao {
	public static void main (String [] args) {
		
		PessoaFisica ps = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		ps.setCpf(1234567890);
		ps.setEndereco("Avenida Paulista");
		ps.setBairro("Bela Vista");
		ps.setCidade("São Paulo");
		ps.setEstado("São Paulo");
		ps.setCep(8032650);
		ps.setTelefone(979501134);
		
		System.out.println("Pessoa Fisica");
		System.out.println("CPF " + ps.getcpf());
		System.out.println(ps.getEndereco());
		System.out.println(ps.getBairro());
		System.out.println(ps.getCidade());
		System.out.println(ps.getEstado());
		System.out.println(ps.getCep());
		System.out.println(ps.getTelefone());
		
		System.out.println("-------------------------");
		
		pj.setCnpj(323244345);
		pj.setEndereco("Rua Augusta");
		pj.setBairro("Bela Vista");
		pj.setCidade("São Paulo");
		pj.setEstado("São Paulo");
		pj.setCep(7035950);;
		pj.setTelefone(25111345);
		
		System.out.println("Pessoa Juridica");
		System.out.println("CNPJ " + pj.getCnpj());
		System.out.println(pj.getEndereco());
		System.out.println(pj.getBairro());
		System.out.println(pj.getCidade());
		System.out.println(pj.getEstado());
		System.out.println(pj.getCep());
		System.out.println(pj.getTelefone());
		
		
		
				
		
		
	}
}
