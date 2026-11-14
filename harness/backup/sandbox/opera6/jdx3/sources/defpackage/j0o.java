package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j0o {
    public static final j0o a;
    public static final j0o b;
    public static final j0o c;
    public static final j0o d;
    public static final j0o e;
    public static final /* synthetic */ j0o[] f;

    static {
        j0o j0oVar = new j0o("NONE", 0);
        a = j0oVar;
        j0o j0oVar2 = new j0o("SLIDE", 1);
        b = j0oVar2;
        j0o j0oVar3 = new j0o("CROSS_FADE", 2);
        c = j0oVar3;
        j0o j0oVar4 = new j0o("CMP_SLIDE", 3);
        d = j0oVar4;
        j0o j0oVar5 = new j0o("CMP_SLIDE_WHEN_READY", 4);
        e = j0oVar5;
        f = new j0o[]{j0oVar, j0oVar2, j0oVar3, j0oVar4, j0oVar5};
    }

    public static j0o valueOf(String str) {
        return (j0o) Enum.valueOf(j0o.class, str);
    }

    public static j0o[] values() {
        return (j0o[]) f.clone();
    }
}
