package my.ilya.visitor;

/**
 * @author Kazakevich Ilya
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
