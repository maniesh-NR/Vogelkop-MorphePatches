package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ezo {
    public static final List a = Collections.singletonList("omsdk_v1.js");
    public static final ygo b = new ygo((byte) 1);

    public static void a() {
        for (String str : a) {
            gxo gxoVar = gxo.c;
            File fileC = sjo.c(2, str);
            if (fileC != null && fileC.exists()) {
                fileC.delete();
            }
        }
    }
}
