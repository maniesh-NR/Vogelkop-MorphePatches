package com.opera.android.startpage.livescore;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.crk;
import defpackage.fb9;
import defpackage.fsp;
import defpackage.fwf;
import defpackage.kw0;
import defpackage.kze;
import defpackage.ov0;
import defpackage.qll;
import defpackage.rg;
import defpackage.ug;
import defpackage.ukc;
import defpackage.vkc;
import defpackage.z61;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/startpage/livescore/LiveScoreAudioCommentaryView;", "Landroid/widget/FrameLayout;", "ukc", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LiveScoreAudioCommentaryView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final ov0 a;
    public final kze b;
    public final nak c;
    public boolean d;
    public boolean e;

    public LiveScoreAudioCommentaryView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        LayoutInflater.from(getContext()).inflate(2131558961, this);
        int i = 2131363105;
        ImageView imageView = (ImageView) w1h.j(2131363105, this);
        if (imageView != null) {
            i = 2131363912;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131363912, this);
            if (themeableLottieAnimationView != null) {
                this.a = new ov0(this, imageView, themeableLottieAnimationView, (byte) 20);
                this.b = (kze) new z61(this).b;
                this.c = z4o.f((Object) null);
                dvb dvbVar = new dvb(new String[]{"**", "fill color", "**"});
                PointF pointF = k3d.a;
                qll qllVar = new qll(new kw0(context));
                themeableLottieAnimationView.u.add(qllVar);
                themeableLottieAnimationView.v(dvbVar, 1, new crk(qllVar, (byte) 12));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.widget.LottieAnimationView, com.opera.android.widget.ThemeableLottieAnimationView] */
    public final void a(ukc ukcVar) {
        if (ukcVar == null) {
            return;
        }
        ov0 ov0Var = this.a;
        ((ImageView) ov0Var.c).setVisibility(ukcVar == ukc.b ? 0 : 8);
        ?? r0 = (ThemeableLottieAnimationView) ov0Var.d;
        boolean z = ukcVar == ukc.c;
        r0.setVisibility(z ? 0 : 8);
        if (z) {
            r0.h();
        } else {
            r0.q();
        }
        setVisibility(ukcVar != ukc.a ? 0 : 8);
    }

    public final void b(rlh rlhVar, fwf fwfVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.k(new ug(new rg((Object) new pqh(), (Object) new ya9(rlhVar, this.c, new vkc(3, this, LiveScoreAudioCommentaryView.class, "makeViewState", "makeViewState(Lcom/opera/android/live_score/LiveCommentaryStatus;Lcom/opera/android/live_score/data/LiveScoreEvent;)Lcom/opera/android/startpage/livescore/LiveScoreAudioCommentaryView$State;", 4, (byte) 0), (byte) 0), (Object) fsp.y(fwfVar), (Object) new fb9((byte) 10, null, this), (byte) 0), (byte) 0));
    }
}
