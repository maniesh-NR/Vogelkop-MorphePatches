package defpackage;

import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class jeg implements Runnable {
    public final /* synthetic */ b2l a;
    public final /* synthetic */ c23 b;
    public final /* synthetic */ k6l c;
    public final /* synthetic */ keg d;
    public final /* synthetic */ leg e;
    public final /* synthetic */ eq9 f;
    public final /* synthetic */ fq9 g;
    public final /* synthetic */ MediaSessionImpl h;
    public final /* synthetic */ meg i;

    public jeg(meg megVar, b2l b2lVar, c23 c23Var, k6l k6lVar, keg kegVar, leg legVar, eq9 eq9Var, fq9 fq9Var, MediaSessionImpl mediaSessionImpl) {
        this.a = b2lVar;
        this.b = c23Var;
        this.c = k6lVar;
        this.d = kegVar;
        this.e = legVar;
        this.f = eq9Var;
        this.g = fq9Var;
        this.h = mediaSessionImpl;
        this.i = megVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((d7l) this.a).H(this.b);
        this.c.H(this.d);
        this.e.c((WebContents) null);
        this.f.c.c(this.g);
        MediaSessionImpl mediaSessionImpl = this.h;
        if (mediaSessionImpl != null) {
            this.i.b.l(mediaSessionImpl, false, k1g.I(mediaSessionImpl));
        }
    }
}
