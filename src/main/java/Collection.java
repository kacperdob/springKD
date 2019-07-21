import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
    private List<String> humanList;
    private Set<String> humanSet;
    private Map<Integer, String> humanMap;
    public Collection(){}

    public Collection(List<String> humanList, Set<String> humanSet, Map<Integer, String> humanMap) {
        this.humanList = humanList;
        this.humanSet = humanSet;
        this.humanMap = humanMap;
    }

    public List<String> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<String> humanList) {
        this.humanList = humanList;
    }

    public Set<String> getHumanSet() {
        return humanSet;
    }

    public void setHumanSet(Set<String> humanSet) {
        this.humanSet = humanSet;
    }

    public Map<Integer, String> getHumanMap() {
        return humanMap;
    }

    public void setHumanMap(Map<Integer, String> humanMap) {
        this.humanMap = humanMap;
    }

    public void listPrinter(List<String> a){
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }

    public void setPrinter(Set<String> names){
        for(String name: names) {
            System.out.println(name);
        }
    }
//    public void mapPrinter(Map<Integer, String> names){
//        for(String name: names) {
//            System.out.println(name);
//        }
//    }
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Collection obj = (Collection) context.getBean("collection");
        obj.listPrinter(obj.humanList);
        System.out.println();
        obj.setPrinter(obj.humanSet);
        System.out.println();
  //      obj.mapPrinter(obj.humanMap);
    }
}

