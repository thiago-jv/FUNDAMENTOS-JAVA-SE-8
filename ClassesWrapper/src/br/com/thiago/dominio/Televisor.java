package br.com.thiago.dominio;

public class Televisor {

	public Integer canal = 130;
	public Integer volume = 20;

	public void mudarCanal(Integer novoCanal) {
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}

	public void mudarVolume(Integer novoVolume) {
		if (volume.equals(novoVolume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			System.out.println("Volume alterado para " + volume);
		}
	}
}