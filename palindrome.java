class Main {
  public static void main(String[] args) {
    
    int num = 355, reversedNum = 0, remainder;
    
    
    int orgNum = num;
    
   
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    
    
    if (orgNum == reversedNum) {
      System.out.println(orgNum + " is Palindrome.");
    }
    else {
      System.out.println(orgNum + " is not Palindrome.");
    }
  }
}