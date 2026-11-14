package defpackage;

import com.opera.android.esim.ui.EsimActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class d78 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ EsimActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d78(EsimActivity esimActivity, byte b) {
        super(0);
        this.i = b;
        this.j = esimActivity;
    }

    public final Object invoke() {
        byte b = this.i;
        EsimActivity esimActivity = this.j;
        switch (b) {
            case 0:
                return esimActivity.getViewModelStore();
            default:
                return esimActivity.getDefaultViewModelCreationExtras();
        }
    }
}
