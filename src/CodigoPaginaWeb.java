import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CodigoPaginaWeb {


    // FUNCIONES
    // Funcion PING
    public String ping(String url) {

        String info = "<html><body>";
        String[] comandos = { "ping", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        info += "</html></body>";

        return info;
    }


    // FUNCION TRACERT MOSTRANDO NOMBRES
    public String tracertNombre(String url) {

        String info = "";
        String[] comandos = { "tracert", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return info;
    }


    // FUNCION TRACERT SIMPLIFICADA
    public String tracert(String url) {

        String info = "";
        String[] comandos = { "tracert", "-d", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return info;
    }


    // FUNCION NsLookUp
    public String nslookup(String url) {

        String info = "<html><body>";
        String[] comandos = { "nslookup", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        info += "</html></body>";

        return info;
    }


    // FUNCION CURL
    public String curl(String url) {

        String info = "<html><body>";
        String[] comandos = { "curl", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        info += "</html></body>";

        return info;
    }


    // FUNCION TELNET
    public String telnet(String url) {

        String info = "<html><body>";
        String[] comandos = { "telnet", url };
        ProcessBuilder pb = new ProcessBuilder(comandos);
        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String lectura = "";
            while ((lectura = br.readLine()) != null) {
                info += "<p> -> " + lectura + "</p>";
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        info += "</html></body>";

        return info;

    }

}
