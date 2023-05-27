class GrandFather {
    int x;
    GrandFather() {
        x = 12;
    }
}

class Father extends GrandFather {
    int x;
    Father() {
        x = 20;
    }
}

class Son extends Father {
    int x = 100;
    Son(int x) {
        int total = x + this.x + super.x + ((GrandFather)this).x;
        System.out.println("Total : " + total);
    }
    
}

public class MultiLevelInheritance {
    Son obj = new Son(120);    
}
