package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p2l {
    public static final p2l a;
    public static final p2l b;
    public static final /* synthetic */ p2l[] c;

    static {
        p2l p2lVar = new p2l("AUTO_SCROLL_TO_INSERTS_OR_ACTIVE", 0);
        a = p2lVar;
        p2l p2lVar2 = new p2l("NONE", 1);
        b = p2lVar2;
        c = new p2l[]{p2lVar, p2lVar2};
    }

    public static p2l valueOf(String str) {
        return (p2l) Enum.valueOf(p2l.class, str);
    }

    public static p2l[] values() {
        return (p2l[]) c.clone();
    }
}
