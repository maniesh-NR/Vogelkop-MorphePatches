package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class br3 {
    public static final br3 a;
    public static final br3 b;
    public static final br3 c;
    public static final br3 d;
    public static final br3 e;
    public static final /* synthetic */ br3[] f;

    static {
        br3 br3Var = new br3("DEFAULT", 0);
        a = br3Var;
        br3 br3Var2 = new br3("FIXED_RECTANGLE", 1);
        b = br3Var2;
        br3 br3Var3 = new br3("FLUID_RECTANGLE", 2);
        c = br3Var3;
        br3 br3Var4 = new br3("FULLSCREEN", 3);
        d = br3Var4;
        br3 br3Var5 = new br3("VIDEO_RECT", 4);
        e = br3Var5;
        f = new br3[]{br3Var, br3Var2, br3Var3, br3Var4, br3Var5};
    }

    public static br3[] values() {
        return (br3[]) f.clone();
    }
}
