package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jli {
    public static final jli a;
    public static final jli b;
    public static final jli c;
    public static final jli d;
    public static final jli e;
    public static final /* synthetic */ jli[] f;

    static {
        jli jliVar = new jli("TopBar", 0);
        a = jliVar;
        jli jliVar2 = new jli("MainContent", 1);
        b = jliVar2;
        jli jliVar3 = new jli("Snackbar", 2);
        c = jliVar3;
        jli jliVar4 = new jli("Fab", 3);
        d = jliVar4;
        jli jliVar5 = new jli("BottomBar", 4);
        e = jliVar5;
        f = new jli[]{jliVar, jliVar2, jliVar3, jliVar4, jliVar5};
    }

    public static jli valueOf(String str) {
        return (jli) Enum.valueOf(jli.class, str);
    }

    public static jli[] values() {
        return (jli[]) f.clone();
    }
}
