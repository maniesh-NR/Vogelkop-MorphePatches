package defpackage;

import com.opera.android.media.MediaPlayerActivity;

/* loaded from: classes.dex */
public final class skd implements rjg {
    public final /* synthetic */ MediaPlayerActivity a;

    public skd(MediaPlayerActivity mediaPlayerActivity) {
        this.a = mediaPlayerActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, com.opera.android.media.MediaPlayerActivity] */
    @Override // defpackage.rjg
    public final void d(sjg sjgVar) {
        ?? r0 = this.a;
        if (r0.r) {
            return;
        }
        r0.finishAndRemoveTask();
    }
}
