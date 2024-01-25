package io.github.zekerzhayard.iie_identifier;

import net.minecraft.util.Identifier;

public class IIE_Identifier {
    public static void checkValid(RuntimeException iie, Identifier identifier) {
        if ("minecraft".equals(identifier.getNamespace()) && "DUMMY".equals(identifier.getPath())) {
            throw iie;
        }
    }
}
