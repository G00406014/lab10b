package ie.atulab10;


public class Person {

   private String name;
   private String adress;
   private String telephone;

   public Person(){


   }

   public Person(String name, String adress, String telephone){
       this.name = "Dave" ;
       this.adress =  "Mervue";
       this.telephone = "123456789";

   }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress =adress;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}




