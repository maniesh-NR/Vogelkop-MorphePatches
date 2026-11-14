package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class utg {
    public static final utg a;
    public static final utg b;
    public static final /* synthetic */ utg[] c;

    static {
        utg utgVar = new utg("PORTRAIT", 0);
        a = utgVar;
        utg utgVar2 = new utg("LANDSCAPE", 1);
        b = utgVar2;
        c = new utg[]{utgVar, utgVar2};
    }

    public static utg valueOf(String str) {
        return (utg) Enum.valueOf(utg.class, str);
    }

    public static utg[] values() {
        return (utg[]) c.clone();
    }
}
