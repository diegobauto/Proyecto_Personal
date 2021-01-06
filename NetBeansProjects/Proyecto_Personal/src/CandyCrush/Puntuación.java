package CandyCrush;

public class Puntuación {
  public int puntuación = 0;

public void puntaje(String cadena){
    String letra = cadena.substring(0,1);
    switch(letra){
      case "G":
        puntuación += 50;
        System.out.println("SCORE: "+puntuación);
        //return puntuación;
        break;
      case "E":
        puntuación += 100;
        System.out.println("SCORE: "+puntuación);
        //return puntuación;
        break;
      case "A":
        puntuación += 200;
        System.out.println("SCORE: "+puntuación);
        //return puntuación;
        break;
      case "P":
        puntuación += 400;
        System.out.println("SCORE: "+puntuación);
        //return puntuación;
        break;
    default:
      //return puntuación;
    }
  }
}