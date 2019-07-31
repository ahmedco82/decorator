package com.ahmedco.decorator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.ahmedco.decorator.test2.Color;
import com.ahmedco.decorator.test2.FillColorDecorator;
import com.ahmedco.decorator.test2.LineColorDecorator;
import com.ahmedco.decorator.test2.LineStyle;
import com.ahmedco.decorator.test2.LineStyleDecorator;
import com.ahmedco.decorator.test2.LineThinknessDecorator;
//import com.ahmedco.decorator.test2.Shape;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Test1();
        // Test2();

        Test3();
    }

    private void Test3() {
        //https://www.tutorialspoint.com/design_pattern/decorator_pattern
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

    private void Test2(){
        // https://dzone.com/articles/decorator-design-pattern-in-java
        /*
        System.out.println("Creating Simple Shape Objects...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        System.out.println("Drawing Simple Shape Objects...");
        rectangle.draw();
        System.out.println();
        circle.draw();
        System.out.println();
        System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ...");
        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new LineThinknessDecorator(new Circle() ,2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
       // Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new LineThinknessDecorator(new Circle() ,2.0d),LineStyle.DASH), Color.BLUE), Color.RED);
        circle1.draw();
        System.out.println();
        // order of decorator is also not much important here since all are unique functionalities.
        // we can also do this nesting of functionalities in separate statements.
        System.out.println("creating object with similar functionalities in separate statements.");
        Circle c = new Circle();
        LineThinknessDecorator lt = new LineThinknessDecorator(c,2.0d);
        LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.DASH);
        LineColorDecorator lc = new LineColorDecorator(ls, Color.BLUE);
        FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
        Shape circle3 = fc;
        circle3.draw();
        System.out.println();
        System.out.println("Creating Decorated Circle with Green Color, Black Lines ...");
        Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.BLACK), Color.GREEN);
        circle2.draw();
        System.out.println();
        System.out.println("Creating Decorated Rectange with Yellow Color, Red Lines in double dash pattern...");
        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RED), Color.YELLOW);
        rectangle1.draw();
        System.out.println();
        */
    }


    private void Test1(){
      //  Sandwich basicSandwich = new Shatta(new BasicSandwich());
       // Sandwich basicSandwich = new Shatta(new Salt(new BasicSandwich()));
       //  Sandwich basicSandwich = new Shatta(new Fool(new Salt(new BasicSandwich())));
       // System.out.printf("Description: %s%n", basicSandwich.getDescription());
       // System.out.print("Cost: %.2f", basicSandwich.getCost());
     //  Log.i("Print_0",""+basicSandwich.getDescription());
       //Log.i("Print_",""+basicSandwich.getCost());
    }
}
