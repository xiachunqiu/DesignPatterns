package patterns.behavioralpatterns.templatepattern;

import patterns.behavioralpatterns.templatepattern.game.Cricket;
import patterns.behavioralpatterns.templatepattern.game.Football;

/**
 * 模板模式
 */
public class Demo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
