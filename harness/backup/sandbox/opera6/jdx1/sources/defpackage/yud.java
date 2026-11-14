package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yud implements z36 {
    public static final pi5 b = new pi5(new p24(new b10((byte) 21), ije.b), new p24(new b10((byte) 22), ije.c));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.z36
    public final boolean a(a46 a46Var, long j) {
        long j2 = a46Var.b;
        z4o.w(j2 != -9223372036854775807L);
        z4o.w(a46Var.c != -9223372036854775807L);
        boolean z = j2 <= j && j < a46Var.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((a46) arrayList.get(size)).b) {
                arrayList.add(size + 1, a46Var);
                return z;
            }
        }
        arrayList.add(0, a46Var);
        return z;
    }

    @Override // defpackage.z36
    public final h1b b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((a46) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    a46 a46Var = (a46) arrayList.get(i);
                    if (j >= a46Var.b && j < a46Var.d) {
                        arrayList2.add(a46Var);
                    }
                    if (j < a46Var.b) {
                        break;
                    }
                }
                csh cshVarA = h1b.A(b, arrayList2);
                z0b z0bVarP = h1b.p();
                for (int i2 = 0; i2 < cshVarA.d; i2++) {
                    z0bVarP.e(((a46) cshVarA.get(i2)).a);
                }
                return z0bVarP.g();
            }
        }
        a1b a1bVar = h1b.b;
        return csh.e;
    }

    @Override // defpackage.z36
    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((a46) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long jMax = ((a46) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((a46) arrayList.get(i)).b;
            long j3 = ((a46) arrayList.get(i)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // defpackage.z36
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.z36
    public final long g(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((a46) arrayList.get(i)).b;
            long j3 = ((a46) arrayList.get(i)).d;
            if (j < j2) {
                jMin = jMin == -9223372036854775807L ? j2 : Math.min(jMin, j2);
            } else {
                if (j < j3) {
                    jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.z36
    public final void h(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((a46) arrayList.get(i)).b;
            if (j > j2 && j > ((a46) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
