package ads_mobile_sdk;

import defpackage.d3p;
import defpackage.yno;
import java.util.Map;

/* loaded from: classes.dex */
public final class i5 implements d3p {
    public final Map a;

    public i5(Map map) {
        this.a = map;
    }

    @Override // defpackage.d3p
    public final yno a(String str) {
        return (yno) this.a.get(str);
    }
}
