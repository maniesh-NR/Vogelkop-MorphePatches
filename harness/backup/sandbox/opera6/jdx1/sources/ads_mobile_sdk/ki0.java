package ads_mobile_sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ki0 extends k61 {
    public final Context c;
    public final ah3 d;
    public final PackageManager e;
    public final zyk f;
    public final zyk g;
    public final zyk h;
    public final zyk i;
    public final zyk j;
    public final zyk k;
    public final zyk l;
    public final zyk m;

    public ki0(Context context, ah3 ah3Var) {
        super(fw0.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK, 2);
        this.c = context;
        this.d = ah3Var;
        this.e = context.getPackageManager();
        this.f = z4c.b(new di0(this, (byte) 0));
        this.g = z4c.b(new di0(this, (byte) 3));
        this.h = z4c.b(fi0.a);
        this.i = z4c.b(new di0(this, (byte) 5));
        this.j = z4c.b(new di0(this, (byte) 4));
        this.k = z4c.b(new di0(this, (byte) 1));
        this.l = z4c.b(new ci0(this));
        this.m = z4c.b(new di0(this, (byte) 2));
    }

    public final boolean a(Intent intent) {
        PackageManager packageManager = this.c.getPackageManager();
        if (packageManager != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)).isEmpty()) {
                    return true;
                }
            } else if (!packageManager.queryIntentActivities(intent, 0).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (Intrinsics.a(Environment.getExternalStorageState(), "mounted")) {
            return Build.VERSION.SDK_INT >= 30 || this.c.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return false;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        this.f.getValue();
        this.h.getValue();
        this.g.getValue();
        this.i.getValue();
        this.j.getValue();
        this.k.getValue();
        this.l.getValue();
        this.m.getValue();
        return new hv0(Unit.a);
    }
}
