package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zoc extends zkc {
    public final mlc c;
    public final okc d;
    public final ulp e;
    public final SimpleDateFormat f;
    public final i16 g;
    public final dpc h;
    public final igi i;
    public wmc j;

    public zoc(mlc mlcVar, okc okcVar, pkc pkcVar, noc nocVar, rlh rlhVar, fwf fwfVar) {
        super(mlcVar.f);
        this.c = mlcVar;
        this.d = okcVar;
        this.e = u55.Ro;
        this.f = new SimpleDateFormat("HH:mm", Locale.getDefault());
        final byte b = 0;
        this.g = new i16((mlc) mlcVar.j, new Function0(this) { // from class: yoc
            public final /* synthetic */ zoc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                zoc zocVar = this.b;
                switch (b2) {
                }
                return zocVar.j;
            }
        }, (byte) 2);
        this.h = new dpc((LiveScoreCarouselStarButton) mlcVar.i, new ci7(1, okcVar, okc.class, "onStarClicked", "onStarClicked(Lcom/opera/android/live_score/data/LiveScoreEvent;)V", 0, (byte) 23));
        final byte b2 = 1;
        this.i = new igi((y83) mlcVar.h, new Function0(this) { // from class: yoc
            public final /* synthetic */ zoc b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                zoc zocVar = this.b;
                switch (b22) {
                }
                return zocVar.j;
            }
        }, pkcVar, nocVar);
        ConstraintLayout constraintLayout = mlcVar.b;
        constraintLayout.setOnClickListener(new sma(this, (byte) 16));
        constraintLayout.setOnLongClickListener(new zt(this, (byte) 11));
        ((LiveScoreAudioCommentaryView) mlcVar.g).b(rlhVar, fwfVar);
    }

    @Override // defpackage.zkc
    public final void U() {
        igi.r0((y83) this.i.b, false);
    }

    @Override // defpackage.zkc
    public final void V() {
        this.i.a0();
    }
}
