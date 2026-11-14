package defpackage;

import android.content.Context;
import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public class by0 {
    public static final /* synthetic */ by0[] f;
    public static final /* synthetic */ h58 g;
    public final byte a;
    public final EnumSet b;
    public final boolean c;
    public final Integer d;
    public final Integer e;

    static {
        yx0 yx0Var = yx0.g;
        yx0 yx0Var2 = yx0.h;
        by0 by0Var = new by0("SUMMARIZE", 0, 30, EnumSet.of(yx0Var, yx0Var2), 2132017491, null, 20);
        yx0 yx0Var3 = yx0.i;
        by0 by0Var2 = new by0("TELL_ME_MORE", 1, 31, EnumSet.of(yx0Var, yx0Var3), 2132017499, null, 20);
        by0 by0Var3 = new by0("EXPLAIN", 2, 27, EnumSet.of(yx0Var, yx0Var3), 2132017428, null, 20);
        yx0 yx0Var4 = yx0.b;
        by0 by0Var4 = new by0("DESCRIBE_IMAGES", 3, 27, EnumSet.of(yx0Var4), null, 2131886082, 12);
        by0 by0Var5 = new by0("EXTRACT_IMAGE_TEXT", 4, 27, EnumSet.of(yx0Var4), null, 2131886083, 12);
        by0 by0Var6 = new by0("TRANSLATE_IMAGE_TEXT", 5, 27, EnumSet.of(yx0Var4), 2132017501, null, 16);
        yx0 yx0Var5 = yx0.c;
        ay0 ay0Var = new ay0("TRANSLATE_TO_LANGUAGE", 6, 27, EnumSet.of(yx0Var5, yx0Var, yx0Var2, yx0Var3), 2132017502, null, 16);
        yx0 yx0Var6 = yx0.d;
        yx0 yx0Var7 = yx0.f;
        by0 by0Var7 = new by0("SUMMARIZE_FILES", 7, 27, EnumSet.of(yx0Var5, yx0Var6, yx0Var7), null, 2131886084, 12);
        by0 by0Var8 = new by0("ANALYZE_CONTENT", 8, 27, EnumSet.of(yx0Var5, yx0Var6, yx0Var7), 2132017404, null, 20);
        by0 by0Var9 = new by0("EXTRACT_KEY_INFORMATION", 9, 27, EnumSet.of(yx0Var5, yx0Var6, yx0Var7), 2132017430, null, 20);
        yx0 yx0Var8 = yx0.e;
        by0[] by0VarArr = {by0Var, by0Var2, by0Var3, by0Var4, by0Var5, by0Var6, ay0Var, by0Var7, by0Var8, by0Var9, new by0("SUMMARIZE_PAGE", 10, 27, EnumSet.of(yx0Var8), 2132017492, null, 20), new zx0("TRANSLATE_PAGE", 11, 27, EnumSet.of(yx0Var8), null, null, 28)};
        f = by0VarArr;
        g = new h58(by0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public by0(String str, int i, int i2, EnumSet enumSet, Integer num, Integer num2, int i3) {
        boolean z = (i3 & 4) == 0;
        num = (i3 & 8) != 0 ? null : num;
        num2 = (i3 & 16) != 0 ? null : num2;
        this.a = i2;
        this.b = enumSet;
        this.c = z;
        this.d = num;
        this.e = num2;
    }

    public static by0 valueOf(String str) {
        return (by0) Enum.valueOf(by0.class, str);
    }

    public static by0[] values() {
        return (by0[]) f.clone();
    }

    public String d(int i, Context context) {
        Integer num = this.d;
        if (num != null) {
            return context.getString(num.intValue());
        }
        Integer num2 = this.e;
        if (num2 == null) {
            return "";
        }
        return context.getResources().getQuantityString(num2.intValue(), i);
    }
}
