package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;

/* loaded from: classes.dex */
public final class i5g extends m5g {
    public final qfb b;

    /* JADX WARN: Illegal instructions before constructor call */
    public i5g(ViewGroup viewGroup, qfb qfbVar, byte b) {
        final byte b2 = 1;
        final byte b3 = 0;
        switch (b) {
            case 1:
                OperaIconedMessage operaIconedMessage = lwk.a(LayoutInflater.from(viewGroup.getContext()).inflate(2131559400, viewGroup, false)).b;
                super(operaIconedMessage);
                this.b = qfbVar;
                operaIconedMessage.b(new View.OnClickListener(this) { // from class: l5g
                    public final /* synthetic */ i5g b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b3;
                        byte b5 = 1;
                        i5g i5gVar = this.b;
                        switch (b4) {
                            case 0:
                                t6g t6gVarI0 = ((t5g) i5gVar.b.b).I0();
                                ((x5f) t6gVarI0.k).l0(gm0.m);
                                hxk hxkVar = t6gVarI0.j;
                                kxk kxkVar = (kxk) hxkVar;
                                xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new s6g(t6gVarI0, (byte) 0), (byte) 3), new l31(new s6g(t6gVarI0, b5), (byte) 4));
                                break;
                            default:
                                t6g t6gVarI02 = ((t5g) i5gVar.b.b).I0();
                                t6gVarI02.getClass();
                                xgh.a = true;
                                t6gVarI02.h();
                                break;
                        }
                    }
                });
                ((MaterialButton) operaIconedMessage.a.f).setOnClickListener(new View.OnClickListener(this) { // from class: l5g
                    public final /* synthetic */ i5g b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b2;
                        byte b5 = 1;
                        i5g i5gVar = this.b;
                        switch (b4) {
                            case 0:
                                t6g t6gVarI0 = ((t5g) i5gVar.b.b).I0();
                                ((x5f) t6gVarI0.k).l0(gm0.m);
                                hxk hxkVar = t6gVarI0.j;
                                kxk kxkVar = (kxk) hxkVar;
                                xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new s6g(t6gVarI0, (byte) 0), (byte) 3), new l31(new s6g(t6gVarI0, b5), (byte) 4));
                                break;
                            default:
                                t6g t6gVarI02 = ((t5g) i5gVar.b.b).I0();
                                t6gVarI02.getClass();
                                xgh.a = true;
                                t6gVarI02.h();
                                break;
                        }
                    }
                });
                return;
            default:
                View viewN = j7c.n(viewGroup, 2131558946, viewGroup, false);
                int i = 2131361899;
                MaterialButton materialButtonJ = w1h.j(2131361899, viewN);
                if (materialButtonJ != null) {
                    i = 2131362353;
                    AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131362353, viewN);
                    if (appCompatImageView != null) {
                        i = 2131363183;
                        AppCompatImageView appCompatImageView2 = (StylingImageView) w1h.j(2131363183, viewN);
                        if (appCompatImageView2 != null) {
                            i = 2131363509;
                            if (((StylingTextView) w1h.j(2131363509, viewN)) != null) {
                                i = 2131363525;
                                if (((StylingTextView) w1h.j(2131363525, viewN)) != null) {
                                    super((FrameLayout) viewN);
                                    this.b = qfbVar;
                                    materialButtonJ.setOnClickListener(new View.OnClickListener(this) { // from class: h5g
                                        public final /* synthetic */ i5g b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b4 = b3;
                                            i5g i5gVar = this.b;
                                            switch (b4) {
                                                case 0:
                                                    t6g t6gVarI0 = ((t5g) i5gVar.b.b).I0();
                                                    if (t6gVarI0.c.b()) {
                                                        t6gVarI0.b.f(new vdf(t6gVarI0, (byte) 17));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    t6g t6gVarI02 = ((t5g) i5gVar.b.b).I0();
                                                    nv6 nv6VarB = t6gVarI02.f.b();
                                                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("has_dismissed_password_autofill_banner", true);
                                                    nv6VarB.w();
                                                    t6gVarI02.h();
                                                    break;
                                            }
                                        }
                                    });
                                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: h5g
                                        public final /* synthetic */ i5g b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            byte b4 = b2;
                                            i5g i5gVar = this.b;
                                            switch (b4) {
                                                case 0:
                                                    t6g t6gVarI0 = ((t5g) i5gVar.b.b).I0();
                                                    if (t6gVarI0.c.b()) {
                                                        t6gVarI0.b.f(new vdf(t6gVarI0, (byte) 17));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    t6g t6gVarI02 = ((t5g) i5gVar.b.b).I0();
                                                    nv6 nv6VarB = t6gVarI02.f.b();
                                                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("has_dismissed_password_autofill_banner", true);
                                                    nv6VarB.w();
                                                    t6gVarI02.h();
                                                    break;
                                            }
                                        }
                                    });
                                    hz0 hz0Var = new hz0((byte) 5);
                                    dll dllVarS = q9n.s(appCompatImageView2);
                                    if (dllVarS != null) {
                                        u8n.b(dllVarS, appCompatImageView2, hz0Var);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i)));
                throw null;
        }
    }
}
