package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lli {
    public static final lli a;
    public static final lli b;
    public static final /* synthetic */ lli[] c;

    static {
        lli lliVar = new lli("FILL", 0);
        a = lliVar;
        lli lliVar2 = new lli("FIT", 1);
        b = lliVar2;
        c = new lli[]{lliVar, lliVar2};
    }

    public static lli valueOf(String str) {
        return (lli) Enum.valueOf(lli.class, str);
    }

    public static lli[] values() {
        return (lli[]) c.clone();
    }
}
