package org.example.stringOpertionProgs;

public class InsertStringInString {
    public static String insertStringInString(String originlString,String stringTobeInsert,int index){
        String result = "";
        for (int i = 0; i< originlString.length(); i++){
            result += originlString.charAt(i);
            if (index == i){
                result += stringTobeInsert;
            }
        }
        return  result;
    }
    public static void main(String[] args) {
     String originlString = "Mohammad Amer";
     String stringTobeInsert = "khan";
     int index = 5;
     System.out.println(insertStringInString(originlString, stringTobeInsert, index));
    }
}
