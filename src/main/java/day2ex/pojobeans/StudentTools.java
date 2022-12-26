package day2ex.pojobeans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentTools implements  StudentTool{
    private Map<String, Tools> toolsOfStudent= new HashMap<>();
    {
        Tools t= new Tools("Compass");
        toolsOfStudent.put(t.getName(), t);
    }

    @Override
    public void addTool(String name) {
        Tools t= new Tools(name);
        toolsOfStudent.put(name, t);
    }

    @Override
    public String getTool(String name) {
        String x=null;
        for (String c:toolsOfStudent.keySet()
        ) {
            if (c.equals(name)){
                x=c;
            }
        }
        return x;
    }
}