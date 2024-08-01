
import java.util.ArrayList;
import java.util.List;

public class Lake extends Element {
    private String name;
    private List<Element> elements;

    public Lake(String name, double diameter, String path)
    {
        super(diameter, diameter, path);
        this.name = name;
        this.elements = new ArrayList<>();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

    //add the visitor
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visitor(this);
        elements.forEach(element -> element.accept(iVisitor));
    }
    @Override
    public void addElement(Element element) {
        if(element.getHabitat() == Habitat.TERRESTRIAL) {
            System.out.printf("%s cannot contain %s\n", getName(), element.getName());
        } else {
            elements.add(element);
        }
    }
    public boolean isListElementsNull(){
        return elements.isEmpty();
    }
}
