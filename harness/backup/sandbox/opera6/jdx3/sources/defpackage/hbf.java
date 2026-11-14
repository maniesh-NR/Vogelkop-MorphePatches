package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hbf {
    public static final hbf a;
    public static final hbf b;
    public static final hbf c;
    public static final hbf d;
    public static final /* synthetic */ hbf[] e;

    static {
        hbf hbfVar = new hbf("START_PAGE", 0);
        a = hbfVar;
        hbf hbfVar2 = new hbf("APPBAR", 1);
        b = hbfVar2;
        hbf hbfVar3 = new hbf("KEYBOARD_SHORTCUT", 2);
        c = hbfVar3;
        hbf hbfVar4 = new hbf("UNKNOWN", 3);
        d = hbfVar4;
        e = new hbf[]{hbfVar, hbfVar2, hbfVar3, hbfVar4};
    }

    public static hbf valueOf(String str) {
        return (hbf) Enum.valueOf(hbf.class, str);
    }

    public static hbf[] values() {
        return (hbf[]) e.clone();
    }
}
