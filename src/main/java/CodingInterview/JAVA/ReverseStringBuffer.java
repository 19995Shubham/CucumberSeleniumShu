package CodingInterview.JAVA;

public class ReverseStringBuffer {
    public static void main(String[] args) {

        String input = "Shubham";
        StringBuffer sb = new StringBuffer();
        sb.append(input);
        sb.reverse();
        System.out.println(sb);


        String inp = "Tripathi";
        StringBuilder sbl = new StringBuilder();
        sbl.append(inp);
        sbl.reverse();
        System.out.println(sbl);
    }

}
