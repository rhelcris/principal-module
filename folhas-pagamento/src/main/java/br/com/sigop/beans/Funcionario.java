package br.com.sigop.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.sigop.beans.PessoaOLD;

@Entity
public class Funcionario extends PessoaOLD {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String departamento;
	private String cargo;
	private double salario;

	public Funcionario() { }

	public Funcionario(String nome, String telefone, String departamento, String cargo, double salario) {
		super(nome, telefone);
		this.departamento = departamento;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
