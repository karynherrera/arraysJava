package likes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;

public class Likes {

    public static void main(String[] args) {
        /*archivo = new File ("C:/archivo.txt");
        fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        while((linea=br.readLine())!=null){
        lineas.add(linea);
        }*/
        int n = 0;
        System.out.printf("Ingrese los datos del archivo: \n");
        Scanner sc = new Scanner(System.in);
        String fotos = sc.nextLine();

        //creo una lista con los nombres de todas las fotos del archivo
        List<String> arrFotos = Arrays.asList(fotos.split(" "));
        //System.out.println(arrFotos);

        //creo otra lista solo con los nombres de las fotos sin repetir
        List<String> distintas = arrFotos.stream().distinct().collect(Collectors.toList());
        System.out.println(distintas);

        //comparo los dos arrayList
        /*
        for (int i = 0; i < arrFotos.size(); i++) {
            if (arrFotos.stream().filter(foto -> distintas.contains(foto)).count() > 0) {
                System.out.println(arrFotos.stream().filter(foto -> distintas.contains(foto)).count());
            }
        }*/
        int total=0;
        String nameDato="";
        ArrayList<List<String>> dataFinal = new ArrayList<List<String>>();
        for(String dato: arrFotos){
            //System.out.println(Collections.frequency(arrFotos,"foto 2"));
          
            for(String un: distintas){
                if(dato== un){
                    n=n+1;
                }   
                nameDato= dato;
                total=n;
                 
            }
            System.out.println(nameDato +" "+total);
           
        }
        //filterLikes(arr);
    }

    static void filterLikes(ArrayList<Integer> arr) {
        for (int count : arr) {

        }
    }
}
