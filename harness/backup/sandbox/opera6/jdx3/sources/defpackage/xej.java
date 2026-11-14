package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xej {
    public static final xej b;
    public static final /* synthetic */ xej[] c;
    public static final /* synthetic */ h58 d;
    public final String a;

    static {
        xej xejVar = new xej("TOO_LONG", 0, "File too large.");
        xej xejVar2 = new xej("INVALID_MIMETYPE", 1, "Invalid mimetype");
        xej xejVar3 = new xej("UNKNOWN_IMAGE_FORMAT", 2, "Unrecognized image format");
        xej xejVar4 = new xej("USER_LIMIT_REACHED", 3, "User limit reached");
        b = xejVar4;
        xej[] xejVarArr = {xejVar, xejVar2, xejVar3, xejVar4};
        c = xejVarArr;
        d = new h58(xejVarArr);
    }

    public xej(String str, int i, String str2) {
        this.a = str2;
    }

    public static xej valueOf(String str) {
        return (xej) Enum.valueOf(xej.class, str);
    }

    public static xej[] values() {
        return (xej[]) c.clone();
    }
}
