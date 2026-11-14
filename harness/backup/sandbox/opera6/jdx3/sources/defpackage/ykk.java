package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ykk {
    public static final ykk a;
    public static final /* synthetic */ ykk[] b;

    static {
        ykk ykkVar = new ykk("GIVEAWAY_EXPIRED", 0);
        a = ykkVar;
        b = new ykk[]{ykkVar};
    }

    public static ykk valueOf(String str) {
        return (ykk) Enum.valueOf(ykk.class, str);
    }

    public static ykk[] values() {
        return (ykk[]) b.clone();
    }
}
