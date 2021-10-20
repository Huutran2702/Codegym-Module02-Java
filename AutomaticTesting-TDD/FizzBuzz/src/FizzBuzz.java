public class FizzBuzz {
   public static String getResult(int number) {
      boolean isFizz = number % 3 == 0;
      boolean isBuzz = number % 5 == 0;
      if(isFizz && isBuzz)
         return "FizzBuzz";

      if(isFizz)
         return "Fizz";

      if(isBuzz)
         return "Buzz";

      return getResultWithOtherCase(number);
   }
   public static String getResultWithOtherCase(int number) {
      String str = String.valueOf(number);
      for (int i = 0; i <str.length() ; i++) {
         char charOfStr = str.charAt(i);
         String charOfString = String.valueOf(charOfStr);
         if (charOfString.equals("3")) {
            return "Fizz";
         }
         if (charOfString.equals("5")) {
            return "Buzz";
         }
      }
      return number + "";
   }
}
