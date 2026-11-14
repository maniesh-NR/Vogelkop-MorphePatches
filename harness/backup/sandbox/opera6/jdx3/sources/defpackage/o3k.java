package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o3k {
    public static final o3k a;
    public static final o3k b;
    public static final o3k c;
    public static final o3k d;
    public static final o3k e;
    public static final o3k f;
    public static final /* synthetic */ o3k[] g;

    static {
        o3k o3kVar = new o3k("HOME", 0);
        a = o3kVar;
        o3k o3kVar2 = new o3k("BACK", 1);
        b = o3kVar2;
        o3k o3kVar3 = new o3k("FORWARD", 2);
        c = o3kVar3;
        o3k o3kVar4 = new o3k("TAB_GALLERY", 3);
        d = o3kVar4;
        o3k o3kVar5 = new o3k("MAIN_MENU", 4);
        e = o3kVar5;
        o3k o3kVar6 = new o3k("PAGE_MENU", 5);
        f = o3kVar6;
        g = new o3k[]{o3kVar, o3kVar2, o3kVar3, o3kVar4, o3kVar5, o3kVar6};
    }

    public static o3k valueOf(String str) {
        return (o3k) Enum.valueOf(o3k.class, str);
    }

    public static o3k[] values() {
        return (o3k[]) g.clone();
    }
}
