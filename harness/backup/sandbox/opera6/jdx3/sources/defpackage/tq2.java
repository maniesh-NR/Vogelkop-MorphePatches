package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tq2 {
    public static final tq2 a;
    public static final /* synthetic */ tq2[] b;

    static {
        tq2 tq2Var = new tq2("CARD_DELETED", 0);
        a = tq2Var;
        b = new tq2[]{tq2Var};
    }

    public static tq2 valueOf(String str) {
        return (tq2) Enum.valueOf(tq2.class, str);
    }

    public static tq2[] values() {
        return (tq2[]) b.clone();
    }
}
