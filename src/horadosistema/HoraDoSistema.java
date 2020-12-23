package horadosistema;
import java.util.Date;
public class HoraDoSistema {
    public static void main(String[] args) {
        Date horario = new Date(); //Usar a palavra "new" é para CRIAR UM NOVO OBJETO
        System.out.println("A hora do sistema é:");
        System.out.println(horario.toString());
    }
}