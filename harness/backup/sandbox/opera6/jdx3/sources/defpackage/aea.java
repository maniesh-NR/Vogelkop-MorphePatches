package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aea {
    public static final aea a;
    public static final aea b;
    public static final /* synthetic */ aea[] c;

    static {
        aea aeaVar = new aea("WEB", 0);
        a = aeaVar;
        aea aeaVar2 = new aea("AI", 1);
        b = aeaVar2;
        c = new aea[]{aeaVar, aeaVar2};
    }

    public static aea valueOf(String str) {
        return (aea) Enum.valueOf(aea.class, str);
    }

    public static aea[] values() {
        return (aea[]) c.clone();
    }
}
