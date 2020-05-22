public class Card{

    private int memeRating;
    private boolean direction;
    private String meaning;

    public Card(){
        this.memeRating = 0;
        this.direction = true; //rightside, false = reverse
        this.meaning = null;
    }

    public int getMemeRating() {
        return memeRating;
    }

    public void setMemeRating(int memeRating) {
        this.memeRating = memeRating;
    }

    public void setDirection(int x){
        if (x == 0){
            this.direction = false;
        } else {
            this.direction = true;
        }
    }

    public boolean getDirection() {
        return direction;
    }

    public void setMeaning(String meaning){
        this.meaning = meaning.toString();
    }

    public String getMeaning(){
        return this.meaning;
    }

    public String toString(){
        return this.meaning;
    }
}





