package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ad9 {
    public static final ad9 a;
    public static final ad9 b;
    public static final ad9 c;
    public static final /* synthetic */ ad9[] d;

    static {
        ad9 ad9Var = new ad9("VERIFIED_AND_AUTHENTICATED", 0);
        a = ad9Var;
        ad9 ad9Var2 = new ad9("VERIFICATION_MISSMATCH", 1);
        b = ad9Var2;
        ad9 ad9Var3 = new ad9("AUTHENTICATION_FAILURE", 2);
        c = ad9Var3;
        d = new ad9[]{ad9Var, ad9Var2, ad9Var3};
    }

    public static ad9 valueOf(String str) {
        return (ad9) Enum.valueOf(ad9.class, str);
    }

    public static ad9[] values() {
        return (ad9[]) d.clone();
    }
}
