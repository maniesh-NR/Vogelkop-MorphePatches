package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ofg extends olb {
    public final String c;

    public ofg(String str) {
        super(nlb.b);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofg) && Intrinsics.a(this.c, ((ofg) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sko.k("PlaceholderText(text=", this.c, ")");
    }
}
