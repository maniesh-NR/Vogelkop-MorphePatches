package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fvg {
    public static final fvg a;
    public static final fvg b;
    public static final /* synthetic */ fvg[] c;

    static {
        fvg fvgVar = new fvg("LOADING", 0);
        a = fvgVar;
        fvg fvgVar2 = new fvg("LIST", 1);
        b = fvgVar2;
        c = new fvg[]{fvgVar, fvgVar2};
    }

    public static fvg valueOf(String str) {
        return (fvg) Enum.valueOf(fvg.class, str);
    }

    public static fvg[] values() {
        return (fvg[]) c.clone();
    }
}
