package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class szk {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public szk(Handler handler) {
        this.a = handler;
    }

    public static rzk b() {
        rzk rzkVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            rzkVar = arrayList.isEmpty() ? new rzk() : (rzk) arrayList.remove(arrayList.size() - 1);
        }
        return rzkVar;
    }

    public final rzk a(int i, Object obj) {
        rzk rzkVarB = b();
        rzkVarB.a = this.a.obtainMessage(i, obj);
        return rzkVarB;
    }

    public final void c(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void d(int i) {
        z4o.w(i != 0);
        this.a.removeMessages(i);
    }

    public final void e(int i) {
        this.a.sendEmptyMessage(i);
    }
}
