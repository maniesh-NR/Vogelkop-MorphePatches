package defpackage;

import com.opera.android.custom_views.StylingImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class jjh implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y83 b;

    public /* synthetic */ jjh(y83 y83Var, byte b) {
        this.a = b;
        this.b = y83Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        y83 y83Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                ((StylingImageView) y83Var.d).setVisibility(num.intValue());
                break;
            default:
                ((StylingImageView) y83Var.d).setVisibility(num.intValue());
                break;
        }
        return Unit.a;
    }
}
