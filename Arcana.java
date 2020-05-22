import java.util.ArrayList;

public class Arcana extends Card {
    private String name;
    private String cue;

    public Arcana(String cue) {
        super();
        this.cue = cue;
        switch (cue) {
            case "world":
                this.name = "The World";
                if (super.getDirection()) {
                    super.setMemeRating(1);
                    super.setMeaning("fulfillment, harmony, completion");
                } else {
                    super.setMemeRating(2);
                    super.setMeaning("incompletion, no closure");
                }
                break;
            case "judgement":
                this.name = "Judgment";
                if (super.getDirection()) {
                    super.setMemeRating(3);
                    super.setMeaning("reflection, reckoning, awakening");
                } else {
                    super.setMemeRating(4);
                    super.setMeaning("lack of self-awareness, doubt, self-loathing");
                }
                break;
            case "sun":
                this.name = "The Sun";
                if (super.getDirection()) {
                    super.setMemeRating(5);
                    super.setMeaning("joy, success, celebration, positivity");
                } else {
                    super.setMemeRating(6);
                    super.setMeaning("negativity, depression, sadness");
                }
                break;
            case "moon":
                this.name = "The Moon";
                if (super.getDirection()) {
                    super.setMemeRating(7);
                    super.setMeaning("unconscious, illusions, intuition");
                } else {
                    super.setMemeRating(8);
                    super.setMeaning("confusion, fear, misinterpretation");
                }
                break;
            case "star":
                this.name = "The Star";
                if (super.getDirection()) {
                    super.setMemeRating(9);
                    super.setMeaning("hope, faith, rejuvination");
                } else {
                    super.setMemeRating(10);
                    super.setMeaning("faithlessness, discouragement, insecurity");
                }
                break;
            case "tower":
                this.name = "The Tower";
                if (super.getDirection()) {
                    super.setMemeRating(11);
                    super.setMeaning("sudden upheavel, broken pride, disaster");
                } else {
                    super.setMemeRating(12);
                    super.setMeaning("disaster avoided, delayed disaster, fear of suffering");
                }
                break;
            case "devil":
                this.name = "The Devil";
                if (super.getDirection()) {
                    super.setMemeRating(13);
                    super.setMeaning("addiction, materialism, playfulness");
                } else {
                    super.setMemeRating(14);
                    super.setMeaning("freedom, release, restoring control");
                }
                break;
            case "temperance":
                this.name = "Temperance";
                if (super.getDirection()) {
                    super.setMemeRating(15);
                    super.setMeaning("middle path, patience, finding meaning");
                } else {
                    super.setMemeRating(16);
                    super.setMeaning("extremes, excess, lack of balance");
                }
                break;
            case "death":
                this.name = "Death";
                if (super.getDirection()) {
                    super.setMemeRating(17);
                    super.setMeaning("end of cycle, beginning of change, metamorphosis");
                } else {
                    super.setMemeRating(18);
                    super.setMeaning("fear of change, holding on, stagnation, decay");
                }
                break;
            case "hanged":
                this.name = "The Hanged Man";
                if (super.getDirection()) {
                    super.setMemeRating(19);
                    super.setMeaning("sacrifice, release, martyrdom");
                } else {
                    super.setMemeRating(20);
                    super.setMeaning("stalling, needless sacrifice, fear of sacrifice");
                }
                break;
            case "justice":
                this.name = "Justice";
                if (super.getDirection()) {
                    super.setMemeRating(21);
                    super.setMeaning("cause and effect, clarity, truth");
                } else {
                    super.setMemeRating(22);
                    super.setMeaning("dishonesty, unaccountability, unfairness");
                }
                break;
            case "wheel":
                this.name = "The Wheel of Fortune";
                if (super.getDirection()) {
                    super.setMemeRating(23);
                    super.setMeaning("change, cycles, inevitable fate");
                } else {
                    super.setMemeRating(24);
                    super.setMeaning("no control, clinging to control, bad luck");
                }
                break;
            case "hermit":
                this.name = "The Hermit";
                if (super.getDirection()) {
                    super.setMemeRating(25);
                    super.setMeaning("contemplation, search for truth, inner guidance");
                } else {
                    super.setMemeRating(26);
                    super.setMeaning("loneliness, isolation, lost your way");
                }
                break;
            case "strength":
                this.name = "Strength";
                if (super.getDirection()) {
                    super.setMemeRating(27);
                    super.setMeaning("inner strength, bravery, compassion, focus");
                } else {
                    super.setMemeRating(28);
                    super.setMeaning("self-doubt, weakness, insecurity");
                }
                break;
            case "chariot":
                this.name = "The Chariot";
                if (super.getDirection()) {
                    super.setMemeRating(29);
                    super.setMeaning("direction, control, willpower");
                } else {
                    super.setMemeRating(30);
                    super.setMeaning("lack of control, lack of direction, aggression");
                }
                break;
            case "lovers":
                this.name = "The Lovers";
                if (super.getDirection()) {
                    super.setMemeRating(31);
                    super.setMeaning("partnerships, duality, union");
                } else {
                    super.setMemeRating(32);
                    super.setMeaning("loss of balance, one-sideness, disharmony");
                }
                break;
            case "hierophant":
                this.name = "The Hierophant";
                if (super.getDirection()) {
                    super.setMemeRating(33);
                    super.setMeaning("tradition, conformity, morality, ethics");
                } else {
                    super.setMemeRating(34);
                    super.setMeaning("rebellion, subversive, new approaches");
                }
                break;
            case "emperor":
                this.name = "The Emperor";
                if (super.getDirection()) {
                    super.setMemeRating(35);
                    super.setMeaning("authority, structure, control, fatherhood");
                } else {
                    super.setMemeRating(36);
                    super.setMeaning("tyranny, rigidity, coldness");
                }
                break;
            case "empress":
                this.name = "The Empress";
                if (super.getDirection()) {
                    super.setMemeRating(37);
                    super.setMeaning("motherhood, fertility, nature");
                } else {
                    super.setMemeRating(38);
                    super.setMeaning("dependence, smothering, emptiness, nosiness");
                }
                break;
            case "priestess":
                this.name = "The High Priestess";
                if (super.getDirection()) {
                    super.setMemeRating(39);
                    super.setMeaning("intuitive, unconscious, inner voice");
                } else {
                    super.setMemeRating(40);
                    super.setMeaning("lack of center, lost inner voice, repressed feelings");
                }
                break;
            case "magician":
                this.name = "The Magician";
                if (super.getDirection()) {
                    super.setMemeRating(41);
                    super.setMeaning("willpower, desire, creation, manifestation");
                } else {
                    super.setMemeRating(42);
                    super.setMeaning("trickery, illusions, out of touch");
                }
                break;
            case "fool":
                this.name = "The Fool";
                if (super.getDirection()) {
                    super.setMemeRating(43);
                    super.setMeaning("innoncence, new beginnings, free spirit");
                } else {
                    super.setMemeRating(44);
                    super.setMeaning("recklessness, taken advantage of, inconsideration");
                }
                break;

        }

    }

    public String toString() {
        if(super.getDirection()) {
            return this.name + ": " + super.toString();
        } else {
            return this.name + " (reversed): " + super.toString();
        }
    }

}