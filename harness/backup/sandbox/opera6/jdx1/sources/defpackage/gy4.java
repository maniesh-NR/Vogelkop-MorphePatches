package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gy4 implements tfd {
    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        int size = list.size();
        int iJ = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iJ += ((pfd) list.get(i2)).J(i);
        }
        return iJ;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) throws pxb {
        Object obj;
        int i;
        final int i2;
        Object obj2;
        int i3;
        final int i4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (Intrinsics.a(j14.R((pfd) obj), "leadingIcon")) {
                break;
            }
            i5++;
        }
        pfd pfdVar = (pfd) obj;
        final ifg ifgVarN = pfdVar != null ? pfdVar.N(yo5.a(0, 0, 0, 0, 10, j)) : null;
        if (ifgVarN != null) {
            i = ifgVarN.a;
            i2 = ifgVarN.b;
        } else {
            i = 0;
            i2 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (Intrinsics.a(j14.R((pfd) obj2), "trailingIcon")) {
                break;
            }
            i6++;
        }
        pfd pfdVar2 = (pfd) obj2;
        final ifg ifgVarN2 = pfdVar2 != null ? pfdVar2.N(yo5.a(0, 0, 0, 0, 10, j)) : null;
        if (ifgVarN2 != null) {
            i3 = ifgVarN2.a;
            i4 = ifgVarN2.b;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (i7 < size3) {
            pfd pfdVar3 = (pfd) list.get(i7);
            if (Intrinsics.a(j14.R(pfdVar3), "label")) {
                final ifg ifgVarN3 = pfdVar3.N(ap5.j(-(i + i3), 0, 2, j));
                int i8 = ifgVarN3.a + i + i3;
                final int iMax = Math.max(i2, Math.max(ifgVarN3.b, i4));
                final int i9 = i;
                return vfdVar.b0(i8, iMax, n08.a, new Function1() { // from class: fy4
                    public final Object invoke(Object obj3) {
                        p1d p1dVar = (p1d) obj3;
                        ifg ifgVar = ifgVarN;
                        int i10 = iMax;
                        if (ifgVar != null) {
                            p1d.h(p1dVar, ifgVar, 0, Math.round(((i10 - i2) / 2.0f) * 1.0f));
                        }
                        ifg ifgVar2 = ifgVarN3;
                        int i11 = i9;
                        p1d.h(p1dVar, ifgVar2, i11, 0);
                        ifg ifgVar3 = ifgVarN2;
                        if (ifgVar3 != null) {
                            p1d.h(p1dVar, ifgVar3, i11 + ifgVar2.a, Math.round(((i10 - i4) / 2.0f) * 1.0f));
                        }
                        return Unit.a;
                    }
                });
            }
            i7++;
            i = i;
        }
        tic.b("Collection contains no element matching the predicate.");
        t3p.v();
        return null;
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        int size = list.size();
        int iE = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iE += ((pfd) list.get(i2)).E(i);
        }
        return iE;
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).c(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).z(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).z(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
