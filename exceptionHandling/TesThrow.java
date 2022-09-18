package exceptionHandling;

public class TesThrow {

    static class AgeInvalid extends Exception{
        AgeInvalid(String s){
            super (s);
        }
    }
}

class test{
    static void validate(int age)throws TesThrow.AgeInvalid {
        if(age<18)
            throw new TesThrow.AgeInvalid("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try {
            validate(13);
        }
        catch(Exception i){
            System.out.println("Exception aktif" + " " + i);
        }
        System.out.println("rest ");
    }
}
