package defpackage;

import android.window.OnBackInvokedCallback;
import com.opera.ads.internal.fullscreenad.AdActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class wi implements OnBackInvokedCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onBackInvoked() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i = AdActivity.e;
                ((AdActivity) obj).a();
                break;
            case 1:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 2:
                ((xp1) obj).E();
                break;
            case 3:
                ((zcd) obj).c();
                break;
            case 4:
                ((ecf) obj).b();
                break;
            default:
                ((psl) obj).run();
                break;
        }
    }
}
