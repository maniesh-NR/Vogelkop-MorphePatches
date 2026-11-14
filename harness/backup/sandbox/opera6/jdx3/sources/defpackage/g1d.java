package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class g1d {
    public final Rect a;
    public final ng3 b;
    public byte c;
    public Bitmap d;
    public uf e;

    public g1d(ng3 ng3Var, Rect rect, fb fbVar) {
        this.a = rect;
        this.b = ng3Var;
    }

    public final void a() throws Surface.OutOfResourcesException, IllegalArgumentException {
        ng3 ng3Var = this.b;
        if (ng3Var == null) {
            b(2);
            return;
        }
        b(6);
        dnb dnbVar = new dnb(this, (byte) 15);
        wa waVar = new wa(this, (byte) 18);
        float fCeil = ng3Var.e;
        if (fCeil == 0.0f) {
            zg zgVar = ng3Var.d;
            WebContentsImpl webContentsImpl = (WebContents) zgVar.b;
            if (webContentsImpl.isDestroyed() || ((Size) zgVar.d).getWidth() == 0) {
                fCeil = 1.0f;
            } else {
                huh huhVar = webContentsImpl.g;
                fCeil = ((int) Math.ceil(huhVar.a(huhVar.e))) / ((Size) zgVar.d).getWidth();
            }
            ng3Var.e = fCeil;
        }
        float f = fCeil;
        long j = ((PlayerCompositorDelegateImpl) ng3Var.a.a).b;
        if (j == 0) {
            return;
        }
        Rect rect = this.a;
        N.MiIDqW7F(j, (Object) null, waVar, dnbVar, f, rect.left, rect.top, rect.width(), rect.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) throws Surface.OutOfResourcesException, IllegalArgumentException {
        this.c = i;
        uf ufVar = this.e;
        if (ufVar != null) {
            hoi hoiVar = (hoi) ufVar.b;
            g1d g1dVar = (g1d) ufVar.c;
            wa waVar = (wa) ufVar.d;
            Rect rect = (Rect) ufVar.e;
            Surface surface = (Surface) ufVar.f;
            hoiVar.getClass();
            if (i != 6) {
                Bitmap bitmap = g1dVar.d;
                if (i != 3 || bitmap == null) {
                    waVar.c(new Rect());
                    return;
                }
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                Canvas canvasLockCanvas = surface.lockCanvas(rect2);
                canvasLockCanvas.drawColor(-1);
                canvasLockCanvas.drawBitmap(bitmap, (Rect) null, rect2, (Paint) null);
                surface.unlockCanvasAndPost(canvasLockCanvas);
                rect.offset(0, -hoiVar.e);
                waVar.c(rect);
            }
        }
    }
}
