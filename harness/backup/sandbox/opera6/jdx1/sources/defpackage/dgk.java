package defpackage;

/* loaded from: classes.dex */
public abstract class dgk {
    public hyl b;
    public en8 c;
    public p9f d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final n9f a = new n9f();
    public qsh j = new qsh((byte) 4);

    public void a(long j) {
        this.g = j;
    }

    public long b(g1g g1gVar) {
        byte[] bArr = g1gVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            g1gVar.O(4);
            g1gVar.I();
        }
        int iS0 = cqp.s0(i, g1gVar);
        g1gVar.N(0);
        return iS0;
    }

    public abstract boolean c(g1g g1gVar, long j, qsh qshVar);

    public void d(boolean z) {
        if (z) {
            this.j = new qsh((byte) 4);
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
