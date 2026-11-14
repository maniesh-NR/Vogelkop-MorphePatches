package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class pvf {
    static {
        qs7.B("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            if (z == z2) {
                qs7.x().getClass();
            } else {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
                qs7.x().getClass();
            }
        } catch (Exception unused) {
            qs7.x().getClass();
        }
    }
}
