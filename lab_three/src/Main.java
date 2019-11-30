public class Main {

    public static void main(String[] args) {
        ShortyDescription dontKnow = new ShortyDescription("Незнайка", true);
        ShortyDescription a = new ShortyDescription("Строптивый", true);

        Bug bug = new Bug(" клоп ");
        BigRat Ratte = new BigRat("Большая серая крыса");

        Shelf shelf = new Shelf();
        Floor floor = new Floor();
        WoodenStand stand = new WoodenStand();
        Boots boots = new Boots();
        LessStuffyAir lsa = new LessStuffyAir();
        StuffyAir sa = new StuffyAir();
        Air air = new Air();
        FreshAir fAir = new FreshAir();

        DayOrNight ti = new DayOrNight();
        ti.setTime(DayNight.NIGHT);

        final String DyNt = DayNight.NIGHT.toString();


        switch (DyNt) {
            case "DAY":
                System.out.println("Текущее время: день");
            case "NIGHT":
                System.out.println("Текущее время: ночь");
        }
        dontKnow.TakeAdvice(a.name);
        dontKnow.LieDown(shelf.ObjectName);
        dontKnow.FeelTouch(bug.animal);
        dontKnow.itch();
        dontKnow.JumpOff(floor.ObjectName);
        dontKnow.BrushOff(bug.animal);
        dontKnow.Stay(floor.ObjectName, lsa.ObjectName + "и нет" + bug.animal);
        dontKnow.SitDown(floor.ObjectName);
        dontKnow.LeanAgainst(stand.ObjectName);

        switch (DyNt) {
            case "NIGHT":
                dontKnow.Nap(stand.ObjectName);
                dontKnow.sleep = true;
                break;
            case "DAY":
                dontKnow.WakeUp();
                dontKnow.sleep = false;
                break;
        }


        Ratte.touching = true;

        if (Ratte.touching || bug.touching) {
            dontKnow.sleep = false;
            dontKnow.WakeUp();
        }

        dontKnow.See(Ratte.animal);

        Ratte.WiggleNose();

        Ratte.sniff(dontKnow.name + boots.ObjectName);


    }
}

