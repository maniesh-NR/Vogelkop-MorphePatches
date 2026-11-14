package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z04 {

    @NotNull
    public static final z04 a = new z04();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? y04.a.a(30) : 0;
        c = i >= 30 ? y04.a.a(31) : 0;
        d = i >= 30 ? y04.a.a(33) : 0;
        e = i >= 30 ? y04.a.a(1000000) : 0;
    }

    private z04() {
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 36 && x04.a() >= 3600001;
    }

    public static final boolean b(@NotNull String str, @NotNull String str2) {
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            Integer num = Intrinsics.a(str2.toUpperCase(locale), "BAKLAVA") ? num : null;
            num = Intrinsics.a(str.toUpperCase(locale), "BAKLAVA") ? 0 : null;
            if (num != null) {
                if (num == null || num.intValue() >= num.intValue()) {
                    return true;
                }
            } else if (num == null && str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
                return true;
            }
        }
        return false;
    }

    @f37
    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return i >= 33 && b("UpsideDownCake", Build.VERSION.CODENAME);
        }
        return true;
    }

    @f37
    public static final boolean d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            return i >= 34 && b("VanillaIceCream", Build.VERSION.CODENAME);
        }
        return true;
    }
}
