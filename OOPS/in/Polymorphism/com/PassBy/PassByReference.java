package in.Polymorphism.com.PassBy;

public class PassByReference {

    public static void main(String[] args) {
        point first = new point(5,8);

        System.out.println("first  : " + first);
        move(first);
        System.out.println("first : "+ first);   // its change the value because its pass by reference ;
    }

    public static void move(point p ){
        p.x++;
        p.y++;
        System.out.println(p);

    }
    public static class point{
        int x ;
        int y ;


        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
