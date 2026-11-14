package defpackage;

import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class vd1 implements tfd {
    public final de1 a;
    public ifg[] b;
    public ifg[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final ud1 h = new ud1(this, (byte) 1);
    public final ud1 i = new ud1(this, (byte) 0);

    public vd1(de1 de1Var) {
        this.a = de1Var;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).J(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).J(i));
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
    public final ufd b(vfd vfdVar, List list, long j) {
        Pair pair;
        int size = list.size();
        ifg[] ifgVarArr = new ifg[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        for (int i = 0; i < size2; i++) {
            pfd pfdVar = (pfd) list.get(i);
            Object objP = pfdVar.p();
            yd1 yd1Var = objP instanceof yd1 ? (yd1) objP : null;
            if (yd1Var != null && ((Boolean) yd1Var.b.getValue()).booleanValue()) {
                ifg ifgVarN = pfdVar.N(j);
                ifgVarArr[i] = ifgVarN;
                j2 = (ifgVarN.a << 32) | (ifgVarN.b & 4294967295L);
            }
        }
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            pfd pfdVar2 = (pfd) list.get(i2);
            if (ifgVarArr[i2] == null) {
                ifgVarArr[i2] = pfdVar2.N(j);
            }
        }
        if (vfdVar.F()) {
            pair = new Pair(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) (j2 & 4294967295L)));
        } else {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                ifg ifgVar = ifgVarArr[i5];
                if (ifgVar != null) {
                    Object objP2 = ((pfd) list.get(i5)).p();
                    yd1 yd1Var2 = objP2 instanceof yd1 ? (yd1) objP2 : null;
                    if (yd1Var2 == null || !((Boolean) yd1Var2.c.getValue()).booleanValue()) {
                        int i6 = ifgVar.a;
                        if (i6 > i3) {
                            i3 = i6;
                        }
                        int i7 = ifgVar.b;
                        if (i7 > i4) {
                            i4 = i7;
                        }
                    }
                }
            }
            pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
        }
        int iIntValue = ((Number) pair.a).intValue();
        int iIntValue2 = ((Number) pair.b).intValue();
        if (vfdVar.F()) {
            this.b = ifgVarArr;
            this.d = iIntValue;
            this.f = iIntValue2;
            return vfdVar.b0(iIntValue, iIntValue2, n08.a, this.h);
        }
        this.a.c.setValue(new gcb((iIntValue << 32) | (iIntValue2 & 4294967295L)));
        this.c = ifgVarArr;
        this.e = iIntValue;
        this.g = iIntValue2;
        return vfdVar.b0(iIntValue, iIntValue2, n08.a, this.i);
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((pfd) list.get(0)).E(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((pfd) list.get(i2)).E(i));
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
