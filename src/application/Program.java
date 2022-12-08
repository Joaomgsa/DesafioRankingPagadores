package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o nome do arquivo: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            Map<String,Integer> map = new TreeMap<>();
            String line = br.readLine();
            while (line !=null){
                String[] fields = line.split(",");
                String empresa = fields[0];
                int count = Integer.parseInt(fields[2]);
                if(map.containsKey(empresa)){
                    int paymentsSofar = map.get(empresa);
                    map.put(empresa, count + paymentsSofar);
                }else {
                    map.put(empresa,count);
                }
                line = br.readLine();
            }
            System.out.println("Ranking de Pagamentos por empresa :");
            for (String key : map.keySet()){
                System.out.println(key +": "+ map.get(key));
            }

        }
        catch(IOException e){
            System.out.println("Erro:" + e.getMessage());
        }
        sc.close();
    }
}