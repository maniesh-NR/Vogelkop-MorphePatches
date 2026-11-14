package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.View;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.leanplum.utils.SizeUtil;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.chromium.content_public.browser.RenderFrameHost;

/* loaded from: classes.dex */
public class pjn implements nol, bs, hti, vlf, oeb, qc, ez4, jh4 {
    public static pjn e;
    public final /* synthetic */ byte a;
    public final Object b;
    public static final String[] c = {"UserComment", "ImageDescription"};
    public static final Object d = new Object();
    public static final String[] f = {"_data"};

    public pjn(byte b) {
        this.a = b;
        switch (b) {
            case SizeUtil.textSize1 /* 22 */:
                this.b = new a31();
                break;
            default:
                this.b = new ArrayDeque(0);
                break;
        }
    }

    public pjn(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, saj sajVar, Rect rect) {
        this.a = (byte) 21;
        jpo.l(rect.left);
        jpo.l(rect.top);
        jpo.l(rect.right);
        jpo.l(rect.bottom);
        this.b = sajVar;
    }

    public pjn(Looper looper) {
        this.a = (byte) 2;
        this.b = new zza(looper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pjn(TabCountButton tabCountButton) {
        this.a = (byte) 18;
        this.b = tabCountButton;
        u7 u7Var = new u7(this, (byte) 21);
        q9n.e(tabCountButton, u7Var);
        u7Var.a(tabCountButton);
    }

    public pjn(hjf hjfVar) {
        this.a = (byte) 5;
        this.b = new b2b(hjfVar, (byte) 0);
    }

    public /* synthetic */ pjn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static pjn c(int i, Context context) throws Resources.NotFoundException {
        jpo.i("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ihh.A);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListL = j14.L(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListL2 = j14.L(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListL3 = j14.L(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        saj sajVarI = saj.g(typedArrayObtainStyledAttributes.getResourceId(5, 0), context, typedArrayObtainStyledAttributes.getResourceId(6, 0)).i();
        typedArrayObtainStyledAttributes.recycle();
        return new pjn(colorStateListL, colorStateListL2, colorStateListL3, dimensionPixelSize, sajVarI, rect);
    }

    public static pjn h() {
        pjn pjnVar;
        synchronized (d) {
            pjnVar = e;
            if (pjnVar == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                pjn pjnVar2 = new pjn(handlerThread.getLooper());
                e = pjnVar2;
                pjnVar = pjnVar2;
            }
        }
        return pjnVar;
    }

    public static Task l(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        osp.a(1, new ypp(callable, taskCompletionSource, (byte) 3));
        return taskCompletionSource.getTask();
    }

    @Override // defpackage.bs
    public final void a(is isVar) {
        tr8 tr8Var = ((ct) this.b).G0().g;
        st stVar = isVar.c;
        Set setE = e82.E(new String[]{stVar.b, stVar.g});
        new rml(Unit.a, tr8Var.a).a(new ry7(tr8Var, setE, (byte) 7)).l();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, com.opera.android.custom_views.TabCountButton] */
    @Override // defpackage.qc
    public final void b(rc rcVar) {
        v3l v3lVar = (v3l) rcVar;
        ?? r5 = (TabCountButton) this.b;
        jf jfVar = v3lVar.b;
        int i = v3lVar.d;
        xc xcVar = jfVar.c;
        if (xcVar == null) {
            xcVar = v3lVar.a.a;
        }
        final ef efVar = new ef(cf.a);
        r5.setId(xcVar.d);
        r5.setOnClickListener(new nf(v3lVar, efVar, (byte) 20));
        final Function2 function2 = v3lVar.b.b;
        if (function2 != null) {
            final byte b = 1;
            r5.setOnLongClickListener(new View.OnLongClickListener() { // from class: vp3
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    byte b2 = b;
                    ef efVar2 = efVar;
                    Function2 function22 = function2;
                    switch (b2) {
                        case 0:
                            function22.invoke(view, efVar2);
                            break;
                        default:
                            function22.invoke(view, efVar2);
                            break;
                    }
                    return true;
                }
            });
        }
        r5.k.a(i);
        r5.setContentDescription(String.valueOf(i));
        n1h.o((View) r5, xcVar.c.a(r5.getResources()), xcVar.e);
    }

    @Override // defpackage.ez4
    public final void close() {
        ((rz4) this.b).finish();
    }

    @Override // defpackage.ez4
    public final void d() {
    }

    public final Cursor e(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.bs
    public final StatusBarDrawingFrameLayout f() {
        return ((ct) this.b).k;
    }

    public final void g(Callback callback) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((v1) obj).F(new p1(this, callback, (byte) 0));
                break;
            default:
                ((e3j) obj).F(new p1(this, callback, (byte) 4));
                break;
        }
    }

    public final vrf i(bza bzaVar, apj apjVar) {
        Context context = bzaVar.a;
        lli lliVar = bzaVar.m;
        wog wogVar = bzaVar.n;
        g29 g29Var = bzaVar.e;
        j74 j74Var = bzaVar.i;
        j74 j74Var2 = bzaVar.j;
        j74 j74Var3 = bzaVar.k;
        xm5 xm5Var = eza.b;
        Bitmap.Config config = (Bitmap.Config) xf8.J(bzaVar, xm5Var);
        xm5 xm5Var2 = eza.g;
        boolean zBooleanValue = ((Boolean) xf8.J(bzaVar, xm5Var2)).booleanValue();
        xm5 xm5Var3 = dza.a;
        boolean z = ((List) xf8.J(bzaVar, xm5Var3)).isEmpty() || e82.o(nzm.a, (Bitmap.Config) xf8.J(bzaVar, xm5Var));
        Bitmap.Config config2 = (Bitmap.Config) xf8.J(bzaVar, xm5Var);
        Bitmap.Config config3 = Bitmap.Config.HARDWARE;
        boolean z2 = (config2 == config3 && ((Bitmap.Config) xf8.J(bzaVar, xm5Var)) == config3 && !((Boolean) xf8.J(bzaVar, eza.f)).booleanValue()) ? false : true;
        if (!z || !z2) {
            config = Bitmap.Config.ARGB_8888;
        }
        boolean z3 = zBooleanValue && ((List) xf8.J(bzaVar, xm5Var3)).isEmpty() && config != Bitmap.Config.ALPHA_8;
        LinkedHashMap linkedHashMap = new LinkedHashMap(rbd.e(bzaVar.q.d.a, bzaVar.o.a));
        if (config != ((Bitmap.Config) xf8.J(bzaVar, xm5Var))) {
            if (config != null) {
                linkedHashMap.put(xm5Var, config);
            } else {
                linkedHashMap.remove(xm5Var);
            }
        }
        if (z3 != ((Boolean) xf8.J(bzaVar, xm5Var2)).booleanValue()) {
            linkedHashMap.put(xm5Var2, Boolean.valueOf(z3));
        }
        return new vrf(context, apjVar, lliVar, wogVar, g29Var, j74Var, j74Var2, j74Var3, new hn8(zi4.d0(linkedHashMap)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.net.Uri r11, android.content.Context r12, nt5 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.tg8
            if (r0 == 0) goto L13
            r0 = r13
            tg8 r0 = (defpackage.tg8) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            tg8 r0 = new tg8
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.LinkedHashMap r10 = r0.t
            ybh.y(r13)     // Catch: java.io.IOException -> L63
            goto L5f
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            r10 = 0
            return r10
        L30:
            ybh.y(r13)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.io.IOException -> L62
            java.lang.Object r10 = r10.b     // Catch: java.io.IOException -> L62
            qie r10 = (defpackage.qie) r10     // Catch: java.io.IOException -> L62
            java.lang.Object r10 = r10.b     // Catch: java.io.IOException -> L62
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.io.IOException -> L62
            jg8 r12 = new jg8     // Catch: java.io.IOException -> L62
            r12.<init>(r10)     // Catch: java.io.IOException -> L62
            c71 r4 = new c71     // Catch: java.io.IOException -> L62
            r9 = 6
            r8 = 0
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L62
            r0.t = r7     // Catch: java.io.IOException -> L62
            r0.w = r3     // Catch: java.io.IOException -> L62
            java.lang.Object r13 = na2.Z(r12, r4, r0)     // Catch: java.io.IOException -> L62
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r10 = r7
        L5f:
            kotlin.Unit r13 = (kotlin.Unit) r13     // Catch: java.io.IOException -> L63
            return r10
        L62:
            r10 = r7
        L63:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjn.j(android.net.Uri, android.content.Context, nt5):java.lang.Object");
    }

    public final synchronized void k(ux9 ux9Var) {
        ux9Var.b = null;
        ux9Var.c = null;
        ((ArrayDeque) this.b).offer(ux9Var);
    }

    public final void m(int i) {
        zz1 zz1Var = (zz1) ((u02) this.b).o;
        if (zz1Var != null) {
            zz1Var.d.a(new rxh(i), 2500);
        }
    }

    public final void n() {
        qjn qjnVar = (qjn) this.b;
        ArrayList arrayList = qjnVar.e;
        qjnVar.d();
        while (!arrayList.isEmpty()) {
            ((Callback) arrayList.remove(0)).run(qjnVar.h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(android.net.Uri r11, android.content.Context r12, java.util.Map r13, nt5 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ug8
            if (r0 == 0) goto L13
            r0 = r14
            ug8 r0 = (defpackage.ug8) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ug8 r0 = new ug8
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r14)     // Catch: java.io.IOException -> L66
            goto L5f
        L27:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            r10 = 0
            return r10
        L2e:
            ybh.y(r14)
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L3a
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        L3a:
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.io.IOException -> L66
            java.lang.Object r10 = r10.b     // Catch: java.io.IOException -> L66
            qie r10 = (defpackage.qie) r10     // Catch: java.io.IOException -> L66
            java.lang.Object r10 = r10.b     // Catch: java.io.IOException -> L66
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.io.IOException -> L66
            jg8 r12 = new jg8     // Catch: java.io.IOException -> L66
            r12.<init>(r10)     // Catch: java.io.IOException -> L66
            c71 r4 = new c71     // Catch: java.io.IOException -> L66
            r9 = 7
            r8 = 0
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L66
            r0.v = r3     // Catch: java.io.IOException -> L66
            java.lang.Object r14 = na2.Z(r12, r4, r0)     // Catch: java.io.IOException -> L66
            if (r14 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.io.IOException -> L66
            boolean r10 = r14.booleanValue()     // Catch: java.io.IOException -> L66
            goto L67
        L66:
            r10 = 0
        L67:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pjn.o(android.net.Uri, android.content.Context, java.util.Map, nt5):java.lang.Object");
    }

    public final void p(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                qmj qmjVar = ((g01) obj).w;
                qmjVar.getClass();
                new c83(qmjVar).filter(str);
                break;
            default:
                qmj qmjVar2 = ((m93) obj).r;
                qmjVar2.getClass();
                new c83(qmjVar2).filter(str);
                break;
        }
    }

    public final neb q() {
        RenderFrameHost renderFrameHost = (RenderFrameHost) this.b;
        if (renderFrameHost == null) {
            return null;
        }
        return new ek2(renderFrameHost);
    }

    @Override // defpackage.bs
    public final void r(is isVar) {
        ct ctVar = (ct) this.b;
        ju juVarG0 = ctVar.G0();
        Resources resources = ctVar.getResources();
        ot otVar = juVarG0.d;
        tw2 tw2Var = juVarG0.e;
        gt gtVar = isVar.a;
        gt gtVar2 = isVar.a;
        gt gtVar3 = gt.f;
        st stVar = isVar.c;
        if (gtVar != gtVar3) {
            st stVarG = juVarG0.g(resources, stVar);
            tw2Var.x(stVarG, stVarG.k, gtVar2);
            return;
        }
        ht htVar = stVar.e;
        if (htVar == ht.b || htVar == ht.f) {
            st stVarG2 = juVarG0.g(resources, stVar);
            tw2Var.x(stVarG2, stVarG2.k, gtVar2);
        } else {
            qb7 qb7Var = juVarG0.c;
            ((nr8) qb7Var.a).a(new mzj(stVar.a.a(resources).toString(), stVar.b, (Bitmap) null, false));
            ((u59) qb7Var.b).N(2132021602);
            tw2Var.x(stVar, true, gtVar2);
        }
        otVar.c();
        otVar.g(null);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((qc2) this.b).b.V(z ? 1 : 0, "ai_assistant_ask_aria");
    }

    public final void v(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                qmj qmjVar = ((g01) obj).w;
                qmjVar.getClass();
                new c83(qmjVar).filter(str);
                break;
            default:
                qmj qmjVar2 = ((m93) obj).r;
                qmjVar2.getClass();
                new c83(qmjVar2).filter(str);
                break;
        }
    }

    public final void w(Typeface typeface) {
        v85 v85Var = (v85) this.b;
        if (v85Var.t(typeface)) {
            v85Var.l(false);
        }
    }

    @Override // defpackage.bs
    public final void x(hs hsVar) {
        ju juVarG0 = ((ct) this.b).G0();
        qb7 qb7Var = juVarG0.c;
        String str = hsVar.c;
        p6l p6lVar = p6l.a;
        ((nr8) qb7Var.a).a(new mzj("", eti.a(str, null, 2).g(), (Bitmap) null, false));
        ((u59) qb7Var.b).N(2132021602);
        ot otVar = juVarG0.d;
        otVar.c();
        otVar.g(null);
        tw2 tw2Var = juVarG0.e;
        String str2 = hsVar.c;
        gt gtVar = hsVar.a;
        orm ormVar = (orm) tw2Var.b;
        ip0 ip0Var = wqm.x(str2) ? ip0.q : ip0.p;
        String strT = tw2.t(gtVar);
        x5f x5fVar = (x5f) ormVar;
        if (x5fVar.h) {
            x5fVar.j(1, strT, false);
        }
        x5fVar.u(ip0Var);
    }
}
