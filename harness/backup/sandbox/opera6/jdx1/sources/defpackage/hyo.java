package defpackage;

import ads_mobile_sdk.hr;
import ads_mobile_sdk.yq;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class hyo extends hr {
    public abstract boolean a(hr hrVar, int i, int i2);

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yq(this);
    }
}
