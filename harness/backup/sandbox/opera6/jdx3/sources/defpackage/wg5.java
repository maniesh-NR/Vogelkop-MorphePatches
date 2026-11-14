package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.DropShadowFrameLayout;
import com.opera.hype.image.editor.EditImage;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes.dex */
public final /* synthetic */ class wg5 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        SerialDescriptor descriptor;
        rxh rxhVar;
        byte b = this.a;
        byte b2 = 6;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((o93) obj2).b((hjm) obj, 3);
                return Unit.a;
            case 1:
                fh5 fh5Var = (fh5) obj2;
                ra1 ra1Var = fh5Var.x;
                if (ra1Var != null) {
                    return ra1Var;
                }
                ra1 ra1Var2 = new ra1(fh5Var.a);
                fh5Var.x = ra1Var2;
                return ra1Var2;
            case 2:
                qi5 qi5Var = (qi5) obj2;
                wkn[] wknVarArr = (wkn[]) qi5Var.b;
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        xf8.E0((h42) qi5Var.c, y1j.h(new r79(new v39(new m2m(new m2m(e82.m(wknVarArr), new hf5((byte) 11)), new hf5((byte) 12)), false, new bli((byte) 13)), new bli((byte) 11), new bli((byte) 10))));
                    } else if (wknVarArr[i].a().i()) {
                        i++;
                    }
                }
                return Unit.a;
            case 3:
                t15 t15Var = (t15) obj;
                KSerializer kSerializer = ((lt5) obj2).b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    annotations = descriptor.getAnnotations();
                }
                if (annotations == null) {
                    annotations = l08.a;
                }
                t15Var.b = annotations;
                return Unit.a;
            case 4:
                qt5 qt5Var = (qt5) obj2;
                ((rt5) qt5Var.c).invoke(((List) qt5Var.e).get(((Integer) obj).intValue()));
                return Unit.a;
            case 5:
                t9f t9fVar = (t9f) obj2;
                s9f s9fVar = (s9f) obj;
                s9fVar.i = t9fVar.h;
                s9fVar.j = t9fVar.i;
                s9fVar.f = t9fVar.e;
                return Unit.a;
            case 6:
                l94 l94Var = (l94) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    l94Var.b((Object) null);
                } else if (th instanceof CancellationException) {
                    l94Var.c();
                } else {
                    l94Var.d(th);
                }
                return Unit.a;
            case 7:
                return ((sxd) obj2).call();
            case 8:
                i9c i9cVar = (i9c) obj2;
                Object obj3 = ((t0i) obj).a;
                Throwable thD = t0i.d(obj3);
                if (thD == null) {
                    ((ghj) i9cVar.d).a(new iu2(i9cVar, (byte) 23));
                } else {
                    ((x5f) i9cVar.f).R(13, thD.getMessage());
                    i9cVar.f(hsl.a);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((isd) ((wjh) obj2).d).G();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ie6 ie6Var = (ie6) obj2;
                zyk zykVar = ie6Var.j;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ie6Var.h.c(new w39(th2));
                }
                if (zykVar.isInitialized()) {
                    ((hdk) zykVar.getValue()).close();
                }
                return Unit.a;
            case 11:
                ((Boolean) obj).getClass();
                ((ml6) obj2).f();
                return Unit.a;
            case 12:
                ((Boolean) obj).getClass();
                ((zm6) obj2).f();
                return Unit.a;
            case 13:
                cq6 cq6Var = (cq6) obj2;
                if (((Boolean) cq6Var.b.d.g()).booleanValue()) {
                    ti9 ti9Var = cq6Var.d;
                    na2.B(ti9Var.a, (CoroutineContext) null, (rx5) null, new rf4((byte) 5, (mt5) null, ti9Var), 3);
                }
                return Unit.a;
            case 14:
                ((tn) obj2).a = ((Boolean) obj).booleanValue();
                return Unit.a;
            case 15:
                fna fnaVar = (fna) obj;
                fnaVar.c = ((vna) obj2).e;
                fnaVar.a.add(new ee6(2, (mt5) null));
                return Unit.a;
            case 16:
                float fFloatValue = ((Float) obj).floatValue();
                tul state = ((amj) obj2).k.getState();
                state.b(state.c.h() + fFloatValue);
                return Unit.a;
            case 17:
                mk7 mk7Var = (mk7) obj;
                long j = ((u95) ((iak) obj2).getValue()).a;
                if (!jgm.a(j, u95.g)) {
                    mk7.z0(mk7Var, j, 0L, 0.0f, 126);
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((ynb) obj2).B0();
                return Unit.a;
            case 19:
                float fFloatValue2 = ((Float) obj).floatValue();
                tul state2 = ((i8m) obj2).o.getState();
                state2.b(state2.c.h() + fFloatValue2);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                return DiskLruCache.h((DiskLruCache) obj2, (IOException) obj);
            case 21:
                ((fa7) obj2).l = true;
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                d06 d06Var = (d06) obj2;
                rh7 rh7Var = (rh7) obj;
                if (!((b8e) rh7Var).a.n) {
                    return t5m.b;
                }
                rh7 rh7Var2 = rh7Var.p;
                if (rh7Var2 != null) {
                    wg5 wg5Var = new wg5(d06Var, (byte) 22);
                    if (wg5Var.invoke(rh7Var2) == t5m.a) {
                        zch.E(rh7Var2, wg5Var);
                    }
                }
                rh7Var.p = null;
                rh7Var.o = null;
                return t5m.a;
            case 23:
                ((ni7) obj2).e.invoke(Float.valueOf(1.0f - ((Float) obj).floatValue()));
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                ((a1d) obj2).invoke();
                return Unit.a;
            case 25:
                aw9 aw9Var = (aw9) obj;
                return Boolean.valueOf(aw9Var instanceof ck7 ? ((Boolean) ((jj7) obj2).invoke(aw9Var)).booleanValue() : true);
            case 26:
                return DropShadowFrameLayout.a((DropShadowFrameLayout) obj2, (Canvas) obj);
            case 27:
                ((zo7) obj2).a.r((bp7) obj);
                return Unit.a;
            case 28:
                ba3 ba3Var = (ba3) obj2;
                xtb[] xtbVarArr = EditImage.s;
                Object tag = ((View) obj).getTag(2131363169);
                bfl bflVar = tag instanceof bfl ? (bfl) tag : null;
                return Boolean.valueOf(Intrinsics.a(bflVar != null ? bflVar.b : null, ba3Var));
            default:
                g77 g77Var = (g77) obj2;
                ChipGroup chipGroup = (ChipGroup) g77Var.b;
                chipGroup.removeAllViews();
                for (o0a o0aVar : (Iterable) ((tsd) g77Var.c).g()) {
                    Context context = chipGroup.getContext();
                    Chip qu7Var = new qu7(context, null, 6, 0);
                    tx4 tx4Var = qu7Var.e;
                    if (tx4Var != null && tx4Var.M != 0.0f) {
                        tx4Var.M = 0.0f;
                        tx4Var.m0.setStrokeWidth(0.0f);
                        if (tx4Var.L0) {
                            tx4Var.A(0.0f);
                        }
                        tx4Var.invalidateSelf();
                    }
                    float fH = z7h.h(context, 32.0f);
                    if (tx4Var != null && tx4Var.J != fH) {
                        tx4Var.J = fH;
                        tx4Var.invalidateSelf();
                        tx4Var.M();
                    }
                    float fH2 = z7h.h(context, 100.0f);
                    if (tx4Var != null && tx4Var.K != fH2) {
                        tx4Var.K = fH2;
                        tx4Var.k(tx4Var.l().a(fH2));
                    }
                    qu7Var.setMaxWidth(z7h.h(context, 200.0f));
                    qu7Var.setEllipsize(TextUtils.TruncateAt.END);
                    if (tx4Var != null) {
                        tx4Var.T(true);
                    }
                    qu7Var.i();
                    pc5 pc5Var = new pc5((Object) qu7Var, (byte) 8);
                    dll dllVarS = q9n.s(qu7Var);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, qu7Var, pc5Var);
                    }
                    pc5Var.a(qu7Var);
                    int iOrdinal = o0aVar.ordinal();
                    if (iOrdinal == 0) {
                        rxhVar = new rxh(2132017517);
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return null;
                        }
                        rxhVar = new rxh(2132017518);
                    }
                    qu7Var.setText(rxhVar.a(qu7Var.getResources()));
                    qu7Var.setOnClickListener(new jf7(g77Var, o0aVar, b2));
                    chipGroup.addView(qu7Var);
                }
                return Unit.a;
        }
    }
}
