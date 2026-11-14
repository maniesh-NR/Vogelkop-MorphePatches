package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class jx6 {
    public static final esf l = new tc5(new c9(10));
    public oyl a;
    public pl6 b;
    public pr c;
    public final Object d;
    public final Context e;
    public final n9a f;
    public bx6 g;
    public Thread h;
    public ex6 i;
    public pf2 j;
    public Boolean k;

    public jx6(Context context) {
        this(bx6.G0, new n9a((byte) 15), context);
    }

    public jx6(nyl nylVar, n9a n9aVar, Context context) {
        bx6 bx6Var;
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = n9aVar;
        if (nylVar instanceof bx6) {
            bx6Var = (bx6) nylVar;
            this.g = bx6Var;
        } else {
            bx6 bx6Var2 = bx6.G0;
            bx6Var2.getClass();
            ax6 ax6Var = new ax6(bx6Var2);
            ax6Var.e(nylVar);
            bx6Var = new bx6(ax6Var);
            this.g = bx6Var;
        }
        this.j = pf2.i;
        if (bx6Var.B0 && context == null) {
            w7d.K("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(fyl fylVar, nyl nylVar, HashMap map) {
        for (int i = 0; i < fylVar.a; i++) {
            kyl kylVar = (kyl) nylVar.H.get(fylVar.a(i));
            if (kylVar != null) {
                eyl eylVar = kylVar.a;
                kyl kylVar2 = (kyl) map.get(Integer.valueOf(eylVar.c));
                if (kylVar2 == null || (kylVar2.b.isEmpty() && !kylVar.b.isEmpty())) {
                    map.put(Integer.valueOf(eylVar.c), kylVar);
                }
            }
        }
    }

    public static int b(oj9 oj9Var, csh cshVar) {
        for (int i = 0; i < cshVar.d; i++) {
            for (int i2 = 0; i2 < oj9Var.c.size(); i2++) {
                if (((jzb) oj9Var.c.get(i2)).b.equals(cshVar.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int c(oj9 oj9Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(oj9Var.d)) {
            return 4;
        }
        String strF = f(str);
        String strF2 = f(oj9Var.d);
        if (strF2 == null || strF == null) {
            return (z && strF2 == null) ? 1 : 0;
        }
        if (strF2.startsWith(strF) || strF.startsWith(strF2)) {
            return 3;
        }
        String str2 = tym.a;
        return strF2.split("-", 2)[0].equals(strF.split("-", 2)[0]) ? 2 : 0;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean h(bx6 bx6Var, int i, oj9 oj9Var) {
        if ((i & 3584) == 0) {
            return false;
        }
        lyl lylVar = bx6Var.w;
        if (lylVar.c && (i & 2048) == 0) {
            return false;
        }
        if (lylVar.b) {
            boolean z = (oj9Var.I == 0 && oj9Var.J == 0) ? false : true;
            boolean z2 = (i & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i, pr prVar, int[][][] iArr, gx6 gx6Var, Comparator comparator) {
        int i2;
        csh cshVarV;
        pr prVar2 = prVar;
        ArrayList arrayList = new ArrayList();
        int i3 = prVar2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == ((int[]) prVar2.b)[i4]) {
                fyl fylVar = ((fyl[]) prVar2.c)[i4];
                for (int i5 = 0; i5 < fylVar.a; i5++) {
                    eyl eylVarA = fylVar.a(i5);
                    csh cshVarH = gx6Var.h(i4, eylVarA, iArr[i4][i5]);
                    int i6 = eylVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        hx6 hx6Var = (hx6) cshVarH.get(i7);
                        int iA = hx6Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                cshVarV = h1b.v(hx6Var);
                            } else {
                                csh arrayList2 = new ArrayList();
                                arrayList2.add(hx6Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    hx6 hx6Var2 = (hx6) cshVarH.get(i8);
                                    int i9 = i3;
                                    if (hx6Var2.a() == 2 && hx6Var.b(hx6Var2)) {
                                        arrayList2.add(hx6Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                cshVarV = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(cshVarV);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            prVar2 = prVar;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((hx6) list.get(i10)).c;
        }
        hx6 hx6Var3 = (hx6) list.get(0);
        return Pair.create(new aj8(0, hx6Var3.b, iArr2), Integer.valueOf(hx6Var3.a));
    }

    public final bx6 d() {
        bx6 bx6Var;
        synchronized (this.d) {
            bx6Var = this.g;
        }
        return bx6Var;
    }

    public final void e() {
        boolean z;
        oyl oylVar;
        ex6 ex6Var;
        synchronized (this.d) {
            z = this.g.B0 && Build.VERSION.SDK_INT >= 32 && (ex6Var = this.i) != null && ex6Var.b;
        }
        if (!z || (oylVar = this.a) == null) {
            return;
        }
        oylVar.onTrackSelectionsInvalidated();
    }

    public final void g() {
        ex6 ex6Var;
        synchronized (this.d) {
            Thread thread = this.h;
            if (thread != null) {
                z4o.G("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (ex6Var = this.i) != null) {
            ex6Var.d();
            this.i = null;
        }
        this.a = null;
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final pyl i(defpackage.kuh[] r30, fyl r31, defpackage.jrd r32, defpackage.gql r33) {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx6.i(kuh[], fyl, jrd, gql):pyl");
    }

    public final void k(nyl nylVar) {
        if (nylVar instanceof bx6) {
            l((bx6) nylVar);
        }
        ax6 ax6Var = new ax6(d());
        ax6Var.e(nylVar);
        l(new bx6(ax6Var));
    }

    public final void l(bx6 bx6Var) {
        boolean zEquals;
        synchronized (this.d) {
            zEquals = this.g.equals(bx6Var);
            this.g = bx6Var;
        }
        if (zEquals) {
            return;
        }
        if (bx6Var.B0 && this.e == null) {
            w7d.K("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        oyl oylVar = this.a;
        if (oylVar != null) {
            oylVar.onTrackSelectionsInvalidated();
        }
    }
}
