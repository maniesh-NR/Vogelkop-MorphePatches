package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.opera.android.esim.ui.EsimActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w68 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ EsimActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w68(EsimActivity esimActivity, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = esimActivity;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        EsimActivity esimActivity = this.v;
        switch (b) {
            case 0:
                return new w68(esimActivity, mt5Var, (byte) 0);
            case 1:
                return new w68(esimActivity, mt5Var, (byte) 1);
            case 2:
                return new w68(esimActivity, mt5Var, (byte) 2);
            default:
                return new w68(esimActivity, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 1:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                break;
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ndc ndcVar = this.v;
        byte b2 = 1;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                Object obj2 = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    int i = EsimActivity.f0;
                    u78 u78VarG0 = ndcVar.G0();
                    Bundle extras = ndcVar.getIntent().getExtras();
                    s88 s88Var = extras != null ? (s88) ((Parcelable) j14.T(extras, "esim_destination", s88.class)) : null;
                    this.u = true;
                    obj = u78VarG0.h(s88Var, this);
                    if (obj == obj2) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                s88 s88Var2 = (s88) obj;
                int i2 = EsimActivity.f0;
                hv5 hv5Var = ((dp6) ndcVar.R.getValue()).k;
                Uri.Builder builderBuildUpon = ((Uri) ndcVar.S.getValue()).buildUpon();
                String string = ndcVar.getString(2132019347);
                switch (string.hashCode()) {
                    case -1295825987:
                        if (string.equals("es-419")) {
                            string = "es";
                            break;
                        }
                        break;
                    case 3241:
                        if (string.equals("en")) {
                            string = "en-US";
                            break;
                        }
                        break;
                    case 101385:
                        if (string.equals("fil")) {
                            string = "tl";
                            break;
                        }
                        break;
                    case 93023594:
                        if (string.equals("ar-SA")) {
                            string = "ar";
                            break;
                        }
                        break;
                    case 93827654:
                        if (string.equals("bn-IN")) {
                            string = "bn";
                            break;
                        }
                        break;
                    case 104135475:
                        if (string.equals("ms-MY")) {
                            string = "ms";
                            break;
                        }
                        break;
                    case 104552570:
                        if (string.equals("nb-NO")) {
                            string = "nb";
                            break;
                        }
                        break;
                    case 106935917:
                        if (string.equals("pt-PT")) {
                            string = "pt";
                            break;
                        }
                        break;
                }
                Uri.Builder builderAppendPath = builderBuildUpon.appendPath(string);
                if (!(s88Var2 instanceof l88)) {
                    if (!Intrinsics.a(s88Var2, m88.a)) {
                        if (!Intrinsics.a(s88Var2, o88.a)) {
                            if (!Intrinsics.a(s88Var2, p88.a)) {
                                if (!Intrinsics.a(s88Var2, n88.a)) {
                                    if (!Intrinsics.a(s88Var2, q88.a)) {
                                        if (!Intrinsics.a(s88Var2, r88.a)) {
                                            h9o.p();
                                            break;
                                        } else {
                                            builderAppendPath.appendPath("plans");
                                        }
                                    } else {
                                        builderAppendPath.appendPath("onboarding");
                                        builderAppendPath.appendPath("nonfree");
                                    }
                                } else {
                                    builderAppendPath.appendPath("onboarding");
                                }
                            }
                        } else {
                            builderAppendPath.appendPath("ineligible");
                            builderAppendPath.appendQueryParameter("view", "incompatible");
                        }
                    } else {
                        builderAppendPath.appendPath("destinations");
                    }
                } else {
                    builderAppendPath.appendPath("checkout");
                    builderAppendPath.appendPath("success");
                    builderAppendPath.appendQueryParameter("payment_ref", ((l88) s88Var2).a);
                }
                ndcVar.e0 = builderAppendPath.build();
                super/*com.opera.android.FullscreenWebActivity*/.p0();
                break;
            case 1:
                px5 px5Var = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    int i3 = EsimActivity.f0;
                    rlh rlhVar = ndcVar.G0().n;
                    z68 z68Var = new z68(ndcVar, null, (byte) 0);
                    this.u = true;
                    if (j14.v(rlhVar, z68Var, this) == px5Var) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                qp2.n("SharedFlow never completes, this call should never return.");
                break;
            case 2:
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    qcc qccVar = qcc.d;
                    w68 w68Var = new w68(ndcVar, mt5Var, b2);
                    this.u = true;
                    if (m5h.w(ndcVar, qccVar, w68Var, this) == px5Var2) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    qcc qccVar2 = qcc.d;
                    z68 z68Var2 = new z68(ndcVar, null, (byte) 1);
                    this.u = true;
                    if (m5h.w(ndcVar, qccVar2, z68Var2, this) == px5Var3) {
                        break;
                    }
                } else if (!z4) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
