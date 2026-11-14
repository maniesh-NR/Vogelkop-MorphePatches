package defpackage;

import com.opera.android.media.MediaPlayerActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class rkd implements pa2, m9n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaPlayerActivity b;

    public /* synthetic */ rkd(MediaPlayerActivity mediaPlayerActivity, byte b) {
        this.a = b;
        this.b = mediaPlayerActivity;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.media.MediaPlayerActivity] */
    @Override // defpackage.pa2
    public final void d(boolean z) {
        int i = MediaPlayerActivity.t;
        ?? r1 = this.b;
        if (r1.r) {
            return;
        }
        if (r1.isInPictureInPictureMode()) {
            if (z) {
                r1.G();
            }
        } else if (r1.p != null) {
            r1.F();
        }
    }

    @Override // defpackage.m9n
    public final void j() {
        byte b = this.a;
        MediaPlayerActivity mediaPlayerActivity = this.b;
        switch (b) {
            case 1:
                int i = MediaPlayerActivity.t;
                if (mediaPlayerActivity.p != null) {
                    mediaPlayerActivity.F();
                    break;
                }
                break;
            default:
                int i2 = MediaPlayerActivity.t;
                mediaPlayerActivity.G();
                break;
        }
    }
}
