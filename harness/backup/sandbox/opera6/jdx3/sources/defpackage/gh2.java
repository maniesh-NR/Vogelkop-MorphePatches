package defpackage;

import android.app.Application;
import android.os.SystemClock;
import android.view.View;
import android.widget.RelativeLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.PushedContentHandler;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.settings.cleardata.OnboardingProfileReset;
import org.chromium.device.geolocation.LocationProviderAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class gh2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gh2(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                mi8 mi8Var = (mi8) ((pad) obj).c;
                String str = tym.a;
                qi8 qi8Var = mi8Var.a;
                if (qi8Var.f0 != z) {
                    qi8Var.f0 = z;
                    qi8Var.n.i(23, new go4((byte) 4, z));
                    break;
                }
                break;
            case 1:
                int i = BrowserActivity.E1;
                ((BrowserActivity) obj).z1(1000L, 0L, this.b);
                break;
            case 2:
                BubbleView bubbleView = (BubbleView) obj;
                int i2 = BubbleView.D;
                bubbleView.x = false;
                lz3 lz3Var = bubbleView.w;
                if (lz3Var != null) {
                    lz3Var.c(z);
                    break;
                }
                break;
            case 3:
                ((LocationProviderAdapter) obj).a.a(z);
                break;
            case 4:
                u02 u02Var = ((gld) obj).s;
                if (u02Var != null) {
                    ((RelativeLayout) ((or2) u02Var.f).f).setVisibility(z ? 0 : 4);
                    break;
                }
                break;
            case 5:
                View view = ((fge) obj).D;
                if (view != null && !z) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 6:
                ((bx7) obj).a(z);
                break;
            case 7:
                ((OnboardingProfileReset.Request) obj).b.run(Boolean.valueOf(z));
                break;
            case 8:
                ((PushedContentHandler) obj).d(true, z);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                PushedContentHandler.Request request = (PushedContentHandler.Request) obj;
                PushedContentHandler.this.e(SystemClock.elapsedRealtime() - request.a, z);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                rgh rghVar = (rgh) obj;
                rghVar.n(rghVar.j(z, false), z);
                break;
            case 11:
                ((jlj) obj).c(z);
                break;
            case 12:
                jqk jqkVar = (jqk) ((km5) obj).d;
                jqkVar.h = null;
                jqkVar.d.k(jqkVar.f, jqkVar.e, z);
                break;
            case 13:
                k8 k8Var = (k8) obj;
                boolean zIsEnabled = k8Var.isEnabled();
                crk crkVar = (crk) k8Var.b;
                int iW = k8Var.W();
                wrl wrlVar = (wrl) crkVar.b;
                h73 h73Var = wrlVar.b;
                if (iW == 0) {
                    h73Var.l.c0(mh0.E);
                } else if (iW == 1) {
                    h73Var.l.c0(mh0.w);
                } else if (iW == 2) {
                    h73Var.l.c0(mh0.c);
                } else if (iW == 3) {
                    h73Var.l.c0(mh0.m);
                }
                if (z && zIsEnabled) {
                    if (iW == 0) {
                        h73Var.a.b.e(new vfn(2, null, 2), false);
                        break;
                    } else if (iW == 3) {
                        f7d f7dVar = h73Var.a;
                        f7dVar.getClass();
                        f7dVar.b.e(new exe(2, (oba) null), false);
                        break;
                    }
                }
                if (zIsEnabled) {
                    wrlVar.h.f(new tg7(wrlVar, iW));
                    break;
                }
                break;
            default:
                jno jnoVar = jno.a;
                jno.a((Application) obj, z);
                break;
        }
    }
}
