package my.ilya.visitor;

/**
 * @author Kazakevich Ilya
 */
public class Mouse implements ComputerPart{
    
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
