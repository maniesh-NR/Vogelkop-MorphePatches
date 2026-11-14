package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class j6o implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h6o b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6o(h6o h6oVar, Object obj, byte b) {
        this.a = b;
        this.b = h6oVar;
        this.c = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.c;
        h6o h6oVar = this.b;
        switch (b) {
            case 0:
                h6oVar.j.d((qk4) obj);
                return Unit.a;
            case 1:
                tsd tsdVar = (tsd) obj;
                ViewGroup viewGroup = h6oVar.k;
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559579, viewGroup, false);
                if (viewInflate == null) {
                    t3p.q("rootView");
                    return null;
                }
                return new h7o(kf.b((FrameLayout) viewInflate), h6oVar.l, tsdVar, new lrk(1, h6oVar.j, w6o.class, "onCardItemFullyVisible", "onCardItemFullyVisible$app(Lcom/opera/android/startpage/livescore/worldcup/WorldCupPromoCardAspectItem;)V", 0, (byte) 27));
            default:
                h6oVar.j.d((rk4) obj);
                return Unit.a;
        }
    }
}
