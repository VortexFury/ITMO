public class ShortyDescription extends AbstractShorty {


    public ShortyDescription(String a, Boolean clothes) {
        name = a;
        type = Type.SHORTY;
        this.clothes = true;
        this.sleep = false;
        this.touch = false;
    }

    @Override
    public void TakeAdvice(String from) {
        System.out.println(name + " прислушался к совету " + from);

    }

    @Override
    public void LieDown(String place) {
        if (clothes) {
            System.out.println(name + " лег на " + place + " в одежде ");
        } else {
            System.out.println(name + " лег на " + place + " без одежды");
        }
    }

    @Override
    public void itch() {
        System.out.println(name + " чешется ");
    }

    @Override
    public void BrushOff(String fromWho) {
        System.out.println(name + " отряхнулся от " + fromWho);
    }

    @Override
    public void SitDown(String place) {
        System.out.println(name + " сел на " + place);
    }

    @Override
    public void LeanAgainst(String place) {
        System.out.println(name + " прислонился к " + place);
    }

    @Override
    public void Nap(String place) {
        System.out.println(name + " задремал на " + place);

    }

    @Override
    public void See(String object) {
        System.out.println(name + " посмотрел на " + object);

    }

    @Override
    public void JumpOff(String place) {
        System.out.println(name + " соскочил на " + place);
    }

    @Override
    public void FeelTouch(String object) {
        System.out.println(name + " почувствовал укус " + object);
    }

    public void Stay(String place, String reason) {
        System.out.println(name + " решил остаться на " + place + " потому что здесь " + reason);
    }

    public void WakeUp() {
        System.out.println(name + " проснулся ");

    }
}
