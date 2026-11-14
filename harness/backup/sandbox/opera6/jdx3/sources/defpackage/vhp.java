package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vhp {
    public static final vhp b;
    public static final /* synthetic */ vhp[] c;
    public final String a = "http.axx";

    static {
        vhp vhpVar = new vhp();
        b = vhpVar;
        c = new vhp[]{vhpVar};
    }

    public static vhp valueOf(String str) {
        return (vhp) Enum.valueOf(vhp.class, str);
    }

    public static vhp[] values() {
        return (vhp[]) c.clone();
    }
}
