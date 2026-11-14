package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class wt1 implements zt1 {
    public final ApplicationInfo a;
    public final String b;
    public final String c;
    public final zyk d;

    public wt1(PackageManager packageManager, ApplicationInfo applicationInfo) {
        this.a = applicationInfo;
        this.b = applicationInfo.loadLabel(packageManager).toString();
        this.c = applicationInfo.packageName;
        this.d = z4c.b(new x2((Object) packageManager, (Object) this, (byte) 18));
    }

    @Override // defpackage.zt1
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.zt1
    public final String o() {
        return (String) this.d.getValue();
    }
}
