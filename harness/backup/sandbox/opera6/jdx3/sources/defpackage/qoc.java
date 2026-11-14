package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qoc {
    public static final qoc b;
    public static final qoc c;
    public static final qoc d;
    public static final qoc e;
    public static final /* synthetic */ qoc[] f;
    public static final /* synthetic */ h58 g;
    public final long a;

    static {
        on7 on7Var = pn7.b;
        qoc qocVar = new qoc("REAL_TIME", 0, cs5.x0(60, un7.e));
        b = qocVar;
        qoc qocVar2 = new qoc("HALF_HOURLY", 1, cs5.x0(30, un7.f));
        c = qocVar2;
        qoc qocVar3 = new qoc("HOURLY", 2, cs5.x0(1, un7.g));
        d = qocVar3;
        qoc qocVar4 = new qoc("DAILY", 3, cs5.x0(1, un7.h));
        e = qocVar4;
        qoc[] qocVarArr = {qocVar, qocVar2, qocVar3, qocVar4};
        f = qocVarArr;
        g = new h58(qocVarArr);
    }

    public qoc(String str, int i, long j) {
        this.a = j;
    }

    public static qoc valueOf(String str) {
        return (qoc) Enum.valueOf(qoc.class, str);
    }

    public static qoc[] values() {
        return (qoc[]) f.clone();
    }
}
