package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vsk extends wsk {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    public vsk(to9 to9Var, String str) {
        super(to9Var, str);
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void r(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            nxg.u(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.wsk
    public final void B(int i, double d) {
        o();
        p(2, i);
        this.d[i] = 2;
        this.f[i] = d;
    }

    @Override // defpackage.wsk
    public final void T0(int i, long j) {
        o();
        p(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // defpackage.wsk
    public final void Z0(int i, byte[] bArr) {
        o();
        p(4, i);
        this.d[i] = 4;
        this.h[i] = bArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            o();
            this.d = new int[0];
            this.e = new long[0];
            this.f = new double[0];
            this.g = new String[0];
            this.h = new byte[0][];
            m();
        }
        this.c = true;
    }

    @Override // defpackage.wsk
    public final byte[] getBlob(int i) {
        o();
        Cursor cursorS = s();
        r(cursorS, i);
        return cursorS.getBlob(i);
    }

    @Override // defpackage.wsk
    public final int getColumnCount() {
        o();
        q();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.wsk
    public final String getColumnName(int i) {
        o();
        q();
        Cursor cursor = this.i;
        if (cursor != null) {
            r(cursor, i);
            return cursor.getColumnName(i);
        }
        qp2.n("Required value was null.");
        return null;
    }

    @Override // defpackage.wsk
    public final double getDouble(int i) {
        o();
        Cursor cursorS = s();
        r(cursorS, i);
        return cursorS.getDouble(i);
    }

    @Override // defpackage.wsk
    public final long getLong(int i) {
        o();
        Cursor cursorS = s();
        r(cursorS, i);
        return cursorS.getLong(i);
    }

    @Override // defpackage.wsk
    public final void h(int i, String str) {
        o();
        p(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // defpackage.wsk
    public final boolean isNull(int i) {
        o();
        Cursor cursorS = s();
        r(cursorS, i);
        return cursorS.isNull(i);
    }

    @Override // defpackage.wsk
    public final void j1(int i) {
        o();
        p(5, i);
        this.d[i] = 5;
    }

    @Override // defpackage.wsk
    public final String l(int i) {
        o();
        Cursor cursorS = s();
        r(cursorS, i);
        return cursorS.getString(i);
    }

    @Override // defpackage.wsk
    public final void m() {
        o();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.wsk
    public final boolean n() {
        o();
        q();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        qp2.n("Required value was null.");
        return false;
    }

    public final void p(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i == 4) {
            byte[][] bArr = this.h;
            if (bArr.length < i3) {
                this.h = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }
    }

    public final void q() {
        if (this.i == null) {
            this.i = this.a.q(new u7k(this));
        }
    }

    public final Cursor s() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        nxg.u(21, "no row");
        throw null;
    }
}
