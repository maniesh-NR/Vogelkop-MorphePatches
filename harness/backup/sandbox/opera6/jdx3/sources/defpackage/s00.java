package defpackage;

import android.app.Activity;
import android.location.Location;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class s00 extends bqi {
    public static boolean u;
    public static boolean v;
    public static int w;
    public final SettingsManager p;
    public final esk q;
    public final zv9 r;
    public Location s;
    public String t;

    public s00(Activity activity, SettingsManager settingsManager, esk eskVar, rm rmVar, String str, pyl pylVar, uwh uwhVar, qfb qfbVar, r68 r68Var, i3j i3jVar, ap apVar, r9g r9gVar, i5o i5oVar, zv9 zv9Var) {
        super("AdxAdsProvider", activity, yo.ADX, rmVar, str, pylVar, uwhVar, qfbVar, r68Var, i3jVar, apVar, r9gVar);
        this.p = settingsManager;
        this.q = eskVar;
        this.r = zv9Var;
        ((iy) i5oVar.a).d(new xa(i5oVar, new ab(this, (byte) 4), (byte) 6));
    }

    public static v50 p(w06 w06Var) {
        int iOrdinal = w06Var.ordinal();
        v50 v50Var = v50.j;
        switch (iOrdinal) {
            case 0:
            case 3:
                return v50.b;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 16:
            case SizeUtil.textSize0_1 /* 18 */:
            case 26:
                return v50.i;
            case 8:
                return v50.h;
            case 11:
                return v50.m;
            case 12:
            case 17:
                return v50.k;
            case 13:
                return v50.d;
            case 14:
                return v50.e;
            case 15:
                return v50.f;
            case 19:
            case SizeUtil.textSize0 /* 20 */:
            case 21:
                return v50.g;
            case SizeUtil.textSize1 /* 22 */:
            case 23:
            case SizeUtil.textSize2 /* 24 */:
                return v50.l;
            case 25:
                return v50.c;
            case 27:
            default:
                return v50Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q(defpackage.w06 r2, int r3) {
        /*
            int r2 = r2.ordinal()
            r0 = 1
            if (r2 == 0) goto L22
            r1 = 8
            if (r2 == r1) goto L1d
            r1 = 3
            if (r2 == r1) goto L1d
            r1 = 4
            if (r2 == r1) goto L18
            switch(r2) {
                case 11: goto L1d;
                case 12: goto L18;
                case 13: goto L1d;
                case 14: goto L1d;
                case 15: goto L1d;
                default: goto L14;
            }
        L14:
            switch(r2) {
                case 19: goto L1d;
                case 20: goto L1d;
                case 21: goto L1d;
                case 22: goto L22;
                case 23: goto L22;
                case 24: goto L1d;
                case 25: goto L1d;
                default: goto L17;
            }
        L17:
            goto L20
        L18:
            r3 = r3 & 2
            if (r3 == 0) goto L20
            goto L22
        L1d:
            r3 = r3 & r0
            if (r3 != 0) goto L22
        L20:
            r2 = 0
            return r2
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s00.q(w06, int):boolean");
    }

    @Override // defpackage.bqi, defpackage.bz
    public final boolean a() {
        if (v) {
            return false;
        }
        return super.a();
    }

    @Override // defpackage.bqi, defpackage.bz
    public final int c() {
        return 0;
    }

    @Override // defpackage.bqi
    public final k43 l(zy zyVar, az azVar) {
        Activity activityM = m();
        String str = this.g;
        if (activityM == null || v) {
            zyVar.onFailed(bqi.n("ads provider not available", str));
            return null;
        }
        dl dlVarA = azVar.a();
        boolean zF = azVar.f();
        rm rmVar = this.f;
        if (!zF) {
            if (rmVar == rm.NATIVE) {
                return azVar.b() ? new r00(this, activityM, zyVar, dlVarA) : new q00(this, activityM, zyVar, dlVarA, (byte) 1);
            }
            zyVar.onFailed(bqi.n("ad format not supported", str));
            return null;
        }
        if (azVar.b()) {
            zyVar.onFailed(bqi.n("ad provider does not support offline requests", str));
            return null;
        }
        if (rmVar == rm.INTERSTITIAL) {
            return new q00(this, activityM, zyVar, dlVarA, (byte) 0);
        }
        zyVar.onFailed("Facebook bidding is no longer supported");
        return null;
    }

    public final double[] r() {
        if (!this.p.i("process_location")) {
            return null;
        }
        Location location = this.s;
        if (location == null) {
            yv9 yv9VarA = this.r.a();
            Location location2 = new Location("");
            location2.setLatitude(yv9VarA.a);
            location2.setLongitude(yv9VarA.b);
            this.s = location2;
            location = location2;
        }
        if (location != null) {
            return new double[]{Math.floor(location.getLatitude() * 10.0d) / 10.0d, Math.floor(this.s.getLongitude() * 10.0d) / 10.0d};
        }
        return null;
    }
}
