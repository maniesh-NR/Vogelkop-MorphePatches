package defpackage;

import J.N;
import ads_mobile_sdk.bw2;
import ads_mobile_sdk.gt1;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.zf1;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class xgh implements jr9 {
    public static boolean a;

    public static final Boolean A(int i, yo7 yo7Var, vg9 vg9Var, voh vohVar) {
        int iOrdinal = vg9Var.Y0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                vg9 vg9VarV = gyg.v(vg9Var);
                if (vg9VarV == null) {
                    qp2.n("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = vg9VarV.Y0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolA = A(i, yo7Var, vg9VarV, vohVar);
                        if (!Intrinsics.a(boolA, Boolean.FALSE)) {
                            return boolA;
                        }
                        if (vohVar == null) {
                            if (vg9VarV.Y0() != qg9.b) {
                                qp2.n("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            vg9 vg9VarR = gyg.r(vg9VarV);
                            if (vg9VarR == null) {
                                qp2.n("ActiveParent must have a focusedChild");
                                return null;
                            }
                            vohVar = gyg.t(vg9VarR);
                        }
                        return Boolean.valueOf(l(i, yo7Var, vg9Var, vohVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            h9o.p();
                            return null;
                        }
                        qp2.n("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (vohVar == null) {
                    vohVar = gyg.t(vg9VarV);
                }
                return Boolean.valueOf(l(i, yo7Var, vg9Var, vohVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return vg9Var.V0().a ? (Boolean) yo7Var.invoke(vg9Var) : vohVar == null ? Boolean.valueOf(k(vg9Var, i, yo7Var)) : Boolean.valueOf(x(i, yo7Var, vg9Var, vohVar));
                }
                h9o.p();
                return null;
            }
        }
        return Boolean.valueOf(k(vg9Var, i, yo7Var));
    }

    public static it1 a(zzo zzoVar, zk zkVar) {
        zf1 zf1Var;
        zf1 zf1Var2;
        it1 it1Var = new it1();
        it1Var.b = gt1.a;
        it1Var.a = 6;
        ArrayList arrayListF = zzoVar.f();
        yip yipVar = arrayListF != null ? (yip) CollectionsKt.firstOrNull(arrayListF) : null;
        if (yipVar != null) {
            Drawable drawableE = yipVar.e();
            Uri uriD = yipVar.d();
            if (uriD == null) {
                uriD = Uri.EMPTY;
            }
            zf1Var = new zf1(drawableE, uriD, yipVar.a(), yipVar.c(), yipVar.b());
        } else {
            zf1Var = null;
        }
        it1Var.f = zf1Var;
        yip icon = zzoVar.getIcon();
        if (icon != null) {
            Drawable drawableE2 = icon.e();
            Uri uriD2 = icon.d();
            if (uriD2 == null) {
                uriD2 = Uri.EMPTY;
            }
            zf1Var2 = new zf1(drawableE2, uriD2, icon.a(), icon.c(), icon.b());
        } else {
            zf1Var2 = null;
        }
        it1Var.g = zf1Var2;
        for (Map.Entry entry : rbd.c(new Pair[]{new Pair("headline", zzoVar.getHeadline()), new Pair("body", zzoVar.getBody()), new Pair("advertiser", zzoVar.getAdvertiser()), new Pair("call_to_action", zzoVar.getCallToAction()), new Pair("store", zzoVar.getStore()), new Pair("price", zzoVar.getPrice())}).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                it1Var.d.put(str, str2);
            }
        }
        it1Var.k = zzoVar.a();
        it1Var.m = zzoVar.getHasVideoContent() ? new bw2() : null;
        it1Var.r = zzoVar.getExtras();
        it1Var.s = zzoVar.e();
        it1Var.t = zzoVar.c();
        it1Var.u = zkVar;
        return it1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View] */
    public static final Activity b(ViewGroup viewGroup) {
        Activity activity;
        Activity activity2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Context context = viewGroup.getContext(); (context instanceof ContextWrapper) && linkedHashSet.add(context); context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
        }
        activity = null;
        if (activity != null) {
            return activity;
        }
        while (viewGroup.getParent() instanceof View) {
            viewGroup = (View) viewGroup.getParent();
            for (Context context2 = viewGroup.getContext(); (context2 instanceof ContextWrapper) && linkedHashSet.add(context2); context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof Activity) {
                    activity2 = (Activity) context2;
                    break;
                }
            }
            activity2 = null;
            if (activity2 != null) {
                return activity2;
            }
        }
        return null;
    }

    public static final boolean c(View view) {
        if (!view.isHardwareAccelerated()) {
            return false;
        }
        while (view != null) {
            if (view.getLayerType() == 1) {
                return false;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r10 <= r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r9 >= r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r8 <= r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r21 == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r1 >= 0.0f) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r21 != 3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r21 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (r21 != 5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        if (r21 != 6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007e, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0084, code lost:
    
        if (r11 >= 1.0f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        if (r1 >= r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        qp2.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        qp2.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r11 >= r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(defpackage.voh r18, defpackage.voh r19, defpackage.voh r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = e(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L99
            boolean r0 = e(r3, r1, r0)
            if (r0 == 0) goto L99
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L34
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L95
            goto L48
        L34:
            if (r3 != r15) goto L3b
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L95
            goto L48
        L3b:
            if (r3 != r14) goto L42
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L95
            goto L48
        L42:
            if (r3 != r13) goto L96
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L95
        L48:
            if (r3 == r0) goto L4c
            if (r3 != r15) goto L4d
        L4c:
            return r18
        L4d:
            if (r3 != r0) goto L54
            float r1 = r1.c
            float r1 = r11 - r1
            goto L66
        L54:
            if (r3 != r15) goto L5a
            float r1 = r1.a
            float r1 = r1 - r10
            goto L66
        L5a:
            if (r3 != r14) goto L61
            float r1 = r1.d
            float r1 = r9 - r1
            goto L66
        L61:
            if (r3 != r13) goto L91
            float r1 = r1.b
            float r1 = r1 - r8
        L66:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L6e
            r1 = r16
        L6e:
            if (r3 != r0) goto L72
            float r11 = r11 - r7
            goto L80
        L72:
            if (r3 != r15) goto L77
            float r11 = r2 - r10
            goto L80
        L77:
            if (r3 != r14) goto L7c
            float r11 = r9 - r5
            goto L80
        L7c:
            if (r3 != r13) goto L8d
            float r11 = r6 - r8
        L80:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L87
            r11 = r0
        L87:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8c
            return r18
        L8c:
            return r12
        L8d:
            qp2.n(r4)
            return r12
        L91:
            qp2.n(r4)
            return r12
        L95:
            return r18
        L96:
            qp2.n(r4)
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgh.d(voh, voh, voh, int):boolean");
    }

    public static final boolean e(int i, voh vohVar, voh vohVar2) {
        if (i == 3 || i == 4) {
            return vohVar.d > vohVar2.b && vohVar.b < vohVar2.d;
        }
        if (i == 5 || i == 6) {
            return vohVar.c > vohVar2.a && vohVar.a < vohVar2.c;
        }
        qp2.n("This function should only be used for 2-D focus search");
        return false;
    }

    public static ugh f(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrT = t(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrT2 = t(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        Arrays.toString(strArrT);
        Arrays.toString(strArrT2);
        return new ugh(z, new HashSet(w(strArrT)), new HashSet(w(strArrT2)));
    }

    public static final void g(View view) {
        try {
            p0i p0iVar = t0i.b;
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        } catch (Throwable unused) {
            p0i p0iVar2 = t0i.b;
        }
    }

    public static final void h(vg9 vg9Var, dfe dfeVar) {
        if (!vg9Var.a.n) {
            a8b.b("visitChildren called on an unattached node");
        }
        dfe dfeVar2 = new dfe(new b8e[16]);
        b8e b8eVar = vg9Var.a;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 == null) {
            ui6.h(dfeVar2, b8eVar);
        } else {
            dfeVar2.c(b8eVar2);
        }
        while (true) {
            int i = dfeVar2.c;
            if (i == 0) {
                return;
            }
            b8e b8eVarU = (b8e) dfeVar2.l(i - 1);
            if ((b8eVarU.d & 1024) == 0) {
                ui6.h(dfeVar2, b8eVarU);
            } else {
                while (true) {
                    if (b8eVarU == null) {
                        break;
                    }
                    if ((b8eVarU.c & 1024) != 0) {
                        dfe dfeVar3 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof vg9) {
                                vg9 vg9Var2 = (vg9) b8eVarU;
                                if (vg9Var2.n && !ui6.e0(vg9Var2).Q) {
                                    if (vg9Var2.V0().a) {
                                        dfeVar.c(vg9Var2);
                                    } else {
                                        h(vg9Var2, dfeVar);
                                    }
                                }
                            } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                int i2 = 0;
                                for (b8e b8eVar3 = ((i17) b8eVarU).p; b8eVar3 != null; b8eVar3 = b8eVar3.f) {
                                    if ((b8eVar3.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            b8eVarU = b8eVar3;
                                        } else {
                                            if (dfeVar3 == null) {
                                                dfeVar3 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar3.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar3.c(b8eVar3);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar3);
                        }
                    } else {
                        b8eVarU = b8eVarU.f;
                    }
                }
            }
        }
    }

    public static RippleDrawable i(ShapeDrawable shapeDrawable, ColorStateList colorStateList, int i) {
        float f = i;
        return new RippleDrawable(colorStateList, shapeDrawable, new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null)));
    }

    public static final vg9 j(dfe dfeVar, voh vohVar, int i) {
        voh vohVarH;
        vg9 vg9Var = null;
        if (i == 3) {
            vohVarH = vohVar.h((vohVar.c - vohVar.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            vohVarH = vohVar.h(-((vohVar.c - vohVar.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            vohVarH = vohVar.h(0.0f, (vohVar.d - vohVar.b) + 1.0f);
        } else {
            if (i != 6) {
                qp2.n("This function should only be used for 2-D focus search");
                return null;
            }
            vohVarH = vohVar.h(0.0f, -((vohVar.d - vohVar.b) + 1.0f));
        }
        Object[] objArr = dfeVar.a;
        int i2 = dfeVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            vg9 vg9Var2 = (vg9) objArr[i3];
            if (gyg.E(vg9Var2)) {
                voh vohVarT = gyg.t(vg9Var2);
                if (p(vohVarT, vohVarH, vohVar, i)) {
                    vg9Var = vg9Var2;
                    vohVarH = vohVarT;
                }
            }
        }
        return vg9Var;
    }

    public static final boolean k(vg9 vg9Var, int i, Function1 function1) {
        voh vohVar;
        dfe dfeVar = new dfe(new vg9[16]);
        h(vg9Var, dfeVar);
        int i2 = dfeVar.c;
        if (i2 <= 1) {
            vg9 vg9Var2 = (vg9) (i2 == 0 ? null : dfeVar.a[0]);
            if (vg9Var2 != null) {
                return ((Boolean) function1.invoke(vg9Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                voh vohVarT = gyg.t(vg9Var);
                float f = vohVarT.a;
                float f2 = vohVarT.b;
                vohVar = new voh(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    qp2.n("This function should only be used for 2-D focus search");
                    return false;
                }
                voh vohVarT2 = gyg.t(vg9Var);
                float f3 = vohVarT2.c;
                float f4 = vohVarT2.d;
                vohVar = new voh(f3, f4, f3, f4);
            }
            vg9 vg9VarJ = j(dfeVar, vohVar, i);
            if (vg9VarJ != null) {
                return ((Boolean) function1.invoke(vg9VarJ)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean l(int i, yo7 yo7Var, vg9 vg9Var, voh vohVar) {
        if (x(i, yo7Var, vg9Var, vohVar)) {
            return true;
        }
        Boolean bool = (Boolean) wxe.X(vg9Var, i, new jff(ui6.f0(vg9Var).l.f(), vg9Var, vohVar, i, yo7Var, (byte) 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static c30 m(t87 t87Var) {
        t87Var.d();
        return new c30((byte) 10, t87Var.c(), false);
    }

    public static final hyh n(njl njlVar, int i) {
        mjl mjlVar = njlVar.a;
        xbe xbeVar = njlVar.b;
        if (mjlVar.a.b.length() != 0) {
            int iD = xbeVar.d(i);
            if ((i != 0 && iD == xbeVar.d(i - 1)) || (i != mjlVar.a.b.length() && iD == xbeVar.d(i + 1))) {
                return njlVar.a(i);
            }
        }
        return njlVar.h(i);
    }

    public static boolean o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (c.q(Build.MODEL.toUpperCase(Locale.ROOT), (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(voh vohVar, voh vohVar2, voh vohVar3, int i) {
        if (!q(i, vohVar, vohVar3)) {
            return false;
        }
        if (!q(i, vohVar2, vohVar3) || d(vohVar3, vohVar, vohVar2, i)) {
            return true;
        }
        return !d(vohVar3, vohVar2, vohVar, i) && r(i, vohVar3, vohVar) < r(i, vohVar3, vohVar2);
    }

    public static final boolean q(int i, voh vohVar, voh vohVar2) {
        if (i == 3) {
            float f = vohVar2.c;
            float f2 = vohVar2.a;
            float f3 = vohVar.c;
            return (f > f3 || f2 >= f3) && f2 > vohVar.a;
        }
        if (i == 4) {
            float f4 = vohVar2.a;
            float f5 = vohVar2.c;
            float f6 = vohVar.a;
            return (f4 < f6 || f5 <= f6) && f5 < vohVar.c;
        }
        if (i == 5) {
            float f7 = vohVar2.d;
            float f8 = vohVar2.b;
            float f9 = vohVar.d;
            return (f7 > f9 || f8 >= f9) && f8 > vohVar.b;
        }
        if (i != 6) {
            qp2.n("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = vohVar2.b;
        float f11 = vohVar2.d;
        float f12 = vohVar.b;
        return (f10 < f12 || f11 <= f12) && f11 < vohVar.d;
    }

    public static final long r(int i, voh vohVar, voh vohVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = vohVar.a;
            f2 = vohVar2.c;
        } else if (i == 4) {
            f = vohVar2.a;
            f2 = vohVar.c;
        } else if (i == 5) {
            f = vohVar.b;
            f2 = vohVar2.d;
        } else {
            if (i != 6) {
                qp2.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = vohVar2.b;
            f2 = vohVar.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = vohVar.b;
            f3 = ((vohVar.d - f7) / 2.0f) + f7;
            f4 = vohVar2.b;
            f5 = vohVar2.d;
        } else {
            if (i != 5 && i != 6) {
                qp2.n("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = vohVar.a;
            f3 = ((vohVar.c - f8) / 2.0f) + f8;
            f4 = vohVar2.a;
            f5 = vohVar2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    public static boolean s(db dbVar, zwk zwkVar) {
        if (dbVar.f()) {
            zwkVar.getClass();
            if (!zwk.i()) {
                return false;
            }
        } else {
            if (!dbVar.d() && TextUtils.isEmpty(dbVar.c())) {
                return false;
            }
            zwkVar.getClass();
            if (!zwk.e()) {
                avj avjVar = cak.d;
                if (!avj.b(1)) {
                    return false;
                }
                int iMhJnoDjg = N.MhJnoDjg();
                if (iMhJnoDjg != 3 && iMhJnoDjg != 5) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] t(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            return new String[0];
        }
    }

    public static List u(lqj lqjVar, int i, lqj lqjVar2, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        boolean z4;
        int iT = lqjVar.t(i);
        int i2 = i + iT;
        int iF = lqjVar.f(lqjVar.q(i), lqjVar.b);
        int iF2 = lqjVar.f(lqjVar.q(i2), lqjVar.b);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (lqjVar.b[(lqjVar.q(i) * 5) + 1] & 201326592) != 0;
        lqjVar2.v(iT);
        lqjVar2.w(i3, lqjVar2.t);
        if (lqjVar.g < i2) {
            lqjVar.A(i2);
        }
        if (lqjVar.k < iF2) {
            lqjVar.B(iF2, i2);
        }
        int[] iArr = lqjVar2.b;
        int i4 = lqjVar2.t;
        int i5 = i4 * 5;
        int i6 = i * 5;
        System.arraycopy(lqjVar.b, i6, iArr, i5, (i2 * 5) - i6);
        Object[] objArr = lqjVar2.c;
        int i7 = lqjVar2.i;
        System.arraycopy(lqjVar.c, iF, objArr, i7, i3);
        int i8 = lqjVar2.v;
        iArr[i5 + 2] = i8;
        int i9 = i4 - i;
        int i10 = i4 + iT;
        int iF3 = i7 - lqjVar2.f(i4, iArr);
        int i11 = lqjVar2.m;
        int i12 = lqjVar2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i13 = i11;
        int i14 = i4;
        while (i14 < i10) {
            if (i14 != i4) {
                int i15 = (i14 * 5) + 2;
                iArr[i15] = iArr[i15] + i9;
            }
            int[] iArr2 = iArr;
            int i16 = i4;
            iArr2[(i14 * 5) + 4] = lqj.h(lqjVar2.f(i14, iArr) + iF3, i13 < i14 ? 0 : lqjVar2.k, i12, length);
            if (i14 == i13) {
                i13++;
            }
            i14++;
            i4 = i16;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        lqjVar2.m = i13;
        int iB = kqj.b(lqjVar.d, i, lqjVar.o());
        int iB2 = kqj.b(lqjVar.d, i2, lqjVar.o());
        if (iB < iB2) {
            ArrayList arrayList2 = lqjVar.d;
            arrayList = new ArrayList(iB2 - iB);
            for (int i17 = iB; i17 < iB2; i17++) {
                qt9 qt9Var = (qt9) arrayList2.get(i17);
                qt9Var.a += i9;
                arrayList.add(qt9Var);
            }
            lqjVar2.d.addAll(kqj.b(lqjVar2.d, lqjVar2.t, lqjVar2.o()), arrayList);
            arrayList2.subList(iB, iB2).clear();
        } else {
            arrayList = l08.a;
        }
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty()) {
            HashMap map = lqjVar.e;
            HashMap map2 = lqjVar2.e;
            if (map != null && map2 != null) {
                int size = arrayList3.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = lqjVar2.v;
        lqjVar2.N(i8);
        int iD = lqjVar.D(i, lqjVar.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                lqjVar.O();
                lqjVar.a(iD - lqjVar.t);
                lqjVar.O();
            }
            lqjVar.a(i - lqjVar.t);
            boolean zG = lqjVar.G();
            if (z7) {
                lqjVar.L();
                lqjVar.i();
                lqjVar.L();
                lqjVar.i();
            }
            z4 = zG;
        } else {
            boolean zH = lqjVar.H(i, iT);
            lqjVar.I(iF, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            mh5.a("Unexpectedly removed anchors");
        }
        int i20 = lqjVar2.o;
        int i21 = iArr3[i5 + 1];
        lqjVar2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            lqjVar2.t = i10;
            lqjVar2.i = i7 + i3;
        }
        if (z6) {
            lqjVar2.S(i8);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ikl v(defpackage.ikl r28, defpackage.d2c r29) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xgh.v(ikl, d2c):ikl");
    }

    public static HashSet w(String[] strArr) throws ClassNotFoundException {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
            if (!tgh.class.isAssignableFrom(cls)) {
                cls = null;
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    public static final boolean x(int i, yo7 yo7Var, vg9 vg9Var, voh vohVar) {
        vg9 vg9VarJ;
        dfe dfeVar = new dfe(new vg9[16]);
        if (!vg9Var.a.n) {
            a8b.b("visitChildren called on an unattached node");
        }
        dfe dfeVar2 = new dfe(new b8e[16]);
        b8e b8eVar = vg9Var.a;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 == null) {
            ui6.h(dfeVar2, b8eVar);
        } else {
            dfeVar2.c(b8eVar2);
        }
        while (true) {
            int i2 = dfeVar2.c;
            if (i2 == 0) {
                break;
            }
            b8e b8eVarU = (b8e) dfeVar2.l(i2 - 1);
            if ((b8eVarU.d & 1024) == 0) {
                ui6.h(dfeVar2, b8eVarU);
            } else {
                while (true) {
                    if (b8eVarU == null) {
                        break;
                    }
                    if ((b8eVarU.c & 1024) != 0) {
                        dfe dfeVar3 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof vg9) {
                                vg9 vg9Var2 = (vg9) b8eVarU;
                                if (vg9Var2.n) {
                                    dfeVar.c(vg9Var2);
                                }
                            } else if ((b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                                int i3 = 0;
                                for (b8e b8eVar3 = ((i17) b8eVarU).p; b8eVar3 != null; b8eVar3 = b8eVar3.f) {
                                    if ((b8eVar3.c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            b8eVarU = b8eVar3;
                                        } else {
                                            if (dfeVar3 == null) {
                                                dfeVar3 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar3.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar3.c(b8eVar3);
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar3);
                        }
                    } else {
                        b8eVarU = b8eVarU.f;
                    }
                }
            }
        }
        while (dfeVar.c != 0 && (vg9VarJ = j(dfeVar, vohVar, i)) != null) {
            if (vg9VarJ.V0().a) {
                return ((Boolean) yo7Var.invoke(vg9VarJ)).booleanValue();
            }
            if (l(i, yo7Var, vg9VarJ, vohVar)) {
                return true;
            }
            dfeVar.k(vg9VarJ);
        }
        return false;
    }

    public static vpb y(ikn iknVar) throws JSONException {
        vpb vpbVar = new vpb();
        int i = iknVar.a;
        JSONArray jSONArray = vpbVar.a;
        jSONArray.put(i);
        try {
            jSONArray.put(iknVar.b);
            try {
                jSONArray.put(iknVar.c);
                return vpbVar;
            } catch (JSONException e) {
                t3p.n(e);
                return null;
            }
        } catch (JSONException e2) {
            t3p.n(e2);
            return null;
        }
    }

    public static ikn z(vpb vpbVar) {
        JSONArray jSONArray = vpbVar.a;
        return new ikn(jSONArray.getInt(0), (float) jSONArray.getDouble(1), (float) jSONArray.getDouble(2));
    }
}
