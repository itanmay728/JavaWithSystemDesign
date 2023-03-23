class constructor{

    private String name ;
    private int age ;
    constructor(String name , int age){
        this.age = age;
        this.name = name;
    }
    constructor(String name){
        this.name = name;
    }
    constructor(int age){
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {

        constructor obj = new constructor(4);

    }
}