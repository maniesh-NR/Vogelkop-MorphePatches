package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class oyj implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oyj(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ oyj(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        xjl xjlVar;
        byte b = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((qyj) obj4).n = new oql((String) obj, (Function1) obj3, ((Integer) obj2).intValue());
                break;
            case 1:
                t1k t1kVar = (t1k) obj4;
                Function0 function0 = (Function0) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    na2.c(gyg.P(-1820789132, new nqi(t1kVar, (byte) 9), vt9Var), gyg.P(-678441547, new is1(function0, (byte) 13), vt9Var), null, null, vt9Var, 54, 12);
                } else {
                    vt9Var.Q();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                r9h.f((b1k) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ydp) obj4).f((Drawable) obj3, (ih5) obj, aoh.m(49));
                break;
            case 4:
                dil dilVar = (dil) obj4;
                nx5 nx5Var = (nx5) obj3;
                ifl iflVar = (ifl) obj;
                Context context = (Context) obj2;
                boolean zH = dilVar.h();
                sf1 sf1VarK = dilVar.k();
                gfl gflVar = null;
                String str = sf1VarK != null ? sf1VarK.b : null;
                xjl xjlVar2 = dilVar.v;
                if (xjlVar2 != null) {
                    long j = xjlVar2.a;
                    i9f i9fVar = dilVar.b;
                    xjlVar = new xjl(upj.c(i9fVar.i((int) (j >> 32)), i9fVar.i((int) (j & 4294967295L))));
                } else {
                    xjlVar = null;
                }
                wgg wggVar = dilVar.i;
                tmi tmiVar = new tmi(dilVar, nx5Var, context, (byte) 15);
                hp7 hp7Var = xgg.a;
                if (str == null || xjlVar == null || wggVar == null) {
                    tmiVar.invoke(iflVar);
                    if (str != null && xjlVar != null) {
                        n1h.c(iflVar, context, zH, str, xjlVar.a);
                    }
                } else {
                    long j2 = xjlVar.a;
                    Object obj5 = wggVar.h;
                    pfe pfeVar = wggVar.e;
                    if (pfeVar.j()) {
                        gfl gflVar2 = (gfl) wggVar.g.getValue();
                        if (gflVar2 == null || !xjl.b(j2, gflVar2.b) || !Intrinsics.a(str, gflVar2.a)) {
                            gflVar2 = null;
                        }
                        pfeVar.l((Object) null);
                        gflVar = gflVar2;
                    }
                    if (gflVar == null) {
                        tmiVar.invoke(iflVar);
                    } else {
                        ArrayList arrayList = gflVar.d;
                        TextClassification textClassification = gflVar.c;
                        if (!textClassification.getActions().isEmpty()) {
                            iflVar.a.a(new yfl(obj5, textClassification, 0, (Drawable) arrayList.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            iflVar.a.a(new yfl(obj5, textClassification, -1, textClassification.getIcon()));
                        }
                        tmiVar.invoke(iflVar);
                        List<RemoteAction> actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i = 0; i < size; i++) {
                            actions.get(i);
                            if (i > 0) {
                                iflVar.a.a(new yfl(obj5, textClassification, i, (Drawable) arrayList.get(i)));
                            }
                        }
                    }
                    n1h.c(iflVar, context, zH, str, xjlVar.a);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                t0h.d((String) obj4, (erl) obj3, (ih5) obj, aoh.m(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xvg.a((ctn) obj4, (c8e) obj3, (ih5) obj, aoh.m(1));
                break;
            case 7:
                ((h6o) obj4).j.e((Context) obj, ((Long) obj2).longValue(), (pk4) obj3);
                break;
            default:
                ((h6o) obj4).j.e((Context) obj, ((Long) obj2).longValue(), (rk4) obj3);
                break;
        }
        return Unit.a;
    }
}
