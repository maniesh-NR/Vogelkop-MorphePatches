package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.opera.android.OperaApplication;
import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class qa implements Function1 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qa(Function1 function1, Function1 function12, FrameLayout.LayoutParams layoutParams, myn mynVar, ma maVar, na naVar, nx5 nx5Var, kxn kxnVar) {
        this.b = function1;
        this.c = function12;
        this.d = layoutParams;
        this.e = mynVar;
        this.f = maVar;
        this.g = naVar;
        this.h = kxnVar;
    }

    public /* synthetic */ qa(pjn pjnVar, lqh lqhVar, lqh lqhVar2, lqh lqhVar3, lqh lqhVar4, lqh lqhVar5, r65 r65Var) {
        this.b = pjnVar;
        this.c = lqhVar;
        this.d = lqhVar2;
        this.e = lqhVar3;
        this.f = lqhVar4;
        this.g = lqhVar5;
        this.h = r65Var;
    }

    public final Object invoke(Object obj) {
        List<TCFPurpose> list;
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                return t8.c((Function1) obj8, (Function1) obj7, (FrameLayout.LayoutParams) obj6, (myn) obj5, (ma) obj4, (na) obj3, (kxn) obj2, (Context) obj);
            default:
                pjn pjnVar = (pjn) obj8;
                lqh lqhVar = (lqh) obj7;
                lqh lqhVar2 = (lqh) obj6;
                lqh lqhVar3 = (lqh) obj5;
                lqh lqhVar4 = (lqh) obj4;
                lqh lqhVar5 = (lqh) obj3;
                r65 r65Var = (r65) obj2;
                TCFData tCFData = (TCFData) obj;
                if (tCFData != null && (list = tCFData.b) != null) {
                    for (TCFPurpose tCFPurpose : list) {
                        int i = tCFPurpose.c;
                        Boolean bool = tCFPurpose.e;
                        if (i == 3) {
                            lqhVar4.a = bool != null ? bool.booleanValue() : false;
                        } else if (i == 4) {
                            lqhVar5.a = bool != null ? bool.booleanValue() : false;
                        } else if (i == 5) {
                            lqhVar2.a = bool != null ? bool.booleanValue() : false;
                        } else if (i == 6) {
                            lqhVar3.a = bool != null ? bool.booleanValue() : false;
                        }
                    }
                }
                boolean z = lqhVar.a;
                OperaApplication operaApplication = ((xv1) pjnVar.b).a;
                operaApplication.J().V(z ? 1 : 0, "collect_website_categories");
                operaApplication.C().c(1);
                operaApplication.J().V((lqhVar2.a && lqhVar3.a) ? 1 : 0, "personalized_news");
                operaApplication.C().c(32);
                operaApplication.J().V((lqhVar2.a && lqhVar3.a) ? 1 : 0, "process_news_topics");
                operaApplication.C().c(8);
                operaApplication.J().V((lqhVar4.a && lqhVar5.a) ? 1 : 0, "personalized_ads");
                operaApplication.C().c(64);
                if (!operaApplication.J().I()) {
                    operaApplication.J().V(0, "personalized_default");
                }
                r65Var.f.e();
                return Unit.a;
        }
    }
}
