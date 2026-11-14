package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class oc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oc4(int i, iw4 iw4Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = iw4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oc4(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ oc4(ycc yccVar, int i, int i2) {
        this.a = (byte) 0;
        this.c = yccVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((ycc) obj).b = b2;
                break;
            case 1:
                iw4 iw4Var = (iw4) obj;
                rl rlVar = ChildProcessLauncherHelperImpl.l;
                if (b2 != 0) {
                    if (b2 == 1) {
                        if (!iw4Var.s.j()) {
                            iw4Var.v--;
                            iw4Var.a();
                            break;
                        }
                    } else if (b2 == 2) {
                        if (!iw4Var.s.j()) {
                            iw4Var.u--;
                            iw4Var.a();
                            break;
                        }
                    } else if (b2 == 3 && !iw4Var.s.j()) {
                        iw4Var.t--;
                        iw4Var.a();
                        break;
                    }
                }
                break;
            case 2:
                cd9 cd9Var = (cd9) obj;
                if (b2 == 1) {
                    od9 od9Var = cd9Var.u;
                    if (od9Var != null) {
                        od9Var.g0();
                        cd9Var.u = null;
                    }
                    new p99().w0(cd9Var.getContext());
                    break;
                } else if (b2 == 2) {
                    cd9Var.B0(2132019093);
                    break;
                } else if (b2 == 3) {
                    cd9Var.B0(2132019092);
                    break;
                } else {
                    cd9Var.getClass();
                    break;
                }
            case 3:
                bv5 bv5Var = (bv5) obj;
                dch dchVar = (dch) bv5Var.c.a.get();
                if (dchVar != null) {
                    dchVar.f |= b2;
                    dchVar.c.remove(bv5Var);
                    dchVar.a();
                    break;
                }
                break;
            case 4:
                ((dbh) obj).D(b2);
                break;
            case 5:
                d8i d8iVar = (d8i) obj;
                if (d8iVar.c.get()) {
                    ycc yccVar = d8iVar.a.a;
                    yccVar.s = b2;
                    qva qvaVar = yccVar.g;
                    if (qvaVar.D(b2)) {
                        qvaVar.N();
                    }
                    yccVar.d.M(b2);
                    y2n y2nVar = yccVar.h;
                    if (y2nVar.D(b2)) {
                        y2nVar.T();
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.A(view, b2, false);
                    break;
                }
                break;
        }
    }
}
