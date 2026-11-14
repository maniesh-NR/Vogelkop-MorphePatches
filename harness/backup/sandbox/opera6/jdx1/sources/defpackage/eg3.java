package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class eg3 implements oyh {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public eg3(Resources resources, oyh oyhVar) {
        this.a = (byte) 0;
        this.c = resources;
        this.b = oyhVar;
    }

    public /* synthetic */ eg3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        switch (this.a) {
            case 0:
                return ((oyh) this.b).a(obj, trfVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        cph cphVar;
        uf8 uf8Var;
        switch (this.a) {
            case 0:
                kyh kyhVarB = ((oyh) this.b).b(obj, i, i2, trfVar);
                Resources resources = (Resources) this.c;
                if (kyhVarB != null) {
                    return new ah3(resources, kyhVarB);
                }
                return null;
            case 1:
                kyh kyhVarC = ((sx9) this.b).c((Uri) obj);
                if (kyhVarC == null) {
                    return null;
                }
                return gl7.a((zg3) this.c, (Drawable) ((lx9) kyhVarC).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof cph) {
                    cphVar = (cph) inputStream;
                    z = false;
                } else {
                    z = true;
                    cphVar = new cph(inputStream, (jl6) this.c);
                }
                ArrayDeque arrayDeque = uf8.c;
                synchronized (arrayDeque) {
                    uf8Var = (uf8) arrayDeque.poll();
                }
                if (uf8Var == null) {
                    uf8Var = new uf8();
                }
                uf8 uf8Var2 = uf8Var;
                uf8Var2.a = cphVar;
                ubd ubdVar = new ubd(uf8Var2);
                ch7 n9hVar = new n9h((byte) 6, cphVar, uf8Var2, false);
                try {
                    dh7 dh7Var = (dh7) this.b;
                    ah3 ah3VarA = dh7Var.a(new x77(dh7Var.c, ubdVar, dh7Var.d), i, i2, trfVar, n9hVar);
                    uf8Var2.b = null;
                    uf8Var2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(uf8Var2);
                    }
                    if (z) {
                        cphVar.release();
                    }
                    return ah3VarA;
                } catch (Throwable th) {
                    uf8Var2.b = null;
                    uf8Var2.a = null;
                    ArrayDeque arrayDeque2 = uf8.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(uf8Var2);
                        if (z) {
                            cphVar.release();
                        }
                        throw th;
                    }
                }
        }
    }
}
