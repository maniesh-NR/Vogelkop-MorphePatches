package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nil {
    public static final nil b;
    public static final nil c;
    public static final /* synthetic */ nil[] d;
    public static final /* synthetic */ h58 e;
    public final String a;

    static {
        nil nilVar = new nil("DEFAULT", 0, null);
        b = nilVar;
        nil nilVar2 = new nil("ANTON", 1, "Anton");
        c = nilVar2;
        nil[] nilVarArr = {nilVar, nilVar2};
        d = nilVarArr;
        e = new h58(nilVarArr);
    }

    public nil(String str, int i, String str2) {
        this.a = str2;
    }

    public static nil valueOf(String str) {
        return (nil) Enum.valueOf(nil.class, str);
    }

    public static nil[] values() {
        return (nil[]) d.clone();
    }
}
