package defpackage;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class bl3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bl3(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ bl3(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        yh5 yh5Var;
        yh5 yh5Var2;
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        int i4 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                cl3 cl3Var = (cl3) obj3;
                ifd ifdVar = (ifd) obj;
                cl3 cl3Var2 = (cl3) ((WeakReference) obj2).get();
                if (cl3Var2 != null && cl3Var2.g == i4) {
                    cl3Var.Z(ifdVar);
                }
                return Unit.a;
            case 1:
                znh znhVar = (znh) obj3;
                zde zdeVar = (zde) obj2;
                yh5 yh5Var3 = (yh5) obj;
                if (znhVar.e == i4 && Intrinsics.a(zdeVar, znhVar.f) && (yh5Var3 instanceof fi5)) {
                    long[] jArr = zdeVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = zdeVar.b[i9];
                                        int i10 = zdeVar.c[i9] != i4 ? 1 : i3;
                                        if (i10 != 0) {
                                            fi5 fi5Var = (fi5) yh5Var3;
                                            i = i6;
                                            see seeVar = fi5Var.g;
                                            n6h.l(seeVar, obj4, znhVar);
                                            yh5Var2 = yh5Var3;
                                            if (obj4 instanceof i37) {
                                                i37 i37Var = (i37) obj4;
                                                if (!seeVar.c(i37Var)) {
                                                    n6h.n(fi5Var.j, i37Var);
                                                }
                                                see seeVar2 = znhVar.g;
                                                if (seeVar2 != null) {
                                                    seeVar2.k(obj4);
                                                }
                                            }
                                        } else {
                                            yh5Var2 = yh5Var3;
                                            i = i6;
                                        }
                                        if (i10 != 0) {
                                            zdeVar.f(i9);
                                        }
                                    } else {
                                        yh5Var2 = yh5Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    yh5Var3 = yh5Var2;
                                    i3 = 0;
                                }
                                yh5Var = yh5Var3;
                                if (i7 == i6) {
                                }
                            } else {
                                yh5Var = yh5Var3;
                            }
                            if (i5 != length) {
                                i5++;
                                yh5Var3 = yh5Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                return Unit.a;
            case 2:
                roi roiVar = (roi) obj3;
                ifg ifgVar = (ifg) obj2;
                p1d p1dVar = (p1d) obj;
                int iH = roiVar.o.a.h();
                if (iH < 0) {
                    iH = 0;
                }
                if (iH <= i4) {
                    i4 = iH;
                }
                int i11 = -i4;
                if (roiVar.p) {
                    i2 = 0;
                } else {
                    i2 = i11;
                    i11 = 0;
                }
                p1dVar.a = true;
                p1d.l(p1dVar, ifgVar, i2, i11);
                p1dVar.a = false;
                return Unit.a;
            case 3:
                a21 a21Var = (a21) obj3;
                return new o4l((ge) obj, (k6l) a21Var.d, (u4l) a21Var.g, (s9i) a21Var.h, a21Var, (u3l) obj2, this.b);
            default:
                j2n j2nVar = (j2n) obj3;
                ifg ifgVar2 = (ifg) obj2;
                p1d p1dVar2 = (p1d) obj;
                int i12 = j2nVar.c;
                vhl vhlVar = j2nVar.b;
                j2m j2mVar = j2nVar.d;
                ojl ojlVar = (ojl) j2nVar.e.invoke();
                vhlVar.a(fsf.a, lah.n(p1dVar2, i12, j2mVar, ojlVar != null ? ojlVar.a : null, false, ifgVar2.a), i4, ifgVar2.b);
                p1d.h(p1dVar2, ifgVar2, 0, Math.round(-vhlVar.a.h()));
                return Unit.a;
        }
    }
}
