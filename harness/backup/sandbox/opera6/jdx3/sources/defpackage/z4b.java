package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class z4b extends dej implements sni {
    public c5b c;
    public final /* synthetic */ mej d;
    public final /* synthetic */ og5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4b(mej mejVar, og5 og5Var) {
        super(mejVar);
        this.d = mejVar;
        this.e = og5Var;
    }

    @Override // defpackage.sni
    public final void Y(boolean z) {
        c5b c5bVar = this.c;
        if (c5bVar != null) {
            c5bVar.c.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.DialogTitle] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    @Override // defpackage.dej
    public final View a(Context context) {
        final b5b b5bVar = (b5b) this.e.b;
        View viewInflate = LayoutInflater.from(context).inflate(2131558940, (ViewGroup) null, false);
        int i = 2131362240;
        View viewJ = w1h.j(2131362240, viewInflate);
        if (viewJ != null) {
            pq3 pq3VarA = pq3.a(viewJ);
            i = 2131363183;
            ?? r8 = (StylingImageView) w1h.j(2131363183, viewInflate);
            if (r8 != 0) {
                i = 2131363509;
                ?? r9 = (StylingTextView) w1h.j(2131363509, viewInflate);
                if (r9 != 0) {
                    i = 2131363525;
                    ?? r10 = (DialogTitle) w1h.j(2131363525, viewInflate);
                    if (r10 != 0) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        c5b c5bVar = new c5b(linearLayout, pq3VarA, r8, r9, r10);
                        r10.setText(b5bVar.p(r10.getContext()));
                        r9.setText(b5bVar.q(r9.getContext()));
                        MaterialButton materialButton = pq3VarA.d;
                        final x4b x4bVarO = b5bVar.o(materialButton.getContext());
                        if (x4bVarO != null) {
                            materialButton.setVisibility(0);
                            materialButton.setText(x4bVarO.a);
                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: y4b
                                public final /* synthetic */ z4b b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    byte b = b;
                                    x4b x4bVar = x4bVarO;
                                    b5b b5bVar2 = b5bVar;
                                    z4b z4bVar = this.b;
                                    switch (b) {
                                        case 0:
                                            z4bVar.b();
                                            b5bVar2.b().a(vb0.b);
                                            nf nfVar = x4bVar.b;
                                            if (nfVar != null) {
                                                nfVar.onClick(view);
                                                break;
                                            }
                                            break;
                                        default:
                                            z4bVar.b();
                                            b5bVar2.b().a(vb0.c);
                                            nf nfVar2 = x4bVar.b;
                                            if (nfVar2 != null) {
                                                nfVar2.onClick(view);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        } else {
                            materialButton.setVisibility(8);
                        }
                        MaterialButton materialButton2 = pq3VarA.c;
                        final x4b x4bVarH = b5bVar.h(materialButton2.getContext());
                        materialButton2.setVisibility(0);
                        materialButton2.setText(x4bVarH.a);
                        final byte b = 1;
                        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: y4b
                            public final /* synthetic */ z4b b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                byte b2 = b;
                                x4b x4bVar = x4bVarH;
                                b5b b5bVar2 = b5bVar;
                                z4b z4bVar = this.b;
                                switch (b2) {
                                    case 0:
                                        z4bVar.b();
                                        b5bVar2.b().a(vb0.b);
                                        nf nfVar = x4bVar.b;
                                        if (nfVar != null) {
                                            nfVar.onClick(view);
                                            break;
                                        }
                                        break;
                                    default:
                                        z4bVar.b();
                                        b5bVar2.b().a(vb0.c);
                                        nf nfVar2 = x4bVar.b;
                                        if (nfVar2 != null) {
                                            nfVar2.onClick(view);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        this.c = c5bVar;
                        r8.setVisibility(r8.getResources().getConfiguration().orientation != 1 ? (byte) 8 : (byte) 0);
                        this.d.x(this);
                        return linearLayout;
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
