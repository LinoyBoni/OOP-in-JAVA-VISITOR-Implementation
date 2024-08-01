// TODO: Implement Composite (change this file).

import java.util.ArrayList;
import java.util.List;

public class Island extends Element {
    private List<Element> elements;
    private String name;
    public Island(String name, double diameter, String path) {
        //TODO: fixed
        super(diameter, diameter, path);
        this.name = name;
        this.elements = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
    }

    @Override
    public void addElement(Element element) {
        if(element.getHabitat() == Habitat.AQUATIC)
        {
            System.out.printf("%s cannot contain %s\n", getName(), element.getName());
        }
        else
            {
            elements.add(element);
        }
    }

    //adding the Visitor
    @Override
    public void accept(IVisitor iVisitor)
    {
        iVisitor.visitor(this);
        elements.forEach(element -> element.accept(iVisitor));
    }

    public boolean isListElementsNull()
    {
        return elements.isEmpty();
    }
}


}

