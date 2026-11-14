package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cse {
    public static final cse a;
    public static final cse b;
    public static final cse c;
    public static final /* synthetic */ cse[] d;

    static {
        cse cseVar = new cse("TRUE", 0);
        a = cseVar;
        cse cseVar2 = new cse("FALSE", 1);
        b = cseVar2;
        cse cseVar3 = new cse("UNKNOWN", 2);
        c = cseVar3;
        d = new cse[]{cseVar, cseVar2, cseVar3};
    }

    public static cse valueOf(String str) {
        return (cse) Enum.valueOf(cse.class, str);
    }

    public static cse[] values() {
        return (cse[]) d.clone();
    }
}
