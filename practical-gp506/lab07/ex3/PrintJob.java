package ex3;

import static java.lang.Thread.sleep;

public class PrintJob implements Runnable{
    private Document documento;

    private String texto;
    private int jobID;
    private static int JobCount = 0;


    public PrintJob(Document documento) {
        this.documento = documento;
        this.jobID = JobCount++;
        this.texto = readDocument();
    }

    @Override
    public void run() {
        try {
            sleep(1500  );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Job " + this.jobID + ": " + readDocument());
    }

    @Override
    public String toString() {

        return ("Job " + this.jobID + ": " + texto);
    }

    public int getID() {
        return this.jobID;
    }

    private String readDocument() {
        StringBuilder content = new StringBuilder();
        String[] lines = this.documento.getDados();
        content.append(lines[0], 0, Math.min(20, lines[0].length() - 1)).append("...");
        return content.toString();
    }
}