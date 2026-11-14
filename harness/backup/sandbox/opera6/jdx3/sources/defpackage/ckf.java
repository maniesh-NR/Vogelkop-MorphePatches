package defpackage;

import J.N;
import java.util.ArrayList;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ckf extends qxe {
    public ArrayList k;
    public ArrayList l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int r;

    public final void b(int i, int i2) {
        this.n = i;
        this.o = i2;
        g();
    }

    public final void c(WebContents webContents) {
        super.c(webContents);
        if (webContents == null || !this.p) {
            return;
        }
        super.e(this.q, this.r);
    }

    public final void didSwapBuffers() {
        if (this.l.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.l;
        this.l = new ArrayList();
        long j = ((ContentViewRenderView) this).a;
        int i = 0;
        N.MTRhfnYH(j, false);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final void didSwapFrame() {
        super.didSwapFrame();
        if (this.k.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.k;
        this.k = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final void e(int i, int i2) {
        super.e(i, i2);
        this.p = true;
        this.q = i;
        this.r = i2;
    }

    public final void g() {
        super.b(this.n, this.o - this.m);
    }
}
