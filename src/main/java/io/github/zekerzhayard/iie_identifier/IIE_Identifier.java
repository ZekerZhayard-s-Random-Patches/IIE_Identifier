package io.github.zekerzhayard.iie_identifier;

public class IIE_Identifier {
    public static String removeIncorrectPath(String path) {
        if (path != null && path.contains(":")) {
            return path.split(":", 2)[1];
        }
        return path;
    }
}
