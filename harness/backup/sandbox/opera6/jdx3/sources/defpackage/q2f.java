package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.widget.LottieAnimationView;

/* loaded from: classes.dex */
public final class q2f extends LayoutDirectionLinearLayout implements pim {
    public final int c;
    public kqd d;
    public View.OnClickListener e;
    public OmniButtonView f;
    public final twf g;
    public final cq3 h;
    public boolean i;
    public final LottieAnimationView j;
    public final int k;
    public final int l;

    public q2f(Context context) {
        super(context);
        d(context, null);
        byte b = 1;
        this.g = new twf(this, (byte) 1);
        this.c = fan.a(4.0f, context.getResources());
        byte b2 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(2131559201, (ViewGroup) this, false);
        addView(viewInflate);
        LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) w1h.j(2131362414, viewInflate);
        if (layoutDirectionLinearLayout == null) {
            t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131362414)));
            throw null;
        }
        BubbleView bubbleView = (BubbleView) viewInflate;
        this.h = new cq3(bubbleView, layoutDirectionLinearLayout);
        LayoutInflater.from(bubbleView.getContext()).inflate(2131559165, layoutDirectionLinearLayout);
        setVisibility(8);
        layoutDirectionLinearLayout.setOnClickListener(new zvd(this, (byte) 10));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(2131362594);
        this.j = lottieAnimationView;
        this.k = f03.t(2130970448, getContext(), 2131103558);
        this.l = f03.t(2130969328, getContext(), 2131101243);
        p2f p2fVar = new p2f(this, b2);
        p2f p2fVar2 = new p2f(this, b);
        dvb dvbVar = new dvb(new String[]{"Black stripe", "Rectangle 1", "BlackStripeFill"});
        PointF pointF = k3d.a;
        lottieAnimationView.a(dvbVar, 1, p2fVar2);
        lottieAnimationView.a(new dvb(new String[]{"Bell", "Group 1", "BellFill"}), 1, p2fVar2);
        lottieAnimationView.a(new dvb(new String[]{"White stripe", "Rectangle 1", "WhiteStripeFill"}), 1, p2fVar);
    }

    public final void f(hjm hjmVar) {
        if (this.i) {
            return;
        }
        this.i = true;
        removeCallbacks(this.g);
        long j = hjmVar == hjm.a ? 100L : 250L;
        BubbleView bubbleView = (BubbleView) this.h.b;
        hpd hpdVar = new hpd(this, hjmVar, (byte) 29);
        if (bubbleView.t != null) {
            bubbleView.t = null;
        }
        LinearInterpolator linearInterpolator = lf1.f;
        bubbleView.u.animate().alpha(0.0f).setStartDelay(0L).setInterpolator(linearInterpolator).setDuration(j).withEndAction(hpdVar);
        bubbleView.a.animate().alpha(0.0f).setStartDelay(0L).setInterpolator(linearInterpolator).setDuration(j);
        bubbleView.b.animate().alpha(0.0f).setStartDelay(0L).setInterpolator(linearInterpolator).setDuration(j);
        bubbleView.c.animate().alpha(0.0f).setStartDelay(0L).setInterpolator(linearInterpolator).setDuration(j);
        bubbleView.d.animate().alpha(0.0f).setStartDelay(0L).setInterpolator(linearInterpolator).setDuration(j);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }
}
