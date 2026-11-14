package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class fq4 implements mnk {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public dq4 d;
    public long e;
    public long f;
    public long g;

    public fq4() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new dq4(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            jl4 jl4Var = new jl4(this, (byte) 8);
            eq4 eq4Var = new eq4();
            eq4Var.h = jl4Var;
            arrayDeque.add(eq4Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.mj6
    public final void a(long j) {
        this.g = j;
    }

    public abstract u59 b();

    public abstract void c(dq4 dq4Var);

    @Override // defpackage.mj6
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public eq4 dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            dq4 dq4Var = (dq4) arrayDeque2.peek();
            String str = tym.a;
            if (dq4Var.g > this.e) {
                return null;
            }
            dq4 dq4Var2 = (dq4) arrayDeque2.poll();
            boolean zD = dq4Var2.d(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zD) {
                eq4 eq4Var = (eq4) arrayDeque.pollFirst();
                eq4Var.a(4);
                dq4Var2.i();
                arrayDeque3.add(dq4Var2);
                return eq4Var;
            }
            c(dq4Var2);
            if (e()) {
                u59 u59VarB = b();
                eq4 eq4Var2 = (eq4) arrayDeque.pollFirst();
                long j = dq4Var2.g;
                eq4Var2.c = j;
                eq4Var2.e = u59VarB;
                eq4Var2.f = j;
                dq4Var2.i();
                arrayDeque3.add(dq4Var2);
                return eq4Var2;
            }
            dq4Var2.i();
            arrayDeque3.add(dq4Var2);
        }
    }

    @Override // defpackage.mj6
    public final Object dequeueInputBuffer() {
        z4o.H(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        dq4 dq4Var = (dq4) arrayDeque.pollFirst();
        this.d = dq4Var;
        return dq4Var;
    }

    public abstract boolean e();

    @Override // defpackage.mj6
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            dq4 dq4Var = (dq4) arrayDeque2.poll();
            String str = tym.a;
            dq4Var.i();
            arrayDeque.add(dq4Var);
        }
        dq4 dq4Var2 = this.d;
        if (dq4Var2 != null) {
            dq4Var2.i();
            arrayDeque.add(dq4Var2);
            this.d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // defpackage.mj6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void queueInputBuffer(java.lang.Object r7) {
        /*
            r6 = this;
            rnk r7 = (defpackage.rnk) r7
            dq4 r0 = r6.d
            if (r7 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.z4o.w(r0)
            dq4 r7 = (defpackage.dq4) r7
            r0 = 4
            boolean r0 = r7.d(r0)
            if (r0 != 0) goto L35
            long r0 = r7.g
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L35
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L35
            r7.i()
            java.util.ArrayDeque r0 = r6.a
            r0.add(r7)
            goto L43
        L35:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.k = r0
            java.util.ArrayDeque r0 = r6.c
            r0.add(r7)
        L43:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq4.queueInputBuffer(java.lang.Object):void");
    }

    @Override // defpackage.mj6
    public void release() {
    }

    @Override // defpackage.mnk
    public final void setPositionUs(long j) {
        this.e = j;
    }
}
