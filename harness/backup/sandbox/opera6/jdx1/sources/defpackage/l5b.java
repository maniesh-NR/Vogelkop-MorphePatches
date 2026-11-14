package defpackage;

import android.view.View;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l5b implements vuj, zk3, s37, p9n {
    public static final l5b c;
    public static final l5b d;
    public final /* synthetic */ byte a;
    public boolean b;

    static {
        byte b = 0;
        c = new l5b(b, true);
        d = new l5b(b, false);
    }

    public l5b() {
        this.a = (byte) 10;
        this.b = a77.a.b(SurfaceOrderQuirk.class) != null;
    }

    public /* synthetic */ l5b(byte b) {
        this.a = b;
    }

    public /* synthetic */ l5b(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    public l5b(qbe qbeVar, n7f n7fVar) throws m7f {
        this.a = (byte) 3;
        byte b = n7fVar.a;
        ByteBuffer byteBuffer = n7fVar.b;
        z4o.w(b == 6 || b == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        bq4 bq4Var = new bq4(bArr, iMin);
        qbeVar.getClass();
        if (bq4Var.h()) {
            this.b = false;
            return;
        }
        int i = bq4Var.i(2);
        if (!bq4Var.h()) {
            this.b = true;
            return;
        }
        if (i != 3 && i != 0) {
            bq4Var.h();
        }
        bq4Var.s();
        throw new m7f();
    }

    public final boolean c(ol3 ol3Var) {
        if (ol3Var.g()) {
            return true;
        }
        this.b = true;
        return false;
    }

    public final void destroy() {
        throw null;
    }

    public final void h(View view) {
        view.setEnabled(this.b);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return z1m.m(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }
}
