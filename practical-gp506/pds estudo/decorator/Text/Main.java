package decorator.Text;

/**        
public class Main {
    public static void main(String[] args) {
        Text base = new BasicText("Implementaçao basica do decorator");
        Text basecomnegrito = new NegritoDecorator(base);
        Text basecomitalico = new ItalicDecorator(base);
        Text italiconegrito = new ItalicDecorator(new NegritoDecorator(base));

        System.out.println("Normal: " + base.getContent());
        System.out.println("Com negrito: " + basecomnegrito.getContent());
        System.out.println("Com italico: " + basecomitalico.getContent());
        System.out.println("Com negrito e italico: " + italiconegrito.getContent());

    }

    class BasicText {

    }

    class TextDecorator implements Text {
        protected Text txt;

        TextDecorator(Text txt) {
        }
    }

    interface Text {
        String getContent();
    }
}
*/
