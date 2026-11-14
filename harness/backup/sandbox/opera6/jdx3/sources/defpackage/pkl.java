package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class pkl extends j0i implements Function2 {
    public lkl u;
    public int v;
    public byte w;
    public /* synthetic */ Object x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkl(String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.y = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        pkl pklVar = new pkl(this.y, mt5Var);
        pklVar.x = obj;
        return pklVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        lkl lklVar;
        int i2;
        lkl lklVar2;
        int iK;
        int i3;
        int iK2;
        l1j l1jVar = (l1j) this.x;
        px5 px5Var = px5.a;
        byte b = this.w;
        if (b == 0) {
            ybh.y(obj);
            i = 0;
        } else {
            if (b == 1) {
                ybh.y(obj);
                return Unit.a;
            }
            if (b == 2) {
                i2 = this.v;
                lklVar = this.u;
                ybh.y(obj);
                mkl mklVar = new mkl(lklVar.a, lklVar.d);
                this.x = l1jVar;
                this.u = lklVar;
                this.v = i2;
                this.w = (byte) 3;
                l1jVar.a(this, mklVar);
                px5 px5Var2 = px5.a;
                return px5Var;
            }
            if (b != 3) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lkl lklVar3 = this.u;
            ybh.y(obj);
            i = lklVar3.c + 1;
        }
        String str = this.y;
        if (i < str.length()) {
            int i4 = i;
            while (i4 < str.length() && (iK = StringsKt.K(str, '<', i4, 4)) != -1 && (iK2 = StringsKt.K(str, '>', (i3 = iK + 1), 4)) != -1) {
                String strSubstring = str.substring(i3, iK2);
                boolean zC0 = StringsKt.c0(strSubstring, '/');
                if (zC0) {
                    strSubstring = strSubstring.substring(1);
                }
                if (ddh.v(strSubstring)) {
                    lklVar2 = new lkl(iK, iK2, strSubstring, zC0);
                    break;
                }
                i4 += iK2 + 2;
            }
            lklVar2 = null;
            if (lklVar2 == null) {
                nkl nklVar = new nkl(str.substring(i));
                this.x = null;
                this.u = null;
                this.v = i;
                this.w = (byte) 1;
                l1jVar.a(this, nklVar);
                px5 px5Var3 = px5.a;
                return px5Var;
            }
            String strSubstring2 = str.substring(i, lklVar2.b);
            if (strSubstring2.length() > 0) {
                nkl nklVar2 = new nkl(strSubstring2);
                this.x = l1jVar;
                this.u = lklVar2;
                this.v = i;
                this.w = (byte) 2;
                l1jVar.a(this, nklVar2);
                px5 px5Var4 = px5.a;
                return px5Var;
            }
            i2 = i;
            lklVar = lklVar2;
            mkl mklVar2 = new mkl(lklVar.a, lklVar.d);
            this.x = l1jVar;
            this.u = lklVar;
            this.v = i2;
            this.w = (byte) 3;
            l1jVar.a(this, mklVar2);
            px5 px5Var22 = px5.a;
            return px5Var;
        }
        return Unit.a;
    }
}
