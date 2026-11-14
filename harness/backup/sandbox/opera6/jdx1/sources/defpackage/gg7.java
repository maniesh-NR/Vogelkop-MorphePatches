package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class gg7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gg7(f28 f28Var, int i, String str, Throwable th) {
        this.a = (byte) 1;
        this.c = f28Var;
        this.b = i;
        this.d = str;
        this.e = th;
    }

    public /* synthetic */ gg7(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ gg7(npd npdVar, boolean z, nod nodVar, Runnable runnable) {
        this.a = (byte) 2;
        this.c = npdVar;
        this.b = z;
        this.d = nodVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                jg7 jg7Var = (jg7) obj3;
                jg7Var.b.p((re7) obj2, (Context) obj, jg7Var.j, z);
                break;
            case 1:
                ((f28) obj3).c(z ? 1 : 0, (String) obj2, (Throwable) obj);
                break;
            case 2:
                npd npdVar = (npd) obj3;
                nod nodVar = (nod) obj2;
                Runnable runnable = (Runnable) obj;
                xqd xqdVar = npdVar.g;
                if (z) {
                    n3j n3jVar = new n3j("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        m59 m59VarO = xqdVar.b.O(nodVar);
                        if (m59VarO != null) {
                            i = m59VarO.c(npd.B).a;
                        } else if (npdVar.g(nodVar)) {
                            yr9.c(new e4j(0));
                            i = 0;
                        } else {
                            yr9.c(new e4j(-100));
                        }
                        mod modVar = nodVar.d;
                        if (modVar != null) {
                            modVar.a(i, n3jVar);
                        }
                    } catch (DeadObjectException unused) {
                        xqdVar.b.Z(nodVar);
                        yr9.c(new e4j(-100));
                    } catch (RemoteException e) {
                        w7d.L("Exception in " + nodVar, e);
                        yr9.c(new e4j(-1));
                    }
                }
                runnable.run();
                xqdVar.b.B(nodVar);
                break;
            case 3:
                moh mohVar = (moh) obj3;
                buk bukVar = (buk) obj2;
                zpl zplVar = (zpl) obj;
                buk bukVar2 = mohVar.n;
                if (bukVar2 != null && !bukVar2.h.b.isDone()) {
                    mohVar.n.c();
                }
                mohVar.z = z;
                mohVar.n = bukVar;
                mohVar.o = zplVar;
                mohVar.j(bukVar, zplVar, true);
                break;
            default:
                iji ijiVar = (iji) obj3;
                ijiVar.h((Uri) obj2, (String) obj);
                ijiVar.A();
                ijiVar.e(z);
                break;
        }
    }
}
