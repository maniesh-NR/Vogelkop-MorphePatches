package defpackage;

import J.N;
import com.opera.android.webapps.WebappActivity;
import java.util.Iterator;
import java.util.List;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class qz4 implements ype {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ qz4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ype
    public final boolean a(GURL gurl) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rz4) obj).q0(gurl);
                break;
            case 1:
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    if (((ype) it.next()).a(gurl)) {
                        break;
                    }
                }
                break;
            default:
                String[] strArr = wqm.a;
                if (!N.M5iQ0HEB(gurl)) {
                    xgf xgfVar = new xgf(gurl.g());
                    xgfVar.m = lqm.i;
                    xgfVar.n = true;
                    zi4.u((WebappActivity) obj, xgfVar);
                    break;
                }
                break;
        }
        return true;
    }
}
