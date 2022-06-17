package identidades;

import java.util.Random;

public abstract class Ajuda {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRandomId() {
		String all = "0123456789abcdefghijklmnopqrstuvwxyz";
		StringBuilder result = new StringBuilder("");
		Random r = new Random();
		for (int i = 0; i < 8; i++) {
			result.append(all.charAt(r.nextInt(all.length())));
		}
		this.setId(result.toString());
	}
}
