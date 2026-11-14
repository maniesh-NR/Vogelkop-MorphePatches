package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oy1 {
    public static final oy1 a;
    public static final oy1 b;
    public static final oy1 c;
    public static final /* synthetic */ oy1[] d;

    static {
        oy1 oy1Var = new oy1(MessageTemplateConstants.Values.OK_TEXT, 0);
        a = oy1Var;
        oy1 oy1Var2 = new oy1("FAILED_TO_DECODE", 1);
        oy1 oy1Var3 = new oy1("IO_ERROR", 2);
        b = oy1Var3;
        oy1 oy1Var4 = new oy1("UNKNOWN", 3);
        c = oy1Var4;
        d = new oy1[]{oy1Var, oy1Var2, oy1Var3, oy1Var4};
    }

    public static oy1 valueOf(String str) {
        return (oy1) Enum.valueOf(oy1.class, str);
    }

    public static oy1[] values() {
        return (oy1[]) d.clone();
    }
}
