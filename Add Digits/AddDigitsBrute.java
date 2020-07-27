//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//brute force solution

class AddDigitsBrute {
    public int addDigits(int num) {
        int sum=0;
        while (num > 0 || sum > 9)  
        { 
            if (num == 0) { 
                num = sum;
                sum=0;
            } 
            sum += num % 10; 
            num /= 10; 
        } 
        return sum;
    }
}
