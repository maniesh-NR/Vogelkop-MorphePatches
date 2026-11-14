package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qdf {
    public static final /* synthetic */ qdf[] b;
    public static final /* synthetic */ h58 c;
    public final int a;

    static {
        qdf[] qdfVarArr = {new qdf("ENTERTAINMENT", 0, 2132019342), new qdf("AI", 1, 2132019341), new qdf("SPORTS", 2, 2132019344), new qdf("SHOPPING", 3, 2132019343), new qdf("TRAVELING", 4, 2132019345)};
        b = qdfVarArr;
        c = new h58(qdfVarArr);
    }

    public qdf(String str, int i, int i2) {
        this.a = i2;
    }

    public static qdf valueOf(String str) {
        return (qdf) Enum.valueOf(qdf.class, str);
    }

    public static qdf[] values() {
        return (qdf[]) b.clone();
    }
}
