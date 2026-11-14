package defpackage;

import com.opera.android.BrowserActivity;
import java.util.function.BooleanSupplier;

/* loaded from: classes.dex */
public final /* synthetic */ class eu3 implements BooleanSupplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eu3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                BrowserActivity browserActivity = (BrowserActivity) obj;
                int i = BrowserActivity.E1;
                return browserActivity.H0().f() == e7j.c || browserActivity.getResources().getConfiguration().smallestScreenWidthDp < 600;
            case 1:
                return !((kwf) obj).n.f.contains(qwf.c);
            case 2:
                b2l b2lVar = ((mrk) obj).i.o;
                if (b2lVar != null) {
                    return ((d7l) b2lVar).j.m();
                }
                return false;
            default:
                return ((dbl) obj).t();
        }
    }
}
