package io.github.zekerzhayard.iie_identifier;

public class IIE_Identifier {
    public static String removeIncorrectPath(String path) {
        if (path != null && path.startsWith("create:")) {
            return path.substring(7);
        }
        return path;
    }
}
