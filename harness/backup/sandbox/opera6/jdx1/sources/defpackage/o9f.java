package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class o9f {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final g1g g = new g1g(255);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, short] */
    public final boolean a(lp6 lp6Var, boolean z) throws s1g, EOFException {
        boolean zPeekFully;
        boolean zPeekFully2;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        g1g g1gVar = this.g;
        g1gVar.K(27);
        try {
            zPeekFully = lp6Var.peekFully(g1gVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zPeekFully = false;
        }
        if (zPeekFully && g1gVar.C() == 1332176723) {
            if (g1gVar.A() == 0) {
                this.a = g1gVar.A();
                this.b = g1gVar.p();
                g1gVar.r();
                g1gVar.r();
                g1gVar.r();
                ?? A = g1gVar.A();
                this.c = A;
                this.d = A + 27;
                g1gVar.K(A);
                try {
                    zPeekFully2 = lp6Var.peekFully(g1gVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zPeekFully2 = false;
                }
                if (zPeekFully2) {
                    for (int i = 0; i < this.c; i++) {
                        int iA = g1gVar.A();
                        this.f[i] = iA;
                        this.e += iA;
                    }
                    return true;
                }
            } else if (!z) {
                throw s1g.h("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r9.d >= r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r9.g(1) != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.lp6 r9, long r10) throws java.io.InterruptedIOException {
        /*
            r8 = this;
            long r0 = r9.d
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            defpackage.z4o.w(r0)
            g1g r8 = r8.g
            r0 = 4
            r8.K(r0)
        L18:
            r3 = -1
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 == 0) goto L27
            long r4 = r9.d
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L46
        L27:
            byte[] r4 = r8.a
            boolean r4 = r9.peekFully(r4, r1, r0, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r4 = r1
        L2f:
            if (r4 == 0) goto L46
            r8.N(r1)
            long r3 = r8.C()
            r5 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L42
            r9.f = r1
            return r2
        L42:
            r9.h(r2, r1)
            goto L18
        L46:
            if (r3 == 0) goto L4e
            long r4 = r9.d
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L55
        L4e:
            int r8 = r9.g(r2)
            r0 = -1
            if (r8 != r0) goto L46
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9f.b(lp6, long):boolean");
    }
}
