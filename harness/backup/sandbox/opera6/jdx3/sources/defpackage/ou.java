package defpackage;

import J.N;
import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.i;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public final /* synthetic */ class ou implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i b;

    public /* synthetic */ ou(i iVar, byte b) {
        this.a = b;
        this.b = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        i iVar = this.b;
        switch (b) {
            case 0:
                ru ruVar = (ru) iVar;
                tab tabVarH0 = ruVar.H0();
                zt1 zt1Var = (zt1) tabVarH0.e.get(i);
                xf8.E0(ruVar.J0().e, new wu(zt1Var, tabVarH0.a(zt1Var)));
                ((sab) tabVarH0.f.getValue()).filter(zt1Var.getName());
                break;
            default:
                pmd pmdVar = (pmd) iVar;
                pmdVar.getClass();
                cod codVar = (cod) adapterView.getItemAtPosition(i);
                if (codVar != null && codVar.g) {
                    grd grdVarA = grd.a(codVar);
                    qmd qmdVar = pmdVar.e;
                    BrowserMediaRouterDialogController browserMediaRouterDialogController = (BrowserMediaRouterDialogController) qmdVar.e;
                    String str = (String) qmdVar.b;
                    if (browserMediaRouterDialogController.b != null) {
                        browserMediaRouterDialogController.b = null;
                        N.MUhSLnzh(browserMediaRouterDialogController.a, str, grdVarA.a);
                    }
                    pmdVar.f = true;
                    pmdVar.dismiss();
                    break;
                }
                break;
        }
    }
}
