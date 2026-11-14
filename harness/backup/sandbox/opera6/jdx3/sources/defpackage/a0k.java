package defpackage;

import com.opera.android.favorites.e;
import com.opera.api.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a0k implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Callback b;
    public final /* synthetic */ nr8 c;

    public /* synthetic */ a0k(Callback callback, nr8 nr8Var) {
        this.b = callback;
        this.c = nr8Var;
    }

    public /* synthetic */ a0k(nr8 nr8Var, Callback callback) {
        this.c = nr8Var;
        this.b = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nr8 nr8Var = this.c;
        Callback callback = this.b;
        switch (b) {
            case 0:
                int size = ((e) nr8Var).f.e.size();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    hq8 hq8VarU = ((e) nr8Var).f.u(i4);
                    if (hq8VarU.j()) {
                        i2++;
                        tq8 tq8Var = (tq8) hq8VarU;
                        int size2 = tq8Var.e.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            String strI = tq8Var.u(i5).i(p6l.a);
                            a36 a36Var = hk6.e;
                            if (!Intrinsics.a(strI, "ofa://ui/synced_speeddials?source=sd_plus")) {
                                i++;
                            }
                        }
                    } else {
                        String strI2 = hq8VarU.i(p6l.a);
                        a36 a36Var2 = hk6.e;
                        if (!Intrinsics.a(strI2, "ofa://ui/synced_speeddials?source=sd_plus")) {
                            i++;
                            i3++;
                        }
                    }
                }
                callback.run(new b0k(0, i, i2, 0, i3));
                break;
            default:
                callback.run(((e) nr8Var).f);
                break;
        }
    }
}
