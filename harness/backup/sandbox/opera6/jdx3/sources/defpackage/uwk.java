package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.startpage.SoftwareClipMaxWidthLinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class uwk extends m6k {
    public final or2 f;

    public uwk(kf kfVar, tsd tsdVar, tsd tsdVar2) {
        super(kfVar, tsdVar, tsdVar2);
        kf kfVar2 = this.d;
        View viewInflate = LayoutInflater.from(((SoftwareClipMaxWidthLinearLayout) kfVar2.c).getContext()).inflate(2131559398, (ViewGroup) kfVar2.c, true);
        int i = 2131362258;
        if (w1h.j(2131362258, viewInflate) != null) {
            i = 2131362350;
            StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362350, viewInflate);
            if (stylingImageButton != null) {
                i = 2131363509;
                OperaTextView operaTextViewJ = w1h.j(2131363509, viewInflate);
                if (operaTextViewJ != null) {
                    i = 2131363947;
                    MaterialButton materialButtonJ = w1h.j(2131363947, viewInflate);
                    if (materialButtonJ != null) {
                        i = 2131363525;
                        OperaTextView operaTextViewJ2 = w1h.j(2131363525, viewInflate);
                        if (operaTextViewJ2 != null) {
                            this.f = new or2(viewInflate, stylingImageButton, operaTextViewJ, materialButtonJ, operaTextViewJ2, (byte) 29);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        final rwk rwkVar = (rwk) a0();
        or2 or2Var = this.f;
        OperaTextView operaTextView = (OperaTextView) or2Var.b;
        operaTextView.setText(rwkVar.c.a(operaTextView.getResources()));
        OperaTextView operaTextView2 = (OperaTextView) or2Var.e;
        operaTextView2.setText(rwkVar.d.a(operaTextView2.getResources()));
        MaterialButton materialButton = (MaterialButton) or2Var.f;
        materialButton.setText(rwkVar.e.a(materialButton.getResources()));
        final byte b = 0;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: twk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                rwk rwkVar2 = rwkVar;
                switch (b2) {
                    case 0:
                        rwkVar2.f.invoke();
                        break;
                    default:
                        rwkVar2.g.invoke();
                        break;
                }
            }
        });
        final byte b2 = 1;
        ((StylingImageButton) or2Var.d).setOnClickListener(new View.OnClickListener() { // from class: twk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                rwk rwkVar2 = rwkVar;
                switch (b22) {
                    case 0:
                        rwkVar2.f.invoke();
                        break;
                    default:
                        rwkVar2.g.invoke();
                        break;
                }
            }
        });
    }
}
