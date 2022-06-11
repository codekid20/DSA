package enumsExamples;

public class Basic1 {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.println("winter");
                break;

            case SUMMER:
                System.out.println("summer");
                break;

            default:
                System.out.println("default");
        }
    }
}





