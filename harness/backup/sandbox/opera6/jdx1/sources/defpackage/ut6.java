package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ut6 implements ird {
    public static final /* synthetic */ int d = 0;
    public final wjh a;
    public final f1p b;
    public r16 c;

    public ut6(Context context, mp6 mp6Var) {
        f1p f1pVar = new f1p(context, (byte) 11);
        this.b = f1pVar;
        r16 r16Var = new r16();
        this.c = r16Var;
        wjh wjhVar = new wjh(mp6Var, r16Var);
        this.a = wjhVar;
        if (f1pVar != ((f1p) wjhVar.e)) {
            wjhVar.e = f1pVar;
            ((HashMap) wjhVar.c).clear();
            ((HashMap) wjhVar.d).clear();
        }
    }

    public static ird e(Class cls, f1p f1pVar) {
        try {
            return (ird) cls.getConstructor(bd6.class).newInstance(f1pVar);
        } catch (Exception e) {
            h9o.o(e);
            return null;
        }
    }

    @Override // defpackage.ird
    public final l73 a(qjd qjdVar) {
        em7 em7VarV;
        qjd qjdVarA = qjdVar;
        qjdVarA.b.getClass();
        String scheme = qjdVarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(qjdVarA.b.b, "application/x-image-uri");
        mjd mjdVar = qjdVarA.b;
        if (zEquals) {
            long j = mjdVar.h;
            String str = tym.a;
            throw null;
        }
        int iG = tym.G(mjdVar.a, mjdVar.b);
        if (qjdVarA.b.h != -9223372036854775807L) {
            mp6 mp6Var = (mp6) this.a.b;
            synchronized (mp6Var) {
                mp6Var.c = true;
            }
            mp6 mp6Var2 = (mp6) this.a.b;
            synchronized (mp6Var2) {
                mp6Var2.d = true;
            }
        }
        try {
            wjh wjhVar = this.a;
            HashMap map = (HashMap) wjhVar.d;
            ird irdVar = (ird) map.get(Integer.valueOf(iG));
            if (irdVar == null) {
                irdVar = (ird) wjhVar.o(iG).get();
                irdVar.d((r16) wjhVar.f);
                irdVar.b();
                irdVar.c();
                map.put(Integer.valueOf(iG), irdVar);
            }
            kjd kjdVarA = qjdVarA.d.a();
            ljd ljdVar = qjdVarA.d;
            if (ljdVar.a == -9223372036854775807L) {
                kjdVarA.a = -9223372036854775807L;
            }
            if (ljdVar.d == -3.4028235E38f) {
                kjdVarA.d = -3.4028235E38f;
            }
            if (ljdVar.e == -3.4028235E38f) {
                kjdVarA.e = -3.4028235E38f;
            }
            if (ljdVar.b == -9223372036854775807L) {
                kjdVarA.b = -9223372036854775807L;
            }
            if (ljdVar.c == -9223372036854775807L) {
                kjdVarA.c = -9223372036854775807L;
            }
            ljd ljdVar2 = new ljd(kjdVarA);
            if (!ljdVar2.equals(qjdVarA.d)) {
                ejd ejdVarA = qjdVarA.a();
                ejdVarA.l = ljdVar2.a();
                qjdVarA = ejdVarA.a();
            }
            l73 l73VarA = irdVar.a(qjdVarA);
            h1b h1bVar = qjdVarA.b.g;
            if (!h1bVar.isEmpty()) {
                l73[] l73VarArr = new l73[h1bVar.size() + 1];
                l73VarArr[0] = l73VarA;
                for (int i = 0; i < h1bVar.size(); i++) {
                    nj9 nj9Var = new nj9();
                    nj9Var.m = dzd.p(((pjd) h1bVar.get(i)).b);
                    nj9Var.d = ((pjd) h1bVar.get(i)).c;
                    nj9Var.e = ((pjd) h1bVar.get(i)).d;
                    nj9Var.f = ((pjd) h1bVar.get(i)).e;
                    nj9Var.b = ((pjd) h1bVar.get(i)).f;
                    nj9Var.a = ((pjd) h1bVar.get(i)).g;
                    oj9 oj9Var = new oj9(nj9Var);
                    ge5 ge5Var = new ge5((Object) this, (Object) oj9Var, (byte) 12);
                    f1p f1pVar = this.b;
                    r9g r9gVar = new r9g(ge5Var, (byte) 11);
                    Object obj = new Object();
                    i06 i06Var = new i06((byte) 2);
                    if (this.c.b(oj9Var)) {
                        nj9 nj9VarA = oj9Var.a();
                        nj9VarA.m = dzd.p("application/x-media3-cues");
                        nj9VarA.j = oj9Var.n;
                        nj9VarA.K = this.c.l(oj9Var);
                        oj9Var = new oj9(nj9VarA);
                    }
                    oj9 oj9Var2 = oj9Var;
                    int i2 = i + 1;
                    String string = ((pjd) h1bVar.get(i)).a.toString();
                    fjd fjdVar = new fjd();
                    ijd ijdVar = new ijd();
                    List list = Collections.EMPTY_LIST;
                    a1b a1bVar = h1b.b;
                    csh cshVar = csh.e;
                    kjd kjdVar = new kjd();
                    njd njdVar = njd.d;
                    Uri uri = string == null ? null : Uri.parse(string);
                    z4o.H(((Uri) ijdVar.e) == null || ((UUID) ijdVar.d) != null);
                    mjd mjdVar2 = uri != null ? new mjd(uri, null, ((UUID) ijdVar.d) != null ? new jjd(ijdVar) : null, null, list, null, cshVar, -9223372036854775807L) : null;
                    qjd qjdVar2 = new qjd("", new hjd(fjdVar), mjdVar2, new ljd(kjdVar), vjd.K, njdVar);
                    mjdVar2.getClass();
                    qjdVar2.b.getClass();
                    jjd jjdVar = qjdVar2.b.c;
                    if (jjdVar == null) {
                        em7VarV = em7.a;
                    } else {
                        synchronized (obj) {
                            em7VarV = !jjdVar.equals(null) ? d5o.v(jjdVar) : null;
                            em7VarV.getClass();
                        }
                    }
                    l73VarArr[i2] = new j5h(qjdVar2, f1pVar, r9gVar, em7VarV, i06Var, oj9Var2);
                }
                l73VarA = new cvd(l73VarArr);
            }
            hjd hjdVar = qjdVarA.f;
            if (hjdVar.b != 0 || hjdVar.d != Long.MIN_VALUE || hjdVar.f) {
                o55 o55Var = new o55(l73VarA);
                long j2 = hjdVar.b;
                z4o.w(j2 >= 0);
                z4o.H(!o55Var.h);
                o55Var.b = j2;
                long j3 = hjdVar.d;
                z4o.H(!o55Var.h);
                o55Var.c = j3;
                boolean z = !hjdVar.g;
                z4o.H(!o55Var.h);
                o55Var.d = z;
                boolean z2 = hjdVar.e;
                z4o.H(!o55Var.h);
                o55Var.e = z2;
                boolean z3 = hjdVar.f;
                z4o.H(!o55Var.h);
                o55Var.f = z3;
                boolean z4 = hjdVar.h;
                z4o.H(!o55Var.h);
                o55Var.g = z4;
                o55Var.h = true;
                l73VarA = new r55(o55Var);
            }
            qjdVarA.b.getClass();
            if (qjdVarA.b.d == null) {
                return l73VarA;
            }
            w7d.K("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return l73VarA;
        } catch (ClassNotFoundException e) {
            h9o.o(e);
            return null;
        }
    }

    @Override // defpackage.ird
    public final void b() {
        wjh wjhVar = this.a;
        synchronized (((mp6) wjhVar.b)) {
        }
        Iterator it = ((HashMap) wjhVar.d).values().iterator();
        while (it.hasNext()) {
            ((ird) it.next()).b();
        }
    }

    @Override // defpackage.ird
    public final void c() {
        synchronized (((mp6) this.a.b)) {
        }
    }

    @Override // defpackage.ird
    public final void d(r16 r16Var) {
        this.c = r16Var;
        wjh wjhVar = this.a;
        wjhVar.f = r16Var;
        mp6 mp6Var = (mp6) wjhVar.b;
        synchronized (mp6Var) {
            mp6Var.b = r16Var;
        }
        Iterator it = ((HashMap) wjhVar.d).values().iterator();
        while (it.hasNext()) {
            ((ird) it.next()).d(r16Var);
        }
    }
}
