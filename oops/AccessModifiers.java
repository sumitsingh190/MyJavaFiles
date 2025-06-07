package oops;
// Access modifiers are used to restrict access to the class, variables, methods and constructors.
// There are four types of access
// 1. public
// 2. private
// 3. protected
// 4. default
// 1. public: accessible from anywhere
// 2. private: accessible only within the class
// 3. protected: accessible within the package and outside the package but only through inheritance
// 4. default: accessible within the package


class Account{
    public String name;    //anyone from this package can access this + different package can also access this
    protected String email; // anyone from this package can access and only the subclass of other package can access this 
    private String password; // it can be accessed only within the class, in this case only Account class can access this, no subclass of this package or other package can access it

    //getters and setters ; these are used to access the private variables
    public String getPassword(){    //by this we can get the password 
        return this.password;
    }
    public void setPassword(String password){    //we can change this public into private too as per our need
        this.password = password;       // by this we can set the password 
    }
}
// default does not need to be written as it is the default access modifier and it is accessible within the package
public class AccessModifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Aman";
        account1.email = "aman@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
