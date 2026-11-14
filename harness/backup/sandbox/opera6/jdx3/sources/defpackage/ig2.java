package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ig2 extends f3d {
    public final int I;
    public boolean J;
    public int K = -1;

    public ig2(Context context, int i) {
        this.I = i;
        ((f3d) this).b.setRepeatCount(-1);
        u2d.e(context, 2131951673, u2d.j(2131951673, context)).b(new hg2(this, (byte) 0));
        dvb dvbVar = new dvb(new String[]{"**", "fill color", "**"});
        PointF pointF = k3d.a;
        a(dvbVar, 1, new va2(this, (byte) 2));
    }

    public final int getIntrinsicHeight() {
        return this.I;
    }

    public final int getIntrinsicWidth() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(p2d p2dVar) {
        if (!super.o(p2dVar)) {
            return false;
        }
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return true;
        }
        callback.invalidateDrawable(this);
        return true;
    }
}
