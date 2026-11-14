package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oi9 {
    public static final i06 b;
    public static final oi9 c;
    public static final oi9 d;
    public static final oi9 e;
    public static final oi9 f;
    public static final /* synthetic */ oi9[] g;
    public static final /* synthetic */ h58 h;
    public final short a;

    static {
        oi9 oi9Var = new oi9("POPULAR_EVENTS", 0, 0);
        c = oi9Var;
        oi9 oi9Var2 = new oi9("TEAM_FOLLOW", 1, 1);
        d = oi9Var2;
        oi9 oi9Var3 = new oi9("MATCH_FOLLOW", 2, 2);
        e = oi9Var3;
        oi9 oi9Var4 = new oi9("UNKNOWN", 3, 999);
        f = oi9Var4;
        oi9[] oi9VarArr = {oi9Var, oi9Var2, oi9Var3, oi9Var4};
        g = oi9VarArr;
        h = new h58(oi9VarArr);
        b = new i06((byte) 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oi9(String str, int i, int i2) {
        this.a = i2;
    }

    public static oi9 valueOf(String str) {
        return (oi9) Enum.valueOf(oi9.class, str);
    }

    public static oi9[] values() {
        return (oi9[]) g.clone();
    }
}
