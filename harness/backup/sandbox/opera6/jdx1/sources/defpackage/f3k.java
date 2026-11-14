package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f3k {
    public int[] a;
    public final i16 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public tx9 l;
    public Bitmap m;
    public final boolean n;
    public byte o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[NotificationCompat.FLAG_LOCAL_ONLY];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public f3k(i16 i16Var, tx9 tx9Var, ByteBuffer byteBuffer, int i) {
        this.c = i16Var;
        this.l = new tx9();
        synchronized (this) {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            int i2 = 0;
            this.o = (byte) 0;
            this.l = tx9Var;
            this.k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            ArrayList arrayList = tx9Var.e;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (((nx9) obj).g == 3) {
                    this.n = true;
                    break;
                }
            }
            this.p = iHighestOneBit;
            int i3 = tx9Var.f;
            this.r = i3 / iHighestOneBit;
            int i4 = tx9Var.g;
            this.q = i4 / iHighestOneBit;
            this.i = (byte[]) ((jl6) this.c.c).i(byte[].class, i3 * i4);
            this.j = (int[]) ((jl6) this.c.c).i(int[].class, this.r * this.q);
        }
    }

    public final Bitmap a() {
        Boolean bool = this.s;
        Bitmap bitmapA = ((zg3) this.c.b).a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        if (this.l.c <= 0 || this.k < 0) {
            if (Log.isLoggable("f3k", 3)) {
                int i = this.l.c;
            }
            this.o = (byte) 1;
        }
        byte b = this.o;
        if (b == 1 || b == 2) {
            return null;
        }
        this.o = (byte) 0;
        if (this.e == null) {
            this.e = (byte[]) ((jl6) this.c.c).i(byte[].class, 255);
        }
        nx9 nx9Var = (nx9) this.l.e.get(this.k);
        int i2 = this.k - 1;
        nx9 nx9Var2 = i2 >= 0 ? (nx9) this.l.e.get(i2) : null;
        int[] iArr = nx9Var.k;
        if (iArr == null) {
            iArr = this.l.a;
        }
        this.a = iArr;
        if (iArr == null) {
            this.o = (byte) 1;
            return null;
        }
        if (nx9Var.f) {
            System.arraycopy(iArr, 0, this.b, 0, iArr.length);
            int[] iArr2 = this.b;
            this.a = iArr2;
            iArr2[nx9Var.h] = 0;
            if (nx9Var.g == 2 && this.k == 0) {
                this.s = Boolean.TRUE;
            }
        }
        return d(nx9Var, nx9Var2);
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap d(defpackage.nx9 r38, defpackage.nx9 r39) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3k.d(nx9, nx9):android.graphics.Bitmap");
    }
}
