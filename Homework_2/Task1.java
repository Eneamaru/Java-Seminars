package Homework_2;

public class Task1 {
    public static void main(String[] args) {
        String query = "{\"name\":\"Mikhailov\", \"country\":\"Russia\", \"city\":\"Samara\", \"age\":\"null\"}";
        String[] request = query.substring(1, query.length() - 1).split(", ");
        StringBuilder result = new StringBuilder();
        boolean flag = true;

        for (String item : request) {
            String[] keyValue = item.split(":" );
            String key = keyValue[0].replace("\"", ""); 
            String value = keyValue[1].replace("\"", ""); 
            if (!value.equalsIgnoreCase("null")) {
                if(flag==false)
                result.append(" AND ");
            result.append(key).append("=").append(value);
            flag = false; 
            }  
        }
        System.out.println("SELECT * FROM students WHERE " + result.toString());          
    }
}
