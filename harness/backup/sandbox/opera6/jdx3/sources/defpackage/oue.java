package defpackage;

import android.content.Context;
import java.util.Map;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class oue {
    public static final long b;
    public final nv6 a;

    static {
        on7 on7Var = pn7.b;
        b = cs5.x0(7, un7.h);
    }

    public oue(Context context, umi umiVar) {
        nv6 nv6Var = new nv6();
        pd7 pd7Var = new pd7(context, umiVar);
        nv6Var.a = pd7Var;
        pd7Var.h();
        this.a = nv6Var;
    }

    public final boolean a(GURL gurl) {
        String strC = !gurl.b ? null : gurl.c();
        if (strC != null) {
            pd7 pd7Var = (pd7) this.a.a;
            Map map = pd7Var.n;
            if (map == null) {
                pd7Var.i();
                map = pd7Var.n;
            }
            od7 od7Var = (od7) map.get(strC);
            if (od7Var != null) {
                if (od7Var.a > System.currentTimeMillis()) {
                    return true;
                }
                map.remove(strC);
                return false;
            }
        }
        return false;
    }
}
