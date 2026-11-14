package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ag2 {
    public static final ag2 a;
    public static final ag2 b;
    public static final ag2 c;
    public static final ag2 d;
    public static final /* synthetic */ ag2[] e;

    static {
        ag2 ag2Var = new ag2("IDLE", 0);
        a = ag2Var;
        ag2 ag2Var2 = new ag2("BUFFERING", 1);
        b = ag2Var2;
        ag2 ag2Var3 = new ag2("READY", 2);
        c = ag2Var3;
        ag2 ag2Var4 = new ag2("ENDED", 3);
        d = ag2Var4;
        e = new ag2[]{ag2Var, ag2Var2, ag2Var3, ag2Var4};
    }

    public static ag2 valueOf(String str) {
        return (ag2) Enum.valueOf(ag2.class, str);
    }

    public static ag2[] values() {
        return (ag2[]) e.clone();
    }
}
