package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class z63 implements y63 {
    public float a;
    public final Object b;
    public Object c;
    public Object d;

    public z63(Context context) {
        this.a = 1.0f;
        this.b = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.c = activityManager;
        this.d = new qfb(context.getResources().getDisplayMetrics(), (byte) 11);
        if (activityManager.isLowRamDevice()) {
            this.a = 0.0f;
        }
    }

    public z63(List list) {
        this.d = null;
        this.a = -1.0f;
        this.b = list;
        this.c = a(0.0f);
    }

    public z63(pt1 pt1Var) {
        this.b = pt1Var;
        this.a = ((FrameLayout) pt1Var.b).getResources().getDisplayMetrics().density;
        this.c = new Rect();
        FrameLayout frameLayout = (FrameLayout) pt1Var.b;
        r2n r2nVar = new r2n((Object) this, (byte) 14);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(frameLayout, r2nVar);
    }

    public final zvb a(float f) {
        List list = (List) this.b;
        zvb zvbVar = (zvb) am2.l(1, list);
        if (f >= zvbVar.b()) {
            return zvbVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            zvb zvbVar2 = (zvb) list.get(size);
            if (((zvb) this.c) != zvbVar2 && f >= zvbVar2.b() && f < zvbVar2.a()) {
                return zvbVar2;
            }
        }
        return (zvb) list.get(0);
    }

    public final void b(Rect rect) {
        pt1 pt1Var = (pt1) this.b;
        if (rect.equals((Rect) this.c)) {
            return;
        }
        this.c = rect;
        WebContents webContents = (WebContents) this.d;
        if (webContents != null) {
            float f = rect.left;
            float f2 = this.a;
            webContents.Q(new Rect((int) Math.ceil(f / f2), (int) Math.ceil(rect.top / f2), (int) Math.ceil(rect.right / f2), (int) Math.ceil(rect.bottom / f2)));
        }
        ((v88) pt1Var.d).b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        ((b98) pt1Var.e).b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean f(float f) {
        zvb zvbVar = (zvb) this.d;
        zvb zvbVar2 = (zvb) this.c;
        if (zvbVar == zvbVar2 && this.a == f) {
            return true;
        }
        this.d = zvbVar2;
        this.a = f;
        return false;
    }

    public final zvb h() {
        return (zvb) this.c;
    }

    public final boolean i(float f) {
        zvb zvbVar = (zvb) this.c;
        if (f >= zvbVar.b() && f < zvbVar.a()) {
            return !((zvb) this.c).c();
        }
        this.c = a(f);
        return true;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final float k() {
        return ((zvb) ((List) this.b).get(0)).b();
    }

    public final float u() {
        return ((zvb) am2.l(1, (List) this.b)).a();
    }
}
