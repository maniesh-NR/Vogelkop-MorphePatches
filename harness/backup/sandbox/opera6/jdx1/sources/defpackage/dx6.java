package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class dx6 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ jx6 a;

    public dx6(jx6 jx6Var) {
        this.a = jx6Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        esf esfVar = jx6.l;
        this.a.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        esf esfVar = jx6.l;
        this.a.e();
    }
}
