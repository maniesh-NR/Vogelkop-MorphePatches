package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t12 {
    public static final t12 a;
    public static final t12 b;
    public static final t12 c;
    public static final t12 d;
    public static final /* synthetic */ t12[] e;

    static {
        t12 t12Var = new t12(MessageTemplateConstants.Values.OK_TEXT, 0);
        a = t12Var;
        t12 t12Var2 = new t12("FAILED_TO_DECODE", 1);
        b = t12Var2;
        t12 t12Var3 = new t12("IO_ERROR", 2);
        c = t12Var3;
        t12 t12Var4 = new t12("UNKNOWN", 3);
        d = t12Var4;
        e = new t12[]{t12Var, t12Var2, t12Var3, t12Var4};
    }

    public static t12 valueOf(String str) {
        return (t12) Enum.valueOf(t12.class, str);
    }

    public static t12[] values() {
        return (t12[]) e.clone();
    }
}
