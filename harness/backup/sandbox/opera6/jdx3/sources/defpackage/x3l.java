package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x3l {
    public static final x3l a;
    public static final x3l b;
    public static final /* synthetic */ x3l[] c;

    static {
        x3l x3lVar = new x3l("NORMAL", 0);
        a = x3lVar;
        x3l x3lVar2 = new x3l("INCOGNITO", 1);
        b = x3lVar2;
        c = new x3l[]{x3lVar, x3lVar2};
    }

    public static x3l valueOf(String str) {
        return (x3l) Enum.valueOf(x3l.class, str);
    }

    public static x3l[] values() {
        return (x3l[]) c.clone();
    }
}
