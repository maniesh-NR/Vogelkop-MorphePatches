package defpackage;

import com.opera.android.firebase.OperaFirebaseMessagingService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class nxk implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bxk b;
    public final /* synthetic */ OperaFirebaseMessagingService c;
    public final /* synthetic */ List d;

    public nxk(boolean z, bxk bxkVar, OperaFirebaseMessagingService operaFirebaseMessagingService, List list) {
        this.a = z;
        this.b = bxkVar;
        this.c = operaFirebaseMessagingService;
        this.d = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (lcp.n) {
            boolean z = this.a;
            bxk bxkVar = lcp.o;
            bxk bxkVar2 = this.b;
            if (!z) {
                List list = this.d;
                if (bxkVar != bxkVar2) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rih.d(this.c, (String) it.next());
                    }
                } else {
                    ((dxk) bxkVar2.b).S(list);
                }
            } else if (bxkVar != bxkVar2) {
                rih.d(this.c, (String) null);
            } else {
                ((dxk) bxkVar.b).R();
            }
        }
        return null;
    }
}
