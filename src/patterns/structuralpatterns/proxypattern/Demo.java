package patterns.structuralpatterns.proxypattern;

/**
 * 代理模式
 */
public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println();
        image.display();
    }
}
