package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vt8 {
    public static final vt8 a;
    public static final vt8 b;
    public static final vt8 c;
    public static final vt8 d;
    public static final /* synthetic */ vt8[] e;
    public static final /* synthetic */ h58 f;

    static {
        vt8 vt8Var = new vt8("DYNAMIC_RANGE", 0);
        a = vt8Var;
        vt8 vt8Var2 = new vt8("FPS_RANGE", 1);
        b = vt8Var2;
        vt8 vt8Var3 = new vt8("VIDEO_STABILIZATION", 2);
        c = vt8Var3;
        vt8 vt8Var4 = new vt8("IMAGE_FORMAT", 3);
        d = vt8Var4;
        vt8[] vt8VarArr = {vt8Var, vt8Var2, vt8Var3, vt8Var4, new vt8("RECORDING_QUALITY", 4)};
        e = vt8VarArr;
        f = new h58(vt8VarArr);
    }

    public static vt8 valueOf(String str) {
        return (vt8) Enum.valueOf(vt8.class, str);
    }

    public static vt8[] values() {
        return (vt8[]) e.clone();
    }
}
