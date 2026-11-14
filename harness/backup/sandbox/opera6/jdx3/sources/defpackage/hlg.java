package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hlg {
    public static final hlg a;
    public static final hlg b;
    public static final hlg c;
    public static final hlg d;
    public static final hlg e;
    public static final hlg f;
    public static final hlg g;
    public static final /* synthetic */ hlg[] h;

    static {
        hlg hlgVar = new hlg("N", 0);
        a = hlgVar;
        hlg hlgVar2 = new hlg("I", 1);
        b = hlgVar2;
        hlg hlgVar3 = new hlg("V", 2);
        c = hlgVar3;
        hlg hlgVar4 = new hlg("W", 3);
        d = hlgVar4;
        hlg hlgVar5 = new hlg("F", 4);
        e = hlgVar5;
        hlg hlgVar6 = new hlg("T", 5);
        f = hlgVar6;
        hlg hlgVar7 = new hlg("C", 6);
        g = hlgVar7;
        h = new hlg[]{hlgVar, hlgVar2, hlgVar3, hlgVar4, hlgVar5, hlgVar6, hlgVar7};
    }

    public static hlg valueOf(String str) {
        return (hlg) Enum.valueOf(hlg.class, str);
    }

    public static hlg[] values() {
        return (hlg[]) h.clone();
    }
}
