package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class oo8 extends bqi {
    public static nrl q;
    public static boolean r;
    public static int s;
    public final /* synthetic */ byte p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo8(String str, Activity activity, yo yoVar, rm rmVar, String str2, pyl pylVar, uwh uwhVar, qfb qfbVar, r68 r68Var, i3j i3jVar, ap apVar, r9g r9gVar, byte b) {
        super(str, activity, yoVar, rmVar, str2, pylVar, uwhVar, qfbVar, r68Var, i3jVar, apVar, r9gVar);
        this.p = b;
    }

    @Override // defpackage.bqi, defpackage.bz
    public final boolean a() {
        switch (this.p) {
            case 1:
                if (!r) {
                    break;
                }
                break;
        }
        return super.a();
    }

    @Override // defpackage.bqi
    public final k43 l(zy zyVar, az azVar) {
        k43 no8Var;
        Activity activityM;
        rhf rhfVar;
        byte b = this.p;
        rm rmVar = this.f;
        switch (b) {
            case 0:
                dl dlVarA = azVar.a();
                int iOrdinal = rmVar.ordinal();
                if (iOrdinal == 0) {
                    no8Var = new no8(this, zyVar, dlVarA, this.h, this.i);
                } else if (iOrdinal != 5 && (activityM = m()) != null) {
                    no8Var = new mo8(this, activityM, this, zyVar, dlVarA, this.h, this.i);
                }
                break;
            default:
                Activity activityM2 = m();
                String str = this.g;
                if (activityM2 != null && !r) {
                    if (!azVar.b()) {
                        dl dlVarA2 = azVar.a();
                        if (!azVar.f()) {
                            switch (rmVar) {
                                case NATIVE:
                                    rhfVar = new rhf(this, activityM2, zyVar, dlVarA2, (byte) 2);
                                    break;
                                case BANNER_SMALL:
                                case BANNER_MEDIUM:
                                    rhfVar = new rhf(this, activityM2, zyVar, dlVarA2, (byte) 0);
                                    break;
                                case BANNER_INLINE:
                                case BANNER_INLINE_MEDIUM:
                                case INTERSTITIAL:
                                case ICON:
                                    zyVar.onFailed(bqi.n("ad format not supported", str));
                                    break;
                                default:
                                    h9o.p();
                                    break;
                            }
                        } else {
                            rhfVar = new rhf(this, activityM2, zyVar, dlVarA2, (byte) 1);
                        }
                        break;
                    } else {
                        zyVar.onFailed(bqi.n("ad provider does not support offline requests", str));
                        break;
                    }
                } else {
                    zyVar.onFailed(bqi.n("ads provider not available", str));
                    break;
                }
                break;
        }
        return null;
    }
}
