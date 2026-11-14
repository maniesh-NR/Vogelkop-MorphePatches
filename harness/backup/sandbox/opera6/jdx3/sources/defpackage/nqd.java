package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nqd implements dd2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ npd b;
    public final /* synthetic */ nod c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nqd(npd npdVar, nod nodVar, Object obj, byte b) {
        this.a = b;
        this.b = npdVar;
        this.c = nodVar;
        this.d = obj;
    }

    public final ListenableFuture apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                npd npdVar = this.b;
                Handler handler = npdVar.l;
                zr9 zr9Var = new zr9(npdVar, this.c, new jbd(npdVar, (kpd) obj2, (ood) obj, (byte) 4));
                e4j e4jVar = new e4j(0);
                String str = tym.a;
                c5j c5jVar = new c5j();
                tym.S(handler, new h4m(c5jVar, zr9Var, e4jVar, (byte) 4));
                return c5jVar;
            default:
                List list = (List) obj;
                npd npdVar2 = this.b;
                Handler handler2 = npdVar2.l;
                nod nodVar = this.c;
                zr9 zr9Var2 = new zr9(npdVar2, nodVar, (Runnable) new qn(npdVar2, (uqd) obj2, nodVar, list, (byte) 15));
                e4j e4jVar2 = new e4j(0);
                String str2 = tym.a;
                c5j c5jVar2 = new c5j();
                tym.S(handler2, new h4m(c5jVar2, zr9Var2, e4jVar2, (byte) 4));
                return c5jVar2;
        }
    }
}
