package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nl3 {
    public static final ulp b;
    public static final nl3 c;
    public static final nl3 d;
    public static final nl3 e;
    public static final nl3 f;
    public static final /* synthetic */ nl3[] g;
    public static final /* synthetic */ h58 h;
    public final int a;

    static {
        b3b[] b3bVarArr = b3b.a;
        nl3 nl3Var = new nl3("SYNC_PASSPHRASE_ERROR", 0, -1);
        nl3 nl3Var2 = new nl3("DOWNLOAD_LOCATION_ERROR", 1, -2);
        nl3 nl3Var3 = new nl3("TIMEOUT_ERROR", 2, -3);
        c = nl3Var3;
        nl3 nl3Var4 = new nl3("DOWNLOAD_NO_SPACE_ERROR", 3, -4);
        nl3 nl3Var5 = new nl3("DOWNLOAD_FILE_NAME_ERROR", 4, -5);
        nl3 nl3Var6 = new nl3("DOWNLOAD_FILE_NOT_EXIST_ERROR", 5, -6);
        nl3 nl3Var7 = new nl3("UNKNOWN_ERROR", 6, 0);
        d = nl3Var7;
        nl3 nl3Var8 = new nl3("NATIVE_ERROR", 7, 1);
        e = nl3Var8;
        nl3 nl3Var9 = new nl3("NO_BOOKMARKS_FILE_ERROR", 8, 2);
        f = nl3Var9;
        nl3[] nl3VarArr = {nl3Var, nl3Var2, nl3Var3, nl3Var4, nl3Var5, nl3Var6, nl3Var7, nl3Var8, nl3Var9};
        g = nl3VarArr;
        h = new h58(nl3VarArr);
        b = new ulp((byte) 24);
    }

    public nl3(String str, int i, int i2) {
        this.a = i2;
    }

    public static nl3 valueOf(String str) {
        return (nl3) Enum.valueOf(nl3.class, str);
    }

    public static nl3[] values() {
        return (nl3[]) g.clone();
    }
}
