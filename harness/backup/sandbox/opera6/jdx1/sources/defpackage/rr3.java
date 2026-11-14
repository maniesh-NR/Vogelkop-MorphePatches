package defpackage;

/* loaded from: classes.dex */
public final class rr3 {
    public final /* synthetic */ byte a;
    public long b;
    public long c;

    public rr3() {
        this.a = (byte) 5;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public /* synthetic */ rr3(byte b, long j, long j2) {
        this.a = b;
        this.b = j;
        this.c = j2;
    }

    public rr3(long j, long j2, int i) {
        this.a = (byte) 2;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }
}
