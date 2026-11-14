package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;

/* loaded from: classes.dex */
public final /* synthetic */ class io4 implements xo4, fjc, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ io4(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        xkg xkgVar = (xkg) obj;
        switch (b) {
            case 5:
                xkgVar.b(f);
                break;
            default:
                xkgVar.setVolume(f);
                break;
        }
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        float f = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 2:
                eigVar.A(f);
                break;
            case 3:
                eigVar.A(f);
                break;
            default:
                eigVar.A(f);
                break;
        }
    }

    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                return remoteMediaClient.setStreamVolume(f);
            default:
                return remoteMediaClient.setPlaybackRate(f);
        }
    }
}
