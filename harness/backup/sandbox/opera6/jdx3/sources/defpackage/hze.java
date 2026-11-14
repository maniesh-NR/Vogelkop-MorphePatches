package defpackage;

import com.opera.android.OperaApplication;
import com.opera.android.PushedContentHandler;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hze implements f7f {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public hze(OperaApplication operaApplication, PushedContentHandler pushedContentHandler, gmk gmkVar) {
        this.a = (byte) 2;
        this.b = operaApplication.getApplicationContext();
        this.c = pushedContentHandler;
        gmkVar.a.k(this);
    }

    public hze(gmk gmkVar) {
        this.a = (byte) 0;
        this.b = gmkVar;
        this.c = new ArrayList();
    }

    public hze(ikc ikcVar, Function1 function1) {
        this.a = (byte) 7;
        this.c = function1;
        this.b = ikcVar.g();
    }

    public /* synthetic */ hze(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public hze(slk slkVar, x5f x5fVar, ox3 ox3Var) {
        this.a = (byte) 3;
        this.b = x5fVar;
        this.c = ox3Var;
        slkVar.i.k(this);
    }

    public hze(tah tahVar, cvg cvgVar) {
        this.a = (byte) 1;
        this.b = cvgVar;
        this.c = tahVar;
    }

    public hze(xzg xzgVar) {
        this.a = (byte) 4;
        Objects.requireNonNull(xzgVar);
        this.c = xzgVar;
    }

    public final void a(Callback callback) {
        ArrayList arrayList = (ArrayList) this.c;
        gmk gmkVar = (gmk) this.b;
        uvg uvgVar = (uvg) gmkVar.a.g();
        if (uvgVar != uvg.LOADING) {
            callback.run(uvgVar);
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(callback);
        if (zIsEmpty) {
            gmkVar.a.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hze.d0(java.lang.Object):void");
    }
}
