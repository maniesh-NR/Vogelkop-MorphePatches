package defpackage;

import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dpc {
    public final LiveScoreCarouselStarButton a;
    public final Function1 b;

    static {
        int i = LiveScoreCarouselStarButton.f;
    }

    public dpc(LiveScoreCarouselStarButton liveScoreCarouselStarButton, Function1 function1) {
        this.a = liveScoreCarouselStarButton;
        this.b = function1;
    }

    public final void a(zmc zmcVar, boolean z, boolean z2) {
        nlc nlcVar;
        int i = LiveScoreCarouselStarButton.f;
        smc smcVar = zmcVar.a().f;
        omc omcVar = zmcVar.a().g;
        if (z2) {
            int iOrdinal = smcVar.ordinal();
            if (iOrdinal == 0) {
                nlcVar = nlc.a;
            } else if (iOrdinal == 1) {
                int iOrdinal2 = omcVar.ordinal();
                if (iOrdinal2 == 0) {
                    nlcVar = nlc.a;
                } else {
                    if (iOrdinal2 != 1) {
                        h9o.p();
                        return;
                    }
                    nlcVar = nlc.b;
                }
            } else {
                if (iOrdinal != 2) {
                    h9o.p();
                    return;
                }
                nlcVar = nlc.c;
            }
        } else {
            int iOrdinal3 = omcVar.ordinal();
            if (iOrdinal3 == 0) {
                nlcVar = nlc.a;
            } else {
                if (iOrdinal3 != 1) {
                    h9o.p();
                    return;
                }
                nlcVar = nlc.b;
            }
        }
        boolean z3 = nlcVar == nlc.c;
        int i2 = z ? 0 : 8;
        LiveScoreCarouselStarButton liveScoreCarouselStarButton = this.a;
        liveScoreCarouselStarButton.setVisibility(i2);
        liveScoreCarouselStarButton.a(nlcVar, false);
        jkc jkcVar = z3 ? null : new jkc(this, zmcVar, (byte) 7);
        liveScoreCarouselStarButton.setOnClickListener(jkcVar != null ? new sma(jkcVar, (byte) 17) : null);
    }
}
