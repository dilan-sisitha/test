
public class Test {
    public static void main(String[] args) {
    
    People p1 = new People("dilan", 007);
   System.out.println(p1.idnum + " "+p1.name);

        
    }

}


class People{
    String name;
    int idnum;

    People(String name,int idnum){
        this.idnum = idnum;
        this.name = name;


    }

}
class manager extends People{

    manager(String name, int idnum) {
        super(name, idnum);
       
    }

}