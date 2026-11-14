package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class cnh extends onh {
    public final pt1 b;
    public final gnh c;
    public final kol d;
    public zmh e;

    /* JADX WARN: Illegal instructions before constructor call */
    public cnh(ikc ikcVar, pt1 pt1Var, gnh gnhVar, ikc ikcVar2, yqa yqaVar) {
        SelectableRelativeLayout selectableRelativeLayout = (SelectableRelativeLayout) pt1Var.d;
        super(selectableRelativeLayout);
        this.b = pt1Var;
        this.c = gnhVar;
        tsd tsdVarW = a26.w(ikcVar, p37.z(selectableRelativeLayout));
        AppCompatImageView appCompatImageView = (StylingImageView) pt1Var.f;
        kol kolVar = new kol(appCompatImageView.getContext(), tsdVarW, ikcVar2, yqaVar, new rmg(this, (byte) 14));
        final byte b = 0;
        anh anhVar = new anh(kolVar, (byte) 0);
        dll dllVarS = q9n.s(appCompatImageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, appCompatImageView, anhVar);
        }
        this.d = kolVar;
        selectableRelativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bnh
            public final /* synthetic */ cnh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                cnh cnhVar = this.b;
                switch (b2) {
                    case 0:
                        zmh zmhVar = cnhVar.e;
                        if (zmhVar != null) {
                            gnh gnhVar2 = cnhVar.c;
                            enh enhVar = zmhVar.a;
                            gnhVar2.getClass();
                            gnhVar2.c(Collections.singletonList(enhVar), false);
                            break;
                        }
                        break;
                    default:
                        zmh zmhVar2 = cnhVar.e;
                        if (zmhVar2 != null) {
                            gnh gnhVar3 = cnhVar.c;
                            enh enhVar2 = zmhVar2.a;
                            gnhVar3.getClass();
                            new xw((Object) enhVar2, (Object) gnhVar3, (byte) 9).o(view);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((StylingImageButton) pt1Var.g).setOnClickListener(new View.OnClickListener(this) { // from class: bnh
            public final /* synthetic */ cnh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                cnh cnhVar = this.b;
                switch (b22) {
                    case 0:
                        zmh zmhVar = cnhVar.e;
                        if (zmhVar != null) {
                            gnh gnhVar2 = cnhVar.c;
                            enh enhVar = zmhVar.a;
                            gnhVar2.getClass();
                            gnhVar2.c(Collections.singletonList(enhVar), false);
                            break;
                        }
                        break;
                    default:
                        zmh zmhVar2 = cnhVar.e;
                        if (zmhVar2 != null) {
                            gnh gnhVar3 = cnhVar.c;
                            enh enhVar2 = zmhVar2.a;
                            gnhVar3.getClass();
                            new xw((Object) enhVar2, (Object) gnhVar3, (byte) 9).o(view);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.onh
    public final boolean U() {
        return true;
    }

    @Override // defpackage.onh
    public final List V() {
        zmh zmhVar = this.e;
        return j95.i(zmhVar != null ? zmhVar.a : null);
    }

    public final void X(zmh zmhVar) {
        this.e = zmhVar;
        enh enhVar = zmhVar.a;
        String str = enhVar.b;
        this.d.j(new fol(enhVar.c, p6l.a, str));
        String str2 = enhVar.b;
        String string = enhVar.a;
        String str3 = enhVar.b;
        boolean zA0 = z5i.a0(str2);
        pt1 pt1Var = this.b;
        if (zA0) {
            ((StylingTextView) pt1Var.c).setText(z5i.K(str3));
            ((StylingTextView) pt1Var.b).setText(2132017532);
            return;
        }
        yq1 yq1Var = (StylingTextView) pt1Var.c;
        if ((string == null || string.length() == 0) && wqm.w(str3)) {
            string = ((SelectableRelativeLayout) pt1Var.d).getResources().getString(2132021418);
        }
        yq1Var.setText(string);
        ((StylingTextView) pt1Var.b).setText(wqm.H(BrowserUtils.getExternalUrlWithFallback(str3)));
    }
}
