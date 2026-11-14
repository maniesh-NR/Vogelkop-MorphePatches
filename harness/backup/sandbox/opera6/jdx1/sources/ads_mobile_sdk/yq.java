package ads_mobile_sdk;

import defpackage.hyo;
import defpackage.t3p;

/* loaded from: classes.dex */
public final class yq extends omm {
    public int a;
    public final int b;
    public final /* synthetic */ hyo c;

    public yq(hyo hyoVar) {
        super((byte) 2);
        this.c = hyoVar;
        this.a = 0;
        this.b = hyoVar.size();
    }

    public final byte a() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.b(i);
        }
        t3p.y();
        return (byte) 0;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }
}
