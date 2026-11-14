package defpackage;

import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.webcore.WebcoreRpcBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class u68 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EsimActivity b;

    public /* synthetic */ u68(EsimActivity esimActivity, byte b) {
        this.a = b;
        this.b = esimActivity;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        EsimActivity esimActivity = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                s9i s9iVar = esimActivity.Y;
                if (s9iVar == null) {
                    s9iVar = null;
                }
                ((WebcoreRpcBridge) s9iVar.d).a(str);
                break;
            default:
                GURL gurl = new GURL(str);
                int i = EsimActivity.f0;
                esimActivity.q0(gurl);
                break;
        }
        return Unit.a;
    }
}
