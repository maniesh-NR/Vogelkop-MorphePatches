package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.net.URL;

/* loaded from: classes.dex */
public final /* synthetic */ class upc implements b6j {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ upc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.b6j
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vpc) obj).a();
                break;
            default:
                nqe nqeVar = (nqe) obj;
                nre nreVar = (nre) nqeVar.f.b;
                if (nreVar != null) {
                    URL url = nreVar.b;
                    URL url2 = nqeVar.h;
                    if (url2 != null && !url2.toString().equals(url.toString())) {
                        Context context = nqeVar.a;
                        String[] strArr = OperaApplication.K;
                        e59 e59VarQ = ((OperaApplication) context.getApplicationContext()).q();
                        ((c59) e59VarQ.a.get(d59.e)).f(true);
                    }
                    nqeVar.h = url;
                    break;
                }
                break;
        }
    }
}
