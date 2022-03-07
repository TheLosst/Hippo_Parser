package com.company.The_Losst;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int count_before = 0;
        FileWriter writer = new FileWriter("C:\\Users\\TheLosst\\IdeaProjects\\Parser_Hippo\\src\\com\\company\\The_Losst\\out.txt");
        int global = 0;
        Gson g = new Gson();
        String all_text = "";
        int count = 0;
        try (FileReader reader = new FileReader("C:\\Users\\TheLosst\\IdeaProjects\\Parser_Hippo\\src\\com\\company\\The_Losst\\File.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                all_text += (char) c;
            }
            //System.out.println(all_text);
        }
        all_text = all_text.replaceAll("\\n","");
        all_text = all_text.replaceAll("\\r","");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество лошадей в заезде :");
        int amount_of_horses = in.nextInt();

        while (global < amount_of_horses) {
            String NOMER = "", klichka = "", mast = "", naezdnik = "";
            boolean number_try = false, klichka_try = false, mast_try = false, naezdnik_try = false;
            while (!(number_try)) {
                if ((all_text.charAt(count) == '.')) {
                    NOMER = String.valueOf(all_text.charAt(count - 2)) + String.valueOf(all_text.charAt(count - 1)) + String.valueOf(all_text.charAt(count));
                    number_try = true;
                    count_before = count + 1;
                }
                count++;
            }
            //System.out.println("Ready " + count);
            while (!(klichka_try)) {
                if ((String.valueOf(all_text.charAt(count + 1)).equals("-"))) {
                    for (int i = count_before; i < count + 1; i++) {
                        klichka += String.valueOf(all_text.charAt(i));

                    }
                    klichka_try = true;
                    count_before = count + 1;
                }
                count++;
            }
            //System.out.println("Ready " + count);

            while (!(mast_try)) {
                //if ((all_text.indexOf("Наездник", count) != -1) | (all_text.indexOf("Мастер", count) != -1) | (all_text.indexOf("Едет", count) != -1))
                if (((all_text.charAt(count + 8) == 'к') & (all_text.charAt(count + 7) == 'и') & (all_text.charAt(count + 6) == 'н') & (all_text.charAt(count + 5) == 'д') & (all_text.charAt(count + 4) == 'з') & (all_text.charAt(count + 3) == 'е') & (all_text.charAt(count + 2) == 'а') & (all_text.charAt(count + 1) == 'Н')) | ((all_text.charAt(count + 4) == 'т') & (all_text.charAt(count + 3) == 'е') & (all_text.charAt(count + 2) == 'д') & (all_text.charAt(count + 1) == 'Е')) | ((all_text.charAt(count + 6) == 'р') & (all_text.charAt(count + 5) == 'е') & (all_text.charAt(count + 4) == 'т') & (all_text.charAt(count + 3) == 'с') & (all_text.charAt(count + 2) == 'а') & (all_text.charAt(count + 1) == 'М'))) {
                    mast_try = true;
                    for (int i = count_before; i < count + 1; i++) {
                        mast += String.valueOf(all_text.charAt(i));
                    }
                    count_before = count;
                }
                count++;
            }
            //System.out.println("Ready " + count);

            if (!(naezdnik_try)) {
                int resetID = all_text.indexOf(".", count + 40);
                for (int i = count_before; i < resetID; i++) {
                    naezdnik += String.valueOf(all_text.charAt(i));
                    naezdnik_try = true;
                }
                count = resetID + 15;
                naezdnik += ".";
            }


            //System.out.println("Стартовый номер " + NOMER);
            //System.out.println("Кличка " + klichka);
            //System.out.println("Масть и описание " + mast);
            //System.out.println("Наездник " + naezdnik);
            global++;
            System.out.println("--------------------------------------------------------------------------");
            Hippo_Parser part = new Hippo_Parser(NOMER,klichka,mast,naezdnik);
            Scanner input = new Scanner(System.in);
            System.out.println("Введите место на финише лошади с номером " + NOMER + " " + klichka + ":");
            String  buff = input.nextLine();
            part.setMesto(buff);
            System.out.println("Введите резвость для лошади с номером " + NOMER + " " + klichka + ":");
            buff = input.nextLine();
            part.setRezvost(buff);
            System.out.println("Введите отставание лошади с номером " + NOMER + " " + klichka + ":");
            buff = input.nextLine();
            part.setOtstavania(buff);
            System.out.println("Введите сбои лошади с номером " + NOMER + " " + klichka + ":");
            buff = input.nextLine();
            part.setSboi(buff);
            System.out.println("Введите нарушения лошади с номером " + NOMER + " " + klichka + ":");
            buff = input.nextLine();
            part.setNarushenia(buff);

            System.out.println(part);
            String test = g.toJson(part);
            System.out.println(test);

            writer.append(test);
            writer.append(",");
            }
            writer.close();
            //ObjectMapper mapper = new ObjectMapper();
        }

    }