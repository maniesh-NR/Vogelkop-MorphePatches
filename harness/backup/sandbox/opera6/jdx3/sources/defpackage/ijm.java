package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ijm {
    public static final ijm a;
    public static final ijm b;
    public static final /* synthetic */ ijm[] c;

    static {
        ijm ijmVar = new ijm("CRITICAL", 0);
        a = ijmVar;
        ijm ijmVar2 = new ijm("NORMAL", 1);
        b = ijmVar2;
        c = new ijm[]{ijmVar, ijmVar2};
    }

    public static ijm valueOf(String str) {
        return (ijm) Enum.valueOf(ijm.class, str);
    }

    public static ijm[] values() {
        return (ijm[]) c.clone();
    }
}
