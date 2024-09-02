import java.util.Collection;

public class UndoCommand<E> implements Command {
    private Collection<E> collection;
    private E element;

    public UndoCommand(Collection<E> collection, E element) {
        this.collection = collection;
        this.element = element;
    }
    
    @Override
    public void execute() {
        this.collection.remove(this.element);
    }

    @Override
    public void undo() {
        this.collection.add(this.element);
    }
    
}
