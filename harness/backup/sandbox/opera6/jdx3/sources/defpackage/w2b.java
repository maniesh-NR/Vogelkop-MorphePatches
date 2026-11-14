package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w2b {
    public static final hv5 b;
    public static final w2b c;
    public static final w2b d;
    public static final w2b e;
    public static final /* synthetic */ w2b[] f;
    public static final /* synthetic */ h58 g;
    public final String a;

    static {
        w2b w2bVar = new w2b("BOOKMARKS_MENU", 0, "bookmarks_menu");
        c = w2bVar;
        w2b w2bVar2 = new w2b("PASSWORDS_MENU", 1, "passwords_menu");
        d = w2bVar2;
        w2b w2bVar3 = new w2b("DEEP_LINK", 2, "deeplink");
        e = w2bVar3;
        w2b[] w2bVarArr = {w2bVar, w2bVar2, w2bVar3};
        f = w2bVarArr;
        g = new h58(w2bVarArr);
        b = new hv5();
    }

    public w2b(String str, int i, String str2) {
        this.a = str2;
    }

    public static w2b valueOf(String str) {
        return (w2b) Enum.valueOf(w2b.class, str);
    }

    public static w2b[] values() {
        return (w2b[]) f.clone();
    }
}
