package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class xw3 implements jr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t5d b;

    public /* synthetic */ xw3(t5d t5dVar, byte b) {
        this.a = b;
        this.b = t5dVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        t5d t5dVar = this.b;
        ChromiumContent chromiumContent = (ChromiumContent) obj;
        switch (b) {
            case 0:
                return new aeb(chromiumContent, t5dVar.n.g, t5dVar.I(chromiumContent)).g;
            default:
                List listG = t5dVar.G(chromiumContent);
                int size = listG.size();
                if (size != 0) {
                    return size != 1 ? new qz4(listG, (byte) 1) : (ype) listG.get(0);
                }
                return null;
        }
    }
}
