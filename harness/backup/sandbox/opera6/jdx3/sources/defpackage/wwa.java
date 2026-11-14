package defpackage;

import com.opera.hype.image.editor.EditImage;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wwa extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ ywa v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwa(ywa ywaVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ywaVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ywa ywaVar = this.v;
        switch (b) {
            case 0:
                return new wwa(ywaVar, mt5Var, (byte) 0);
            case 1:
                wwa wwaVar = new wwa(ywaVar, mt5Var, (byte) 1);
                wwaVar.u = ((Boolean) obj).booleanValue();
                return wwaVar;
            default:
                return new wwa(ywaVar, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                wwa wwaVar = new wwa(this.v, (mt5) obj2, (byte) 1);
                wwaVar.u = zBooleanValue;
                return wwaVar.invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        ywa ywaVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    this.u = true;
                    xtb[] xtbVarArr = ywa.g;
                    if (ywaVar.i0(this) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ywaVar.h0().c.setVisibility(!z2 ? 0 : 8);
                ywaVar.h0().b.setVisibility(z2 ? 8 : 0);
                break;
            default:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(1000L, this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                EditImage editImage = ywaVar.h0().e;
                WeakHashMap weakHashMap = r5n.a;
                if (!editImage.isLaidOut() || editImage.isLayoutRequested()) {
                    editImage.addOnLayoutChangeListener(new ho3(ywaVar, (byte) 4));
                } else {
                    bfl bflVar = (bfl) y1j.d(ywaVar.h0().e.f());
                    if (bflVar != null) {
                        ywaVar.h0().e.a(bflVar, true);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
