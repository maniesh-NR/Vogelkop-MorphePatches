package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mb4 {
    public final Map a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();
    public final t94 e;

    public mb4(String str, Map map, Context context, hnl hnlVar, ve4 ve4Var) {
        this.a = map;
        this.b = context;
        ve4Var.a(te4.a, new lb4(this, (byte) 0));
        t94 t94VarA = a(str);
        if (t94VarA != null) {
            this.e = t94VarA;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) kb4.a(str));
        t14.h(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final t94 a(String str) {
        t94 t94Var;
        synchronized (this.c) {
            t94Var = (t94) this.d.get(new kb4(str));
            if (t94Var == null) {
                we4 we4Var = (we4) this.a.get(new kb4(str));
                t94Var = we4Var != null ? we4Var.a : null;
                if (t94Var != null) {
                    if (!Intrinsics.a(str, "CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) kb4.a(str)) + " but it was actually " + ((Object) kb4.a("CXCP-Camera2"))).toString());
                    }
                    this.d.put(new kb4(str), t94Var);
                }
            }
        }
        return t94Var;
    }
}
