package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println("O idioma atual do sistema é:");
        System.out.println(currentLocale.getDisplayLanguage());
        System.out.println("O país atual do sistema é:");
        System.out.println(currentLocale.getDisplayCountry());
    }
}
