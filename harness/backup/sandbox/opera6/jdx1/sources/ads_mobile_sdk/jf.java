package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jf {
    public static final jf a;
    public static final jf b;
    public static final jf c;
    public static final /* synthetic */ jf[] d;

    static {
        jf jfVar = new jf("NO_ANR", 0);
        a = jfVar;
        jf jfVar2 = new jf("EARLY_ANR", 1);
        b = jfVar2;
        jf jfVar3 = new jf("FULL_ANR", 2);
        c = jfVar3;
        d = new jf[]{jfVar, jfVar2, jfVar3};
    }

    public static jf[] values() {
        return (jf[]) d.clone();
    }
}
