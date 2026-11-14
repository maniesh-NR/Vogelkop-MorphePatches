package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vl3 {
    public static final vl3 a;
    public static final vl3 b;
    public static final vl3 c;
    public static final vl3 d;
    public static final vl3 e;
    public static final vl3 f;
    public static final /* synthetic */ vl3[] g;

    static {
        vl3 vl3Var = new vl3("RESULT_UNKNOWN", 0);
        a = vl3Var;
        vl3 vl3Var2 = new vl3("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = vl3Var2;
        vl3 vl3Var3 = new vl3("RESULT_UPDATED", 2);
        c = vl3Var3;
        vl3 vl3Var4 = new vl3("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = vl3Var4;
        vl3 vl3Var5 = new vl3("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = vl3Var5;
        vl3 vl3Var6 = new vl3("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = vl3Var6;
        g = new vl3[]{vl3Var, vl3Var2, vl3Var3, vl3Var4, vl3Var5, vl3Var6};
    }

    public static vl3[] values() {
        return (vl3[]) g.clone();
    }
}
