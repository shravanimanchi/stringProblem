package teksystem.exercise;


public class StringProblem {

    public static void main(String[] args) {

        String data = args[0];
        Character charTobeReplaced = args[1].charAt(0);

        System.out.println("Entered String is : " + data);
        System.out.println("Entered char to be replaced is : " + charTobeReplaced);

        System.out.println("String replaced by plain way is : "
                + replaceStringPlainWay(data, charTobeReplaced));

        System.out.println("String replaced by plain way is : "
                + replaceStringUtilityWay(data, charTobeReplaced));


    }

    public static String replaceStringPlainWay(String data, Character charTobeReplaced) {
        StringBuilder modifiedData = new StringBuilder();
        for (char eachChar : data.toCharArray()) {
            if (eachChar != charTobeReplaced) {
                modifiedData.append(eachChar);
            }

        }
        return modifiedData.toString();
    }

    public static String replaceStringUtilityWay(String data, Character charTobeReplaced) {
        return data.replaceAll(charTobeReplaced.toString(), "");
    }


}

