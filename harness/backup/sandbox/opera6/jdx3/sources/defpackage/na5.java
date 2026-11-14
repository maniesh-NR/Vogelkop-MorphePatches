package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.MurmurHash3;
import com.opera.android.siteicons.URLColorTable;
import com.opera.android.siteicons.URLFallbackColors$NativeColorResult;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class na5 {
    public static final qs7 a;
    public static final na5 b;
    public static final na5 c;
    public static final na5 d;
    public static final na5 e;
    public static final /* synthetic */ na5[] f;

    static {
        na5 na5Var = new na5("DEFAULT", 0);
        b = na5Var;
        na5 na5Var2 = new na5("DISABLE_ON_DISABLE", 1);
        c = na5Var2;
        na5 na5Var3 = new na5("DISABLE_ON_SURFACE", 2);
        d = na5Var3;
        na5 na5Var4 = new na5("AI_ASSISTANT", 3);
        e = na5Var4;
        f = new na5[]{na5Var, na5Var2, na5Var3, na5Var4};
        a = new qs7((byte) 29);
    }

    public static na5 valueOf(String str) {
        return (na5) Enum.valueOf(na5.class, str);
    }

    public static na5[] values() {
        return (na5[]) f.clone();
    }

    public final oa5 d(Context context) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return new oa5(f03.t(2130969273, context, 2131101243), f03.t(2130969303, context, 2131101243));
        }
        if (iOrdinal == 1) {
            return new oa5(f03.t(2130969263, context, 2131101243), f03.t(2130969115, context, 2131101243));
        }
        if (iOrdinal == 2) {
            return new oa5(f03.t(2130969288, context, 2131101243), f03.t(2130969325, context, 2131101243));
        }
        if (iOrdinal == 3) {
            return new oa5(-16777216, -1);
        }
        h9o.p();
        return null;
    }

    public final oa5 g(Context context, String str) {
        boolean z = true;
        if (ma5.a[ordinal()] != 1) {
            return d(context);
        }
        a.getClass();
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && scheme.length() != 0) {
            z = false;
        }
        if (!z) {
            return URLColorTable.a(str);
        }
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        URLFallbackColors$NativeColorResult uRLFallbackColors$NativeColorResult = (URLFallbackColors$NativeColorResult) N.M1PTv6E7(Math.abs(MurmurHash3.murmurhash3_x86_32(lowerCase.getBytes(StandardCharsets.UTF_8), 0, lowerCase.length(), 33724382) % 10));
        return new oa5(uRLFallbackColors$NativeColorResult.b, uRLFallbackColors$NativeColorResult.a);
    }
}
