package defpackage;

import android.widget.RelativeLayout;
import com.opera.android.media.MediaPlayerBottomSlideLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class cld implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gld b;

    public /* synthetic */ cld(gld gldVar, byte b) {
        this.a = b;
        this.b = gldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gld gldVar = this.b;
        switch (b) {
            case 0:
                if (gldVar.s != null) {
                    gldVar.I0();
                    u02 u02Var = gldVar.s;
                    ((wkd) u02Var.d).j.setActivated(((MediaPlayerBottomSlideLayout) u02Var.b).a);
                    int i = ((MediaPlayerBottomSlideLayout) gldVar.s.b).a() == 1.0f ? 2131232034 : 2131232026;
                    if (i != gldVar.w) {
                        gldVar.w = i;
                        gldVar.E0();
                        break;
                    }
                }
                break;
            default:
                u02 u02Var2 = gldVar.s;
                if (u02Var2 != null) {
                    ((RelativeLayout) ((or2) u02Var2.f).f).setVisibility(0);
                    break;
                }
                break;
        }
    }
}
