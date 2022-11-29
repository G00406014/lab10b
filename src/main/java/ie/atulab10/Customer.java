package ie.atulab10;
public class Customer extends Person{
    private String name;
    private String adress;
    private String telephone;

    public Customer(){
}

    public Customer(String name, String adress, String telephone){
        this.name = name;
        this.adress = adress;
        this.telephone = telephone;



    }
    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public String getAress(){return adress;}

    public void setAdress(String adress){this.adress = adress;}

    public String getTelephone(){return telephone;}

    public void setTelephone(String telephone){this.telephone = telephone;}

}
