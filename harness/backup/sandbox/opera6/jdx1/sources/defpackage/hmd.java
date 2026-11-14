package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class hmd extends MediaRouter2$RouteCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jmd b;

    public /* synthetic */ hmd(jmd jmdVar, byte b) {
        this.a = b;
        this.b = jmdVar;
    }

    public final void onRoutesAdded(List list) {
        switch (this.a) {
            case 0:
                this.b.k();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public final void onRoutesChanged(List list) {
        switch (this.a) {
            case 0:
                this.b.k();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public final void onRoutesRemoved(List list) {
        switch (this.a) {
            case 0:
                this.b.k();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public final void onRoutesUpdated(List list) {
        switch (this.a) {
            case 1:
                this.b.k();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
