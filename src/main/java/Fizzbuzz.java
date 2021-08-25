// For: src/main/java/Fizzbuzz.java
public class Fizzbuzz {
    public String generate(Integer upto) {
        String result = "";
        if(upto < 2) {
            return "1";
        } else {
            for (Integer i = 1; i <= upto; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    result += "FizzBuzz, ";
                } else if (i % 3 == 0) {
                    result += "Fizz, ";
                } else if (i % 5 == 0){
                    result += "Buzz, ";
                } else {
                    result += i.toString() + ", ";
                }
            }
            return result.substring(0, (result.length() -2));
        }

    }
}
