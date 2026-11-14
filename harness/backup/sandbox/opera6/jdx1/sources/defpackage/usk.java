package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class usk extends wsk {
    public final /* synthetic */ byte d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usk(to9 to9Var, String str) {
        super(to9Var, str);
        this.d = (byte) 1;
        this.e = to9Var.l(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ usk(to9 to9Var, String str, Object obj, byte b) {
        super(to9Var, str);
        this.d = b;
        this.e = obj;
    }

    @Override // defpackage.wsk
    public final void B(int i, double d) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).B(i, d);
                return;
            case 1:
                o();
                ((ap9) obj).B(i, d);
                return;
            default:
                o();
                nxg.u(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final void T0(int i, long j) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).T0(i, j);
                return;
            case 1:
                o();
                ((ap9) obj).T0(i, j);
                return;
            default:
                o();
                nxg.u(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final void Z0(int i, byte[] bArr) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).Z0(i, bArr);
                return;
            case 1:
                o();
                ((ap9) obj).Z0(i, bArr);
                return;
            default:
                o();
                nxg.u(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).close();
                break;
            case 1:
                ((ap9) obj).close();
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // defpackage.wsk
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).getBlob(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                o();
                break;
            default:
                o();
                break;
        }
        return 0;
    }

    @Override // defpackage.wsk
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).getColumnName(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final double getDouble(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).getDouble(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).getLong(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final void h(int i, String str) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).h(i, str);
                return;
            case 1:
                o();
                ((ap9) obj).w(i, str);
                return;
            default:
                o();
                nxg.u(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).isNull(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final void j1(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((vsk) obj).j1(i);
                return;
            case 1:
                o();
                ((ap9) obj).j1(i);
                return;
            default:
                o();
                nxg.u(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final boolean k() {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).k();
            default:
                return super.k();
        }
    }

    @Override // defpackage.wsk
    public final String l(int i) {
        switch (this.d) {
            case 0:
                return ((vsk) this.e).l(i);
            case 1:
                o();
                nxg.u(21, "no row");
                throw null;
            default:
                o();
                nxg.u(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wsk
    public final void m() {
        switch (this.d) {
            case 0:
                ((vsk) this.e).m();
                break;
            default:
                super.m();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // defpackage.wsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            byte r0 = r6.d
            r1 = 1
            to9 r2 = r6.a
            java.lang.Object r3 = r6.e
            r4 = 0
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L74;
                default: goto Lb;
            }
        Lb:
            tsk r3 = (defpackage.tsk) r3
            int r6 = r3.ordinal()
            if (r6 == 0) goto L6d
            if (r6 == r1) goto L69
            r0 = 2
            if (r6 == r0) goto L65
            r0 = 3
            if (r6 == r0) goto L61
            r0 = 4
            if (r6 != r0) goto L5d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.a
            l4c r1 = defpackage.to9.e
            java.lang.Object r3 = r1.getValue()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L59
            l4c r3 = defpackage.to9.d
            java.lang.Object r5 = r3.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L59
            java.lang.Object r1 = r1.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Object r2 = r3.getValue()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 0
            java.lang.Object r0 = r2.invoke(r0, r3)
            if (r0 == 0) goto L53
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r3, r6, r3}
            r1.invoke(r0, r6)
            goto L73
        L53:
            java.lang.String r6 = "Required value was null."
            qp2.n(r6)
            goto L73
        L59:
            r2.h()
            goto L73
        L5d:
            h9o.p()
            goto L73
        L61:
            r2.k()
            goto L73
        L65:
            r2.h()
            goto L73
        L69:
            r2.m()
            goto L73
        L6d:
            r2.s()
            r2.m()
        L73:
            return r4
        L74:
            r6.o()
            ap9 r3 = (defpackage.ap9) r3
            android.database.sqlite.SQLiteStatement r6 = r3.b
            r6.execute()
            return r4
        L7f:
            vsk r3 = (defpackage.vsk) r3
            boolean r6 = r3.n()
            java.lang.String r0 = r3.l(r4)
            java.lang.String r3 = "wal"
            boolean r0 = kotlin.text.c.m(r0, r3, r1)
            if (r0 == 0) goto L97
            android.database.sqlite.SQLiteDatabase r0 = r2.a
            r0.enableWriteAheadLogging()
            goto L9c
        L97:
            android.database.sqlite.SQLiteDatabase r0 = r2.a
            r0.disableWriteAheadLogging()
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usk.n():boolean");
    }
}
