package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gn6 {
    public final xsc a;
    public final r9i b;
    public final int[] c;
    public final int d;
    public final ed6 e;
    public final long f;
    public final bjg g;
    public final en6[] h;
    public bj8 i;
    public wa6 j;
    public int k;
    public uc3 l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [gn6, java.lang.Object] */
    public gn6(rq6 rq6Var, xsc xscVar, wa6 wa6Var, r9i r9iVar, int i, int[] iArr, bj8 bj8Var, int i2, ed6 ed6Var, long j, boolean z, ArrayList arrayList, bjg bjgVar) {
        evh evhVar;
        en6[] en6VarArr;
        oj9 oj9Var;
        cn8 wn9Var;
        m14 m14Var;
        ?? obj = new Object();
        obj.a = xscVar;
        obj.j = wa6Var;
        obj.b = r9iVar;
        obj.c = iArr;
        obj.i = bj8Var;
        obj.d = i2;
        obj.e = ed6Var;
        obj.k = i;
        obj.f = j;
        bjg bjgVar2 = bjgVar;
        obj.g = bjgVar2;
        long jC = wa6Var.c(i);
        ArrayList arrayListA = obj.a();
        obj.h = new en6[bj8Var.length()];
        int i3 = 0;
        int i4 = 0;
        gn6 gn6Var = obj;
        while (i4 < gn6Var.h.length) {
            evh evhVar2 = (evh) arrayListA.get(bj8Var.getIndexInTrackGroup(i4));
            oa3 oa3VarR = r9iVar.R(evhVar2.b);
            en6[] en6VarArr2 = gn6Var.h;
            oa3 oa3Var = oa3VarR == null ? (oa3) evhVar2.b.get(i3) : oa3VarR;
            oj9 oj9Var2 = evhVar2.a;
            String str = oj9Var2.m;
            if (!dzd.n(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    evhVar = evhVar2;
                    oj9Var = oj9Var2;
                    en6VarArr = en6VarArr2;
                    wn9Var = new efd(rq6Var.a, rq6Var.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    wn9Var = new tt6(1);
                } else if (Objects.equals(str, "image/png")) {
                    wn9Var = new sk3((byte) 1);
                } else {
                    int i5 = z ? 4 : 0;
                    evhVar = evhVar2;
                    int i6 = rq6Var.b ? i5 : i5 | 32;
                    en6VarArr = en6VarArr2;
                    oj9Var = oj9Var2;
                    wn9Var = new wn9(rq6Var.a, i6, null, arrayList, bjgVar2);
                }
                m14Var = new m14(wn9Var, i2, oj9Var);
                m14 m14Var2 = m14Var;
                long j2 = jC;
                int i7 = i4;
                en6VarArr[i7] = new en6(j2, evhVar, oa3Var, m14Var2, 0L, evhVar.c());
                i4 = i7 + 1;
                gn6Var = this;
                bjgVar2 = bjgVar;
                jC = j2;
                i3 = 0;
            } else if (rq6Var.b) {
                wn9Var = new qnk(rq6Var.a.k(oj9Var2), oj9Var2);
            } else {
                m14Var = null;
                evhVar = evhVar2;
                en6VarArr = en6VarArr2;
                m14 m14Var22 = m14Var;
                long j22 = jC;
                int i72 = i4;
                en6VarArr[i72] = new en6(j22, evhVar, oa3Var, m14Var22, 0L, evhVar.c());
                i4 = i72 + 1;
                gn6Var = this;
                bjgVar2 = bjgVar;
                jC = j22;
                i3 = 0;
            }
            evhVar = evhVar2;
            oj9Var = oj9Var2;
            en6VarArr = en6VarArr2;
            m14Var = new m14(wn9Var, i2, oj9Var);
            m14 m14Var222 = m14Var;
            long j222 = jC;
            int i722 = i4;
            en6VarArr[i722] = new en6(j222, evhVar, oa3Var, m14Var222, 0L, evhVar.c());
            i4 = i722 + 1;
            gn6Var = this;
            bjgVar2 = bjgVar;
            jC = j222;
            i3 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.a(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((jr) list.get(i)).c);
        }
        return arrayList;
    }

    public final en6 b(int i) {
        en6[] en6VarArr = this.h;
        en6 en6Var = en6VarArr[i];
        oa3 oa3VarR = this.b.R(en6Var.b.b);
        if (oa3VarR == null || oa3VarR.equals(en6Var.c)) {
            return en6Var;
        }
        en6 en6Var2 = new en6(en6Var.e, en6Var.b, oa3VarR, en6Var.a, en6Var.f, en6Var.d);
        en6VarArr[i] = en6Var2;
        return en6Var2;
    }
}
