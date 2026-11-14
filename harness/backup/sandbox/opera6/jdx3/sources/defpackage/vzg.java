package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vzg {
    public static final vzg a;
    public static final vzg b;
    public static final vzg c;
    public static final /* synthetic */ vzg[] d;

    static {
        vzg vzgVar = new vzg("SHOW_INCOGNITO_FOOTER", 0);
        a = vzgVar;
        vzg vzgVar2 = new vzg("SHOW_SITE_SETTINGS", 1);
        b = vzgVar2;
        vzg vzgVar3 = new vzg("HIDE_ALL", 2);
        c = vzgVar3;
        d = new vzg[]{vzgVar, vzgVar2, vzgVar3};
    }

    public static vzg valueOf(String str) {
        return (vzg) Enum.valueOf(vzg.class, str);
    }

    public static vzg[] values() {
        return (vzg[]) d.clone();
    }
}
