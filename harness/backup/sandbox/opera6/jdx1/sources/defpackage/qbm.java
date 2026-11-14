package defpackage;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class qbm extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ rbm j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbm(rbm rbmVar, byte b) {
        super(0);
        this.i = b;
        this.j = rbmVar;
    }

    public final Object invoke() {
        byte b = this.i;
        rbm rbmVar = this.j;
        switch (b) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(rbmVar.a);
                frameLayout.setVisibility(4);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(rbmVar.d);
                Integer num = rbmVar.c;
                if (num == null) {
                    num = rbmVar.b.a.i;
                }
                if (num != null) {
                    frameLayout.setBackgroundColor(num.intValue());
                }
                return frameLayout;
            default:
                return (FrameLayout) rbmVar.f.getValue();
        }
    }
}
