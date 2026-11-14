package defpackage;

/* loaded from: classes.dex */
public abstract class cfa implements Comparable {
    public final String a;
    public final bfa b;
    public final long c;
    public final int d;
    public final long e;
    public final vl7 f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public cfa(String str, bfa bfaVar, long j, int i, long j2, vl7 vl7Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = bfaVar;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = vl7Var;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.e;
        if (j > jLongValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
