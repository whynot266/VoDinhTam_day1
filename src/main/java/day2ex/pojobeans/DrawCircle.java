package day2ex.pojobeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("draw")
public class DrawCircle implements Draw {
    @Autowired
    private StudentTool studentTools;



    @Override
    public void draw(){
        String gettool= studentTools.getTool("Compass");
        if (gettool.equals("Compass")){
            System.out.println("Succeed in drawing a circle!!!");
        }else {
            System.out.println("Cannot draw");
        }
    }
}