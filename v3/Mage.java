// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Expanded
// 2017 - 11 - 13

public class Mage extends Protagonist {
    public Mage () {
	HP = 80;
	strength = 180;
	defense = 25;
	atkRate = 0.5;
    }

    public static about() {
	return "This is a mage! He has stumbled upon magic when he was just a child and his parents, who were also mages, assisted him in his journey to be the greatest mage out there! But all his friends know that although he can obliterate his foe in just a few hits, he can be taken out by a fatal hit as well.";
    }
}