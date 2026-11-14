package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class me4 {
    public final Context a;
    public final oe4 b;
    public final c37 c;
    public final ke4 d;
    public final le4 e;
    public final ne4 f;

    public me4(Context context, oe4 oe4Var, le4 le4Var) {
        c37 c37Var = new c37((byte) 8);
        ke4 ke4Var = new ke4((byte) 0);
        ne4 ne4Var = new ne4();
        this.a = context;
        this.b = oe4Var;
        this.c = c37Var;
        this.d = ke4Var;
        this.e = le4Var;
        this.f = ne4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof me4) {
            me4 me4Var = (me4) obj;
            if (Intrinsics.a(this.a, me4Var.a) && this.b.equals(me4Var.b) && this.c == me4Var.c && this.d == me4Var.d && this.e.equals(me4Var.e) && this.f.equals(me4Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 961) + 1237) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.a + ", threadConfig=" + this.b + ", cameraMetadataConfig=" + this.c + ", cameraBackendConfig=" + this.d + ", cameraInteropConfig=" + this.e + ", imageSources=null, flags=" + this.f + ", platformApiCompat=null)";
    }
}
