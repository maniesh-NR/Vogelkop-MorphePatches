package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aze {
    public static final aze a;
    public static final aze b;
    public static final /* synthetic */ aze[] c;

    static {
        aze azeVar = new aze("Width", 0);
        a = azeVar;
        aze azeVar2 = new aze("Height", 1);
        b = azeVar2;
        c = new aze[]{azeVar, azeVar2};
    }

    public static aze valueOf(String str) {
        return (aze) Enum.valueOf(aze.class, str);
    }

    public static aze[] values() {
        return (aze[]) c.clone();
    }
}
