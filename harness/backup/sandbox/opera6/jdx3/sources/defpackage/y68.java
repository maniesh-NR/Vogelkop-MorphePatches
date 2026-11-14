package defpackage;

import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.opera.android.esim.ui.EsimActivity;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class y68 implements mud {
    public final /* synthetic */ EsimActivity a;

    public y68(EsimActivity esimActivity) {
        this.a = esimActivity;
    }

    public final boolean c(MenuItem menuItem) {
        hra hraVarD;
        GURL gurlS;
        String strG;
        if (menuItem.getItemId() == 2131362746) {
            int i = EsimActivity.f0;
            EsimActivity esimActivity = this.a;
            e78 e78Var = ((i78) esimActivity.G0().n.a.getValue()).a.b;
            hra hraVarI = null;
            String str = e78Var != null ? e78Var.a : null;
            WebContents webContentsN0 = esimActivity.n0();
            if (webContentsN0 == null || (gurlS = webContentsN0.s()) == null || (strG = gurlS.g()) == null) {
                hraVarD = null;
            } else {
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(strG, null);
                hraVarD = rmaVar.d();
            }
            if (str != null && hraVarD != null) {
                hraVarI = hraVarD.i(str);
            }
            if (hraVarI != null) {
                esimActivity.s0(Uri.parse(hraVarI.h), 1, 0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, com.opera.android.esim.ui.EsimActivity] */
    public final void d(Menu menu, MenuInflater menuInflater) {
        int i = EsimActivity.f0;
        ?? r2 = this.a;
        if (((i78) r2.G0().n.a.getValue()).a.b == null) {
            return;
        }
        f78 f78Var = f78.a;
        if (x68.a[0] == 1) {
            menu.add(0, 2131362746, 0, 2132019330).setIcon(2131232118).setIconTintList(new dxh(2130969897).b(r2)).setShowAsActionFlags(2);
        } else {
            h9o.p();
        }
    }
}
