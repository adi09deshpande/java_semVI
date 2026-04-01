class Hillstation
{
    public void famousfood() {
        System.out.println("Hill stations offer unique local delicacies");
    }
    
    public void famousfor() {
        System.out.println("Known for pleasant weather and natural beauty");
    }
}

// First subclass
class Ooty extends Hillstation {
    public void famousfood() {
        System.out.println("Ooty is known for: Homemade chocolates, Varkey, Tea");
    }
    
    public void famousfor() {
        System.out.println("Ooty is famous for: Botanical gardens and Nilgiri mountain railway");
    }
}

// Second subclass
class Mussoorie extends Hillstation {
    public void famousfood() {
        System.out.println("Mussoorie specialties: Bal Mithai, Singori, Garhwal ka Fannah");
    }
    
    public void famousfor() {
        System.out.println("Mussoorie is famous for: Kempty Falls and Gun Hill");
    }
}

// Third subclass
class Nainital extends Hillstation {
    public void famousfood() {
        System.out.println("Nainital delights: Bal Mithai, Arsa, Ras");
    }
    
    public void famousfor() {
        System.out.println("Nainital is famous for: Naini Lake and boating");
    }
}

public class assign3_Hillstations {
    public static void main(String[] args) {
        System.out.println("*** EXPLORING INDIAN HILL STATIONS ***\n");
        Hillstation place;
        
        // first hill station
        place = new Ooty();
        System.out.println(">> Ooty <<");
        place.famousfood();
        place.famousfor();
        System.out.println();
        
        // second hill station
        place = new Mussoorie();
        System.out.println(">> Mussoorie <<");
        place.famousfood();
        place.famousfor();
        System.out.println();
        
        // third hill station
        place = new Nainital();
        System.out.println(">> Nainital <<");
        place.famousfood();
        place.famousfor();
    }
}
