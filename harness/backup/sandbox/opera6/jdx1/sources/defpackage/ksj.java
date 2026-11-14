package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ksj {
    public static final ksj a;
    public static final ksj b;
    public static final /* synthetic */ ksj[] c;

    static {
        ksj ksjVar = new ksj("Short", 0);
        a = ksjVar;
        ksj ksjVar2 = new ksj("Long", 1);
        b = ksjVar2;
        c = new ksj[]{ksjVar, ksjVar2, new ksj("Indefinite", 2)};
    }

    public static ksj valueOf(String str) {
        return (ksj) Enum.valueOf(ksj.class, str);
    }

    public static ksj[] values() {
        return (ksj[]) c.clone();
    }
}
