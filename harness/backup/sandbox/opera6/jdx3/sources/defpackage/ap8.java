package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ap8 {
    public static final wu5 b;
    public static final ap8 c;
    public static final /* synthetic */ ap8[] d;
    public static final /* synthetic */ h58 e;
    public final String a;

    static {
        ap8 ap8Var = new ap8("PORTRAIT", 0, "portrait");
        ap8[] ap8VarArr = {ap8Var, new ap8("LANDSCAPE", 1, "landscape"), new ap8("INTERACTIVE", 2, "interactive")};
        d = ap8VarArr;
        e = new h58(ap8VarArr);
        b = new wu5();
        c = ap8Var;
    }

    public ap8(String str, int i, String str2) {
        this.a = str2;
    }

    public static ap8 valueOf(String str) {
        return (ap8) Enum.valueOf(ap8.class, str);
    }

    public static ap8[] values() {
        return (ap8[]) d.clone();
    }
}
