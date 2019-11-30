public class Air extends AbstractObjects {
    public Air() {
        this.ObjectName = " обычный воздух ";
        this.Material = " воздух ";
        this.type = Type.OBJECT;
    }
}

class StuffyAir extends Air {
    public StuffyAir() {
        this.ObjectName = " удушающий воздух ";
        this.Material = " воздух ";
        this.type = Type.OBJECT;
    }
}

class LessStuffyAir extends Air {
    public LessStuffyAir() {
        this.ObjectName = " менее душный воздух ";
        this.Material = " воздух ";
        this.type = Type.OBJECT;
    }
}

class FreshAir extends Air {
    public FreshAir() {
        this.ObjectName = " свежий воздух ";
        this.Material = " воздух ";
        this.type = Type.OBJECT;
    }
}
