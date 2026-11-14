package defpackage;

/* loaded from: classes.dex */
public abstract class zzf {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        skl[] sklVarArr = rkl.b;
        a = rkl.c;
    }

    public static final yzf a(yzf yzfVar, int i, int i2, long j, wil wilVar, pgg pggVar, rec recVar, int i3, int i4, vjl vjlVar) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        wil wilVar2 = wilVar;
        pgg pggVar2 = pggVar;
        rec recVar2 = recVar;
        int i7 = i3;
        int i8 = i4;
        vjl vjlVar2 = vjlVar;
        if (i5 == 0 || i5 == yzfVar.a) {
            skl[] sklVarArr = rkl.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (rkl.a(j3, yzfVar.c)) {
                }
            }
            if ((wilVar2 == null || wilVar2.equals(yzfVar.d)) && ((i6 == 0 || i6 == yzfVar.b) && ((pggVar2 == null || pggVar2.equals(yzfVar.e)) && ((recVar2 == null || recVar2.equals(yzfVar.f)) && ((i7 == 0 || i7 == yzfVar.g) && ((i8 == 0 || i8 == yzfVar.h) && (vjlVar2 == null || vjlVar2.equals(yzfVar.i)))))))) {
                return yzfVar;
            }
        } else {
            j2 = 0;
        }
        skl[] sklVarArr2 = rkl.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = yzfVar.c;
        }
        if (wilVar2 == null) {
            wilVar2 = yzfVar.d;
        }
        if (i5 == 0) {
            i5 = yzfVar.a;
        }
        if (i6 == 0) {
            i6 = yzfVar.b;
        }
        pgg pggVar3 = yzfVar.e;
        if (pggVar3 != null && pggVar2 == null) {
            pggVar2 = pggVar3;
        }
        if (recVar2 == null) {
            recVar2 = yzfVar.f;
        }
        if (i7 == 0) {
            i7 = yzfVar.g;
        }
        if (i8 == 0) {
            i8 = yzfVar.h;
        }
        if (vjlVar2 == null) {
            vjlVar2 = yzfVar.i;
        }
        return new yzf(i5, i6, j3, wilVar2, pggVar2, recVar2, i7, i8, vjlVar2);
    }
}
