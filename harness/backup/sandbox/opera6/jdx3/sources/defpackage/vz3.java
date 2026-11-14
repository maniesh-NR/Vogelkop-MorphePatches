package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vz3 {
    public static final vz3 a;
    public static final vz3 b;
    public static final vz3 c;
    public static final vz3 d;
    public static final vz3 e;
    public static final /* synthetic */ vz3[] f;

    static {
        vz3 vz3Var = new vz3("ACTION_BUTTON", 0);
        a = vz3Var;
        vz3 vz3Var2 = new vz3("ANCHOR_VIEW", 1);
        b = vz3Var2;
        vz3 vz3Var3 = new vz3("CANCELLED", 2);
        c = vz3Var3;
        vz3 vz3Var4 = new vz3("CLOSE_BUTTON", 3);
        d = vz3Var4;
        vz3 vz3Var5 = new vz3("FAILED_TO_SHOW", 4);
        e = vz3Var5;
        f = new vz3[]{vz3Var, vz3Var2, vz3Var3, vz3Var4, vz3Var5};
    }

    public static vz3 valueOf(String str) {
        return (vz3) Enum.valueOf(vz3.class, str);
    }

    public static vz3[] values() {
        return (vz3[]) f.clone();
    }
}
