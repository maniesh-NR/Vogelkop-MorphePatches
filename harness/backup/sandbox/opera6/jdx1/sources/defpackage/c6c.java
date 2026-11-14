package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c6c implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e6c b;

    public /* synthetic */ c6c(e6c e6cVar, byte b) {
        this.a = b;
        this.b = e6cVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        e6c e6cVar = this.b;
        switch (b) {
            case 0:
                k5c k5cVar = (k5c) e6cVar.o.invoke();
                int itemCount = k5cVar.getItemCount();
                int i = 0;
                while (true) {
                    if (i >= itemCount) {
                        i = -1;
                    } else if (!k5cVar.d(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                k5c k5cVar2 = (k5c) e6cVar.o.invoke();
                if (iIntValue < 0 || iIntValue >= k5cVar2.getItemCount()) {
                    d8b.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + k5cVar2.getItemCount() + ")");
                }
                na2.B(e6cVar.H0(), null, null, new oca(e6cVar, iIntValue, null, (byte) 1), 3);
                return Boolean.TRUE;
        }
    }
}
