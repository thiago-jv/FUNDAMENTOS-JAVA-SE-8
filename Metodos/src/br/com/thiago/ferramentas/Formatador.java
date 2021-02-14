package br.com.thiago.ferramentas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatador {

	// met�do recebendo uma data e retornando formatado
	public static String data(LocalDate data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		return dtf.format(data);
	}

	// met�do recebendo uma data e retornando formatado
	public static String data(LocalDate data, boolean customizado) {
		if (customizado) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
			return dtf.format(data);
		} else {
			return data(data);
		}
	}
}
