package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.CapturableButton;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iw8 extends nv9 {
    public final BrowserActivity o;
    public final sz4 p;
    public final oi q;
    public final bw8 r;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public iw8(BrowserActivity browserActivity, sz4 sz4Var, oi oiVar, x5f x5fVar, r16 r16Var, ow8 ow8Var) {
        tcc lifecycle = browserActivity.getLifecycle();
        Objects.requireNonNull(x5fVar);
        super(fw8.class, r16Var, ow8Var, lifecycle, new zv8(x5fVar, (byte) 1), j90.c, j90.b, j90.d);
        this.o = browserActivity;
        this.p = sz4Var;
        this.q = oiVar;
        this.r = new bw8(browserActivity, "news_notifications_card_handler", "news_notifications_suggestion_card_shown", "news_notifications_suggestion_card_clicked", "news_notifications_suggestion_card_sp_visits");
    }

    @Override // defpackage.nv9
    public final void A() {
        this.r.t0(false);
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i != 2131558827) {
            return null;
        }
        final byte b = 0;
        View viewM = ha2.M(viewGroup, i, 0);
        hw8 hw8Var = new hw8(this, viewM);
        ov0 ov0VarB = ov0.b(viewM);
        ((TextView) ov0VarB.d).setText(2132019243);
        ov0 ov0Var = (ov0) ov0VarB.c;
        MaterialButton materialButton = (CapturableButton) ov0Var.c;
        MaterialButton materialButton2 = (CapturableButton) ov0Var.d;
        materialButton.setText(2132020043);
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: gw8
            public final /* synthetic */ iw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                iw8 iw8Var = this.b;
                switch (b2) {
                    case 0:
                        nrl nrlVar = iw8Var.k;
                        Object obj = iw8Var.m;
                        nrlVar.a = false;
                        ((qp5) nrlVar.b).accept(obj);
                        iw8Var.r.s0();
                        iw8Var.w();
                        break;
                    default:
                        nrl nrlVar2 = iw8Var.k;
                        Object obj2 = iw8Var.l;
                        nrlVar2.a = false;
                        ((qp5) nrlVar2.b).accept(obj2);
                        iw8Var.r.s0();
                        yi4.R(iw8Var.o, iw8Var.p, iw8Var.q, new dg7(iw8Var, (byte) 15));
                        break;
                }
            }
        });
        materialButton2.setText(2132018835);
        final byte b2 = 1;
        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: gw8
            public final /* synthetic */ iw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                iw8 iw8Var = this.b;
                switch (b22) {
                    case 0:
                        nrl nrlVar = iw8Var.k;
                        Object obj = iw8Var.m;
                        nrlVar.a = false;
                        ((qp5) nrlVar.b).accept(obj);
                        iw8Var.r.s0();
                        iw8Var.w();
                        break;
                    default:
                        nrl nrlVar2 = iw8Var.k;
                        Object obj2 = iw8Var.l;
                        nrlVar2.a = false;
                        ((qp5) nrlVar2.b).accept(obj2);
                        iw8Var.r.s0();
                        yi4.R(iw8Var.o, iw8Var.p, iw8Var.q, new dg7(iw8Var, (byte) 15));
                        break;
                }
            }
        });
        return hw8Var;
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return 2131558827;
    }

    @Override // defpackage.nv9
    public final yv8 t() {
        return new fw8((byte) 0);
    }

    @Override // defpackage.nv9
    public final boolean u() {
        return this.r.X();
    }

    @Override // defpackage.nv9
    public final boolean y() {
        if (super.y() && yi4.T(this.p)) {
            bw8 bw8Var = this.r;
            if (!((SharedPreferences) ((b59) bw8Var.b).get()).getBoolean(bw8Var.o, false)) {
                long j = u59.C(this.o).H().b;
                if (j == 0 || System.currentTimeMillis() - j >= 172800000) {
                    long j2 = ((SharedPreferences) ((b59) bw8Var.b).get()).getLong("news_notifications_suggestion_card_shown_timestamp", 0L);
                    if ((j2 == 0 || System.currentTimeMillis() - j2 >= 432000000) && bw8Var.u0() <= 2) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.nv9
    public final void z() {
        this.k.a = true;
        this.r.t0(true);
    }
}
