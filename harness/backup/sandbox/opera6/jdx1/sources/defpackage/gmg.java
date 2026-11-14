package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gmg {
    public static final gmg a;
    public static final gmg b;
    public static final gmg c;
    public static final /* synthetic */ gmg[] d;

    static {
        gmg gmgVar = new gmg("Initial", 0);
        a = gmgVar;
        gmg gmgVar2 = new gmg("Main", 1);
        b = gmgVar2;
        gmg gmgVar3 = new gmg("Final", 2);
        c = gmgVar3;
        d = new gmg[]{gmgVar, gmgVar2, gmgVar3};
    }

    public static gmg valueOf(String str) {
        return (gmg) Enum.valueOf(gmg.class, str);
    }

    public static gmg[] values() {
        return (gmg[]) d.clone();
    }
}
