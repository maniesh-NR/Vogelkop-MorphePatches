package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class iod extends MediaRouter.VolumeCallback {
    public final kgg a;

    public iod(kgg kggVar) {
        this.a = kggVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        ngg nggVarM = kgg.m(routeInfo);
        if (nggVarM != null) {
            nggVarM.a.j(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.getClass();
        ngg nggVarM = kgg.m(routeInfo);
        if (nggVarM != null) {
            nggVarM.a.k(i);
        }
    }
}
