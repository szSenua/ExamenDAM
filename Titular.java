
package examen;


public class Titular {
    private String name;
    private String surnames;
    private int age;

    //constructor con todos los atributos
    public Titular(String name, String surnames, int age) {
        this.name = name;
        this.surnames = surnames;
        this.age = age;
    }
    
    //Get y Set de todos los atributos

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //método que muestra los datos del titular
    public void muestraTitular(){
        System.out.println("Los datos del titular son:");
        System.out.println("Nombre: "+ name +"\n Apellidos: "
                +surnames+" Edad: "+ age);
        
        
    }

   
    
    
    
    
    
}


