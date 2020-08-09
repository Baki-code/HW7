import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {

        return name;
    }
    void catInfo(){
        if (satiety == true){
            System.out.println(name + " сыт");
        }
        else {
            System.out.println(name + " голоден");
        }
    }
    void eat (Plate plate) {
        if (plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел");
        }
        else {
            System.out.printf("%s остался голодным. В тарелке недостаточно еды\n",name);
        }



    }


}
