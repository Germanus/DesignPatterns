package my.ilya.visitor;

/**
 * @author Kazakevich Ilya
 */
public class Keyboard implements ComputerPart {
    
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
