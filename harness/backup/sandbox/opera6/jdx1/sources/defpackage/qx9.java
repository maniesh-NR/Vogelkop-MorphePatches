package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class qx9 implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qx9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                rx9 rx9Var = (rx9) this.b;
                int i = message.what;
                if (i == 1) {
                    rx9Var.b((ox9) message.obj);
                    return true;
                }
                if (i == 2) {
                    rx9Var.d.g((ox9) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                i3j i3jVar = (i3j) this.b;
                xsj xsjVar = (xsj) message.obj;
                synchronized (i3jVar.a) {
                    if (((xsj) i3jVar.c) == xsjVar || ((xsj) i3jVar.d) == xsjVar) {
                        i3jVar.l(xsjVar, 2);
                    }
                }
                return true;
        }
    }
}
