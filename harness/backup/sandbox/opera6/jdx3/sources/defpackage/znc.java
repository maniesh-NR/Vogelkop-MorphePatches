package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class znc extends zkc {
    public final y83 c;
    public final okc d;
    public final ulp e;
    public final i16 f;
    public final igi g;
    public nmc h;

    public znc(y83 y83Var, okc okcVar, pkc pkcVar, noc nocVar, rlh rlhVar, fwf fwfVar) {
        super((View) y83Var.g);
        this.c = y83Var;
        this.d = okcVar;
        this.e = u55.Ro;
        final byte b = 0;
        this.f = new i16((mlc) y83Var.h, new Function0(this) { // from class: ync
            public final /* synthetic */ znc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                znc zncVar = this.b;
                switch (b2) {
                }
                return zncVar.h;
            }
        }, (byte) 2);
        final byte b2 = 1;
        this.g = new igi((y83) y83Var.f, new Function0(this) { // from class: ync
            public final /* synthetic */ znc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                znc zncVar = this.b;
                switch (b22) {
                }
                return zncVar.h;
            }
        }, pkcVar, nocVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) y83Var.c;
        constraintLayout.setOnClickListener(new sma(this, (byte) 12));
        constraintLayout.setOnLongClickListener(new zt(this, (byte) 8));
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
