package org.example;

public class NameFormat {
    private NameFormat() {}

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public static  String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder builder = new StringBuilder();


        if (prefix != null && !prefix.isEmpty()) {
            builder.append(prefix).append(" ");
        }

        builder.append(firstName);

        if (middleName != null && !middleName.isEmpty()) {

            builder.append(" ").append(middleName);
        }

        if (suffix != null && !suffix.isEmpty()) {

            builder.append(", ").append(suffix);
        }

        return builder.toString();
    }

    public static String format(String fullName){
        String trimmedName = fullName.trim();
        String suffix = null;

        if (trimmedName.contains(", ")) {
            String[] split = trimmedName.split(", ", 2);
            trimmedName = split[0].trim();
            suffix = split[1].trim();
        }

        String[] nameParts = trimmedName.split(" ");
        String prefix = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;

        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];

        }else if (nameParts.length == 3) {
            if(isPrefix(nameParts[0])){
                prefix = nameParts[0];
                firstName = nameParts[1];
                lastName = nameParts[2];
            }else {

                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
            }

        } else if (nameParts.length == 4) {
            prefix = nameParts[0];
            firstName = nameParts[1];
            middleName = nameParts[2];
            lastName = nameParts[3];
        }else {

            return fullName;
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }

    private static boolean isPrefix(String word) {
        return word.matches("(?i)mr\\.|mrs\\.|ms\\.|miss\\.|dr\\.");
    }
}

