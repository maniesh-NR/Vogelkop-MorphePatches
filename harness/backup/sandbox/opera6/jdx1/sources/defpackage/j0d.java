package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0d {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long[] c;

    public /* synthetic */ j0d() {
    }

    public j0d(int i) {
        this.c = new long[i];
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArrCopyOf = this.c;
                if (i == jArrCopyOf.length) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i << 1);
                    this.c = jArrCopyOf;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                jArrCopyOf[i2] = j;
                break;
            default:
                if (!c(j)) {
                    int i3 = this.b;
                    long[] jArrCopyOf2 = this.c;
                    if (i3 >= jArrCopyOf2.length) {
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(i3 + 1, jArrCopyOf2.length << 1));
                        this.c = jArrCopyOf2;
                    }
                    jArrCopyOf2[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public final void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArrCopyOf = this.c;
        if (length > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(jArrCopyOf.length << 1, length));
            this.c = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.b, jArr.length);
        this.b = length;
    }

    public final boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        h9o.g(this.b, p3p.o(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public final void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }
}
