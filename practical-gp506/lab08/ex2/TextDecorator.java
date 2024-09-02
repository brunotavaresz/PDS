package lab08.ex2;

public class TextDecorator implements Text {

    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public boolean hasNext() {
        text.hasNext();
        return false;
    }

    @Override
    public String next() {
        text.next();
        return null;
    }
    
}
