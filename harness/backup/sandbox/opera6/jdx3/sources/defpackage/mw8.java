package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.custom_views.CapturableButton;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mw8 extends nv9 implements p5j {

    @NonNull
    @WeakOwner
    private final q8j o;
    public final BrowserActivity p;
    public final SettingsManager q;
    public final gjm r;
    public final cq5 s;
    public final kw8 t;
    public final boolean u;
    public l0c v;
    public boolean w;
    public boolean x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public mw8(BrowserActivity browserActivity, r16 r16Var, ow8 ow8Var, SettingsManager settingsManager, cq5 cq5Var, x5f x5fVar, gjm gjmVar) {
        tcc lifecycle = browserActivity.getLifecycle();
        Objects.requireNonNull(x5fVar);
        super(jw8.class, r16Var, ow8Var, lifecycle, new zv8(x5fVar, (byte) 2), vb0.b, vb0.c, vb0.d);
        xy xyVar = new xy(this, 1 == true ? 1 : 0);
        this.o = xyVar;
        this.p = browserActivity;
        this.q = settingsManager;
        this.r = gjmVar;
        this.u = settingsManager.n("personalized_default") > 0;
        this.w = settingsManager.M();
        settingsManager.F(this);
        this.s = cq5Var;
        this.t = new kw8(browserActivity, "news_personalized_news_card_handler", "news_personalized_news_card_shown");
        String[] strArr = OperaApplication.K;
        ((OperaApplication) browserActivity.getApplicationContext()).y().a(xyVar);
    }

    @Override // defpackage.nv9
    public final void A() {
        this.t.s0(false);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("personalized_news".equals(str) || "process_news_topics".equals(str)) {
            boolean zM = this.q.M();
            this.w = zM;
            if (this.i && zM) {
                w();
            }
        }
    }

    @Override // defpackage.nv9, defpackage.fa2, defpackage.rjm
    public final void b(sjm sjmVar) {
        if (sjmVar.a()) {
            kw8 kw8Var = this.t;
            if (((SharedPreferences) ((b59) kw8Var.b).get()).getLong("news_personalized_news_shown_timestamp", -1L) == -1) {
                am2.x(((SharedPreferences) ((b59) kw8Var.b).get()).edit(), "news_personalized_news_shown_timestamp");
            }
        }
        super.b(sjmVar);
    }

    @Override // defpackage.ea2
    public final ab2 k(ViewGroup viewGroup, int i) {
        if (i != 2131558822) {
            return null;
        }
        final byte b = 0;
        View viewM = ha2.M(viewGroup, i, 0);
        hw8 hw8Var = new hw8(this, viewM);
        ov0 ov0VarB = ov0.b(viewM);
        ((TextView) ov0VarB.d).setText(2132019244);
        ov0 ov0Var = (ov0) ov0VarB.c;
        MaterialButton materialButton = (CapturableButton) ov0Var.c;
        MaterialButton materialButton2 = (CapturableButton) ov0Var.d;
        materialButton.setText(2132019498);
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: lw8
            public final /* synthetic */ mw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                mw8 mw8Var = this.b;
                switch (b2) {
                    case 0:
                        nrl nrlVar = mw8Var.k;
                        Object obj = mw8Var.m;
                        nrlVar.a = false;
                        ((qp5) nrlVar.b).accept(obj);
                        mw8Var.w();
                        break;
                    default:
                        nrl nrlVar2 = mw8Var.k;
                        Object obj2 = mw8Var.l;
                        nrlVar2.a = false;
                        ((qp5) nrlVar2.b).accept(obj2);
                        SettingsManager settingsManager = mw8Var.q;
                        if (settingsManager.i("collect_website_categories") || settingsManager.i("collect_partner_visits") || settingsManager.i("process_news_topics") || settingsManager.i("process_location")) {
                            mw8Var.r.e(new pb6(), false);
                        } else {
                            settingsManager.V(0, "news_is_blocked_by_personalization_change");
                            settingsManager.V(1, "personalized_news");
                            settingsManager.V(1, "process_news_topics");
                            fp1 fp1Var = mw8Var.p;
                            String[] strArr = OperaApplication.K;
                            ((OperaApplication) fp1Var.getApplicationContext()).F().b(true, null);
                        }
                        ((SharedPreferences) ((b59) mw8Var.t.b).get()).edit().putBoolean("news_personalized_news_card_accepted", true).apply();
                        mw8Var.w();
                        break;
                }
            }
        });
        materialButton2.setText(2132020157);
        final byte b2 = 1;
        materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: lw8
            public final /* synthetic */ mw8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                mw8 mw8Var = this.b;
                switch (b22) {
                    case 0:
                        nrl nrlVar = mw8Var.k;
                        Object obj = mw8Var.m;
                        nrlVar.a = false;
                        ((qp5) nrlVar.b).accept(obj);
                        mw8Var.w();
                        break;
                    default:
                        nrl nrlVar2 = mw8Var.k;
                        Object obj2 = mw8Var.l;
                        nrlVar2.a = false;
                        ((qp5) nrlVar2.b).accept(obj2);
                        SettingsManager settingsManager = mw8Var.q;
                        if (settingsManager.i("collect_website_categories") || settingsManager.i("collect_partner_visits") || settingsManager.i("process_news_topics") || settingsManager.i("process_location")) {
                            mw8Var.r.e(new pb6(), false);
                        } else {
                            settingsManager.V(0, "news_is_blocked_by_personalization_change");
                            settingsManager.V(1, "personalized_news");
                            settingsManager.V(1, "process_news_topics");
                            fp1 fp1Var = mw8Var.p;
                            String[] strArr = OperaApplication.K;
                            ((OperaApplication) fp1Var.getApplicationContext()).F().b(true, null);
                        }
                        ((SharedPreferences) ((b59) mw8Var.t.b).get()).edit().putBoolean("news_personalized_news_card_accepted", true).apply();
                        mw8Var.w();
                        break;
                }
            }
        });
        return hw8Var;
    }

    @Override // defpackage.nv9, defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        super.onDestroy();
        this.q.H(this);
        this.x = true;
    }

    @Override // defpackage.ea2
    public final int q(ja2 ja2Var, int i, ca2 ca2Var) {
        return 2131558822;
    }

    @Override // defpackage.nv9
    public final yv8 t() {
        return new jw8((byte) 0);
    }

    @Override // defpackage.nv9
    public final boolean u() {
        return this.t.X();
    }

    @Override // defpackage.nv9
    public final boolean y() {
        if (super.y()) {
            kw8 kw8Var = this.t;
            b59 b59Var = (b59) kw8Var.b;
            b59 b59Var2 = (b59) kw8Var.b;
            if (!((SharedPreferences) b59Var.get()).getBoolean("news_personalized_news_card_accepted", false) && this.v != null && ((bef) this.s.getValue()).h().contains(this.v.toString()) && !this.u && !this.w && ((SharedPreferences) b59Var2.get()).getInt("news_personalized_news_card_shown_count", 0) < 2) {
                long j = ((SharedPreferences) b59Var2.get()).getLong("news_personalized_news_shown_timestamp", -1L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j != -1 && jCurrentTimeMillis - j >= 432000000) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nv9
    public final void z() {
        this.k.a = true;
        this.t.s0(true);
    }
}
