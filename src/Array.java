import java.util.Random;

public class Array {
    public static void main(String[] args) {
        String Tarot[];
        Tarot = new String[22];

        Tarot[0] = "Fool       \n\"New beginnings, having faith in the future, being inexperienced,\nnot knowing what to expect, having beginner's luck, improvisation and believing in the universe.\"";
        Tarot[1] = "Magician   \n\"Points to the talents, capabilities and resources at the querent's disposal to succeed.\nThe message is to tap into one's full potential rather than holding back.\"";
        Tarot[2] = "Priestess  \n\"Mystery, stillness and passivity.\nIt is time to retreat and reflect upon the situation and trust your inner instincts to guide you through it.\nThings around you are not what they appear to be right now.\"";
        Tarot[3] = "Empress    \n\"Associated with maternal influence, You are hoping to start a family.\nThe creation of life, romance, art, or new business.\"";
        Tarot[4] = "Emperor    \n\"Stability and security in life.\nYou are on top of things and everything in under your control.\nIt is your hard work, discipline and self control that have bought you this far.\"";
        Tarot[5] = "Hierophant \n\"Tradition and convention.\nrepresent marriage in an arranged setup.\nIt can also mean a teacher or counsellor who will help in learning / education of the querent.\"";
        Tarot[6] = "Lovers     \n\"Relationships and choices.\nIndicates some decision about an existing relationship, a temptation of the heart, or a choice of potential partners.\"";
        Tarot[7] = "Chariot    \n\"Overcoming conflicts and moving forward in a positive direction.\nOne needs to keep going on and through sheer hard work and commitment he will be victorious.\"";
        Tarot[8] = "Justice    \n\"The fairest decision will be made.\nJustice is the sword that cuts through a situation \nand will not be swayed by outer beauty when deciding what is fair and just.\"";
        Tarot[9] = "Hermit     \n\"You are in a phase of introspection where you are drawing your attention inwards and looking for answers within.\nYou are in need of a period of inner reflection.\"";
        Tarot[10] = "Fortune   \n\"An element of change in the querent's life, such change being in station, position or fortune\nsuch as the rich becoming poor, or the poor becoming rich.\"";
        Tarot[11] = "Strength  \n\"Predicts the triumphant conclusion to a major life problem, \nsituation or temptation through strength of character.\nIt is a very good if you are fighting illness or recovering from injury.\"";
        Tarot[12] = "Hanged Man\n\"Ultimate surrender, sacrifice, or being suspended in time.\"";
        Tarot[13] = "Death     \n\"A physical death.\n Typically it implies an end, possibly of a relationship or interest,\nand therefore implies an increased sense of self-awareness.\"";
        Tarot[14] = "Temperance\n\"You should learn to bring about balance, patience and moderation in your life.\nYou should take the middle road, avoiding extreme's and maintain a sense of calm.\"";
        Tarot[15] = "Devil     \n\"Being seduced by the material world and physical pleasures.\nAlso living in fear, domination and bondage, being caged by an overabundance of luxury.\"";
        Tarot[16] = "Tower     \n\"Danger, crisis, destruction, and liberation.\nAssociated with sudden unforseen change.\"";
        Tarot[17] = "Star      \n\"You are likely to find yourself feeling inspired.\nIt brings renewed hope and faith and a sense that you are truly blessed by the universe at this time.\"";
        Tarot[18] = "Moon      \n\"Illusion and deception, and a time when something is not as it appears to be.\nPerhaps a misunderstanding on your part, or a truth you cannot admit to yourself.\"";
        Tarot[19] = "Sun       \n\"Good fortune, happiness, joy and harmony.\nThe universe coming together and agreeing with your path \nand aiding forward movement into something greater.\"";
        Tarot[20] = "Judgement \n\"A time of resurrection and awakening\nA time when a period of our life comes to an absolute end making way for dynamic new beginnings.\"";
        Tarot[21] = "World     \n\"Ending to a cycle of life\nA pause in life before the next big cycle beginning with the fool.\nIt is an indicator of a major and inexorable change, of tectonic breadth.\"";

        System.out.println("***YOU GOT***\n");
        System.out.println( Tarot[new Random().nextInt(Tarot.length)]);
    }
}
