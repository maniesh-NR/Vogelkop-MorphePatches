package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class u6n extends z6n {
    public final int b;
    public final agm c;
    public final tjn d;
    public final c5b e;
    public aln f;
    public boolean g;

    /* JADX WARN: Type inference failed for: r1v2, types: [android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public u6n(Context context, boolean z, int i, agm agmVar, tjn tjnVar) {
        k6n k6nVar = new k6n(tjnVar, (byte) 3);
        super(new ft9(context, k6nVar, k6nVar));
        this.b = i;
        this.c = agmVar;
        this.d = tjnVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(((i) this).itemView.getContext());
        ViewGroup viewGroup = (ViewGroup) ((i) this).itemView;
        View viewInflate = layoutInflaterFrom.inflate(2131559549, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i2 = 2131362594;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, viewInflate);
        if (stylingImageView != null) {
            i2 = 2131363525;
            ?? r1 = (StylingTextView) w1h.j(2131363525, viewInflate);
            if (r1 != 0) {
                this.e = new c5b((LinearLayout) viewInflate, stylingImageView, r1);
                boolean z2 = ((float) tjnVar.a()) >= ((i) this).itemView.getResources().getDimension(2131165522);
                r1.setTextAppearance(f03.E(z ? 2130971032 : 2130971029, ((i) this).itemView.getContext(), 2130971032));
                r1.setTextColor(f03.t(2130969274, ((i) this).itemView.getContext(), 2131102416));
                r1.setMaxLines(z2 ? 2 : 1);
                ((i) this).itemView.setOnClickListener(new pkm(this, (byte) 4));
                q9n.e(((i) this).itemView, new svk(this, (byte) 15));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void U(aln alnVar) {
        Context context = ((i) this).itemView.getContext();
        int iA = this.d.a();
        o2c o2cVar = new o2c(true, iA, iA, false);
        Context context2 = ((i) this).itemView.getContext();
        qjn qjnVar = new qjn(this.c, alnVar.c(context2, o2cVar), new vk2((byte) 25), o2cVar);
        int i = this.b;
        lkn lknVarA = qjnVar.a(i, context2);
        ((i) this).itemView.setBackground(lknVarA);
        ((i) this).itemView.setForeground(xgh.i((ShapeDrawable) null, ColorStateList.valueOf(context.getColor(lknVarA.a.g ? 2131103628 : 2131103629)), i));
        this.e.c.setImageResource(this.g ? 2131232024 : 2131231984);
    }
}
