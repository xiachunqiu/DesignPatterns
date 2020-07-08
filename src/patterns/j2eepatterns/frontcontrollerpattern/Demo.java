package patterns.j2eepatterns.frontcontrollerpattern;

import patterns.j2eepatterns.frontcontrollerpattern.controller.FrontController;

/**
 * 前端控制器模式
 */
public class Demo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
