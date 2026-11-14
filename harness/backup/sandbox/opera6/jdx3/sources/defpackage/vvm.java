package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import com.usercentrics.sdk.UsercentricsBanner;
import com.usercentrics.sdk.UsercentricsDialog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class vvm extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }

    public final Object invoke() {
        UsercentricsDialog usercentricsDialog;
        lzo lzoVar;
        lzo lzoVar2;
        byte b = this.i;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        a3p lviVar = null;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                WeakReference weakReferenceAccess$getActiveDialog$cp = UsercentricsBanner.access$getActiveDialog$cp();
                if (weakReferenceAccess$getActiveDialog$cp == null || (usercentricsDialog = (UsercentricsDialog) weakReferenceAccess$getActiveDialog$cp.get()) == null || !usercentricsDialog.g()) {
                    UsercentricsDialog usercentricsDialogAccess$getDialog = UsercentricsBanner.access$getDialog((UsercentricsBanner) obj4, (Context) obj3, (uwm) obj2, (Integer) null, false, (fqg) obj);
                    bxm bxmVar = (bxm) obj5;
                    if (bxmVar != null) {
                        Boolean bool = bxmVar.b;
                        Integer num = bxmVar.c;
                        List<cxm> list = bxmVar.a;
                        ArrayList arrayList = new ArrayList(k95.o(list, 10));
                        for (cxm cxmVar : list) {
                            arrayList.add(new bqg(cxmVar.a, cxmVar.b));
                        }
                        lviVar = new lvi(bool, num, arrayList);
                    }
                    usercentricsDialogAccess$getDialog.i(lviVar);
                }
                break;
            default:
                y13 y13Var = (y13) obj5;
                if (((lqh) obj4).a) {
                    guo guoVar = (guo) obj3;
                    if (guoVar.q && (lzoVar = guoVar.l) != null) {
                        lqh lqhVar = (lqh) obj2;
                        if (!lqhVar.a) {
                            lqhVar.a = true;
                            a3p a3pVar = lzoVar.a;
                            guo guoVar2 = (guo) obj;
                            if (guoVar2 != null && (lzoVar2 = guoVar2.l) != null) {
                                lviVar = lzoVar2.a;
                            }
                            if (lviVar != null) {
                                qqo qqoVar = new qqo(y13Var, (byte) 11);
                                a3pVar.bringToFront();
                                a3pVar.setVisibility(0);
                                a3pVar.setAlpha(0.0f);
                                lviVar.setVisibility(0);
                                lviVar.setAlpha(1.0f);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ObjectAnimator.ofFloat(a3pVar, "alpha", 0.0f, 1.0f).setDuration(300L), ObjectAnimator.ofFloat(lviVar, "alpha", 1.0f, 0.0f).setDuration(300L));
                                animatorSet.addListener(new al9((byte) 7, lviVar, qqoVar, false));
                                animatorSet.start();
                            } else if (y13Var != null) {
                                y13Var.invoke();
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
