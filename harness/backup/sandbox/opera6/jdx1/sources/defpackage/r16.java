package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.coroutines.g;

/* loaded from: classes.dex */
public final class r16 implements tnk, u38, wn8, c4d, ysl, g, kkm {
    public static t1e e(String str) {
        h58 h58Var = t1e.n;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            t1e t1eVar = (t1e) w4VarE.next();
            if (t1eVar.a.equals(str)) {
                return t1eVar;
            }
        }
        h9o.h("Collection contains no element matching the predicate.");
        return null;
    }

    public static c2h i(String str) {
        c2h q0iVar;
        Iterator it;
        try {
            p0i p0iVar = t0i.b;
            it = c2h.i.iterator();
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        while (it.hasNext()) {
            q0iVar = (c2h) it.next();
            if (q0iVar.a.equals(str)) {
                p0i p0iVar3 = t0i.b;
                if (q0iVar instanceof q0i) {
                    q0iVar = null;
                }
                return q0iVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static int m(Class cls, int i, List list) {
        if (!yv8.class.isAssignableFrom(cls) || i > 3 || list.size() + i < 3) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (yv8.class.isAssignableFrom(((ja2) it.next()).getClass())) {
                return -1;
            }
        }
        return 3;
    }

    public static void o(Object obj, bqb bqbVar) {
        Throwable thD = t0i.d(obj);
        if (thD == null) {
            bqbVar.n(new sw7(obj));
        } else {
            bqbVar.n(new rw7(new dqb(thD)));
        }
    }

    public static qhj p(qwf qwfVar) {
        qhj[] qhjVarArrValues = qhj.values();
        int iA = qbd.a(qhjVarArrValues.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (qhj qhjVar : qhjVarArrValues) {
            linkedHashMap.put(qhjVar.a, qhjVar);
        }
        qhj qhjVar2 = (qhj) linkedHashMap.get(qwfVar);
        if (qhjVar2 != null) {
            return qhjVar2;
        }
        qp2.o(sko.j("No shortcut for option ", qwfVar.name()));
        return null;
    }

    public final int A() {
        return 0;
    }

    public final int H() {
        return 0;
    }

    public final void J(ChromiumContent chromiumContent) {
    }

    public final void M() {
    }

    public final e5d N(List list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            int iIndexOf = arrayList.indexOf(obj);
            if (iIndexOf >= 0) {
                arrayList.remove(iIndexOf);
                arrayList2.add(new guh(obj, iIndexOf));
            }
        }
        return new e5d(arrayList2, arrayList, (byte) 2);
    }

    public final void O(l46 l46Var) {
    }

    public final void T(r22 r22Var) {
    }

    public final void Z() {
    }

    public final int a() {
        return 0;
    }

    @Override // defpackage.tnk
    public final boolean b(oj9 oj9Var) {
        String str = oj9Var.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public final void b0(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int c() {
        return 0;
    }

    @Override // defpackage.u38
    public final Object d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    public final Object f() {
        return new syc();
    }

    public final void f0(Object obj) {
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return 0;
    }

    public final boolean j() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // defpackage.tnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vnk k(defpackage.oj9 r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r16.k(oj9):vnk");
    }

    @Override // defpackage.tnk
    public final int l(oj9 oj9Var) {
        String str = oj9Var.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        qp2.o(sko.j("Unsupported MIME type: ", str));
        return 0;
    }

    public final boolean n() {
        return false;
    }

    public final boolean q() {
        return false;
    }

    public final void r(Object obj) {
    }

    public final void t(e5d e5dVar) {
        ArrayList arrayList = (ArrayList) e5dVar.c;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = e5dVar.iterator();
        vx3 vx3VarA = ay3.a((String) ((guh) it.next()).a, lqm.k, false);
        vx3VarA.c(true);
        vx3VarA.c = 1;
        if (arrayList.size() == 1) {
            vx3VarA.a(true);
        } else {
            vx3VarA.d = 1;
            vx3VarA.d(true);
        }
        while (it.hasNext()) {
            vx3VarA.b((String) ((guh) it.next()).a, false);
        }
        am2.v(vx3VarA);
    }

    public final void x(ChromiumContent chromiumContent) {
    }

    public final void z(bvl bvlVar) {
    }
}
