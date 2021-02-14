package br.com.thiago.util;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formata {

	public static String moeda(double valor) {
		return NumberFormat.getCurrencyInstance().format(valor);
	}

	public static String data(LocalDateTime data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE h:m:s");
		return dtf.format(data);
	}
}
