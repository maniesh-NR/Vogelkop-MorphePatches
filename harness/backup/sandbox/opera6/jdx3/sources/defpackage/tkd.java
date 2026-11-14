package defpackage;

import com.opera.android.media.MediaPlayerActivity;

/* loaded from: classes.dex */
public final class tkd implements eig {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tkd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Activity, com.opera.android.media.MediaPlayerActivity] */
    public final void P(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ?? r1 = (MediaPlayerActivity) obj;
                if (r1.isInPictureInPictureMode()) {
                    r1.q.k((pod) r1.p.d, z);
                    break;
                }
                break;
            default:
                rld rldVar = (rld) obj;
                if (rldVar.requireActivity().isInPictureInPictureMode()) {
                    rldVar.q.k((pod) rldVar.n.d, z);
                    break;
                }
                break;
        }
    }
}
