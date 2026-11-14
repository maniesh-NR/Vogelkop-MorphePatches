package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewStub;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.OperaRateBar;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class ljh extends uim {
    public final /* synthetic */ byte d;
    public final Object e;
    public final Object f;

    public /* synthetic */ ljh(Object obj, Object obj2, byte b) {
        this.d = b;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.uim
    public final Dialog g0(Bundle bundle) {
        byte b = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                ce5 ce5Var = new ce5(requireContext(), 2132083345);
                ce5Var.setContentView(2131559193);
                y83 y83VarC = y83.c(ce5Var.requireViewById(2131362526));
                MaterialButton materialButton = (OperaMaterialButton) y83VarC.g;
                ViewStub viewStub = (ViewStub) y83VarC.c;
                viewStub.setLayoutResource(2131559261);
                Object objInflate = viewStub.inflate();
                if (objInflate == null) {
                    t3p.q("rootView");
                    return null;
                }
                OperaRateBar operaRateBar = (OperaRateBar) objInflate;
                wjh wjhVar = (wjh) obj2;
                operaRateBar.t.add(new kjh(wjhVar, (byte) 0));
                DialogTitle dialogTitle = (DialogTitle) y83VarC.h;
                StylingTextView stylingTextView = (StylingTextView) y83VarC.e;
                MaterialButton materialButton2 = (OperaMaterialButton) y83VarC.f;
                ((s9i) obj).a(dialogTitle, stylingTextView, materialButton, materialButton2);
                pde pdeVar = (pde) wjhVar.c;
                pde pdeVar2 = (pde) wjhVar.d;
                pdeVar.j(ce5Var, new t7d(new ldh(1, materialButton, OperaMaterialButton.class, "setEnabled", "setEnabled(Z)V", 0, (byte) 2), (byte) 6));
                materialButton.setOnClickListener(new j5g(this, operaRateBar, (byte) 2));
                materialButton2.setOnClickListener(new zvd(this, (byte) 24));
                xf8.F0(pdeVar2, Integer.valueOf(getResources().getConfiguration().screenHeightDp >= 500 ? 0 : 8));
                pdeVar2.j(ce5Var, new t7d(new jjh(y83VarC, (byte) 0), (byte) 6));
                return ce5Var;
            default:
                ce5 ce5Var2 = new ce5(requireContext(), 2132083345);
                ce5Var2.setContentView(2131559193);
                y83 y83VarC2 = y83.c(ce5Var2.requireViewById(2131362526));
                ViewStub viewStub2 = (ViewStub) y83VarC2.c;
                viewStub2.setLayoutResource(2131559262);
                q5g q5gVarA = q5g.a(viewStub2.inflate());
                DialogTitle dialogTitle2 = (DialogTitle) y83VarC2.h;
                StylingTextView stylingTextView2 = (StylingTextView) y83VarC2.e;
                MaterialButton materialButton3 = (OperaMaterialButton) y83VarC2.g;
                MaterialButton materialButton4 = (OperaMaterialButton) y83VarC2.f;
                ((xbf) obj).l(dialogTitle2, stylingTextView2, materialButton3, materialButton4, ((hi4) q5gVarA.c).c, new ldh(1, (ojh) obj2, ojh.class, "onFeedbackOptionSelected", "onFeedbackOptionSelected(Lcom/opera/android/rateus/FeedbackOption;)V", 0, (byte) 3));
                materialButton3.setOnClickListener(new j5g(this, q5gVarA, (byte) 3));
                materialButton4.setOnClickListener(new zvd(this, (byte) 25));
                ojh ojhVar = (ojh) obj2;
                ojhVar.a(getResources().getConfiguration().screenHeightDp);
                ojhVar.b.j(ce5Var2, new iwa(new jjh(y83VarC2, (byte) 1), (byte) 21));
                return ce5Var2;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
                xf8.F0((pde) ((wjh) obj).d, Integer.valueOf(configuration.screenHeightDp >= 500 ? 0 : 8));
                break;
            default:
                super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
                ((ojh) obj).a(configuration.screenHeightDp);
                break;
        }
    }
}
