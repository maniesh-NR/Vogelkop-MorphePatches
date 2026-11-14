package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dy1 {
    public static final dy1 a;
    public static final /* synthetic */ dy1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    dy1 EF0;

    static {
        dy1 dy1Var = new dy1(MessageTemplateConstants.Values.OK_TEXT, 0);
        dy1 dy1Var2 = new dy1("NO_CAMERA_PERMISSION", 1);
        a = dy1Var2;
        b = new dy1[]{dy1Var, dy1Var2};
    }

    public static dy1 valueOf(String str) {
        return (dy1) Enum.valueOf(dy1.class, str);
    }

    public static dy1[] values() {
        return (dy1[]) b.clone();
    }
}
