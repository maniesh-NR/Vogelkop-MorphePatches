package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class hd6 implements vg3 {
    public static final dsk e = jym.p(new fd6((byte) 0));
    public final jjc a;
    public final f1p b;
    public final int c;
    public final boolean d;

    public hd6(gd6 gd6Var) {
        this.b = new f1p(gd6Var.a, (byte) 11);
        jjc jjcVar = (jjc) e.get();
        jjcVar.getClass();
        this.a = jjcVar;
        this.c = gd6Var.c;
        this.d = gd6Var.b;
    }

    @Override // defpackage.vg3
    public final ListenableFuture a(Uri uri) {
        return this.a.submit(new d9(this, uri, (byte) 2));
    }

    @Override // defpackage.vg3
    public final ListenableFuture m(byte[] bArr) {
        return this.a.submit(new d9(this, bArr, (byte) 1));
    }
}
