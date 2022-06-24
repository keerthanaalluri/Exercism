class ArmstrongNumbers {
    public int countdigits(int number)
    {
        int count=0;
        while(number>0)
        {
            count++;
            number /= 10;
        }
        return count;
    }
    boolean isArmstrongNumber(int numberToCheck) {

       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
       int numberobtained=0;
       int digits = countdigits(numberToCheck);
       int number = numberToCheck;
       while(numberToCheck>0)
        {
           int digit = numberToCheck%10;
           numberToCheck = numberToCheck/10;
           numberobtained += Math.pow(digit,digits);
        }
        if(numberobtained==number)
            return true;
        return false;


    }

}
