package br.com.carnaval;
import javax.swing.JOptionPane;

public class Carnaval {

	public static void main(String[] args) {
		double valor, valorAdicional;
		String localizacao;
		int opcao;
		do {
			 opcao=Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2>Ingresso VIP\n<3>Ingresso Camarote\n<4>Sair"));
			switch (opcao)
		
			{
			case 1:
				valor=Double.parseDouble( JOptionPane.showInputDialog("Valor do Ingresso: "));
				Normal ingressoNormal = new Normal(valor);
				JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(),"Mensagem",JOptionPane.DEFAULT_OPTION);
				break;
			case 2:
				valor=Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
				valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor do Adicional: "));
				Vip ingressoVip = new Vip(valor,valorAdicional);
				JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso());
				break;
			case 3:
				valor=Double.parseDouble( JOptionPane.showInputDialog("Valor do Ingresso: "));
				valorAdicional=Double.parseDouble(JOptionPane.showInputDialog("Valor Adicional do Ingresso:"));
				localizacao = JOptionPane.showInputDialog("Localição: ");
				Camarote ingressoCamarote = new Camarote (valor, localizacao,valorAdicional);
				JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(),"Mensagem",JOptionPane.DEFAULT_OPTION);
				break;
			case 4:
				break;
				default:
					JOptionPane.showMessageDialog(null, "Escolha corretamente uma opção", "mensagem", JOptionPane.DEFAULT_OPTION);
				break;
			}
		}while(opcao!=4);
	}
}


