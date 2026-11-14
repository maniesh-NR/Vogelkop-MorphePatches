package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import defpackage.avj;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class kj0 {
    public final g0 a;
    public final qr0 b;
    public final PowerManager c;
    public final KeyguardManager d;

    public kj0(Context context, g0 g0Var, qr0 qr0Var) {
        this.a = g0Var;
        this.b = qr0Var;
        this.c = (PowerManager) context.getSystemService(PowerManager.class);
        this.d = (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public final Display a(Context context) {
        Context contextC = c(context);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                return contextC.getDisplay();
            } catch (Exception e) {
                vr3 vr3Var = xu0.a;
                xu0.a("Unable to get display: " + e.getMessage(), null, 6);
            }
        }
        return this.b(contextC).getDefaultDisplay();
    }

    public final boolean a(av2 av2Var, a2 a2Var) {
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        avj avjVar = av2.b;
        if (((List) qr0Var.a("gads:lock_screen_viewable_formats", Collections.singletonList("native"), fo.a$15)).contains(av2Var.a)) {
            return true;
        }
        return ((Boolean) qr0Var.a("gads:lockscreen_display_allowlist", Boolean.TRUE, fo.a)).booleanValue() && a2Var.B;
    }

    public final boolean a(View view, boolean z) {
        if (this.c.isInteractive() && view.getVisibility() == 0 && view.isShown() && view.getLocalVisibleRect(new Rect()) && view.getGlobalVisibleRect(new Rect())) {
            return z || !this.d.isKeyguardLocked();
        }
        return false;
    }

    public final WindowManager b(Context context) {
        return (WindowManager) c(context).getSystemService(WindowManager.class);
    }

    public final Context c(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            return activity;
        }
        Activity activityB = this.a.b();
        return activityB != null ? activityB : context;
    }
}
