package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Paciente;

public class TestIMC {

	@Test
	public void testIMCBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(40, 1.59);
		assertEquals(15.82, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(40, 1.59);
		assertSame("Baixo peso muito grave", p.diagnostico());
	}
	
	@Test
	public void testIMCBaixoPesoGrave() {
		Paciente p = new Paciente(45, 1.65);
		assertEquals(16.53, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoBaixoPesoGrave() {
		Paciente p = new Paciente(45, 1.65);
		assertSame("Baixo peso grave", p.diagnostico());
	}
	
	@Test
	public void testIMCBaixoPeso() {
		Paciente p = new Paciente(48, 1.65);
		assertEquals(16.53, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoBaixoPeso() {
		Paciente p = new Paciente(48, 1.65);
		assertSame("Baixo peso", p.diagnostico());
	}

	@Test
	public void testIMCPesoNormal() {
		Paciente p = new Paciente(50, 1.60);
		assertEquals(19.53, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoPesoNormal() {
		Paciente p = new Paciente(50, 1.60);
		assertSame("Peso normal", p.diagnostico());
	}
	
	@Test
	public void testIMCSobrepeso() {
		Paciente p = new Paciente(82, 1.75);
		assertEquals(26.78, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoSobrepeso() {
		Paciente p = new Paciente(82, 1.75);
		assertSame("Sobrepeso", p.diagnostico());
	}
	
	@Test
	public void testIMCObesidadeGrauI() {
		Paciente p = new Paciente(92, 1.69);
		assertEquals(32.21, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoObesidadeGrauI() {
		Paciente p = new Paciente(92, 1.69);
		assertSame("Obesidade grau I", p.diagnostico());
	}
	
	@Test
	public void testIMCObesidadeGrauII() {
		Paciente p = new Paciente(98, 1.65);
		assertEquals(36.00, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoObesidadeGrauII() {
		Paciente p = new Paciente(98, 1.65);
		assertSame("Obesidade grau II", p.diagnostico());
	}
	
	@Test
	public void testIMCObesidadeGrauIII() {
		Paciente p = new Paciente(105, 1.60);
		assertEquals(41.02, p.calcularIMC(), 2);
	}
	
	@Test
	public void testDiagnosticoObesidadeGrauIII() {
		Paciente p = new Paciente(105, 1.60);
		assertSame("Obesidade grau III (obesidade mórbida)", p.diagnostico());
	}
	
}
