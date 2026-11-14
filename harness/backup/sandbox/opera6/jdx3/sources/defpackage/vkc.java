package defpackage;

import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class vkc extends kr implements cr9 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkc(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.h;
        Object obj4 = ((kr) this).a;
        switch (b) {
            case 0:
                akc akcVar = (akc) obj;
                zmc zmcVar = (zmc) obj2;
                int i = LiveScoreAudioCommentaryView.f;
                if (!((LiveScoreAudioCommentaryView) obj4).e && zmcVar != null && zmcVar.a().j) {
                    if (akcVar instanceof zjc) {
                        Long lK0 = StringsKt.k0(((zjc) akcVar).a);
                        long j = zmcVar.a().a;
                        if (lK0 != null && lK0.longValue() == j) {
                            return ukc.c;
                        }
                    }
                    return zmcVar instanceof nmc ? ukc.a : ukc.b;
                }
                return ukc.a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((fpc) obj4).getClass();
                return !zBooleanValue ? vd0.d : zBooleanValue2 ? vd0.b : vd0.c;
        }
    }
}
