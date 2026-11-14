package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;

/* loaded from: classes.dex */
public final class a13 extends oa3 {
    public final String d;
    public final qr0 e;
    public final Context f;
    public final ax0 g;
    public final String h;
    public final i41 i;

    public a13(String str, qr0 qr0Var, Context context, ax0 ax0Var, String str2, i41 i41Var) {
        super(fw0.CUI_NAME_SDKINIT_INIT_ENVIRONMENT_SIGNAL, 2);
        this.d = str;
        this.e = qr0Var;
        this.f = context;
        this.g = ax0Var;
        this.h = str2;
        this.i = i41Var;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.SDK_ENV;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        ApplicationInfo applicationInfo = this.f.getApplicationInfo();
        int i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
        qr0 qr0Var = this.e;
        qr0Var.getClass();
        String str = (String) qr0Var.a("gads:sdk_core_constants:caps", "", fo.a$23);
        PackageManager packageManager = this.g.a.getPackageManager();
        boolean zIsInstantApp = packageManager != null ? packageManager.isInstantApp() : false;
        int iMyUid = Process.myUid();
        boolean z = iMyUid == 0 || iMyUid == 1000 || iMyUid == 1001 || iMyUid == 1002 || iMyUid == 1027;
        this.i.a();
        return new hv0(new z03(i, this.d, str, this.h, zIsInstantApp, z));
    }
}
