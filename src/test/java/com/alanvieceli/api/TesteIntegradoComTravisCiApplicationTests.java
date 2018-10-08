package com.alanvieceli.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class TesteIntegradoComTravisCiApplicationTests {
	
	@Value("${paginacao.qtd_por_pagina}")
	private int qtdePorPagina;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void TestCarregarContextoDeTeste() {
		assertEquals(87, qtdePorPagina);
	}

}
