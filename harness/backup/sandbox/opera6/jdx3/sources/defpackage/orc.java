package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class orc {
    public static final orc a;
    public static final orc b;
    public static final orc c;
    public static final /* synthetic */ orc[] d;

    static {
        orc orcVar = new orc("LOADING", 0);
        a = orcVar;
        orc orcVar2 = new orc("LIVESCORE", 1);
        b = orcVar2;
        orc orcVar3 = new orc("ERROR", 2);
        c = orcVar3;
        d = new orc[]{orcVar, orcVar2, orcVar3};
    }

    public static orc valueOf(String str) {
        return (orc) Enum.valueOf(orc.class, str);
    }

    public static orc[] values() {
        return (orc[]) d.clone();
    }
}
