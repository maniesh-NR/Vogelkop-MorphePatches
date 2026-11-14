package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ee1 implements tfd {
    public final le1 a;
    public boolean b;

    public ee1(le1 le1Var) {
        this.a = le1Var;
    }

    public final int a(shb shbVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ = ((pfd) list.get(0)).J(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iJ2 = ((pfd) list.get(i2)).J(i);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iJ;
    }

    public final ufd b(vfd vfdVar, List list, long j) {
        t0g t0gVar = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            ifg ifgVarN = ((pfd) list.get(i)).N(j);
            iMax = Math.max(iMax, ifgVarN.a);
            iMax2 = Math.max(iMax2, ifgVarN.b);
            arrayList.add(ifgVarN);
        }
        if (vfdVar.F()) {
            this.b = true;
            t0gVar.setValue(new gcb((iMax << 32) | (iMax2 & 4294967295L)));
        } else if (!this.b) {
            t0gVar.setValue(new gcb((iMax << 32) | (iMax2 & 4294967295L)));
        }
        return vfdVar.b0(iMax, iMax2, n08.a, new b11(arrayList, (byte) 3));
    }

    public final int c(shb shbVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE = ((pfd) list.get(0)).E(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iE2 = ((pfd) list.get(i2)).E(i);
                if (iE2 > iE) {
                    iE = iE2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iE;
    }

    public final int d(shb shbVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iC = ((pfd) list.get(0)).c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iC2 = ((pfd) list.get(i2)).c(i);
                if (iC2 > iC) {
                    iC = iC2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iC;
    }

    public final int e(shb shbVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = ((pfd) list.get(0)).z(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iZ2 = ((pfd) list.get(i2)).z(i);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iZ;
    }
}
