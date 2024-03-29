import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializacao {
    // Método para serializar uma lista de usuários em um arquivo binário
    public static void serializar1(String arquivo, List<Usuario> usuarios) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {

            // Escreve a lista de usuários no arquivo especificado
            outputStream.writeObject(usuarios);
            System.out.println("Dados serializados com sucesso.");
        } catch (IOException e) {
            // Em caso de erro na serialização, imprime a mensagem de erro
            System.err.println("Erro ao serializar os dados: " + e.getMessage());
        }
    }

    // Método para deserializar uma lista de usuários a partir de um arquivo binário
    public static List<Usuario> deserializar1(String arquivo) {
        try {
            // Abre o arquivo para leitura
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo));

            // Lê a lista de usuários do arquivo e a converte de volta para a lista
            return (List<Usuario>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro na deserialização, imprime a mensagem de erro
            System.err.println("Erro ao deserializar os dados: " + e.getMessage());
            return null; // Retorna nulo para indicar que ocorreu um erro
        }
    }

    // Método para serializar uma lista de usuários em um arquivo binário
    public static void serializar2(String arquivo2, List<Agenda> agendamento) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo2))) {

            // Escreve a lista de usuários no arquivo especificado
            outputStream.writeObject(agendamento);
            System.out.println("Dados serializados com sucesso.");
        } catch (IOException e) {
            // Em caso de erro na serialização, imprime a mensagem de erro
            System.err.println("Erro ao serializar os dados: " + e.getMessage());
        }
    }

    // Método para deserializar uma lista de usuários a partir de um arquivo binário
    public static List<Agenda> deserializar2(String arquivo2) {
        try {
            // Abre o arquivo para leitura
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo2));

            // Lê a lista de usuários do arquivo e a converte de volta para a lista
            return (List<Agenda>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Em caso de erro na deserialização, imprime a mensagem de erro
            System.err.println("Erro ao deserializar os dados: " + e.getMessage());
            return null; // Retorna nulo para indicar que ocorreu um erro
        }
    }
}
