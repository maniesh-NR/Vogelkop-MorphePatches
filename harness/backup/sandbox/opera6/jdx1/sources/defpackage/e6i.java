package defpackage;

import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e6i implements ssk, rsk {
    public static final TreeMap i = new TreeMap();
    public final byte a;
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    public final int[] g;
    public byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public e6i(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    @Override // defpackage.rsk
    public final void B(int i2, double d) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // defpackage.rsk
    public final void T0(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    @Override // defpackage.rsk
    public final void Z0(int i2, byte[] bArr) {
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ssk
    public final String h() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        qp2.n("Required value was null.");
        return null;
    }

    @Override // defpackage.rsk
    public final void j1(int i2) {
        this.g[i2] = 1;
    }

    @Override // defpackage.ssk
    public final void l(rsk rskVar) {
        byte b = this.h;
        if (1 > b) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.g[i2];
            if (i3 == 1) {
                rskVar.j1(i2);
            } else if (i3 == 2) {
                rskVar.T0(i2, this.c[i2]);
            } else if (i3 == 3) {
                rskVar.B(i2, this.d[i2]);
            } else if (i3 == 4) {
                String str = this.e[i2];
                if (str == null) {
                    qp2.o("Required value was null.");
                    return;
                }
                rskVar.w(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.f[i2];
                if (bArr == null) {
                    qp2.o("Required value was null.");
                    return;
                }
                rskVar.Z0(i2, bArr);
            }
            if (i2 == b) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void release() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // defpackage.rsk
    public final void w(int i2, String str) {
        this.g[i2] = 4;
        this.e[i2] = str;
    }
}
