//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//Optimal solution in O(1) 

/* After understanding the Brute for solution you may understand that if the number is less than or equal to 9 than it is the answer ,
   so here we optimiize the solution such that -

    if "num" is divisible by 9 then the answer is 9 (as sum of all nums divisble by 9 is 9)
    else if num is not divisble by 9 then the remainder is the answer .
    eg. num = 55 , num%9 = 1, (9*6=54+1) 
*/
class AddDigitsOptimized {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return (num%9==0?9:(num%9));
    }
}
