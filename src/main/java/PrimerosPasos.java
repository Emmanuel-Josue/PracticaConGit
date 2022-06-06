
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class PrimerosPasos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        
        
        Scanner leer = new Scanner(System.in);
        String respuesta;
        
        File archivo = new File("C:\\Users\\user01\\Desktop\\Emmanuel\\UAEMEX\\CURSO LOGICA DE PROGRAMACION\\RelacionAudioImagen\\src\\Recursos\\Audio verbos regulares WAV\\1 OPEN.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        respuesta = "";
        
        while(!respuesta.equals("Q"))
        {
            System.out.println("P = PLAY, S = STOP, R = RESET, Q = QUIT");
            System.out.println("Ingresa la elección ");
            respuesta = leer.next();
            respuesta = respuesta.toUpperCase();
            switch(respuesta)
            {
                case("P"):
                    clip.start();
                    System.out.println("La variable es:"+respuesta);
                break;
                case("S"):
                    clip.stop();
                break;
                case("R"):
                    clip.setMicrosecondPosition(0);
                break;// Por tan solo omitir este break el programa solo ejecutaba una instruccion bien, solamente una vez. 
                case("Q"):
                    clip.close();
                break;
                default: System.out.println("Respuesta no valida");
            }
            
            
        
        }


    }

    
}
