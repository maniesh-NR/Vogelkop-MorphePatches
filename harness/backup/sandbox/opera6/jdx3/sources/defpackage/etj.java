package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final /* synthetic */ class etj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gtj b;

    public /* synthetic */ etj(gtj gtjVar, byte b) {
        this.a = b;
        this.b = gtjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gtj gtjVar = this.b;
        switch (b) {
            case 0:
                View view = ((na3) gtjVar.a).i;
                ViewParent parent = view.getParent();
                if (!gtjVar.f && !gtjVar.e && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(view);
                    break;
                }
                break;
            default:
                qv5 layoutParams = ((na3) gtjVar.a).i.getLayoutParams();
                if (layoutParams instanceof qv5) {
                    layoutParams.b((nv5) null);
                    break;
                }
                break;
        }
    }
}
