package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final /* synthetic */ class beb implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdb b;

    public /* synthetic */ beb(zdb zdbVar, byte b) {
        this.a = b;
        this.b = zdbVar;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        byte b = this.a;
        zdb zdbVar = this.b;
        sm8 sm8Var = (sm8) obj;
        switch (b) {
            case 0:
                WebContents webContents = zdbVar.c;
                if (webContents != null) {
                    N.MzEZdCyU(webContents, sm8Var.a == 2 ? sm8Var.d : null);
                    break;
                }
                break;
            default:
                byte b2 = sm8Var.a;
                tm8 tm8Var = sm8Var.c;
                if (b2 == 1) {
                    zdbVar.i(tm8Var.a, sm8Var.b);
                    break;
                } else if (b2 == 2) {
                    zdbVar.c(sm8Var.d, tm8Var);
                    break;
                }
                break;
        }
    }
}
