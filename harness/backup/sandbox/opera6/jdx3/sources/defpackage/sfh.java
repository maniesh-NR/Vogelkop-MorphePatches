package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sfh {
    public static final sfh a;
    public static final sfh b;
    public static final sfh c;
    public static final sfh d;
    public static final /* synthetic */ sfh[] e;

    static {
        sfh sfhVar = new sfh("UNDETERMINED", 0);
        a = sfhVar;
        sfh sfhVar2 = new sfh("SLOW", 1);
        b = sfhVar2;
        sfh sfhVar3 = new sfh("MEDIUM", 2);
        c = sfhVar3;
        sfh sfhVar4 = new sfh("FAST", 3);
        d = sfhVar4;
        e = new sfh[]{sfhVar, sfhVar2, sfhVar3, sfhVar4};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        if (r0 != 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sfh d() {
        /*
            int r0 = defpackage.sle.c()
            r1 = 3
            r2 = 1
            if (r0 == r1) goto L1c
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L1c
            int r0 = defpackage.sle.c()
            if (r0 == r2) goto L2d
            r1 = 2
            if (r0 == r1) goto L2d
            goto L2a
        L1c:
            defpackage.sle.b()
            org.chromium.net.NetworkChangeNotifier r0 = org.chromium.net.NetworkChangeNotifier.getInstance()
            int r0 = r0.getCurrentConnectionSubtype(r2)
            switch(r0) {
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L33;
                case 9: goto L30;
                case 10: goto L30;
                case 11: goto L30;
                case 12: goto L30;
                case 13: goto L2d;
                case 14: goto L2d;
                case 15: goto L2d;
                case 16: goto L30;
                case 17: goto L2d;
                case 18: goto L2d;
                case 19: goto L2d;
                default: goto L2a;
            }
        L2a:
            sfh r0 = defpackage.sfh.a
            return r0
        L2d:
            sfh r0 = defpackage.sfh.d
            return r0
        L30:
            sfh r0 = defpackage.sfh.c
            return r0
        L33:
            sfh r0 = defpackage.sfh.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfh.d():sfh");
    }

    public static sfh valueOf(String str) {
        return (sfh) Enum.valueOf(sfh.class, str);
    }

    public static sfh[] values() {
        return (sfh[]) e.clone();
    }
}
