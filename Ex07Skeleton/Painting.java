
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Painting {
    Map<String, Element> pathToElementMap;
    List<Element> elementList;
    Painting(){
        elementList=new ArrayList<>();
        pathToElementMap = new HashMap<>();
    }
    public void addElement(Element element){
        pathToElementMap.put(element.getFullName(), element);
        if (element.getPath().isEmpty()){
            elementList.add(element);
        }
        else {
            Element containingElement = pathToElementMap.get(element.getPath());
            //Add element as a child of containingElement
            containingElement.addElement(element);
        }
    }
    public String getName() {
        return Painting.class.getSimpleName().toLowerCase();
    }
     //add the visitor
    public void actionWithIVisitor(IVisitor iVisitor){
        elementList.forEach(element -> element.accept(iVisitor));
        System.out.println("\n");
    }

}