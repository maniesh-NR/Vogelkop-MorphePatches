package defpackage;

import J.N;
import com.opera.android.suggestion.SuggestionListCallback;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class yv4 implements gb6, dn8, en8, SuggestionListCallback {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public yv4(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = new WeakHashMap();
                break;
            case 5:
                break;
            case 9:
                Thread.currentThread();
                this.c = new HashMap();
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public /* synthetic */ yv4(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yv4(fsf fsfVar) {
        this((Object) fsfVar, 0L, (byte) 10);
        this.a = (byte) 10;
    }

    public /* synthetic */ yv4(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public yv4(lp6 lp6Var, long j) {
        this.a = (byte) 6;
        this.c = lp6Var;
        z4o.w(lp6Var.d >= j);
        this.b = j;
    }

    public static long j(yv4 yv4Var, long j, float f) {
        long jE = y8f.e(yv4Var.b, j);
        yv4Var.b = jE;
        float fC = ((fsf) yv4Var.c) == null ? y8f.c(jE) : Math.abs(yv4Var.p(jE));
        if (fC <= 0.0f || fC < f) {
            return 9205357640488583168L;
        }
        fsf fsfVar = (fsf) yv4Var.c;
        long j2 = yv4Var.b;
        if (fsfVar == null) {
            float fC2 = y8f.c(j2);
            return y8f.d(yv4Var.b, y8f.f((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fC2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fC2) & 4294967295L), f));
        }
        float fP = yv4Var.p(j2) - (Math.signum(yv4Var.p(yv4Var.b)) * f);
        long j3 = yv4Var.b;
        fsf fsfVar2 = (fsf) yv4Var.c;
        fsf fsfVar3 = fsf.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fsfVar2 == fsfVar3 ? j3 & 4294967295L : j3 >> 32));
        if (((fsf) yv4Var.c) == fsfVar3) {
            return (Float.floatToRawIntBits(fP) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fP) & 4294967295L);
    }

    @Override // defpackage.gb6
    public final boolean P() {
        return true;
    }

    @Override // defpackage.gb6
    public final long S() {
        return 0L;
    }

    @Override // defpackage.gb6
    public final long V(long j, long j2) {
        return ((xz4) this.c).a;
    }

    @Override // defpackage.gb6
    public final long a(long j, long j2) {
        return ((xz4) this.c).d[(int) j];
    }

    @Override // defpackage.dn8
    public final void advancePeekPosition(int i) {
        ((lp6) this.c).a(i, false);
    }

    public final void d(List list) {
        N.Mu4UeD_8(this.b, list, ((SuggestionProviderBridge) this.c).c);
    }

    public final void e(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        yv4 yv4Var = (yv4) this.c;
        if (yv4Var != null) {
            yv4Var.e(i - 64);
        }
    }

    @Override // defpackage.en8
    public final void endTracks() {
        ((en8) this.c).endTracks();
    }

    public final int f(int i) {
        yv4 yv4Var = (yv4) this.c;
        if (yv4Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(j & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + yv4Var.f(i - 64);
    }

    public final void finalize() throws Throwable {
        switch (this.a) {
            case 5:
                long j = this.b;
                if (j != 0) {
                    N.MQVuDP50(j);
                    break;
                }
                break;
            case 8:
                N.MTsWkgiY(this.b);
                super.finalize();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public final void g() {
        if (((yv4) this.c) == null) {
            this.c = new yv4((byte) 0);
        }
    }

    @Override // defpackage.dn8
    public final long getLength() {
        return ((lp6) this.c).c - this.b;
    }

    @Override // defpackage.dn8
    public final long getPeekPosition() {
        return ((lp6) this.c).getPeekPosition() - this.b;
    }

    @Override // defpackage.dn8
    public final long getPosition() {
        return ((lp6) this.c).d - this.b;
    }

    @Override // defpackage.gb6
    public final long getTimeUs(long j) {
        return ((xz4) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.en8
    public final void h(twi twiVar) {
        ((en8) this.c).h(new i4k(this, twiVar, twiVar));
    }

    public final boolean i(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        g();
        return ((yv4) this.c).i(i - 64);
    }

    @Override // defpackage.gb6
    public final long k(long j, long j2) {
        return 0L;
    }

    public final sql l() {
        long jNanoTime = System.nanoTime();
        HashMap map = (HashMap) this.c;
        sql sqlVar = (sql) map.get("SessionDuration");
        if (sqlVar == null) {
            sqlVar = new sql();
            map.put("SessionDuration", sqlVar);
        }
        this.b = (System.nanoTime() - jNanoTime) + this.b;
        return sqlVar;
    }

    @Override // defpackage.gb6
    public final long m(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.gb6
    public final bjh n(long j) {
        return new bjh(null, ((xz4) this.c).c[(int) j], r6.b[r7]);
    }

    public final void o(int i, boolean z) {
        if (i >= 64) {
            g();
            ((yv4) this.c).o(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            t(i);
        } else {
            e(i);
        }
        if (z2 || ((yv4) this.c) != null) {
            g();
            ((yv4) this.c).o(0, z2);
        }
    }

    public final float p(long j) {
        return Float.intBitsToFloat((int) (((fsf) this.c) == fsf.b ? j >> 32 : j & 4294967295L));
    }

    @Override // defpackage.dn8
    public final void peekFully(byte[] bArr, int i, int i2) {
        ((lp6) this.c).peekFully(bArr, i, i2, false);
    }

    @Override // defpackage.dn8
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        return ((lp6) this.c).peekFully(bArr, i, i2, z);
    }

    public final boolean q(int i) {
        if (i >= 64) {
            g();
            return ((yv4) this.c).q(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight(j3 & (~j4), 1);
        yv4 yv4Var = (yv4) this.c;
        if (yv4Var != null) {
            if (yv4Var.i(0)) {
                t(63);
            }
            ((yv4) this.c).q(0);
        }
        return z;
    }

    @Override // defpackage.gb6
    public final long r(long j, long j2) {
        xz4 xz4Var = (xz4) this.c;
        return tym.f(xz4Var.e, j + this.b, true);
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) {
        return ((lp6) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.dn8
    public final void readFully(byte[] bArr, int i, int i2) throws InterruptedIOException {
        ((lp6) this.c).readFully(bArr, i, i2, false);
    }

    @Override // defpackage.dn8
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        return ((lp6) this.c).readFully(bArr, 0, i2, z);
    }

    @Override // defpackage.dn8
    public final void resetPeekPosition() {
        ((lp6) this.c).f = 0;
    }

    public final void s() {
        this.b = 0L;
        yv4 yv4Var = (yv4) this.c;
        if (yv4Var != null) {
            yv4Var.s();
        }
    }

    @Override // defpackage.dn8
    public final void skipFully(int i) throws InterruptedIOException {
        ((lp6) this.c).h(i, false);
    }

    public final void t(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            g();
            ((yv4) this.c).t(i - 64);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((yv4) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((yv4) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.en8
    public final hyl track(int i, int i2) {
        return ((en8) this.c).track(i, i2);
    }

    @Override // defpackage.gb6
    public final long z(long j) {
        return ((xz4) this.c).a;
    }
}
