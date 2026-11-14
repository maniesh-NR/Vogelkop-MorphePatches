package androidx.mediarouter.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cnd;
import defpackage.dod;
import defpackage.ff;
import defpackage.vnd;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends ff {
    public vnd d;
    public final cnd e;
    public MediaRouteButton f;

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.d = vnd.c;
        this.e = cnd.a;
        dod.d(context);
    }

    @Override // defpackage.ff
    public final View c() {
        MediaRouteButton mediaRouteButton = new MediaRouteButton(this.a, null);
        this.f = mediaRouteButton;
        if (true != mediaRouteButton.o) {
            mediaRouteButton.o = true;
            mediaRouteButton.g();
        }
        this.f.d(this.d);
        MediaRouteButton mediaRouteButton2 = this.f;
        cnd cndVar = this.e;
        if (cndVar != null) {
            mediaRouteButton2.d = cndVar;
            mediaRouteButton2.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
            return this.f;
        }
        mediaRouteButton2.getClass();
        qp2.o("factory must not be null");
        return null;
    }

    @Override // defpackage.ff
    public final boolean e() {
        MediaRouteButton mediaRouteButton = this.f;
        if (mediaRouteButton != null) {
            return mediaRouteButton.e();
        }
        return false;
    }
}
