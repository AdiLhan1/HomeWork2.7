package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> list = new HashMap<>();
        list.put("холод", new String[]{"мороз", "стужа", "зима", "зноба"});
        list.put("красивый", new String[]{"привлекательный", "прелестный", "прекрасный", "симпатичный"});
        list.put("ярко", new String[]{"светло", "ясно", "резко"});
        list.put("слово", new String[]{"термин", "речь", "понятие"});
        while (true) {
            System.out.println("Введите слово");
            String w = scanner.nextLine();
            Set<Map.Entry<String, String[]>> entries = list.entrySet();
            Map<String, String[]> stringMap = new HashMap<>();
            for (Map.Entry<String, String[]> entry : entries) {
                String key = entry.getKey();
                String[] value = entry.getValue();
                for (int i = 0; i < value.length; i++) {
                    String synonymous = value[i];
                    String[] value2 = new String[value.length];
                    for (int i2 = 0; i2 < value.length; i2++) {
                        String valueor = value[i2];
                        if (valueor.equals(synonymous)) {
                            value2[i2] = key;
                        } else {
                            value2[i2] = valueor;
                        }
                    }
                    stringMap.put(synonymous, value2);

                    for (String e : value2) {
                        if (w.equals(e)) {
                            System.out.println(synonymous);
                        }

                    }
                }

            }


        }
    }
}
