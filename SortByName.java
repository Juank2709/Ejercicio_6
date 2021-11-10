import java.util.*;
    
    public class SortByName implements Comparator<Dispositivo>{
        @Override
        public int compare(Dispositivo a, Dispositivo b){
            return a.getMarca().compareTo(b.getMarca());
        }
    }
