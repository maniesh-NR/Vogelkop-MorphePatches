package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j2b {
    public static final wu5 b;
    public static final j2b c;
    public static final j2b d;
    public static final /* synthetic */ j2b[] e;
    public static final /* synthetic */ h58 f;
    public boolean a;

    static {
        j2b j2bVar = new j2b("PASSWORDS", 0, false);
        c = j2bVar;
        j2b j2bVar2 = new j2b("BOOKMARKS", 1, true);
        d = j2bVar2;
        j2b[] j2bVarArr = {j2bVar, j2bVar2};
        e = j2bVarArr;
        f = new h58(j2bVarArr);
        b = new wu5();
    }

    public j2b(String str, int i, boolean z) {
        this.a = z;
    }

    public static j2b valueOf(String str) {
        return (j2b) Enum.valueOf(j2b.class, str);
    }

    public static j2b[] values() {
        return (j2b[]) e.clone();
    }
}
