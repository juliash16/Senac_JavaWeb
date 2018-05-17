package colecao;

public class Vetores02 {

	private String nomes[] = new String[5];

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}
	
	public static void main(String[] args) {
		
		Vetores02 vet = new Vetores02();
		// vet.getNomes()[0] = "Sarah"; - outra maneira
		vet.nomes[0] = "Sarah";
		vet.nomes[1] = "Caio";
		vet.nomes[2] = "Julia";
		vet.nomes[3] = "Beatriz";
		vet.nomes[4] = "Larissa";
		
		for (int i = 0; i < vet.nomes.length; i++) {
			System.out.println("Posição : "+i+" - Nome : "+vet.nomes[i]);
		}
		System.out.println("--------------------");
		
		int x = vet.nomes.length;
		for (int i = x - 1; i >= 0; i--) {
			System.out.println("Posição : "+i+" - Nome : "+vet.nomes[i]);
		}
	}
}
