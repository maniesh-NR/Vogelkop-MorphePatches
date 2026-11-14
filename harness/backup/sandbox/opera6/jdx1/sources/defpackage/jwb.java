package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class jwb {
    public static jwb h;
    public float a;
    public float b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public jwb(d2c d2cVar, ikl iklVar, q27 q27Var, mh9 mh9Var) {
        this.c = d2cVar;
        this.d = iklVar;
        this.e = q27Var;
        this.f = mh9Var;
        this.g = xgh.v(iklVar, d2cVar);
        this.a = Float.NaN;
        this.b = Float.NaN;
    }

    public jwb(iwb iwbVar, ArrayList arrayList, ArrayList arrayList2) {
        this.c = iwbVar;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(arrayList2);
        float f = ((iwb) am2.k(1, arrayList)).b().a - iwbVar.b().a;
        this.a = f;
        float f2 = iwbVar.d().a - ((iwb) am2.k(1, arrayList2)).d().a;
        this.b = f2;
        this.f = e(f, arrayList, true);
        this.g = e(f2, arrayList2, false);
    }

    public static float[] e(float f, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i = 1;
        while (i < size) {
            int i2 = i - 1;
            iwb iwbVar = (iwb) arrayList.get(i2);
            iwb iwbVar2 = (iwb) arrayList.get(i);
            fArr[i] = i == size + (-1) ? 1.0f : fArr[i2] + ((z ? iwbVar2.b().a - iwbVar.b().a : iwbVar.d().a - iwbVar2.d().a) / f);
            i++;
        }
        return fArr;
    }

    public static float[] f(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i = 1;
        while (i < size) {
            float f3 = fArr[i];
            if (f <= f3) {
                return new float[]{ze1.b(0.0f, 1.0f, f2, f3, f), i - 1, i};
            }
            i++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static iwb g(iwb iwbVar, int i, int i2, float f, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(iwbVar.c);
        arrayList.add(i2, (hwb) arrayList.remove(i));
        gwb gwbVar = new gwb(iwbVar.a, i5);
        float f2 = f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            hwb hwbVar = (hwb) arrayList.get(i6);
            float f3 = hwbVar.d;
            gwbVar.b((f3 / 2.0f) + f2, hwbVar.c, f3, i6 >= i3 && i6 <= i4, hwbVar.e, hwbVar.f, 0.0f, 0.0f);
            f2 += hwbVar.d;
            i6++;
        }
        return gwbVar.d();
    }

    public static iwb h(iwb iwbVar, float f, int i, boolean z, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2 = iwbVar.e;
        int i3 = iwbVar.d;
        float f8 = iwbVar.a;
        List list = iwbVar.c;
        boolean z2 = true;
        if (vep.A(1) != 0) {
            ArrayList arrayList = new ArrayList(list);
            gwb gwbVar = new gwb(f8, i);
            int size = z ? 0 : arrayList.size() - 1;
            int i4 = 0;
            while (i4 < arrayList.size()) {
                hwb hwbVar = (hwb) arrayList.get(i4);
                boolean z3 = hwbVar.e;
                if (z3 && i4 == size) {
                    gwbVar.b(hwbVar.b, hwbVar.c, hwbVar.d, false, true, hwbVar.f, 0.0f, 0.0f);
                } else {
                    float f9 = hwbVar.b;
                    if (z) {
                        f5 = f9 + f;
                        f7 = f;
                        f6 = 0.0f;
                    } else {
                        f5 = f9 - f;
                        f6 = f;
                        f7 = 0.0f;
                    }
                    boolean z4 = (i4 < i3 || i4 > i2) ? false : z2;
                    float f10 = f5;
                    float f11 = hwbVar.c;
                    float f12 = hwbVar.d;
                    gwbVar.b(f10, f11, f12, z4, z3, Math.abs(z ? Math.max(0.0f, ((f12 / 2.0f) + f10) - i) : Math.min(0.0f, f10 - (f12 / 2.0f))), f7, f6);
                }
                i4++;
                z2 = true;
            }
            return gwbVar.d();
        }
        ArrayList arrayList2 = new ArrayList(list);
        gwb gwbVar2 = new gwb(f8, i);
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (((hwb) it.next()).e) {
                i5++;
            }
        }
        float size2 = f / (list.size() - i5);
        float f13 = z ? f : 0.0f;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            hwb hwbVar2 = (hwb) arrayList2.get(i6);
            if (hwbVar2.e) {
                gwbVar2.b(hwbVar2.b, hwbVar2.c, hwbVar2.d, false, true, hwbVar2.f, 0.0f, 0.0f);
            } else {
                boolean z5 = i6 >= i3 && i6 <= i2;
                float f14 = hwbVar2.d - size2;
                float fB = gl4.b(f14, f8, f2);
                float f15 = (f14 / 2.0f) + f13;
                float fAbs = Math.abs(f15 - hwbVar2.b);
                float f16 = hwbVar2.f;
                if (z) {
                    f4 = fAbs;
                    f3 = 0.0f;
                } else {
                    f3 = fAbs;
                    f4 = 0.0f;
                }
                gwbVar2.b(f15, fB, f14, z5, false, f16, f4, f3);
                f13 += f14;
            }
            i6++;
        }
        return gwbVar2.d();
    }

    public final long a(int i, long j) {
        int i2;
        q27 q27Var = (q27) this.e;
        ikl iklVar = (ikl) this.g;
        float f = this.b;
        float f2 = this.a;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = fzd.a;
            l08 l08Var = l08.a;
            Object obj = this.f;
            y81 y81Var = new y81(new c91(str, iklVar, l08Var, l08Var, (mh9) obj, q27Var, false), 1, 1, ap5.b(0, 0, 0, 0, 15));
            float f3 = new y81(new c91(fzd.b, iklVar, l08Var, l08Var, (mh9) obj, q27Var, true), 2, 1, ap5.b(0, 0, 0, 0, 15)).f;
            float f4 = y81Var.f;
            float f5 = f3 - f4;
            this.b = f4;
            this.a = f5;
            f2 = f5;
            f = f4;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = yo5.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = yo5.i(j);
        }
        return ap5.a(yo5.j(j), yo5.h(j), i2, yo5.g(j));
    }

    public final iwb b() {
        return (iwb) am2.l(1, (List) this.e);
    }

    public final iwb c(float f, float f2, float f3, boolean z) {
        float fB;
        List list;
        float[] fArr;
        float f4 = this.a;
        float f5 = f2 + f4;
        float f6 = this.b;
        float f7 = f3 - f6;
        float f8 = d().a().g;
        float f9 = b().a().h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = ze1.b(1.0f, 0.0f, f2, f5, f);
            list = (List) this.d;
            fArr = (float[]) this.f;
        } else {
            if (f <= f7) {
                return (iwb) this.c;
            }
            fB = ze1.b(0.0f, 1.0f, f7, f3, f);
            list = (List) this.e;
            fArr = (float[]) this.g;
        }
        if (z) {
            float[] fArrF = f(list, fB, fArr);
            return fArrF[0] >= 0.5f ? (iwb) list.get((int) fArrF[2]) : (iwb) list.get((int) fArrF[1]);
        }
        float[] fArrF2 = f(list, fB, fArr);
        iwb iwbVar = (iwb) list.get((int) fArrF2[1]);
        iwb iwbVar2 = (iwb) list.get((int) fArrF2[2]);
        float f10 = fArrF2[0];
        float f11 = iwbVar.a;
        List list2 = iwbVar.c;
        if (f11 != iwbVar2.a) {
            qp2.o("Keylines being linearly interpolated must have the same item size.");
            return null;
        }
        List list3 = iwbVar2.c;
        if (list2.size() != list3.size()) {
            qp2.o("Keylines being linearly interpolated must have the same number of keylines.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            hwb hwbVar = (hwb) list2.get(i);
            hwb hwbVar2 = (hwb) list3.get(i);
            arrayList.add(new hwb(ze1.a(hwbVar.a, hwbVar2.a, f10), ze1.a(hwbVar.b, hwbVar2.b, f10), ze1.a(hwbVar.c, hwbVar2.c, f10), ze1.a(hwbVar.d, hwbVar2.d, f10), false, 0.0f, 0.0f, 0.0f));
        }
        return new iwb(iwbVar.a, arrayList, ze1.c(f10, iwbVar.d, iwbVar2.d), ze1.c(f10, iwbVar.e, iwbVar2.e), iwbVar.f);
    }

    public final iwb d() {
        return (iwb) am2.l(1, (List) this.d);
    }
}
