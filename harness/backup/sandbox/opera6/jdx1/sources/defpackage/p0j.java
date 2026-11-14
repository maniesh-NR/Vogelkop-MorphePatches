package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p0j {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public /* synthetic */ p0j(String str) {
        this(str, new ali((byte) 24));
    }

    public p0j(String str, int i) {
        this(str);
        this.c = true;
    }

    public p0j(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public p0j(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }

    public final String toString() {
        return sko.j("AccessibilityKey: ", this.a);
    }
}
