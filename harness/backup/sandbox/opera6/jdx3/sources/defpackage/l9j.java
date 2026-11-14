package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class l9j implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o9j b;
    public final /* synthetic */ String c;

    public /* synthetic */ l9j(String str, o9j o9jVar) {
        this.a = (byte) 2;
        this.c = str;
        this.b = o9jVar;
    }

    public /* synthetic */ l9j(o9j o9jVar, String str, byte b) {
        this.a = b;
        this.b = o9jVar;
        this.c = str;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        String str = this.c;
        o9j o9jVar = this.b;
        switch (b) {
            case 0:
                o9j.h(o9jVar, str, 2);
                break;
            case 1:
                oml omlVar = new oml(o9jVar.b.e(new l9j(o9jVar, str, (byte) 3)));
                AtomicReference atomicReference = o9jVar.g;
                omlVar.b(omlVar, 350L, TimeUnit.MILLISECONDS, null);
                oml omlVar2 = (oml) atomicReference.getAndSet(omlVar);
                if (omlVar2 != null && !omlVar2.isCancelled()) {
                    omlVar2.cancel(true);
                }
                break;
            case 2:
                if (str == null || str.length() == 0) {
                    n9j n9jVar = o9jVar.f;
                    n9jVar.n = true;
                    n9jVar.u();
                } else {
                    n9j n9jVar2 = o9jVar.f;
                    n9jVar2.n = false;
                    n9jVar2.u();
                }
                break;
            default:
                oml omlVar3 = (oml) obj;
                o9jVar.g(str, false);
                AtomicReference atomicReference2 = o9jVar.g;
                while (!atomicReference2.compareAndSet(omlVar3, null) && atomicReference2.get() == omlVar3) {
                }
                break;
        }
        return Unit.a;
    }
}
