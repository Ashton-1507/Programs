//Reverse a number
class Reverse
{
    public static void main(String args[])
    {
        int num = 123;
        int rev = 0;
        int sum = 0;
        int rem;
        while(num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            sum = sum + rem;
            num = num /10;
        }
        System.out.println(rev);
    }
}