package my.ilya.visitor;

/**
 * @author Kazakevich Ilya
 */
public class Monitor implements ComputerPart{
    
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
