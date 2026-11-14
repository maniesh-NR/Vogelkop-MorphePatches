package defpackage;

import com.opera.android.media.MediaPlayerActivity;

/* loaded from: classes.dex */
public final class ukd implements as6, Runnable {
    public boolean a;
    public final /* synthetic */ MediaPlayerActivity b;

    public ukd(MediaPlayerActivity mediaPlayerActivity, tcc tccVar) {
        this.b = mediaPlayerActivity;
        vml.d(this, 500L);
        tccVar.a(this);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        if (this.a) {
            return;
        }
        vml.a(this);
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        if (this.a) {
            return;
        }
        vml.a(this);
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        if (this.a) {
            return;
        }
        vml.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = true;
        this.b.finishAndRemoveTask();
    }
}
