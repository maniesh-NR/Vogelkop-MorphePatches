package defpackage;

import android.content.Context;
import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class fse extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ hd f;

    public /* synthetic */ fse(hd hdVar, byte b) {
        this.e = b;
        this.f = hdVar;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        hd hdVar = this.f;
        switch (b) {
            case 0:
                return new mse(hd.j((Context) hdVar.f), "npt_unsent_token_track_events", 1, jse.m);
            default:
                return new ise(hd.j((Context) hdVar.f), "npt_unsent_push_track_events", 10, hse.d);
        }
    }
}
