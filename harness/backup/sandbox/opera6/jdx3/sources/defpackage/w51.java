package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w51 {
    public final Context a;
    public final n27 b;
    public final long c;
    public final zvf d;

    public w51(Context context, n27 n27Var, long j, zvf zvfVar) {
        this.a = context;
        this.b = n27Var;
        this.c = j;
        this.d = zvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w51.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w51 w51Var = (w51) obj;
        if (!Intrinsics.a(this.a, w51Var.a) || !Intrinsics.a(this.b, w51Var.b)) {
            return false;
        }
        long j = w51Var.c;
        int i = u95.h;
        return jgm.a(this.c, j) && this.d.equals(w51Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = u95.h;
        igm igmVar = jgm.b;
        return this.d.hashCode() + z1m.e(iHashCode, 31, this.c);
    }
}
