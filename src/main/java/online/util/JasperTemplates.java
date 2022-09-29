package online.util;

public class JasperTemplates {

    public static final String EXTENSION = ".jrxml";
    public static final String HOME = "/";
    public static final String REPORTS = HOME + "reports";

    public static final String OUTGOING = concatTemplates(REPORTS, "outgoing");

    private static String concatTemplates(String... routes) {
        return String.join("/", routes).concat(EXTENSION);
    }
}
