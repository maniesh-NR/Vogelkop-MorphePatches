package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class ox9 implements zbl {
    public zlj a;
    public final Handler b;
    public final int c;
    public final long d;
    public Bitmap e;

    public ox9(Handler handler, int i, long j) {
        if (!rm5.E(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET)) {
            qp2.o("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.b = handler;
        this.c = i;
        this.d = j;
    }

    @Override // defpackage.zbl
    public final void a(zlj zljVar) {
    }

    @Override // defpackage.zbl
    public final void b(Object obj) {
        this.e = (Bitmap) obj;
        Handler handler = this.b;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.d);
    }

    @Override // defpackage.zbl
    public final void c(zlj zljVar) {
        this.a = zljVar;
    }

    @Override // defpackage.zbl
    public final void d() {
    }

    @Override // defpackage.zbl
    public final void e(Drawable drawable) {
        this.e = null;
    }

    @Override // defpackage.zbl
    public final void f(zlj zljVar) throws Throwable {
        zljVar.j(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    }

    @Override // defpackage.zbl
    public final zlj getRequest() {
        return this.a;
    }

    @Override // defpackage.kdc
    public final void onDestroy() {
    }

    @Override // defpackage.kdc
    public final void onStart() {
    }

    @Override // defpackage.kdc
    public final void onStop() {
    }
}
