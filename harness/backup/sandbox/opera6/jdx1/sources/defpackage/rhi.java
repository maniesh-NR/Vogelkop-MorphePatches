package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class rhi {
    public final l45 a;
    public final int b;
    public final g1g c;
    public tr3 d;
    public tr3 e;
    public tr3 f;
    public long g;

    public rhi(l45 l45Var) {
        this.a = l45Var;
        synchronized (l45Var) {
            r05 r05Var = ((xs6) l45Var.c).c;
        }
        this.b = 65536;
        this.c = new g1g(32);
        tr3 tr3Var = new tr3(0L, 65536);
        this.d = tr3Var;
        this.e = tr3Var;
        this.f = tr3Var;
    }

    public static tr3 c(tr3 tr3Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= tr3Var.b) {
            tr3Var = (tr3) tr3Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (tr3Var.b - j));
            h01 h01Var = (h01) tr3Var.c;
            byteBuffer.put(h01Var.a, ((int) (j - tr3Var.a)) + h01Var.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == tr3Var.b) {
                tr3Var = (tr3) tr3Var.d;
            }
        }
        return tr3Var;
    }

    public static tr3 d(tr3 tr3Var, long j, byte[] bArr, int i) {
        while (j >= tr3Var.b) {
            tr3Var = (tr3) tr3Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (tr3Var.b - j));
            h01 h01Var = (h01) tr3Var.c;
            System.arraycopy(h01Var.a, ((int) (j - tr3Var.a)) + h01Var.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == tr3Var.b) {
                tr3Var = (tr3) tr3Var.d;
            }
        }
        return tr3Var;
    }

    public static tr3 e(tr3 tr3Var, qj6 qj6Var, y03 y03Var, g1g g1gVar) {
        if (qj6Var.d(1073741824)) {
            long j = y03Var.b;
            int iH = 1;
            g1gVar.K(1);
            tr3 tr3VarD = d(tr3Var, j, g1gVar.a, 1);
            long j2 = j + 1;
            byte b = g1gVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & Byte.MAX_VALUE;
            d36 d36Var = qj6Var.d;
            byte[] bArr = d36Var.a;
            if (bArr == null) {
                d36Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            tr3Var = d(tr3VarD, j2, d36Var.a, i);
            long j3 = j2 + i;
            if (z) {
                g1gVar.K(2);
                tr3Var = d(tr3Var, j3, g1gVar.a, 2);
                j3 += 2;
                iH = g1gVar.H();
            }
            int[] iArr = d36Var.d;
            if (iArr == null || iArr.length < iH) {
                iArr = new int[iH];
            }
            int[] iArr2 = d36Var.e;
            if (iArr2 == null || iArr2.length < iH) {
                iArr2 = new int[iH];
            }
            if (z) {
                int i2 = iH * 6;
                g1gVar.K(i2);
                tr3Var = d(tr3Var, j3, g1gVar.a, i2);
                j3 += i2;
                g1gVar.N(0);
                for (int i3 = 0; i3 < iH; i3++) {
                    iArr[i3] = g1gVar.H();
                    iArr2[i3] = g1gVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = y03Var.a - ((int) (j3 - y03Var.b));
            }
            gyl gylVar = (gyl) y03Var.c;
            String str = tym.a;
            byte[] bArr2 = gylVar.b;
            byte[] bArr3 = d36Var.a;
            byte b2 = gylVar.a;
            int i4 = gylVar.c;
            int i5 = gylVar.d;
            d36Var.f = iH;
            d36Var.d = iArr;
            d36Var.e = iArr2;
            d36Var.b = bArr2;
            d36Var.a = bArr3;
            d36Var.c = b2;
            d36Var.g = i4;
            d36Var.h = i5;
            MediaCodec.CryptoInfo cryptoInfo = d36Var.i;
            cryptoInfo.numSubSamples = iH;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = b2;
            i16 i16Var = d36Var.j;
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) i16Var.c;
            pattern.set(i4, i5);
            ((MediaCodec.CryptoInfo) i16Var.b).setPattern(pattern);
            long j4 = y03Var.b;
            int i6 = (int) (j3 - j4);
            y03Var.b = j4 + i6;
            y03Var.a -= i6;
        }
        if (!qj6Var.d(268435456)) {
            qj6Var.k(y03Var.a);
            return c(tr3Var, y03Var.b, qj6Var.e, y03Var.a);
        }
        g1gVar.K(4);
        tr3 tr3VarD2 = d(tr3Var, y03Var.b, g1gVar.a, 4);
        int iE = g1gVar.E();
        y03Var.b += 4;
        y03Var.a -= 4;
        qj6Var.k(iE);
        tr3 tr3VarC = c(tr3VarD2, y03Var.b, qj6Var.e, iE);
        y03Var.b += iE;
        int i7 = y03Var.a - iE;
        y03Var.a = i7;
        ByteBuffer byteBuffer = qj6Var.h;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            qj6Var.h = ByteBuffer.allocate(i7);
        } else {
            qj6Var.h.clear();
        }
        return c(tr3VarC, y03Var.b, qj6Var.h, y03Var.a);
    }

    public final void a(long j) {
        tr3 tr3Var;
        if (j != -1) {
            while (true) {
                tr3Var = this.d;
                if (j < tr3Var.b) {
                    break;
                }
                l45 l45Var = this.a;
                h01 h01Var = (h01) tr3Var.c;
                synchronized (l45Var) {
                    r05 r05Var = ((xs6) l45Var.c).c;
                    synchronized (r05Var) {
                        try {
                            h01[] h01VarArr = (h01[]) r05Var.e;
                            int i = r05Var.d;
                            r05Var.d = i + 1;
                            h01VarArr[i] = h01Var;
                            r05Var.c--;
                            r05Var.notifyAll();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    l45Var.N(h01Var);
                }
                tr3 tr3Var2 = this.d;
                tr3Var2.c = null;
                tr3 tr3Var3 = (tr3) tr3Var2.d;
                tr3Var2.d = null;
                this.d = tr3Var3;
            }
            if (this.e.a < tr3Var.a) {
                this.e = tr3Var;
            }
        }
    }

    public final int b(int i) {
        h01 h01VarQ;
        tr3 tr3Var = this.f;
        if (((h01) tr3Var.c) == null) {
            l45 l45Var = this.a;
            synchronized (l45Var) {
                h01VarQ = ((xs6) l45Var.c).c.q();
                ((HashMap) l45Var.a).put(h01VarQ, (fjg) l45Var.b);
                ws6 ws6Var = (ws6) ((xs6) l45Var.c).n.get((fjg) l45Var.b);
                if (ws6Var != null) {
                    synchronized (ws6Var) {
                        ws6Var.d++;
                    }
                }
            }
            tr3 tr3Var2 = new tr3(this.f.b, this.b);
            tr3Var.c = h01VarQ;
            tr3Var.d = tr3Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
