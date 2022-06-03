import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudantes> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try{
            FileOutputStream fout = new FileOutputStream("c:\\"+this.nomeArquivo+".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(estudantes);
            oos.close();

        }catch (FileNotFoundException e){
            System.out.println("Nao foi possivel serializar");
        }
        catch(IOException e){
            System.out.println("Nao foi possivel desserializar");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudantes = new ArrayList<>();
        try{
            FileInputStream fin = new FileInputStream("c:\\"+this.nomeArquivo+".ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            estudantes = (List<Estudante>) ois.readObject();
            ois.close();
        }catch (FileNotFoundException e){
            System.out.println("Nao foi possivel desserializar");
        }
        catch(IOException e){
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return estudantes;
    }
}
