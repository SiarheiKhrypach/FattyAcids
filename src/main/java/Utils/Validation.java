package Utils;

import javax.servlet.http.HttpServletRequest;

public class Validation {

    public static boolean idIsNumber(HttpServletRequest request) {
        final String id = request.getParameter("id");
        return id != null &&
                (id.length() > 0) &&
                id.matches("\\d+");
    }


}
