package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class lgg extends snd {
    public final MediaRouter.RouteInfo a;

    public lgg(MediaRouter.RouteInfo routeInfo) {
        this.a = routeInfo;
    }

    @Override // defpackage.snd
    public final void f(int i) {
        this.a.requestSetVolume(i);
    }

    @Override // defpackage.snd
    public final void i(int i) {
        this.a.requestUpdateVolume(i);
    }
}
