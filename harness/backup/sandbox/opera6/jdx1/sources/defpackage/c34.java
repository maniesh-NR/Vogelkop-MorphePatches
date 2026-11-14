package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c34 implements oyh {
    public final /* synthetic */ byte a;
    public final dh7 b;

    public /* synthetic */ c34(dh7 dh7Var, byte b) {
        this.a = b;
        this.b = dh7Var;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) {
        switch (this.a) {
            case 0:
                int i3 = j34.a;
                i34 i34Var = new i34((ByteBuffer) obj);
                ch7 ch7Var = dh7.j;
                dh7 dh7Var = this.b;
                return dh7Var.a(new x77(dh7Var.c, i34Var, dh7Var.d), i, i2, trfVar, ch7Var);
            default:
                dh7 dh7Var2 = this.b;
                return dh7Var2.a(new ua7((ParcelFileDescriptor) obj, dh7Var2.d, dh7Var2.c), i, i2, trfVar, dh7.j);
        }
    }
}
