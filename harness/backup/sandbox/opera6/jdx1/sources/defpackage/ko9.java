package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ko9 {
    public static final ko9 a;
    public static final ko9 b;
    public static final ko9 c;
    public static final ko9 d;
    public static final /* synthetic */ ko9[] e;

    static {
        ko9 ko9Var = new ko9("STARTED", 0);
        a = ko9Var;
        ko9 ko9Var2 = new ko9("FRAME_INFO_COMPLETE", 1);
        b = ko9Var2;
        ko9 ko9Var3 = new ko9("STREAM_RESULTS_COMPLETE", 2);
        c = ko9Var3;
        ko9 ko9Var4 = new ko9("COMPLETE", 3);
        d = ko9Var4;
        e = new ko9[]{ko9Var, ko9Var2, ko9Var3, ko9Var4};
    }

    public static ko9 valueOf(String str) {
        return (ko9) Enum.valueOf(ko9.class, str);
    }

    public static ko9[] values() {
        return (ko9[]) e.clone();
    }
}
