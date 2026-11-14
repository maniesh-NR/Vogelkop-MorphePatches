package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v65 {
    public static final v65 a;
    public static final v65 b;
    public static final /* synthetic */ v65[] c;

    static {
        v65 v65Var = new v65("PRE_SCREEN_CONSENT", 0);
        a = v65Var;
        v65 v65Var2 = new v65("CONSENT_USERCENTRICS", 1);
        b = v65Var2;
        c = new v65[]{v65Var, v65Var2};
    }

    public static v65 valueOf(String str) {
        return (v65) Enum.valueOf(v65.class, str);
    }

    public static v65[] values() {
        return (v65[]) c.clone();
    }
}
