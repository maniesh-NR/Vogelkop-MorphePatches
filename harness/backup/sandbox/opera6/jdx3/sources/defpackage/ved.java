package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ved {
    public static final ved a;
    public static final ved b;
    public static final /* synthetic */ ved[] c;

    static {
        ved vedVar = new ved("Regular", 0);
        a = vedVar;
        ved vedVar2 = new ved("Medium", 1);
        b = vedVar2;
        c = new ved[]{vedVar, vedVar2, new ved("SemiBold", 2)};
    }

    public static ved valueOf(String str) {
        return (ved) Enum.valueOf(ved.class, str);
    }

    public static ved[] values() {
        return (ved[]) c.clone();
    }
}
