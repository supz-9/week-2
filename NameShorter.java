public class NameShortener {
    public static void main(String[] args) {
        String fullName = "Jawaharlal Nehru";
        String shortenedName = shortenName(fullName);
        System.out.println(shortenedName);
    }

    public static String shortenName(String name) {
        String[] parts = name.split(regex: " ");

        StringBuilder shortName = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++) {
            shortName.append(parts[i].charAt(index: 0)).append(str: ". ");
        }

        shortName.append(parts[parts.length - 1]);
        return shortName.toString();
    }
}