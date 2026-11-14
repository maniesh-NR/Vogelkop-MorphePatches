package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z5o {
    public final h5o a;
    public final Context b;
    public final String c;
    public final a5o d;
    public final jl5 e;
    public final t1h f;
    public final WorkDatabase g;
    public final i5o h;
    public final c37 i;
    public final ArrayList j;
    public final String k;
    public final ynb l;

    public z5o(ami amiVar) {
        h5o h5oVar = (h5o) amiVar.f;
        this.a = h5oVar;
        this.b = (Context) amiVar.h;
        String str = h5oVar.a;
        this.c = str;
        this.d = (a5o) amiVar.c;
        jl5 jl5Var = (jl5) amiVar.b;
        this.e = jl5Var;
        ioj iojVar = jl5Var.d;
        this.f = (t1h) amiVar.d;
        WorkDatabase workDatabase = (WorkDatabase) amiVar.e;
        this.g = workDatabase;
        this.h = workDatabase.C();
        this.i = workDatabase.x();
        ArrayList arrayList = (ArrayList) amiVar.g;
        this.j = arrayList;
        this.k = z1m.l(p3p.s("Work [ id=", str, ", tags={ "), CollectionsKt.P(arrayList, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62), " } ]");
        this.l = o0g.e();
    }

    public final void a(int i) {
        i5o i5oVar = this.h;
        String str = this.c;
        i5oVar.n(1, str);
        i5oVar.l(System.currentTimeMillis(), str);
        i5oVar.k(this.a.v, str);
        i5oVar.h(-1L, str);
        i5oVar.o(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        i5o i5oVar = this.h;
        String str = this.c;
        i5oVar.l(jCurrentTimeMillis, str);
        i5oVar.n(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVar.a;
        workDatabase_Impl.b();
        uzk uzkVar = (uzk) i5oVar.j;
        ap9 ap9VarF = uzkVar.f();
        ap9VarF.w(1, str);
        try {
            workDatabase_Impl.c();
            try {
                ap9VarF.h();
                workDatabase_Impl.v();
                uzkVar.m(ap9VarF);
                i5oVar.k(this.a.v, str);
                workDatabase_Impl.b();
                uzkVar = (uzk) i5oVar.f;
                ap9VarF = uzkVar.f();
                ap9VarF.w(1, str);
                try {
                    workDatabase_Impl.c();
                    try {
                        ap9VarF.h();
                        workDatabase_Impl.v();
                        uzkVar.m(ap9VarF);
                        i5oVar.h(-1L, str);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5o.c(nt5):java.lang.Object");
    }

    public final void d(zic zicVar) {
        String str = this.c;
        ArrayList arrayListJ = j95.j(new String[]{str});
        while (true) {
            boolean zIsEmpty = arrayListJ.isEmpty();
            i5o i5oVar = this.h;
            if (zIsEmpty) {
                ib6 ib6Var = ((wic) zicVar).a;
                i5oVar.k(this.a.v, str);
                i5oVar.m(str, ib6Var);
                return;
            } else {
                String str2 = (String) o95.x(arrayListJ);
                if (i5oVar.f(str2) != 6) {
                    i5oVar.n(4, str2);
                }
                arrayListJ.addAll(this.i.p(str2));
            }
        }
    }
}
