package defpackage;

import com.opera.android.BrowserActivity;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f7d {
    public final BrowserActivity a;
    public final gjm b;
    public final e4i c;
    public final umi d;
    public final x5f e;
    public final xb f;
    public final db g;
    public final jtg h;
    public final slk i;
    public final yug j;
    public final pt3 k;

    public f7d(BrowserActivity browserActivity, gjm gjmVar, e4i e4iVar, umi umiVar, x5f x5fVar, xb xbVar, db dbVar, jtg jtgVar, slk slkVar, yug yugVar, pt3 pt3Var) {
        this.a = browserActivity;
        this.b = gjmVar;
        this.c = e4iVar;
        this.d = umiVar;
        this.e = x5fVar;
        this.f = xbVar;
        this.g = dbVar;
        this.h = jtgVar;
        this.i = slkVar;
        this.j = yugVar;
        this.k = pt3Var;
    }

    public final void a(Class cls) {
        new zhj(new wzg(null, cls, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.opera.android.BrowserActivity, t5d] */
    public final void b() {
        ?? r0 = this.a;
        gom gomVarA = mom.a(r0.getApplicationContext());
        int iOrdinal = gomVarA.a.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            int iOrdinal2 = gomVarA.b.ordinal();
            x5f x5fVar = this.e;
            if (iOrdinal2 == 0) {
                x5fVar.e0(ht0.c);
            } else if (iOrdinal2 == 1) {
                x5fVar.e0(ht0.d);
            }
        }
        mom.b(r0, gomVarA);
    }
}
