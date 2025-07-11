public class User {
    private int id;
    private String name;
    private String email;

    public User(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        
        if(!email.contains("@")){
            throw new  IllegalArgumentException("Invalid email format");
        }
        this.email= email;
    }

    public String getContactInfo(){
        return "Name "+ name+ " Email "+ email;
    }

    public static boolean emailsAreUnique(User u1, User u2) {
    return !u1.getEmail().equalsIgnoreCase(u2.getEmail());  
    }

    @Override
    public String toString(){
        return "User {Id "+id+ ", name: "+name+", email: "+ email+"}";
    }

    public static void main(String [] args){
        User u1 = new User(1, "Ryan Hess", "ryanhess@tco.org");
        User u2 = new User(2, "Alam", "alam@gmail.com");

    System.out.println("Are emails equal? " + emailsAreUnique(u1, u2));    

    }
}


