package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class s1 {
    public final String a;
    public final boolean b;
    public final HashMap c;

    public s1(String str, boolean z, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = z;
        if (strArr == null) {
            this.c = null;
            return;
        }
        this.c = new HashMap(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            this.c.put(strArr[i], strArr2[i]);
        }
    }
}
