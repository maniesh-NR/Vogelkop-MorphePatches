package defpackage;

/* loaded from: classes.dex */
public final class rv0 {
    public final y5i a;

    public rv0(y5i y5iVar) {
        this.a = y5iVar;
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
    public static lu4 a(String str) {
        switch (str.hashCode()) {
            case -1003746574:
                if (str.equals("APP_DISCLAMER")) {
                    return lu4.a;
                }
                break;
            case -230135617:
                if (str.equals("APP_RESPONSE")) {
                    return lu4.b;
                }
                break;
            case -78544194:
                if (str.equals("ASSISTANT")) {
                    return lu4.d;
                }
                break;
            case 2614219:
                if (str.equals("USER")) {
                    return lu4.c;
                }
                break;
        }
        qp2.o("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }
}
