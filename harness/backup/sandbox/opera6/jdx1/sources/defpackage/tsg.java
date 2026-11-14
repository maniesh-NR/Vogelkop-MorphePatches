package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tsg {
    public static final tsg a;
    public static final tsg b;
    public static final /* synthetic */ tsg[] c;

    static {
        tsg tsgVar = new tsg("SRGB", 0);
        a = tsgVar;
        tsg tsgVar2 = new tsg("DISPLAY_P3", 1);
        b = tsgVar2;
        c = new tsg[]{tsgVar, tsgVar2};
    }

    public static tsg valueOf(String str) {
        return (tsg) Enum.valueOf(tsg.class, str);
    }

    public static tsg[] values() {
        return (tsg[]) c.clone();
    }
}
