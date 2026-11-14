package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class bg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
    }

    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                cg cgVar = (cg) this.b;
                cgVar.j = j2;
                Context context = cgVar.b;
                String[] strArr = OperaApplication.K;
                List listL = ((OperaApplication) context.getApplicationContext()).m().a.l();
                Callback callback = cgVar.d;
                if (callback != null) {
                    callback.run(cgVar.a(listL));
                    break;
                } else {
                    ((NotificationManager) context.getSystemService("notification")).notify(cgVar.a, cgVar.a(listL));
                    break;
                }
            default:
                c(j, j2, j2 > 0 && j > 0);
                break;
        }
    }

    public final void c(long j, long j2, boolean z) {
        ze7 ze7Var = ((wg7) this.b).z;
        vg7 vg7Var = new vg7();
        vg7Var.c = z;
        vg7Var.a = j;
        vg7Var.b = j2;
        ze7Var.n = vg7Var;
        WeakReference weakReference = ze7Var.m;
        a9a a9aVar = null;
        if (weakReference != null) {
            a9a a9aVar2 = (a9a) weakReference.get();
            if (a9aVar2 == null) {
                ze7Var.m = null;
            } else {
                a9aVar = a9aVar2;
            }
        }
        if (a9aVar == null) {
            return;
        }
        a9aVar.U(ze7Var.n);
    }
}
