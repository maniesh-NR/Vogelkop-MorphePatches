package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class vc4 {
    public final Context a;
    public final ha4 b;
    public final ha4 c;

    public vc4(Context context) {
        String string;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 35) {
            this.c = new ha4(context);
        }
        ha4 ha4Var = null;
        try {
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 132).services;
            if (serviceInfoArr != null) {
                String str = null;
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    Bundle bundle = serviceInfo.metaData;
                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                        if (str != null) {
                            qp2.n("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                            throw null;
                        }
                        str = string;
                    }
                }
                if (str != null) {
                    try {
                        ha4Var = (ha4) Class.forName(str).getConstructor(Context.class).newInstance(context);
                    } catch (Exception e) {
                        h9o.m("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                        throw null;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.b = ha4Var;
    }
}
