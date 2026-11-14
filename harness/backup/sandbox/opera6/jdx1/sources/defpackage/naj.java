package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class naj implements rvj {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    public naj() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        this.d = new Paint();
        t(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint2);
    }

    public naj(svj svjVar) {
        this.h = svjVar;
        int i2 = svjVar.h;
        this.d = new short[i2];
        int i3 = i2 * svjVar.b;
        this.e = new short[i3];
        this.f = new short[i3];
        this.g = new short[i3];
    }

    @Override // defpackage.rvj
    public final void a(int i2, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        svj svjVar = (svj) this.h;
        shortBufferAsShortBuffer.get(sArr, svjVar.j * svjVar.b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // defpackage.rvj
    public final void b(int i2, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        int i3 = ((svj) this.h).b;
        shortBufferAsShortBuffer.put(sArr, 0, i2 * i3);
        byteBuffer.position(((i2 << 1) * i3) + byteBuffer.position());
    }

    @Override // defpackage.rvj
    public final void c(int i2, int i3) {
        for (int i4 = 0; i4 < ((svj) this.h).b * i3; i4++) {
            ((short[]) this.e)[i2 + i4] = 0;
        }
    }

    @Override // defpackage.rvj
    public final void d(int i2, int i3) {
        short[] sArr = (short[]) this.e;
        svj svjVar = (svj) this.h;
        int i4 = svjVar.h / i3;
        int i5 = svjVar.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            ((short[]) this.d)[i8] = (short) (i9 / i6);
        }
    }

    @Override // defpackage.rvj
    public final int e(int i2, int i3, int i4) {
        return s((short[]) this.e, i2, i3, i4);
    }

    @Override // defpackage.rvj
    public final void f(int i2) {
        this.f = r((short[]) this.f, ((svj) this.h).k, i2);
    }

    @Override // defpackage.rvj
    public final void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.rvj
    public final boolean g() {
        int i2 = this.a;
        return i2 != 0 && ((svj) this.h).p != 0 && this.b <= i2 * 3 && (i2 << 1) > this.c * 3;
    }

    @Override // defpackage.rvj
    public final void h(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    @Override // defpackage.rvj
    public final void i(int i2) {
        this.e = r((short[]) this.e, ((svj) this.h).j, i2);
    }

    @Override // defpackage.rvj
    public final int j(int i2, int i3) {
        return s((short[]) this.d, 0, i2, i3);
    }

    @Override // defpackage.rvj
    public final void k(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            svj svjVar = (svj) this.h;
            int i4 = svjVar.b;
            if (i3 >= i4) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i5 = (svjVar.k * i4) + i3;
            short[] sArr2 = (short[]) this.g;
            int i6 = (i2 * i4) + i3;
            short s = sArr2[i6];
            short s2 = sArr2[i6 + i4];
            long j4 = svjVar.n * j2;
            long j5 = (r1 + 1) * j3;
            long j6 = j5 - j4;
            long j7 = j5 - (svjVar.m * j3);
            sArr[i5] = (short) ((((j7 - j6) * s2) + (s * j6)) / j7);
            i3++;
        }
    }

    @Override // defpackage.rvj
    public final void l() {
        this.c = this.a;
    }

    @Override // defpackage.rvj
    public final Object m() {
        return (short[]) this.e;
    }

    @Override // defpackage.rvj
    public final Object n() {
        return (short[]) this.f;
    }

    @Override // defpackage.rvj
    public final Object o() {
        return (short[]) this.g;
    }

    @Override // defpackage.rvj
    public final void p(int i2) {
        this.g = r((short[]) this.g, ((svj) this.h).l, i2);
    }

    @Override // defpackage.rvj
    public final int q() {
        return 2;
    }

    public final short[] r(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = ((svj) this.h).b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int s(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * ((svj) this.h).b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i7 * i3) {
                i8 = i3;
                i7 = iAbs;
            }
            if (iAbs * i6 > i9 * i3) {
                i6 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.a = i7 / i8;
        this.b = i9 / i6;
        return i8;
    }

    public final void t(int i2) {
        this.a = ab5.l(i2, 68);
        this.b = ab5.l(i2, 20);
        this.c = ab5.l(i2, 0);
        ((Paint) this.d).setColor(this.a);
    }
}
