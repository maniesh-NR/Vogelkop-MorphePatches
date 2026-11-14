package defpackage;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.AsyncTask;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j8g extends AsyncTask {
    public final o8f a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ ro9 e;

    public j8g(ro9 ro9Var, int i, int i2, int i3, o8f o8fVar) {
        Objects.requireNonNull(ro9Var);
        this.e = ro9Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = o8fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap bitmapU = z5i.u(this.c, this.d, Bitmap.Config.ARGB_8888);
        if (bitmapU == null) {
            return null;
        }
        PdfRenderer.Page pageOpenPage = ((PdfRenderer) this.e.c).openPage(this.b);
        try {
            pageOpenPage.render(bitmapU, null, null, 1);
            return bitmapU;
        } finally {
            pageOpenPage.close();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.a.run((Bitmap) obj);
    }
}
