package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nan {
    public static final avj b;
    public static final nan c;
    public static final /* synthetic */ nan[] d;
    public static final /* synthetic */ h58 e;
    public final String a;

    static {
        nan nanVar = new nan("Gnosis", 0, "gnosis");
        nan[] nanVarArr = {nanVar, new nan("Vica", 1, "vica")};
        d = nanVarArr;
        e = new h58(nanVarArr);
        b = new avj((byte) 8);
        c = nanVar;
    }

    public nan(String str, int i, String str2) {
        this.a = str2;
    }

    public static nan valueOf(String str) {
        return (nan) Enum.valueOf(nan.class, str);
    }

    public static nan[] values() {
        return (nan[]) d.clone();
    }
}
