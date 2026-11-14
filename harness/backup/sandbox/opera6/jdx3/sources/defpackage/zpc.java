package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class zpc implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqc b;

    public /* synthetic */ zpc(aqc aqcVar, byte b) {
        this.a = b;
        this.b = aqcVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        aqc aqcVar = this.b;
        switch (b) {
            case 0:
                Integer numA = aqcVar.a((zmc) obj);
                if (numA == null) {
                    numA = num;
                }
                Integer numA2 = aqcVar.a((zmc) obj2);
                return numA.compareTo(numA2 != null ? numA2 : Integer.MAX_VALUE);
            default:
                Integer numA3 = aqcVar.a((zmc) obj);
                Integer numValueOf = Integer.valueOf(Integer.MAX_VALUE - (numA3 != null ? numA3.intValue() : 0));
                Integer numA4 = aqcVar.a((zmc) obj2);
                return numValueOf.compareTo(Integer.valueOf(Integer.MAX_VALUE - (numA4 != null ? numA4.intValue() : 0)));
        }
    }
}
