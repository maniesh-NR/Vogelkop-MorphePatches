package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class qnl implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kol b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ qnl(kol kolVar, Function0 function0, byte b) {
        this.a = b;
        this.b = kolVar;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        ir irVar;
        byte b = this.a;
        Function0 function0 = this.c;
        kol kolVar = this.b;
        switch (b) {
            case 0:
                coj cojVar = (coj) obj;
                kolVar.h = null;
                if (!(cojVar instanceof boj)) {
                    if (!Intrinsics.a(cojVar, znj.a) && !Intrinsics.a(cojVar, aoj.a)) {
                        h9o.p();
                        break;
                    } else {
                        function0.invoke();
                    }
                } else {
                    ColorDrawable colorDrawable = kol.r;
                    Context context = kolVar.a;
                    Bitmap bitmap = ((boj) cojVar).a;
                    cyj cyjVarA = kolVar.a();
                    kolVar.i(xvg.p(context, new hq4(cyjVarA.b.l(context), 0, 2, bitmap), bitmap.getWidth(), bitmap.getHeight(), cyjVarA, new qs7((byte) 15)), bol.a);
                }
                break;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    Context context2 = kolVar.a;
                    cyj cyjVarA2 = kolVar.a();
                    uxj uxjVar = cyjVarA2.f;
                    y7h y7hVar = cyjVarA2.b;
                    boolean z = uxjVar.b;
                    ixh ixhVar = uxjVar.f;
                    dxh dxhVar = uxjVar.e;
                    if (z) {
                        irVar = new ir(y7hVar.k(context2), uxjVar.d.a(context2), dxhVar.a(context2), ixhVar.k(context2), uxjVar.g.k(context2), new uq8(context2, gjf.a(context2), uxjVar.c, bitmap2), new fr(bitmap2.getWidth(), bitmap2.getHeight(), (byte) 1), null, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                    } else {
                        irVar = new ir(y7hVar.k(context2), 0, dxhVar.a(context2), ixhVar.k(context2), 0, new hq4(y7hVar.l(context2), 0, 14, bitmap2), new fr(bitmap2.getWidth(), bitmap2.getHeight(), (byte) 0), null, 144);
                    }
                    kolVar.i(irVar, aol.a);
                } else {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
