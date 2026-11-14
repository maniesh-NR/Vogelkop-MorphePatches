package defpackage;

import android.content.Context;
import androidx.webkit.WebViewCompat;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class fcp {
    public static volatile c30 c;
    public static volatile Boolean d;
    public static final zyk a = z4c.b(xvo.s);
    public static final boolean b = true;
    public static final zyk e = z4c.b(xvo.r);

    public static final Unit a(cn cnVar) {
        if (b) {
            return Unit.a;
        }
        pfp.a(new xbp(cnVar, (byte) 1));
        return null;
    }

    public static final Unit b(cn cnVar, Context context) {
        if (e(context)) {
            return Unit.a;
        }
        pfp.a(new xbp(cnVar, (byte) 2));
        return null;
    }

    public static final Unit c(cn cnVar, String str) {
        if (str != null && !StringsKt.N(str)) {
            return Unit.a;
        }
        pfp.a(new xbp(cnVar, (byte) 0));
        return null;
    }

    public static final rpb d() {
        return (rpb) e.getValue();
    }

    public static final boolean e(Context context) {
        Boolean q0iVar;
        Set set = tlp.a;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = Boolean.valueOf(WebViewCompat.getCurrentWebViewPackage(context) != null);
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        Boolean bool = Boolean.FALSE;
        if (q0iVar instanceof q0i) {
            q0iVar = bool;
        }
        if (q0iVar.booleanValue()) {
            String str = lah.b;
            if (str != null) {
                String strH0 = StringsKt.h0(str, ".");
                Integer intOrNull = strH0 != null ? StringsKt.toIntOrNull(strH0) : null;
                if (intOrNull == null || intOrNull.intValue() < 63) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String f() {
        return (String) a.getValue();
    }
}
