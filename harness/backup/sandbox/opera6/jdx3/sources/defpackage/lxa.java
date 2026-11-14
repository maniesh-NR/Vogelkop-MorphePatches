package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class lxa extends x7n {
    public static final juh v = new juh(null);
    public final Context c;
    public final qie d;
    public final Uri e;
    public final List f;
    public final ra5 g;
    public final oam h;
    public final i16 i;
    public final mcj j;
    public final d7h k;
    public final nak l = z4o.f(cxa.a);
    public final nak m;
    public final nak n;
    public final boolean o;
    public final nak p;
    public final Uri q;
    public final luf r;
    public final zba s;
    public final dya t;
    public d3k u;

    public lxa(Context context, qie qieVar, Uri uri, List list, ra5 ra5Var, oam oamVar, gki gkiVar) {
        this.c = context;
        this.d = qieVar;
        this.e = uri;
        this.f = list;
        this.g = ra5Var;
        this.h = oamVar;
        nak nakVarF = z4o.f(Boolean.FALSE);
        this.m = nakVarF;
        mt5 mt5Var = null;
        nak nakVarF2 = z4o.f((Object) null);
        this.n = nakVarF2;
        z4o.f(v);
        byte b = 0;
        byte b2 = 1;
        boolean z = list.size() == 1;
        this.o = z;
        s5h s5hVar = (s5h) gkiVar.a("properties");
        if (s5hVar == null) {
            n8g.c.getClass();
            s5hVar = new s5h(n8g.d, true, 0, nil.b, false, null);
        }
        nak nakVarF3 = z4o.f(s5hVar);
        this.p = nakVarF3;
        Uri uri2 = (Uri) gkiVar.a("output");
        this.q = uri2 == null ? Uri.EMPTY : uri2;
        luf lufVar = (luf) gkiVar.a("output-properties");
        this.r = lufVar == null ? new luf(Bitmap.CompressFormat.PNG, 100, null, "", "", qnn.a) : lufVar;
        zba zbaVar = (zba) gkiVar.a("history");
        zbaVar = zbaVar == null ? new zba() : zbaVar;
        this.s = zbaVar;
        gkiVar.b(zbaVar, "history");
        dya dyaVar = (dya) gkiVar.a("model");
        dyaVar = dyaVar == null ? new dya(uri) : dyaVar;
        this.t = dyaVar;
        gkiVar.b(dyaVar, "model");
        Integer num = (Integer) gkiVar.a("tool");
        int iIntValue = num != null ? num.intValue() : -1;
        nakVarF2.j(iIntValue < 0 ? z ? (nsl) list.get(0) : null : (nsl) nsl.l.get(iIntValue));
        j14.Y(new z99(nakVarF2, new kxa(gkiVar, mt5Var, b2), (byte) 2), p7n.a(this));
        j14.Y(new z99(nakVarF3, new kxa(gkiVar, mt5Var, b), (byte) 2), p7n.a(this));
        f65 f65VarA = p7n.a(this);
        jea[] jeaVarArr = jea.a;
        this.i = new i16(zbaVar, nakVarF, f65VarA);
        this.j = new mcj(nakVarF2, nakVarF, list, z);
        this.k = new d7h(nakVarF2, nakVarF, list, nakVarF3);
        zbaVar.b.b = new xm5(this);
        dyaVar.c.add(new it7(this, b2));
        h();
    }

    public final void g() {
        nak nakVar = this.n;
        if (nakVar.getValue() != null && !this.o) {
            nakVar.j((Object) null);
        } else if (this.s.c >= 0) {
            f(gxa.a);
        } else {
            f(new exa(null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r8 = this;
            nak r0 = r8.l
            java.lang.Object r1 = r0.getValue()
            cxa r2 = defpackage.cxa.c
            if (r1 != r2) goto Lb
            return
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            dya r2 = r8.t
            java.util.ArrayList r3 = r2.d
            int r4 = r3.size()
            r5 = 0
        L19:
            if (r5 >= r4) goto L29
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            boolean r7 = r6 instanceof defpackage.f76
            if (r7 == 0) goto L19
            r1.add(r6)
            goto L19
        L29:
            boolean r3 = r1.isEmpty()
            r4 = 0
            if (r3 != 0) goto L78
            i97 r3 = new i97
            android.graphics.PointF r2 = r2.b
            r5 = 5
            r3.<init>(r2, r5)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            fjh r5 = new fjh
            android.content.Context r8 = r8.c
            r5.<init>(r1, r3, r8, r4)
            d82 r1 = new d82
            r6 = 3
            r1.<init>(r5, r6)
            rm5.Y(r1, r2)
            android.graphics.PointF r1 = r3.b
            float r3 = r1.x
            float r1 = r1.y
            r5 = 0
            r2.intersect(r5, r5, r3, r1)
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r1 = 1
            r3 = 1107296256(0x42000000, float:32.0)
            float r8 = android.util.TypedValue.applyDimension(r1, r3, r8)
            int r8 = (int) r8
            float r1 = r2.width()
            float r8 = (float) r8
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L7b
            float r1 = r2.height()
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
        L78:
            cxa r8 = defpackage.cxa.a
            goto L7d
        L7b:
            cxa r8 = defpackage.cxa.b
        L7d:
            r0.k(r4, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxa.h():void");
    }
}
