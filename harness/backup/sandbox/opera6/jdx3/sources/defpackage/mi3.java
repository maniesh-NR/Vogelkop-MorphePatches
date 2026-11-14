package defpackage;

/* loaded from: classes.dex */
public final class mi3 {
    public final y5i a;
    public final esg b = new esg((byte) 15, new nb2(this, 2), new li3(this), false);

    public mi3(y5i y5iVar) {
        this.a = y5iVar;
    }

    public static String a(sj3 sj3Var) {
        int iOrdinal = sj3Var.ordinal();
        if (iOrdinal == 0) {
            return "ADBLOCK_URL";
        }
        if (iOrdinal == 1) {
            return "CDB_URL";
        }
        if (iOrdinal == 2) {
            return "TRACKER_URL";
        }
        if (iOrdinal == 3) {
            return "ADBLOCK_CSS";
        }
        h9o.p();
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static sj3 b(String str) {
        switch (str.hashCode()) {
            case -1950387634:
                if (str.equals("ADBLOCK_CSS")) {
                    return sj3.d;
                }
                break;
            case -1950370374:
                if (str.equals("ADBLOCK_URL")) {
                    return sj3.a;
                }
                break;
            case -373190744:
                if (str.equals("TRACKER_URL")) {
                    return sj3.c;
                }
                break;
            case 1343853585:
                if (str.equals("CDB_URL")) {
                    return sj3.b;
                }
                break;
        }
        qp2.o("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }
}
