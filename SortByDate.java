import java.util.*;

public class SortByDate implements Comparator<Dispositivo>{
        @Override
        public int compare(Dispositivo a, Dispositivo b){
            return a.getFecha().compareTo(b.getFecha());
        }
    }