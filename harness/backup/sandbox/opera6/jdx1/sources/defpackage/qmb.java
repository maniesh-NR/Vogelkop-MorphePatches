package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.textclassifier.TextClassifier;
import androidx.fragment.app.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.opera.android.suggestion.Suggestion;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.connection.RealCall;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class qmb extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmb(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmb(is6 is6Var, boolean z, z1f z1fVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 16;
        this.v = is6Var;
        this.u = z;
        this.w = z1fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qmb(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new qmb(this.v, obj2, mt5Var, (byte) 0);
            case 1:
                qmb qmbVar = new qmb((byte) 1, mt5Var, (jvj) obj2);
                qmbVar.v = obj;
                return qmbVar;
            case 2:
                return new qmb(this.v, obj2, mt5Var, (byte) 2);
            case 3:
                return new qmb(this.v, obj2, mt5Var, (byte) 3);
            case 4:
                return new qmb((byte) 4, mt5Var, (jcc) obj2);
            case 5:
                return new qmb(this.v, obj2, mt5Var, (byte) 5);
            case 6:
                return new qmb(this.v, obj2, mt5Var, (byte) 6);
            case 7:
                return new qmb(this.v, obj2, mt5Var, (byte) 7);
            case 8:
                return new qmb(this.v, obj2, mt5Var, (byte) 8);
            case 9:
                return new qmb(this.v, obj2, mt5Var, (byte) 9);
            case 10:
                qmb qmbVar2 = new qmb((byte) 10, mt5Var, (fme) obj2);
                qmbVar2.v = obj;
                return qmbVar2;
            case 11:
                return new qmb(this.v, obj2, mt5Var, (byte) 11);
            case 12:
                return new qmb(this.v, obj2, mt5Var, (byte) 12);
            case 13:
                return new qmb(this.v, obj2, mt5Var, (byte) 13);
            case 14:
                qmb qmbVar3 = new qmb((byte) 14, mt5Var, (p04) obj2);
                qmbVar3.v = obj;
                return qmbVar3;
            case 15:
                qmb qmbVar4 = new qmb((byte) 15, mt5Var, (e2f) obj2);
                qmbVar4.v = obj;
                return qmbVar4;
            case 16:
                return new qmb((is6) this.v, this.u, (z1f) obj2, mt5Var);
            case 17:
                return new qmb(this.v, obj2, mt5Var, (byte) 17);
            case 18:
                qmb qmbVar5 = new qmb((byte) 18, mt5Var, (jtf) obj2);
                qmbVar5.v = obj;
                return qmbVar5;
            case 19:
                qmb qmbVar6 = new qmb((byte) 19, mt5Var, (mt3) obj2);
                qmbVar6.v = obj;
                return qmbVar6;
            case 20:
                qmb qmbVar7 = new qmb((byte) 20, mt5Var, (mt3) obj2);
                qmbVar7.v = obj;
                return qmbVar7;
            case 21:
                return new qmb(this.v, obj2, mt5Var, (byte) 21);
            case 22:
                return new qmb(this.v, obj2, mt5Var, (byte) 22);
            case 23:
                return new qmb(this.v, obj2, mt5Var, (byte) 23);
            case 24:
                return new qmb(this.v, obj2, mt5Var, (byte) 24);
            case 25:
                return new qmb(this.v, obj2, mt5Var, (byte) 25);
            case 26:
                return new qmb((byte) 26, mt5Var, (hng) obj2);
            case 27:
                return new qmb(this.v, obj2, mt5Var, (byte) 27);
            case 28:
                return new qmb(this.v, obj2, mt5Var, (byte) 28);
            default:
                qmb qmbVar8 = new qmb((byte) 29, mt5Var, (q8h) obj2);
                qmbVar8.v = obj;
                return qmbVar8;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 10:
                return create((poe) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 18:
                return create((d8o) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 20:
                return create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 22:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 24:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 25:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 26:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 27:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 28:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((if4) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: fsl */
    public final Object invokeSuspend(Object obj) throws Exception {
        nak nakVar;
        mt5 mt5Var;
        Object objZ;
        Object objG;
        Object objH;
        CancellationException cancellationException;
        unb unbVar;
        Object objO;
        Object objQ;
        Task task;
        bqo bqoVar;
        nak nakVar2;
        Object objA;
        Object objO2;
        Object objE;
        byte b = this.t;
        byte b2 = 3;
        int i = 0;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        Object obj2 = this.w;
        byte b3 = 1;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                qd6 qd6Var = ((rmb) this.v).d;
                fb9 fb9Var = new fb9((byte) 6, (mt5) null, (Long) obj2);
                this.u = true;
                Object objA2 = qd6Var.a(new fsg(fb9Var, null, b3), this);
                return objA2 == px5Var ? px5Var : objA2;
            case 1:
                jvj jvjVar = (jvj) obj2;
                z1h z1hVar = (z1h) this.v;
                px5 px5Var2 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    z1hVar.b(Boolean.valueOf(jvjVar.d));
                    tv3 tv3Var = new tv3(z1hVar, (byte) 2);
                    jvjVar.a.b(tv3Var);
                    gv8 gv8Var = new gv8(jvjVar, tv3Var, (byte) 13);
                    this.v = null;
                    this.u = true;
                    if (w1h.h(z1hVar, gv8Var, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    pmg pmgVar = (pmg) this.v;
                    tob tobVar = new tob(b3, null, (gu6) obj2);
                    this.u = true;
                    if (z4o.n(pmgVar, tobVar, this) == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                boolean z5 = this.u;
                if (!z5) {
                    ybh.y(obj);
                    this.u = true;
                    bhg.a((hac) this.v, (s71) obj2, this);
                    return px5Var4;
                }
                if (!z5) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ybh.y(obj);
                    t3p.v();
                }
                return null;
            case 4:
                px5 px5Var5 = px5.a;
                boolean z6 = this.u;
                if (!z6) {
                    ybh.y(obj);
                    jcc jccVar = (jcc) obj2;
                    nakVar = jccVar.e;
                    oxh oxhVar = jccVar.d;
                    dgg dggVar = jhg.a;
                    this.v = nakVar;
                    this.u = true;
                    oxh oxhVar2 = oxhVar;
                    mt5Var = null;
                    objZ = na2.Z(oxhVar2.b.b(), new r8h(oxhVar2, dggVar, mt5Var, b2), this);
                    if (objZ == px5Var5) {
                        return px5Var5;
                    }
                } else {
                    if (!z6) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nak nakVar3 = (nak) this.v;
                    ybh.y(obj);
                    nakVar = nakVar3;
                    mt5Var = null;
                    objZ = obj;
                }
                g1b g1bVarU = rm5.U((Iterable) objZ);
                nakVar.getClass();
                nakVar.k(mt5Var, g1bVarU);
                return Unit.a;
            case 5:
                hkc hkcVar = (hkc) this.v;
                Unit unit = px5.a;
                boolean z7 = this.u;
                if (!z7) {
                    ybh.y(obj);
                    hx5 hx5Var = hkcVar.a;
                    this.u = true;
                    if (hx5Var.u(this) == unit) {
                        return unit;
                    }
                } else {
                    if (!z7) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                hkcVar.a.r(obj2);
                return Unit.a;
            case 6:
                px5 px5Var6 = px5.a;
                boolean z8 = this.u;
                if (!z8) {
                    ybh.y(obj);
                    z78 z78Var = new z78((plh) this.v, (byte) 7);
                    o71 o71Var = new o71((q53) obj2, (byte) 9);
                    this.u = true;
                    if (z78Var.collect(o71Var, this) == px5Var6) {
                        return px5Var6;
                    }
                } else {
                    if (!z8) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 7:
                px5 px5Var7 = px5.a;
                boolean z9 = this.u;
                if (!z9) {
                    ybh.y(obj);
                    this.u = true;
                    if (((h5e) this.v).i((t1e) obj2, 1L, this) == px5Var7) {
                        return px5Var7;
                    }
                } else {
                    if (!z9) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    Object obj3 = ((t0i) obj).a;
                }
                return Unit.a;
            case 8:
                h5e h5eVar = (h5e) this.v;
                px5 px5Var8 = px5.a;
                boolean z10 = this.u;
                if (!z10) {
                    ybh.y(obj);
                    mvm mvmVar = h5eVar.c;
                    this.u = true;
                    objG = mvmVar.g((String) obj2, this);
                    if (objG == px5Var8) {
                        return px5Var8;
                    }
                } else {
                    if (!z10) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objG = ((t0i) obj).a;
                }
                p0i p0iVar = t0i.b;
                if (!(objG instanceof q0i)) {
                    h5eVar.r();
                }
                return Unit.a;
            case 9:
                px5 px5Var9 = px5.a;
                boolean z11 = this.u;
                if (!z11) {
                    ybh.y(obj);
                    lak lakVar = (lak) this.v;
                    o71 o71Var2 = new o71((aae) obj2, (byte) 10);
                    this.u = true;
                    if (lakVar.collect(o71Var2, this) == px5Var9) {
                        return px5Var9;
                    }
                } else {
                    if (!z11) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                t3p.v();
                return null;
            case 10:
                fme fmeVar = (fme) obj2;
                poe poeVar = (poe) this.v;
                px5 px5Var10 = px5.a;
                boolean z12 = this.u;
                if (z12) {
                    if (!z12) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objH = obj;
                    return new hwj((oza) objH, fme.d(fmeVar.a, poeVar.d.a()), dd6.d);
                }
                ybh.y(obj);
                iyb iybVar = poeVar.e;
                if (iybVar == null) {
                    qp2.n("body == null");
                    return null;
                }
                this.v = poeVar;
                this.u = true;
                objH = fmeVar.h(iybVar, this);
                if (objH == px5Var10) {
                    return px5Var10;
                }
                return new hwj((oza) objH, fme.d(fmeVar.a, poeVar.d.a()), dd6.d);
            case 11:
                px5 px5Var11 = px5.a;
                boolean z13 = this.u;
                if (!z13) {
                    ybh.y(obj);
                    this.u = true;
                    if (nb6.p(1000L, this) == px5Var11) {
                        return px5Var11;
                    }
                } else {
                    if (!z13) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                qs7 qs7VarX = qs7.x();
                int i2 = q4o.a;
                qs7VarX.getClass();
                ((z1h) obj2).b(new ep5(7));
                return Unit.a;
            case 12:
                px5 px5Var12 = px5.a;
                boolean z14 = this.u;
                if (!z14) {
                    ybh.y(obj);
                    f99 f99VarT = qbe.t((jdj) this.v);
                    o71 o71Var3 = new o71((x5f) obj2, (byte) 11);
                    this.u = true;
                    if (f99VarT.collect(o71Var3, this) == px5Var12) {
                        return px5Var12;
                    }
                } else {
                    if (!z14) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 13:
                px5 px5Var13 = px5.a;
                boolean z15 = this.u;
                if (!z15) {
                    ybh.y(obj);
                    this.u = true;
                    if (((spi) ((zm9) this.v).b).g(gfe.b, (Function2) obj2, this) == px5Var13) {
                        return px5Var13;
                    }
                } else {
                    if (!z15) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 14:
                px5 px5Var14 = px5.a;
                boolean z16 = this.u;
                if (z16) {
                    if (!z16) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    unbVar = (unb) this.v;
                    try {
                        ybh.y(obj);
                        objO = obj;
                        unbVar.k((CancellationException) null);
                        return objO;
                    } catch (Throwable th) {
                        th = th;
                        cancellationException = null;
                        unbVar.k(cancellationException);
                        throw th;
                    }
                }
                ybh.y(obj);
                unb unbVarB = na2.B((nx5) this.v, null, null, new ue6(2, (mt5) null, (byte) 9), 3);
                try {
                    this.v = unbVarB;
                    this.u = true;
                    objO = p04.O((p04) obj2, this);
                    if (objO == px5Var14) {
                        return px5Var14;
                    }
                    unbVar = unbVarB;
                    unbVar.k((CancellationException) null);
                    return objO;
                } catch (Throwable th2) {
                    th = th2;
                    cancellationException = null;
                    unbVar = unbVarB;
                    unbVar.k(cancellationException);
                    throw th;
                }
            case 15:
                List list = (List) this.v;
                px5 px5Var15 = px5.a;
                boolean z17 = this.u;
                if (!z17) {
                    ybh.y(obj);
                    if (!list.isEmpty()) {
                        this.v = null;
                        this.u = true;
                        z1f z1fVar = e2f.e;
                        if (((e2f) obj2).d(list, this) == px5Var15) {
                            return px5Var15;
                        }
                    }
                } else {
                    if (!z17) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 16:
                px5 px5Var16 = px5.a;
                ybh.y(obj);
                z1f z1fVar2 = (z1f) obj2;
                ((is6) this.v).a(this.u ? z1fVar2.b : z1fVar2.c);
                return Unit.a;
            case 17:
                pqh pqhVar = (pqh) obj2;
                x3f x3fVar = (x3f) this.v;
                px5 px5Var17 = px5.a;
                boolean z18 = this.u;
                if (!z18) {
                    ybh.y(obj);
                    Iterable iterable = (Iterable) pqhVar.a;
                    ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((b58) it.next()).e);
                    }
                    this.u = true;
                    int iIntValue = ((Number) ((yqk) x3fVar.h).get()).intValue();
                    scd.q(4, "initialCapacity");
                    Object[] objArrCopyOf = new Object[4];
                    int size = arrayList.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj4 = arrayList.get(i4);
                        i4++;
                        int i5 = i + 1;
                        fsl fslVar = fslVar;
                        if (i < 0) {
                            j95.n();
                            throw fslVar;
                        }
                        w3f w3fVar = new w3f((Uri) obj4, i);
                        int i6 = i3 + 1;
                        int iB = w0b.b(objArrCopyOf.length, i6);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i3] = w3fVar;
                        i3 = i6;
                        i = i5;
                        fslVar = fslVar;
                    }
                    csh cshVarO = h1b.o(i3, objArrCopyOf);
                    nh4 nh4Var = new nh4(1, hib.b(this));
                    nh4Var.s();
                    on7 on7Var = pn7.b;
                    nh4Var.u(new v91(new w6j(iIntValue, cshVarO, pn7.f(cs5.x0(5, un7.e)), new ez(nh4Var, cshVarO, (byte) 4)), (byte) 8));
                    objQ = nh4Var.q();
                    px5 px5Var18 = px5.a;
                    if (objQ == px5Var17) {
                        return px5Var17;
                    }
                } else {
                    if (!z18) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                    objQ = obj;
                }
                if (!((Boolean) objQ).booleanValue()) {
                    return l08.a;
                }
                Iterable<b58> iterable2 = (Iterable) pqhVar.a;
                ArrayList arrayList2 = new ArrayList(k95.o(iterable2, 10));
                for (b58 b58Var : iterable2) {
                    arrayList2.add(new Suggestion(33, b58Var.c, "", ((ghf) x3fVar.i).L(b58Var.d.toString(), p6l.a), (rn9) null, (String) null, 1000, b58Var.e.toString(), 0, -1, b58Var));
                }
                return arrayList2;
            case 18:
                d8o d8oVar = (d8o) this.v;
                px5 px5Var19 = px5.a;
                boolean z19 = this.u;
                if (!z19) {
                    ybh.y(obj);
                    i54 i54Var = d8oVar.a;
                    this.v = null;
                    this.u = true;
                    Object objInvoke = ((jtf) obj2).a.invoke(i54Var, this);
                    if (objInvoke != px5.a) {
                        objInvoke = Unit.a;
                    }
                    if (objInvoke == px5Var19) {
                        return px5Var19;
                    }
                } else {
                    if (!z19) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 19:
                z1h z1hVar2 = (z1h) this.v;
                px5 px5Var20 = px5.a;
                boolean z20 = this.u;
                if (!z20) {
                    ybh.y(obj);
                    gbf gbfVar = (gbf) ((mt3) obj2).invoke();
                    b7f b7fVar = gbfVar.o;
                    z1hVar2.b(Boolean.valueOf(gbfVar.j.p()));
                    wa waVar = new wa(z1hVar2, (byte) 22);
                    b7fVar.getClass();
                    b7fVar.c(waVar);
                    s4f s4fVar = new s4f(b7fVar, waVar, (byte) 3);
                    this.v = null;
                    this.u = true;
                    if (w1h.h(z1hVar2, s4fVar, this) == px5Var20) {
                        return px5Var20;
                    }
                } else {
                    if (!z20) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 20:
                z1h z1hVar3 = (z1h) this.v;
                px5 px5Var21 = px5.a;
                boolean z21 = this.u;
                if (!z21) {
                    ybh.y(obj);
                    wjb wjbVar = new wjb(z1hVar3, (byte) 1);
                    k6l k6lVar = (k6l) ((mt3) obj2).invoke();
                    k6lVar.w.a(wjbVar);
                    d7l d7lVar = k6lVar.o;
                    String url = d7lVar != null ? d7lVar.j.getUrl() : null;
                    if (url != null && url.length() != 0) {
                        GURL gurl = new GURL(url);
                        if (gurl.b && (gurl.f().equals("http") || gurl.f().equals("https"))) {
                            z = true;
                        }
                    }
                    z1hVar3.b(Boolean.valueOf(z));
                    s4f s4fVar2 = new s4f(k6lVar, wjbVar, (byte) 4);
                    this.v = null;
                    this.u = true;
                    if (w1h.h(z1hVar3, s4fVar2, this) == px5Var21) {
                        return px5Var21;
                    }
                } else {
                    if (!z21) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 21:
                px5 px5Var22 = px5.a;
                boolean z22 = this.u;
                if (z22) {
                    if (z22) {
                        ybh.y(obj);
                        return Unit.a;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                jdj jdjVar = ((u6c) this.v).g.a;
                o71 o71Var4 = new o71((afe) obj2, (byte) 12);
                this.u = true;
                jdjVar.collect(o71Var4, this);
                return px5Var22;
            case 22:
                t0g t0gVar = (t0g) ((lld) obj2).b;
                aof aofVar = (aof) this.v;
                px5 px5Var23 = px5.a;
                boolean z23 = this.u;
                if (!z23) {
                    ybh.y(obj);
                    long j = aofVar.a.b;
                    this.u = true;
                    if (nb6.p(j, this) == px5Var23) {
                        return px5Var23;
                    }
                } else {
                    if (!z23) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                if (((aof) t0gVar.getValue()) == aofVar) {
                    t0gVar.setValue(null);
                    aofVar.b.invoke(hjm.b);
                }
                return Unit.a;
            case 23:
                px5 px5Var24 = px5.a;
                boolean z24 = this.u;
                if (!z24) {
                    ybh.y(obj);
                    this.u = true;
                    Object objInvoke2 = ((Function2) this.v).invoke((j3g) obj2, this);
                    return objInvoke2 == px5Var24 ? px5Var24 : objInvoke2;
                }
                if (z24) {
                    ybh.y(obj);
                    return obj;
                }
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                px5 px5Var25 = px5.a;
                boolean z25 = this.u;
                if (z25) {
                    if (z25) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                TextClassifier textClassifier = (TextClassifier) this.v;
                if (textClassifier == null) {
                    return null;
                }
                this.u = true;
                Object objInvoke3 = ((Function2) obj2).invoke(textClassifier, this);
                return objInvoke3 == px5Var25 ? px5Var25 : objInvoke3;
            case 25:
                px5 px5Var26 = px5.a;
                boolean z26 = this.u;
                if (z26) {
                    if (z26) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ccp ccpVar = (ccp) obj2;
                ypo ypoVar = ((ohg) this.v).a.a;
                ypoVar.getClass();
                k3k k3kVar = ccpVar.b;
                if (k3kVar.g()) {
                    k3kVar.d();
                    r rVar = ccpVar.a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog.intent.type", 4);
                    bundle.putString("package.name", ypoVar.b);
                    bundle.putInt("playcore.integrity.version.major", 1);
                    bundle.putInt("playcore.integrity.version.minor", 5);
                    bundle.putInt("playcore.integrity.version.patch", 0);
                    if ((k3kVar instanceof k3k) && (bqoVar = k3kVar.a) != null) {
                        bundle.putLong("request.token.sid", bqoVar.b);
                    }
                    int i7 = bundle.getInt("dialog.intent.type");
                    ypoVar.a.b("requestAndShowDialog(%s)", new Object[]{Integer.valueOf(i7)});
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    ypoVar.f.c(new spo(ypoVar, taskCompletionSource, bundle, rVar, taskCompletionSource, i7), taskCompletionSource);
                    task = taskCompletionSource.getTask();
                } else {
                    task = Tasks.forResult(0);
                }
                this.u = true;
                Object objB = a4h.b(task, null, this);
                return objB == px5Var26 ? px5Var26 : objB;
            case 26:
                px5 px5Var27 = px5.a;
                boolean z27 = this.u;
                if (!z27) {
                    ybh.y(obj);
                    hng hngVar = (hng) obj2;
                    nakVar2 = hngVar.l;
                    i07 i07Var = hngVar.k;
                    this.v = nakVar2;
                    this.u = true;
                    objA = i07Var.A(this);
                    if (objA == px5Var27) {
                        return px5Var27;
                    }
                } else {
                    if (!z27) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nak nakVar4 = (nak) this.v;
                    ybh.y(obj);
                    nakVar2 = nakVar4;
                    objA = obj;
                }
                fng fngVar = (fng) objA;
                nakVar2.j(fngVar != null ? fngVar.b : null);
                return Unit.a;
            case 27:
                px5 px5Var28 = px5.a;
                boolean z28 = this.u;
                try {
                    if (!z28) {
                        ybh.y(obj);
                        RealCall realCallC = ((t9f) this.v).c((kvh) obj2);
                        this.u = true;
                        objO2 = f03.o(realCallC, this);
                        if (objO2 == px5Var28) {
                            return px5Var28;
                        }
                    } else {
                        if (!z28) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                        objO2 = obj;
                    }
                    pzh pzhVar = (Closeable) objO2;
                    try {
                        pzh pzhVar2 = pzhVar;
                        String strString = pzhVar2.g.string();
                        if (!pzhVar2.q) {
                            strString = null;
                        }
                        vtp.v(pzhVar, null);
                        return strString;
                    } finally {
                    }
                } catch (IOException unused) {
                    return null;
                }
            case 28:
                px5 px5Var29 = px5.a;
                boolean z29 = this.u;
                if (!z29) {
                    ybh.y(obj);
                    this.u = true;
                    int i8 = n3h.q;
                    if (((n3h) this.v).i((String) obj2, this) == px5Var29) {
                        return px5Var29;
                    }
                } else {
                    if (!z29) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var30 = px5.a;
                boolean z30 = this.u;
                if (!z30) {
                    ybh.y(obj);
                    wvh wvhVar = (if4) this.v;
                    q8h q8hVar = (q8h) obj2;
                    this.u = true;
                    if (wvhVar instanceof qwh) {
                        objE = q8hVar.g((qwh) wvhVar, this);
                        if (objE != px5Var30) {
                            objE = Unit.a;
                        }
                    } else if (wvhVar instanceof vvh) {
                        objE = q8hVar.d((vvh) wvhVar, this);
                        if (objE != px5Var30) {
                            objE = Unit.a;
                        }
                    } else if (wvhVar instanceof xvh) {
                        objE = q8hVar.f((xvh) wvhVar, this);
                        if (objE != px5Var30) {
                            objE = Unit.a;
                        }
                    } else {
                        if (!(wvhVar instanceof wvh)) {
                            h9o.p();
                            return null;
                        }
                        objE = q8hVar.e(wvhVar, this);
                        if (objE != px5Var30) {
                            objE = Unit.a;
                        }
                    }
                    if (objE == px5Var30) {
                        return px5Var30;
                    }
                } else {
                    if (!z30) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
