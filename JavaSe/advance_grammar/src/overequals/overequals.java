package overequals;
public class overequals {
    int  age;
    String name;
    int month;

    @Override
    public boolean equals(Object obj) {
        /*
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        overequals son = (overequals) obj;
         */
        if(obj==null||!(obj instanceof overequals))
            return false;
        if(this==obj) {
            return true;
        }
        overequals t=(overequals)obj;
        return this.name==t.name&&this.age==t.age&&this.month==t.month;

    }

    public static void main(String[] args) {
        overequals a=new overequals();
        String b="fasd";
        System.out.println(a);
        System.out.println(b);
    }
}
