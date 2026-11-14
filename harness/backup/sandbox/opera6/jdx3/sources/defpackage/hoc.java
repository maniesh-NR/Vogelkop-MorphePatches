package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class hoc extends zkc {
    public final y83 c;
    public final okc d;
    public final i16 e;
    public final dpc f;
    public final igi g;
    public qmc h;

    public hoc(y83 y83Var, okc okcVar, pkc pkcVar, noc nocVar, rlh rlhVar, fwf fwfVar) {
        super((View) y83Var.g);
        this.c = y83Var;
        this.d = okcVar;
        final byte b = 0;
        this.e = new i16((mlc) y83Var.h, new Function0(this) { // from class: goc
            public final /* synthetic */ hoc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                hoc hocVar = this.b;
                switch (b2) {
                }
                return hocVar.h;
            }
        }, (byte) 2);
        this.f = new dpc((LiveScoreCarouselStarButton) y83Var.f, new ci7(1, okcVar, okc.class, "onStarClicked", "onStarClicked(Lcom/opera/android/live_score/data/LiveScoreEvent;)V", 0, (byte) 18));
        final byte b2 = 1;
        this.g = new igi((y83) y83Var.e, new Function0(this) { // from class: goc
            public final /* synthetic */ hoc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                hoc hocVar = this.b;
                switch (b22) {
                }
                return hocVar.h;
            }
        }, pkcVar, nocVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) y83Var.c;
        constraintLayout.setOnClickListener(new sma(this, (byte) 14));
        constraintLayout.setOnLongClickListener(new zt(this, (byte) 10));
        ((LiveScoreAudioCommentaryView) y83Var.b).b(rlhVar, fwfVar);
    }

    @Override // defpackage.zkc
    public final void U() {
        igi.r0((y83) this.g.b, false);
    }

    @Override // defpackage.zkc
    public final void V() {
        this.g.a0();
    }
}
