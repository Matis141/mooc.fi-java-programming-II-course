

public class Checker {
    
    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        if (string.matches("[aeiou]*")) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean timeOfDay(String string) {
        if (string.length() != 8) {
            return false;
        }
        if (string.substring(0,2).matches("[0-9]*") && string.substring(2,3).equals(":") && string.substring(3,5).matches("[0-9]*") &&
                string.substring(5,6).equals(":") && string.substring(6,8).matches("[0-9]*")) {
            if (Integer.valueOf(string.substring(0,2)) < 24  && Integer.valueOf(string.substring(3,5)) < 60 && 
                            Integer.valueOf(string.substring(6,8)) < 60) {
               return true;
            } else {
                return false;
            }
        }    
        return false;
    }
    
}
