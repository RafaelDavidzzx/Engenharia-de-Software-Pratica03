import javax.swing.JOptionPane;

public class diegoTavares {
	public static void main(String[] args) {
		String pesoString = JOptionPane.showInputDialog("Diga seu peso: ");
		double peso = Double.parseDouble(pesoString);
		String alturaStr = JOptionPane.showInputDialog
        ("Diga sua altura:");
		double altura = Double.parseDouble(alturaStr);
		double imc = peso / (altura * altura);
		JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc);

	}

}
