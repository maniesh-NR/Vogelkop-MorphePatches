package defpackage;

/* loaded from: classes.dex */
public final class uba {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public uba(long j, long j2, float f, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        String strG = y8f.g(this.b);
        String strG2 = y8f.g(this.d);
        StringBuilder sbQ = sko.q(this.a, "HistoricalChange(uptimeMillis=", ", position=", strG);
        sbQ.append(", scaleFactor=");
        sbQ.append(this.c);
        sbQ.append(", panOffset=");
        sbQ.append(strG2);
        sbQ.append(")");
        return sbQ.toString();
    }
}
