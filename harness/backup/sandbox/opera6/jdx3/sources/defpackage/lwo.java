package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class lwo extends kuk implements Function2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ wjo C;
    public final /* synthetic */ sm D;
    public final /* synthetic */ eq E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Boolean G;
    public final /* synthetic */ String H;
    public final /* synthetic */ ako I;
    public wjo t;
    public sm u;
    public eq v;
    public String w;
    public Boolean x;
    public String y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwo(sm smVar, eq eqVar, mt5 mt5Var, wjo wjoVar, ako akoVar, Context context, Boolean bool, String str, String str2) {
        super(2, mt5Var);
        this.B = context;
        this.C = wjoVar;
        this.D = smVar;
        this.E = eqVar;
        this.F = str;
        this.G = bool;
        this.H = str2;
        this.I = akoVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        String str = this.H;
        lwo lwoVar = new lwo(this.D, this.E, mt5Var, this.C, this.I, this.B, this.G, this.F, str);
        lwoVar.A = obj;
        return lwoVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        rxo q0iVar;
        Context context;
        wjo wjoVar;
        sm smVar;
        String str;
        Boolean bool;
        eq eqVar;
        String str2;
        px5 px5Var = px5.a;
        boolean z = this.z;
        try {
            if (!z) {
                ybh.y(obj);
                context = this.B;
                wjoVar = this.C;
                smVar = this.D;
                eq eqVar2 = this.E;
                str = this.F;
                bool = this.G;
                String str3 = this.H;
                p0i p0iVar = t0i.b;
                oxo oxoVar = oxo.a;
                this.A = context;
                this.t = wjoVar;
                this.u = smVar;
                this.v = eqVar2;
                this.w = str;
                this.x = bool;
                this.y = str3;
                this.z = true;
                Object objE = oxo.e(context, this);
                if (objE == px5Var) {
                    return px5Var;
                }
                eqVar = eqVar2;
                str2 = str3;
                obj = objE;
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str4 = this.y;
                bool = this.x;
                str = this.w;
                eq eqVar3 = this.v;
                smVar = this.u;
                wjoVar = this.t;
                context = (Context) this.A;
                ybh.y(obj);
                str2 = str4;
                eqVar = eqVar3;
            }
            jzo jzoVar = (jzo) obj;
            oxo oxoVar2 = oxo.a;
            wjo wjoVar2 = wjoVar;
            huo huoVarA = oxo.a(context);
            hwo hwoVarG = oxo.g(context);
            mwo mwoVarB = oxo.b(wjoVar2, 1);
            wwo wwoVarC = oxo.c(context, true);
            j1p j1pVarD = oxo.d(smVar, eqVar, str, bool);
            jko.a(context, true);
            TreeSet treeSet = jko.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((txo) it.next()).a);
            }
            List listK0 = CollectionsKt.k0(linkedHashSet);
            if (listK0.isEmpty()) {
                listK0 = null;
            }
            q0iVar = new rxo(str2, Collections.singletonList(j1pVarD), huoVarA, jzoVar, wwoVarC, mwoVarB, hwoVarG, listK0 != null ? new zvo(listK0) : null);
            p0i p0iVar2 = t0i.b;
        } catch (Throwable th) {
            p0i p0iVar3 = t0i.b;
            q0iVar = new q0i(th);
        }
        ako akoVar = this.I;
        if (!(q0iVar instanceof q0i)) {
            rxo rxoVar = q0iVar;
            dap dapVar = dap.a;
            if (ynh.g == null) {
                ynh.g = new Uri.Builder().scheme("https").authority(ynh.c + ".s.adx.opera.com").appendPath("osdk").appendPath("v1").appendPath(ynh.c).appendQueryParameter("ep", ynh.f).build().toString();
            }
            String str5 = ynh.g;
            KSerializer kSerializerSerializer = rxo.Companion.serializer();
            rpb rpbVarD = fcp.d();
            zyk zykVar = gbp.a;
            dap.c(str5, new cno(new nvh(rpbVarD, kSerializerSerializer, rxoVar, (byte) 2), (byte) 11), null, akoVar);
        }
        ako akoVar2 = this.I;
        Throwable thD = t0i.d(q0iVar);
        if (thD != null) {
            akoVar2.a(0, new q0i(thD));
        }
        return new t0i(q0iVar);
    }
}
