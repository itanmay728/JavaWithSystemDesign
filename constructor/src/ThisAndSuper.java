class test{

//    test(){
//                        // This is Default constructor
//    }

    public test(){
        System.out.println("tanmay");
    }

    test(int b){
        System.out.println("int test");
    }

}

class moreTest extends test{

    public moreTest(){
        super();
        System.out.println("GYandeep");
    }


    public moreTest(int a){
        this();
        System.out.println("shivani int");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {

        moreTest obj = new moreTest(7);


    }
}
