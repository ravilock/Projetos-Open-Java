package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        double total = width*height;
        System.out.println("As dimensões da tela no formato Largura X Altura = Y são:");
        System.out.print(width);
        System.out.print(" X ");
        System.out.println(height);
        System.out.print("Total: ");
        System.out.println(total);
    }
}
