package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yvh {
    public static final yvh b;
    public static final /* synthetic */ yvh[] c;
    public static final /* synthetic */ h58 d;
    public final String a;

    static {
        yvh yvhVar = new yvh(0, "MAX_AD_CONTENT_RATING_UNSPECIFIED", "");
        b = yvhVar;
        yvh[] yvhVarArr = {yvhVar, new yvh(1, "MAX_AD_CONTENT_RATING_G", "G"), new yvh(2, "MAX_AD_CONTENT_RATING_PG", "PG"), new yvh(3, "MAX_AD_CONTENT_RATING_T", "T"), new yvh(4, "MAX_AD_CONTENT_RATING_MA", "MA")};
        c = yvhVarArr;
        d = new h58(yvhVarArr);
    }

    public yvh(int i, String str, String str2) {
        this.a = str2;
    }

    public static yvh[] values() {
        return (yvh[]) c.clone();
    }
}
