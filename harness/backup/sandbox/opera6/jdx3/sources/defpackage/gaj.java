package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class gaj {
    public static final /* synthetic */ int a = 0;

    static {
        int length = "0123456789abcdefABCDEF".length();
        if (length != 0) {
            if (length == 1) {
                Collections.singleton(Character.valueOf("0123456789abcdefABCDEF".charAt(0)));
                return;
            }
            int length2 = "0123456789abcdefABCDEF".length();
            if (length2 > 128) {
                length2 = 128;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(qbd.a(length2));
            for (int i = 0; i < "0123456789abcdefABCDEF".length(); i++) {
                linkedHashSet.add(Character.valueOf("0123456789abcdefABCDEF".charAt(i)));
            }
        }
    }
}
