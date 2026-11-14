package defpackage;

import java.util.List;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class tbf {
    public long a;
    public ypm b;
    public int c;
    public qwi d;
    public List e;
    public List f;

    public final qwi a() {
        if (this.d.a == nwi.b) {
            ypm ypmVar = this.b;
            if (ypmVar.g != null || !new GURL(ypmVar.e).equals(new GURL(this.b.a))) {
                iwi iwiVar = new iwi();
                nwi nwiVar = nwi.c;
                return new qwi(nwiVar, new hwi(iwiVar, nwiVar));
            }
        }
        return this.d;
    }

    public final boolean b(long j) {
        return (this.a & j) != 0;
    }
}
