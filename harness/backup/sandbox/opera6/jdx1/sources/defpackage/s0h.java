package defpackage;

/* loaded from: classes.dex */
public final class s0h extends h0k {
    public final /* synthetic */ byte a;
    public final long b;
    public final long c;

    public s0h(byte b, long j, long j2) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, g1g g1gVar) {
        long jA = g1gVar.A();
        if ((128 & jA) != 0) {
            return ((((jA & 1) << 32) | g1gVar.C()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.h0k
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return j7c.o(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return j7c.o(this.c, " }", sb2);
        }
    }
}
