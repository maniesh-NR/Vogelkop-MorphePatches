package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.opera.android.browser.obml.MiniHttpClient$Call;
import java.io.IOException;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class cda implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public final Object d;

    public /* synthetic */ cda(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj2;
        this.b = z;
        this.d = obj;
    }

    public cda(bca bcaVar, boolean z) {
        this.a = (byte) 0;
        this.c = bcaVar;
        this.b = z;
        yz7 yz7Var = new yz7(bcaVar, 2, z ? bcaVar.G() : 2132019252, 2131951649, 0);
        this.d = yz7Var;
        if (this.b) {
            yz7Var.c();
        } else {
            vml.d(this, 500L);
        }
    }

    public cda(MiniHttpClient$Call miniHttpClient$Call, boolean z, byte[] bArr) {
        this.a = (byte) 2;
        this.b = z;
        this.c = bArr;
        this.d = miniHttpClient$Call;
    }

    public cda(qdc qdcVar, occ occVar) {
        this.a = (byte) 3;
        this.c = qdcVar;
        this.d = occVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tw2 tw2Var;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((yz7) obj2).c();
                break;
            case 1:
                boolean z = this.b;
                tm8 tm8Var = (tm8) obj;
                zdb zdbVar = (zdb) obj2;
                WebContents webContents = zdbVar.c;
                if (webContents != null && !webContents.isDestroyed() && ((iqh) tm8Var.g.b) != null) {
                    if (!zdbVar.j) {
                        zdbVar.h = new ig((Object) this, (byte) 15);
                        break;
                    } else {
                        zdbVar.j(zdbVar.d(tm8Var, z), tm8Var.a, z);
                        break;
                    }
                } else {
                    while (true) {
                        ig igVar = zdbVar.h;
                        if (igVar == null) {
                            break;
                        } else {
                            igVar.b = null;
                            zdbVar.h = null;
                            d23 d23Var = zdbVar.i;
                            zdbVar.i = null;
                            d23Var.c(Boolean.FALSE);
                        }
                    }
                }
                break;
            case 2:
                MiniHttpClient$Call miniHttpClient$Call = (MiniHttpClient$Call) obj2;
                boolean z2 = this.b;
                byte[] bArr = (byte[]) obj;
                if (miniHttpClient$Call.b != null && z2 && bArr != null) {
                    try {
                        miniHttpClient$Call.b.a(hzd.a(bArr));
                    } catch (IOException unused) {
                        miniHttpClient$Call.b.getClass();
                    }
                }
                miniHttpClient$Call.a();
                break;
            case 3:
                if (!this.b) {
                    ((qdc) obj).e((occ) obj2);
                    this.b = true;
                    break;
                }
                break;
            default:
                View view = (View) obj;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj2;
                x5n x5nVar = swipeDismissBehavior.a;
                if (x5nVar != null && x5nVar.f()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.b && (tw2Var = swipeDismissBehavior.b) != null) {
                    tw2Var.s(view);
                    break;
                }
                break;
        }
    }
}
