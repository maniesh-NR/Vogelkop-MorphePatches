package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j9l {
    public static final j9l a;
    public static final j9l b;
    public static final j9l c;
    public static final j9l d;
    public static final /* synthetic */ j9l[] e;

    static {
        j9l j9lVar = new j9l("SHOWING", 0);
        a = j9lVar;
        j9l j9lVar2 = new j9l("ANIMATIONS_BEFORE_HIDING", 1);
        b = j9lVar2;
        j9l j9lVar3 = new j9l("HIDING", 2);
        c = j9lVar3;
        j9l j9lVar4 = new j9l("HIDDEN", 3);
        d = j9lVar4;
        e = new j9l[]{j9lVar, j9lVar2, j9lVar3, j9lVar4};
    }

    public static j9l valueOf(String str) {
        return (j9l) Enum.valueOf(j9l.class, str);
    }

    public static j9l[] values() {
        return (j9l[]) e.clone();
    }
}
