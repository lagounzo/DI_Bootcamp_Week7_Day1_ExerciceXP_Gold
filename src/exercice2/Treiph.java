package exercice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Treiph {
	List<Card> cards = new  ArrayList<Card>();

	public  Treiph() {
		// TODO Auto-generated constructor stub
        String[] types = {"Heart", "Gold", "Spade", "Diamond"};
        Map<String, Integer> nameValeurMap = new HashMap<String, Integer>(){{
            put("2", 2);
            put("3", 3);
            put("4", 4);
            put("5", 5);
            put("6", 6);
            put("7", 7);
            put("8", 8);
            put("9", 9);
            put("10", 10);
            put("Ahou", 10);
            put("Agnes", 10);
            put("King", 10);
            put("Kouame", 11);
        }};
        for (int i = 0; i < types.length; i++) {
            int _i = i;
            nameValeurMap.forEach((n, v) -> {
                Card card = new Card(v, types[_i], n);
                this.cards.add(card);
            });
        }
    }

    public Treiph(List<Card> cards) {
        this.cards = cards;
    }

    public static void main(String[] args) {
        Treiph treiph =  new Treiph();
        System.out.println(treiph.cards.toString());
    }


}


