package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p8l {
    public static final p8l a;
    public static final p8l b;
    public static final /* synthetic */ p8l[] c;

    static {
        p8l p8lVar = new p8l("SOLID_INSET", 0);
        a = p8lVar;
        p8l p8lVar2 = new p8l("EXTENDED", 1);
        b = p8lVar2;
        c = new p8l[]{p8lVar, p8lVar2};
    }

    public static p8l valueOf(String str) {
        return (p8l) Enum.valueOf(p8l.class, str);
    }

    public static p8l[] values() {
        return (p8l[]) c.clone();
    }
}
