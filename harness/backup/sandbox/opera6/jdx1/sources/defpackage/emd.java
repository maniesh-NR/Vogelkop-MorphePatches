package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* loaded from: classes.dex */
public final class emd extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ jmd a;

    public emd(jmd jmdVar) {
        this.a = jmdVar;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.l(routingController);
    }
}
