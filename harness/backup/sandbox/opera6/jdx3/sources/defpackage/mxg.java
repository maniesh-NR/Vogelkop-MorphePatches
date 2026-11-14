package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mxg {
    public static final mxg a;
    public static final mxg b;
    public static final /* synthetic */ mxg[] c;

    static {
        mxg mxgVar = new mxg("SUCCESS", 0);
        a = mxgVar;
        mxg mxgVar2 = new mxg("FAILURE", 1);
        b = mxgVar2;
        c = new mxg[]{mxgVar, mxgVar2};
    }

    public static mxg valueOf(String str) {
        return (mxg) Enum.valueOf(mxg.class, str);
    }

    public static mxg[] values() {
        return (mxg[]) c.clone();
    }
}
