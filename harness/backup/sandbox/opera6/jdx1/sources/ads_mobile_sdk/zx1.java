package ads_mobile_sdk;

import android.net.Uri;
import defpackage.ato;
import defpackage.avj;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class zx1 implements ato {
    public final z2 a;
    public final uv2 b;

    public zx1(z2 z2Var, uv2 uv2Var) {
        this.a = z2Var;
        this.b = uv2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("u");
        if (str == null || str.length() == 0) {
            xh3.a("Impression URL in native GMSG is null or empty", null, 6);
            return Unit.a;
        }
        Uri uri = Uri.parse(str);
        Boolean bool = Boolean.TRUE;
        avj avjVar = av2.b;
        uv2 uv2Var = this.b;
        uv2Var.getClass();
        uv2Var.c.a(uri, uv2Var.a, uv2Var.b, this.a, bool);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 56;
    }
}
