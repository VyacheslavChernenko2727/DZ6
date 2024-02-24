import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавляем записи в телефонную книгу
        addEntry(phoneBook, "Иванов", "89439549574");
        addEntry(phoneBook, "Петров", "8953209853");
        addEntry(phoneBook, "Сидоров", "8942342322");
        addEntry(phoneBook, "Иванов", "8956667733");
        addEntry(phoneBook, "Петров", "89998887737");

        // Сортировка записей по убыванию числа телефонов
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        // Вывод отсортированных записей
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }

    // Метод для добавления записи в телефонную книгу
    public static void addEntry(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phoneNumber);
        phoneBook.put(name, phones);
    }
}

