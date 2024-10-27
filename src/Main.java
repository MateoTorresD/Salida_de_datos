import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre: ");
        String nombre = br.readLine();


        System.out.println("Edad: ");
        int edad = Integer.parseInt(br.readLine());

        System.out.println("Altura: ");
        double altura = Double.parseDouble(br.readLine());
    }
}