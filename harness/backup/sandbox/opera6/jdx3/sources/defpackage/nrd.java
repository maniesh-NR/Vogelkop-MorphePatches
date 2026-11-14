package defpackage;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class nrd implements op5, n5o {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nrd(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.a = z;
    }

    public final void accept(Object obj) {
        ro9 ro9Var = (ro9) this.b;
        ((prd) obj).i(ro9Var.b, (jrd) ro9Var.c, (bsc) this.c, (tjd) this.d, (IOException) this.e, this.a);
    }

    public final Object g(Object obj) {
        iji ijiVar = (iji) this.b;
        fji fjiVar = (fji) this.c;
        fji fjiVar2 = (fji) this.d;
        Uri uri = (Uri) this.e;
        String str = (String) obj;
        if (str == null) {
            ijiVar.P();
            return null;
        }
        if (fjiVar != null && !fjiVar2.equals(fjiVar)) {
            ijiVar.k(fjiVar, new wii(ijiVar, (byte) 1));
        }
        ijiVar.s(new gg7(ijiVar, uri, str, this.a, (byte) 4));
        return null;
    }
}
