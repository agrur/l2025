package lesson13;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            rethrow("First");
        }catch(UserDefinedFirstException | UserDefinedSecondException | UserDefinedThirdException e){
            //below assignment will throw compile time exception since e is final
            //e = new Exception();
            System.out.println(e.getMessage());
        }
    }

    static void rethrow(String s) throws UserDefinedFirstException, UserDefinedSecondException,
            UserDefinedThirdException {
        try {
            if (s.equals("First"))
                throw new UserDefinedFirstException("First");
            else if (s.equals("Second"))
                throw new UserDefinedSecondException("Second");
            else
                throw new UserDefinedThirdException("Third");
        } catch (Exception e) {
            //below assignment disables the improved rethrow exception type checking feature of Java 7
            // e=new ThirdException();
            throw e;
        }
    }

    static class UserDefinedFirstException extends Exception {

        public UserDefinedFirstException(String msg) {
            super(msg);
        }
    }

    static class UserDefinedSecondException extends Exception {

        public UserDefinedSecondException(String msg) {
            super(msg);
        }
    }

    static class UserDefinedThirdException extends Exception {

        public UserDefinedThirdException(String msg) {
            super(msg);
        }
    }
}
