package defpackage;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class a5l {
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final gpk l;
    public final umi a;
    public final wun b;
    public final zyk e;
    public final n9h c = new n9h((byte) 8);
    public final n9h d = new n9h((byte) 8);
    public final zyk f = z4c.b(new dnj(this, 26));
    public final qie g = new qie((byte) 19);

    static {
        on7 on7Var = pn7.b;
        h = cs5.x0(10, un7.e);
        un7 un7Var = un7.h;
        i = cs5.x0(1, un7Var);
        j = cs5.x0(7, un7Var);
        k = cs5.x0(30, un7Var);
        l = new gpk((byte) 19);
    }

    public a5l(Context context, umi umiVar, wun wunVar) {
        this.a = umiVar;
        this.b = wunVar;
        this.e = z4c.b(new eek((Object) context, (Object) this, (byte) 8));
    }

    public final e58 a() {
        return (e58) this.f.getValue();
    }

    public final x4l b(String str, p6l p6lVar, String str2, int i2) {
        x4l x4lVar = new x4l(str, i2, str2, System.currentTimeMillis());
        int iOrdinal = p6lVar.ordinal();
        if (iOrdinal == 0) {
            this.c.o(str, x4lVar, true);
            new rml(Unit.a, this.a).a(new d7k((Object) this, (Object) x4lVar, (byte) 11)).m(this.g);
            return x4lVar;
        }
        if (iOrdinal == 1) {
            this.d.o(str, x4lVar, true);
            return x4lVar;
        }
        h9o.p();
        return null;
    }
}
