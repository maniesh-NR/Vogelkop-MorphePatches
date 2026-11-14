package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yrm {
    public static final yrm a;
    public static final yrm b;
    public static final yrm c;
    public static final /* synthetic */ yrm[] d;
    public static final /* synthetic */ h58 e;

    static {
        yrm yrmVar = new yrm("SESSION_CONFIG", 0);
        a = yrmVar;
        yrm yrmVar2 = new yrm("DEFAULT", 1);
        b = yrmVar2;
        yrm yrmVar3 = new yrm("CAMERA2_CAMERA_CONTROL", 2);
        c = yrmVar3;
        yrm[] yrmVarArr = {yrmVar, yrmVar2, yrmVar3};
        d = yrmVarArr;
        e = new h58(yrmVarArr);
    }

    public static yrm valueOf(String str) {
        return (yrm) Enum.valueOf(yrm.class, str);
    }

    public static yrm[] values() {
        return (yrm[]) d.clone();
    }
}
