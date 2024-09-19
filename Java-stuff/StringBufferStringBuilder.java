public class StringBufferStringBuilder {
    public static void main(String[] args){
        //StringBuilder = StringBuffer (basically) except it is NOT thread-safe
        //StringBuffer default 16 capacity + size of string
        StringBuffer sb = new StringBuffer("Liam");
        sb.append(" Wilkinson");
        sb.deleteCharAt(2);
        sb.insert(0, "Java ");
        sb.insert(6, " Here ");
        sb.setLength(30);
        sb.ensureCapacity(100);

        String str = sb.toString();

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(str);

        //StringBuffer is thread-safe, StringBuilder is not
    }
    
}
