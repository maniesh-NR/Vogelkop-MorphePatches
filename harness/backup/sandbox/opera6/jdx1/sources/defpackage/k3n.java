package defpackage;

import android.util.Range;
import android.util.Rational;
import androidx.core.app.NotificationCompat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k3n {
    public static final LinkedHashMap a;

    static {
        fp2 fp2Var = fp2.d;
        Pair pair = new Pair(1, fp2Var);
        fp2 fp2Var2 = fp2.g;
        Pair pair2 = new Pair(2, fp2Var2);
        fp2 fp2Var3 = fp2.h;
        a = rbd.d(new Pair[]{new Pair("video/hevc", rbd.c(new Pair[]{pair, pair2, new Pair(4096, fp2Var3), new Pair(8192, fp2Var3)})), new Pair("video/av01", rbd.c(new Pair[]{new Pair(1, fp2Var), new Pair(2, fp2Var2), new Pair(4096, fp2Var3), new Pair(8192, fp2Var3)})), new Pair("video/x-vnd.on2.vp9", rbd.c(new Pair[]{new Pair(1, fp2Var), new Pair(4, fp2Var2), new Pair(4096, fp2Var3), new Pair(16384, fp2Var3), new Pair(2, fp2Var), new Pair(8, fp2Var2), new Pair(8192, fp2Var3), new Pair(32768, fp2Var3)})), new Pair("video/dolby-vision", rbd.c(new Pair[]{new Pair(Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY), fp2Var2), new Pair(Integer.valueOf(NotificationCompat.FLAG_GROUP_SUMMARY), fp2.e)}))});
    }

    public static ii4 a(s4n s4nVar, Range range) {
        Range range2 = buk.q;
        int iIntValue = Intrinsics.a(range, range2) ? 30 : ((Number) range.getUpper()).intValue();
        s4nVar.getClass();
        if (!Intrinsics.a(range, range2)) {
            String.valueOf(range);
        }
        return new ii4(iIntValue, iIntValue);
    }

    public static final i4n b(gp2 gp2Var, ip7 ip7Var, zrd zrdVar) {
        String str;
        boolean zB = ip7Var.b();
        int i = ip7Var.a;
        String str2 = null;
        if (!zB) {
            n57.e("Dynamic range must be a fully specified dynamic range [provided dynamic range: ", ip7Var, 93);
            return null;
        }
        zrdVar.getClass();
        if (gp2Var == null) {
            str = "video/avc";
            hn2Var = null;
        } else {
            Set set = (Set) op7.b.get(Integer.valueOf(i));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) op7.a.get(Integer.valueOf(ip7Var.b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            for (hn2 hn2Var : gp2Var.d) {
                if (set.contains(Integer.valueOf(hn2Var.j)) && set2.contains(Integer.valueOf(hn2Var.h))) {
                    str = hn2Var.b;
                    if (!"video/avc".equals(str)) {
                        ip7Var.toString();
                    }
                }
            }
            str = "video/avc";
            hn2Var = null;
        }
        if (hn2Var == null) {
            if (i == 1) {
                str2 = "video/avc";
            } else if (i == 3 || i == 4 || i == 5) {
                str2 = "video/hevc";
            } else if (i == 6) {
                str2 = "video/dolby-vision";
            }
            if (str2 == null) {
                throw new UnsupportedOperationException("Unsupported dynamic range: " + ip7Var + "\nNo supported default mime type available.");
            }
            if (gp2Var == null) {
                ip7Var.toString();
            } else {
                ip7Var.toString();
            }
            str = str2;
        }
        return new i4n(str, hn2Var);
    }

    public static final int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        return (int) (new Rational(i8, i9).doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
    }
}
