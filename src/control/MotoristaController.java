package control;

import model.Motorista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MotoristaController {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista();
        Motorista motorista2 = new Motorista();
        Motorista motorista3 = new Motorista(1,123, "fabricio", "megiato", "fabricio@gmail.com");
        Motorista motorista4 = new Motorista(2,321, "mauricio", "junior", "mauricio@gmail.com");
        Motorista motorista5 = new Motorista(3,456);
        Motorista motorista6 = new Motorista(4,654);

        System.out.println("Motorista1 = " + motorista1 + "Motorista2 = " + motorista2 + "Motorista3 = " + motorista3 + "Motorista4 = " + motorista4 + "Motorista5 = " + motorista5 + "Motorista6 = " + motorista6);

        motorista1.setId(5);
        motorista1.setCpf(1111111);
        motorista1.setNome("Maria");
        motorista1.setSobrenome("Silva");
        motorista1.setEmail("maria@gmail.com");
        System.out.println(motorista1.getId());
        System.out.println(motorista1.getCpf());
        System.out.println(motorista1.getNome());
        System.out.println(motorista1.getSobrenome());
        System.out.println(motorista1.getEmail());

        motorista2.setId(6);
        motorista2.setCpf(2222222);
        motorista2.setNome("João");
        motorista2.setSobrenome("Souza");
        motorista2.setEmail("Joao@gmail.com");
        System.out.println(motorista2.getId());
        System.out.println(motorista2.getCpf());
        System.out.println(motorista2.getNome());
        System.out.println(motorista2.getSobrenome());
        System.out.println(motorista2.getEmail());

        List<Motorista> motoristaList = new ArrayList<>();
        motoristaList.add(motorista1);
        motoristaList.add(motorista2);
        motoristaList.add(motorista3);
        motoristaList.add(motorista4);
        motoristaList.add(motorista5);
        motoristaList.add(motorista6);
        System.out.println(motoristaList);

        motoristaList.forEach(m -> {
            if(m.getId() == 3){
                System.out.print("***** Objeto de id=3: ");
                System.out.println(m);
            }
        });

        motoristaList.sort((c1, c2) -> {
            if(c1.getId() < c2.getId()){
                return 1;
            }else if(c1.getId() > c2.getId()){
                return -1;
            }
            return 0;
        });
        System.out.println("********* Lista ordenada decrescente\n" + motoristaList);

        Map<Integer, Motorista> motoristaMap = new HashMap<>();
        motoristaMap.put(motorista1.hashCode(), motorista1);
        motoristaMap.put(motorista2.hashCode(), motorista2);
        motoristaMap.put(motorista3.hashCode(), motorista3);
        motoristaMap.put(motorista4.hashCode(), motorista4);
        motoristaMap.put(motorista5.hashCode(), motorista5);
        motoristaMap.put(motorista6.hashCode(), motorista6);
        System.out.println("\n********* Map *********");
        System.out.println(motoristaMap);
        System.out.print("***** Objeto de id=3: ");
        System.out.println(motoristaMap.get(motorista3.hashCode()));
    }

    }

