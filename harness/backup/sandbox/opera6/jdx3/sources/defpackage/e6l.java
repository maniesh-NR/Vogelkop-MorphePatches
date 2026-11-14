package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class e6l implements srg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;

    public /* synthetic */ e6l(Set set, byte b) {
        this.a = b;
        this.b = set;
    }

    public final boolean apply(Object obj) {
        szb szbVar;
        byte b = this.a;
        Set set = this.b;
        switch (b) {
            case 0:
                szbVar = (b2l) obj;
                break;
            default:
                szbVar = (szb) obj;
                break;
        }
        return set.contains(szbVar);
    }
}
