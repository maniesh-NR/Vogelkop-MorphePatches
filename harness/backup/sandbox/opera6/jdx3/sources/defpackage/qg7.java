package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.downloads.DownloadItem;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qg7 extends yzi {
    public final ig2 f;
    public final TextView g;
    public final View h;
    public final LinearProgressIndicator i;
    public final StylingImageView j;
    public final StylingImageButton k;
    public final z l;
    public final View m;
    public final TextView n;
    public int o;
    public re7 p;
    public final pg7 q;
    public final k5o r;
    public final xbf s;
    public final ng7 t;
    public final og7 u;
    public final c5o v;
    public int w;

    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View, com.opera.android.custom_views.StylingImageButton] */
    public qg7(View view, jg7 jg7Var, tzi tziVar, xbf xbfVar) {
        super(view, tziVar);
        this.l = new z(this);
        this.r = new k5o(this);
        this.t = new ng7(this);
        this.v = new c5o((byte) 29);
        this.q = cs5.W(view) ? null : new pg7(this);
        this.s = xbfVar;
        view.setOnClickListener(t0h.i(jg7Var));
        final byte b = 1;
        view.setLongClickable(true);
        view.setOnLongClickListener(jg7Var);
        View viewFindViewById = view.findViewById(2131362577);
        this.h = viewFindViewById;
        viewFindViewById.setOnClickListener(t0h.i(jg7Var));
        View viewFindViewById2 = view.findViewById(2131362569);
        Objects.requireNonNull(viewFindViewById2);
        this.g = (TextView) viewFindViewById2;
        LinearProgressIndicator linearProgressIndicatorFindViewById = view.findViewById(2131362590);
        Objects.requireNonNull(linearProgressIndicatorFindViewById);
        LinearProgressIndicator linearProgressIndicator = linearProgressIndicatorFindViewById;
        this.i = linearProgressIndicator;
        View viewFindViewById3 = view.findViewById(2131362599);
        Objects.requireNonNull(viewFindViewById3);
        TextView textView = (TextView) viewFindViewById3;
        Object objFindViewById = view.findViewById(2131362568);
        Objects.requireNonNull(objFindViewById);
        this.j = (StylingImageView) objFindViewById;
        Object objFindViewById2 = view.findViewById(2131362561);
        Objects.requireNonNull(objFindViewById2);
        ?? r1 = (StylingImageButton) objFindViewById2;
        this.k = r1;
        final byte b2 = 0;
        r1.setOnClickListener(new ohi(jg7Var, (byte) 0));
        View viewFindViewById4 = view.findViewById(2131362562);
        Objects.requireNonNull(viewFindViewById4);
        this.m = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(2131362571);
        Objects.requireNonNull(viewFindViewById5);
        this.n = (TextView) viewFindViewById5;
        this.f = new ig2(view.getContext(), fan.a(24.0f, view.getResources()));
        this.w = 1;
        og7 og7Var = new og7(textView);
        this.u = og7Var;
        dll dllVarS = q9n.s(textView);
        if (dllVarS != null) {
            u8n.b(dllVarS, textView, og7Var);
        }
        r8n r8nVar = new r8n(this) { // from class: mg7
            public final /* synthetic */ qg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b3 = b2;
                qg7 qg7Var = this.b;
                switch (b3) {
                    case 0:
                        qg7Var.j0();
                        break;
                    default:
                        qg7Var.w = 1;
                        re7 re7Var = qg7Var.p;
                        if (re7Var != null) {
                            qg7Var.m0(re7Var);
                            break;
                        }
                        break;
                }
            }
        };
        dll dllVarS2 = q9n.s(linearProgressIndicator);
        if (dllVarS2 != null) {
            u8n.b(dllVarS2, linearProgressIndicator, r8nVar);
        }
        r8n r8nVar2 = new r8n(this) { // from class: mg7
            public final /* synthetic */ qg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view2) {
                byte b3 = b;
                qg7 qg7Var = this.b;
                switch (b3) {
                    case 0:
                        qg7Var.j0();
                        break;
                    default:
                        qg7Var.w = 1;
                        re7 re7Var = qg7Var.p;
                        if (re7Var != null) {
                            qg7Var.m0(re7Var);
                            break;
                        }
                        break;
                }
            }
        };
        dll dllVarV = hjf.v(view.getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, view, r8nVar2);
    }

    @Override // defpackage.yzi
    public final void e0() {
        re7 re7Var = this.p;
        this.p = null;
        pg7 pg7Var = this.q;
        if (pg7Var != null) {
            pg7Var.a();
        }
        re7Var.t(this.t);
        vml.a((bl6) this.r.b);
        super.e0();
    }

    @Override // defpackage.yzi
    public final void g0(boolean z) {
        z zVar = this.l;
        zVar.a = z;
        zVar.s();
        this.h.setVisibility(z ? 0 : 4);
    }

    public final void j0() {
        int i = this.o;
        LinearProgressIndicator linearProgressIndicator = this.i;
        if (i == 3) {
            linearProgressIndicator.setVisibility(8);
            return;
        }
        if (i != 0) {
            Context context = linearProgressIndicator.getContext();
            int iA = vep.A(this.o);
            linearProgressIndicator.f(new int[]{iA != 0 ? iA != 1 ? 0 : f03.t(2130969299, context, 2131101243) : f03.C(context)});
            Context context2 = linearProgressIndicator.getContext();
            int iA2 = vep.A(this.o);
            int iT = iA2 != 0 ? iA2 != 1 ? 0 : f03.t(2130969300, context2, 2131101243) : f03.t(2130969343, context2, 2131101243);
            p83 p83Var = ((o83) linearProgressIndicator).a;
            if (p83Var.f != iT) {
                p83Var.f = iT;
                linearProgressIndicator.invalidate();
            }
            linearProgressIndicator.setVisibility(0);
        }
    }

    public final void k0(String str) {
        boolean zIsEmpty = str.isEmpty();
        View view = this.m;
        TextView textView = this.n;
        if (zIsEmpty) {
            view.setVisibility(8);
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            view.setVisibility(0);
            textView.setVisibility(0);
        }
    }

    public final void l0(re7 re7Var) {
        long j;
        String string;
        pg7 pg7Var = this.q;
        if (pg7Var != null) {
            qg7 qg7Var = pg7Var.e;
            j = qg7Var.p.m() ? (long) pg7Var.b : qg7Var.p.i;
        } else {
            j = re7Var.i;
        }
        Context context = ((i) this).itemView.getContext();
        int[][] iArr = lg7.a;
        if (re7Var.i()) {
            string = context.getResources().getString(2132018722, aik.i(j, context), aik.i(re7Var.i() ? re7Var.j : re7Var.i, context));
        } else {
            string = aik.i(re7Var.i() ? re7Var.j : re7Var.i, context);
        }
        og7 og7Var = this.u;
        og7Var.b = false;
        String string2 = string.toString();
        TextView textView = og7Var.a;
        if (!string2.contentEquals(textView.getText())) {
            textView.setText(string);
            Context context2 = textView.getContext();
            textView.setTextColor(og7Var.b ? f03.y(context2) : f03.F(context2));
        }
        boolean zI = re7Var.i();
        LinearProgressIndicator linearProgressIndicator = this.i;
        if (zI) {
            linearProgressIndicator.setIndeterminate(false);
            long j2 = re7Var.j;
            linearProgressIndicator.setProgress((int) ((j2 <= 0 ? 0.0d : re7Var.i / j2) * 100.0d));
        } else {
            linearProgressIndicator.setProgress(0);
            if (re7Var.m()) {
                linearProgressIndicator.setIndeterminate(true);
            } else {
                linearProgressIndicator.setIndeterminate(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [android.graphics.drawable.Drawable, f3d, ig2] */
    public final void m0(re7 re7Var) {
        int i;
        if (re7Var != null) {
            Context context = ((i) this).itemView.getContext();
            int[][] iArr = lg7.a;
            kg7 kg7VarG = lg7.g(c5o.m().o(re7Var.f(), rf7.h(re7Var)));
            xbf xbfVar = this.s;
            gig gigVar = (gig) ((ode) xbfVar.c).g();
            qjd qjdVarG = gigVar.g();
            egd egdVar = qjdVarG != null ? (egd) ((tjg) xbfVar.b).k.e.get(qjdVarG.a) : null;
            boolean zE0 = gigVar.e0();
            boolean z = zE0 && egdVar != null && re7Var == egdVar.a;
            int i2 = z ? 3 : 2;
            ?? r14 = this.f;
            if (i2 == 3) {
                if (this.w != i2) {
                    r14.p(0);
                    b0(new LayerDrawable(new Drawable[]{kg7VarG.g(1, context), new w3a(r14, 17, false)}));
                }
                i = 1;
            } else {
                i = 1;
                b0(new LayerDrawable(new Drawable[]{kg7VarG.g(1, context), new w3a(kg7VarG.h(1, context), 17, false)}));
            }
            this.w = i2;
            boolean zC = re7Var.C();
            AppCompatImageView appCompatImageView = this.j;
            if (zC) {
                appCompatImageView.setVisibility(0);
            } else {
                appCompatImageView.setVisibility(8);
            }
            int i3 = kg7VarG.i(((i) this).itemView.getContext());
            if (r14.K != i3) {
                r14.K = i3;
                r14.invalidateSelf();
            }
            og7 og7Var = this.u;
            if (z) {
                bl6 bl6Var = (bl6) this.r.b;
                vml.a(bl6Var);
                vml.d(bl6Var, 1000L);
                k0("");
                long currentPosition = gigVar.getCurrentPosition();
                long duration = gigVar.getDuration();
                c5o c5oVar = this.v;
                String strT = (duration == -9223372036854775807L || egdVar.b() == o29.AUDIO_PLAYLIST) ? c5oVar.t(currentPosition) : ((i) this).itemView.getContext().getString(2132019749, c5oVar.t(currentPosition), c5oVar.t(duration));
                og7Var.b = false;
                String string = strT.toString();
                TextView textView = og7Var.a;
                if (!string.contentEquals(textView.getText())) {
                    textView.setText(strT);
                    Context context2 = textView.getContext();
                    textView.setTextColor(og7Var.b ? f03.y(context2) : f03.F(context2));
                }
                if (r14.J != zE0) {
                    r14.J = zE0;
                    if (zE0) {
                        r14.k();
                    } else {
                        r14.j();
                    }
                    r14.invalidateSelf();
                    return;
                }
                return;
            }
            int iA = vep.A(re7Var.f);
            if (iA == 0) {
                if (this.o != 1) {
                    this.o = 1;
                    j0();
                }
                l0(re7Var);
                k0("");
                return;
            }
            if (iA == i) {
                if (this.o != 2) {
                    this.o = 2;
                    j0();
                }
                l0(re7Var);
                String strD = this.p.d(((i) this).itemView.getResources());
                if (strD == null) {
                    boolean zN = re7Var.n();
                    View view = ((i) this).itemView;
                    if (zN) {
                        String string2 = view.getResources().getString(2132018668);
                        og7Var.b = false;
                        String string3 = string2.toString();
                        TextView textView2 = og7Var.a;
                        if (!string3.contentEquals(textView2.getText())) {
                            textView2.setText(string2);
                            Context context3 = textView2.getContext();
                            textView2.setTextColor(og7Var.b ? f03.y(context3) : f03.F(context3));
                        }
                    } else {
                        String string4 = view.getResources().getString(2132018667);
                        og7Var.b = false;
                        String string5 = string4.toString();
                        TextView textView3 = og7Var.a;
                        if (!string5.contentEquals(textView3.getText())) {
                            textView3.setText(string4);
                            Context context4 = textView3.getContext();
                            textView3.setTextColor(og7Var.b ? f03.y(context4) : f03.F(context4));
                        }
                    }
                } else {
                    og7Var.b = true;
                    String string6 = strD.toString();
                    TextView textView4 = og7Var.a;
                    if (!string6.contentEquals(textView4.getText())) {
                        textView4.setText(strD);
                        Context context5 = textView4.getContext();
                        textView4.setTextColor(og7Var.b ? f03.y(context5) : f03.F(context5));
                    }
                }
                k0("");
                return;
            }
            if (iA != 2) {
                if (iA != 3) {
                    return;
                }
                if (this.o != 3) {
                    this.o = 3;
                    j0();
                }
                String strI = aik.i(re7Var.i() ? re7Var.j : re7Var.i, ((i) this).itemView.getContext());
                og7Var.b = false;
                String string7 = strI.toString();
                TextView textView5 = og7Var.a;
                if (!string7.contentEquals(textView5.getText())) {
                    textView5.setText(strI);
                    Context context6 = textView5.getContext();
                    textView5.setTextColor(og7Var.b ? f03.y(context6) : f03.F(context6));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                DownloadItem downloadItem = re7Var.t;
                k0(jCurrentTimeMillis - downloadItem.n() < 60000 ? ((i) this).itemView.getResources().getString(2132018611) : aik.e(new Date(downloadItem.n())));
                return;
            }
            if (this.o != 3) {
                this.o = 3;
                j0();
            }
            String strD2 = this.p.d(((i) this).itemView.getResources());
            if (strD2 != null) {
                og7Var.b = true;
                String string8 = strD2.toString();
                TextView textView6 = og7Var.a;
                if (!string8.contentEquals(textView6.getText())) {
                    textView6.setText(strD2);
                    Context context7 = textView6.getContext();
                    textView6.setTextColor(og7Var.b ? f03.y(context7) : f03.F(context7));
                }
            } else {
                String string9 = ((i) this).itemView.getResources().getString(2132018605);
                og7Var.b = true;
                String string10 = string9.toString();
                TextView textView7 = og7Var.a;
                if (!string10.contentEquals(textView7.getText())) {
                    textView7.setText(string9);
                    Context context8 = textView7.getContext();
                    textView7.setTextColor(og7Var.b ? f03.y(context8) : f03.F(context8));
                }
            }
            k0("");
        }
    }
}
