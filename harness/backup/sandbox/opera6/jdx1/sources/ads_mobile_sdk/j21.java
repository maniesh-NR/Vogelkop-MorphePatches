package ads_mobile_sdk;

import java.io.Closeable;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class j21 implements Closeable {
    public final int a;
    public final String b;
    public final LinkedHashMap c;
    public final gv2 d;
    public final h07 e;
    public final String f;

    public j21(int i, String str, LinkedHashMap linkedHashMap, gv2 gv2Var, h07 h07Var, String str2) {
        this.a = i;
        this.b = str;
        this.c = linkedHashMap;
        this.d = gv2Var;
        this.e = h07Var;
        this.f = str2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
