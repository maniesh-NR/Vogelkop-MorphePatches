package defpackage;

import android.content.Context;
import android.util.Size;
import android.widget.ImageView;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class sro extends yjo {
    public ImageView e;
    public tqo f;
    public u6p g;
    public boolean h;
    public Throwable i;

    public final void b(Context context, Size size, u6p u6pVar) {
        if (this.f == null) {
            this.g = u6pVar;
            this.f = new tqo(context, a(), size, new cno(this, (byte) 5));
            ImageView imageView = this.e;
            if (imageView != null) {
                c(imageView);
            }
        }
    }

    public final void c(ImageView imageView) {
        d();
        this.e = imageView;
        imageView.setImageDrawable(this.f);
        tqo tqoVar = this.f;
        if (tqoVar != null && tqoVar.e.compareAndSet(false, true)) {
            na2.B(w2p.a, (CoroutineContext) null, (rx5) null, new sqo((byte) 0, (mt5) null, tqoVar), 3);
        }
        tqo tqoVar2 = this.f;
        if (tqoVar2 != null) {
            qt6 qt6Var = tqoVar2.f;
            if (qt6Var != null) {
                qt6Var.b = true;
            }
            w0h.e(tqoVar2.getDrawable(), true);
        }
        if (this.e == null || !this.h) {
            return;
        }
        u6p u6pVar = this.g;
        if (u6pVar != null) {
            u6pVar.invoke(this.i);
        }
        this.g = null;
    }

    public final void d() {
        tqo tqoVar = this.f;
        if (tqoVar != null) {
            qt6 qt6Var = tqoVar.f;
            if (qt6Var != null) {
                qt6Var.b = false;
            }
            w0h.e(tqoVar.getDrawable(), false);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        this.e = null;
    }
}
