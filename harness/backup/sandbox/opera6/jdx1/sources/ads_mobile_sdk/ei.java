package ads_mobile_sdk;

import android.content.Context;
import defpackage.dvj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ei extends oa3 {
    public final Context d;

    public ei(Context context) {
        super(fw0.CUI_NAME_SDKINIT_INIT_APP_PERMISSIONS, 2);
        this.d = context;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.APP_PERMISSIONS;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        ArrayList arrayList;
        List listB;
        dvj dvjVar = ax0.f;
        Context context = this.d;
        String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        if (strArr == null || (listB = e82.B(strArr)) == null) {
            arrayList = l08.a;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listB) {
                dvj dvjVar2 = ax0.f;
                if (context.checkSelfPermission((String) obj) == 0) {
                    arrayList.add(obj);
                }
            }
        }
        return new hv0(new di(arrayList));
    }
}
