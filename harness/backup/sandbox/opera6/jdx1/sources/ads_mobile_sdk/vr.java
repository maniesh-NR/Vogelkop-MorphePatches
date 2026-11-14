package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.ato;
import defpackage.prb;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class vr implements ato {
    public final Context a;

    public vr(Context context) {
        this.a = context;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            xh3.a("CanOpenAppGmsgHandler not enabled on R+ devices.", null, 6);
            return Unit.a;
        }
        String str = (String) map.get("package_name");
        if (str == null || str.length() == 0) {
            xh3.a("Package name missing in canOpenApp GMSG.", null, 6);
            return Unit.a;
        }
        PackageManager packageManager = this.a.getPackageManager();
        boolean z = (packageManager != null ? packageManager.getLaunchIntentForPackage(str) : null) != null;
        prb prbVar = new prb();
        prbVar.q(str, Boolean.valueOf(z));
        Object objA = cy0Var.a(prbVar, "openableApp", mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 34;
    }
}
