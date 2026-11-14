package defpackage;

import com.opera.android.browser.SessionStore;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ju3 implements Runnable {
    public oml a;
    public long b;
    public boolean c;
    public long d;
    public final /* synthetic */ ku3 e;

    public ju3(ku3 ku3Var) {
        this.e = ku3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ku3 ku3Var = this.e;
        ku3Var.b.c = true;
        this.d = System.nanoTime() - this.b;
        oml omlVar = this.a;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        if (this.c) {
            this.c = false;
            ArrayList arrayList = (ArrayList) ((vl9) SessionStore.j.e.b).b;
            if (arrayList != null) {
                arrayList.remove(this);
            }
        }
        ku3Var.d.sendEmptyMessage(2);
    }
}
