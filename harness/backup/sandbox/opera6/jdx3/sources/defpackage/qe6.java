package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.internal.Constants;
import com.opera.android.browser.chromium.ChromiumContent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qe6 implements w7e, gm6, zun, ori, rr9, f94, ph, ed2, vga, jz4, elf, bn, d05, hti, raj {
    public final /* synthetic */ byte a;
    public Object b;

    public qe6() {
        this.a = (byte) 0;
        this.b = new j06((byte) 1);
    }

    public /* synthetic */ qe6(byte b) {
        this.a = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qe6(RecyclerView recyclerView) {
        this(new kba(recyclerView), (byte) 15);
        this.a = (byte) 15;
    }

    public /* synthetic */ qe6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public qe6(ygh yghVar) {
        this.a = (byte) 17;
        this.b = new ga6(yghVar);
    }

    public qe6(byte[] bArr) {
        this.a = (byte) 22;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public static qe6 K(uio uioVar) {
        zch.d(uioVar, "AdSession is null");
        if (gvf.b != ((gvf) uioVar.b.c)) {
            qp2.n("Cannot create MediaEvents for JavaScript AdSession");
            return null;
        }
        if (uioVar.f) {
            qp2.n("AdSession is started");
            return null;
        }
        zch.g(uioVar);
        yp ypVar = uioVar.e;
        if (ypVar.d != null) {
            qp2.n("MediaEvents already exists for AdSession");
            return null;
        }
        qe6 qe6Var = new qe6(uioVar, (byte) 28);
        ypVar.d = qe6Var;
        return qe6Var;
    }

    public static void N(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof jba)) {
            background = new jba(view);
            view.setBackground(background);
        }
        jba jbaVar = (jba) background;
        ObjectAnimator objectAnimator = jbaVar.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(jbaVar.b, "alpha", 0, 66);
        jbaVar.e = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(200L);
        jbaVar.e.setRepeatCount(4);
        jbaVar.e.setInterpolator(jbaVar.c);
        jbaVar.e.setRepeatMode(2);
        jbaVar.e.addListener(new kc(jbaVar, (byte) 13));
        jbaVar.e.start();
    }

    public static eo2 S(sn2 sn2Var) throws gwa {
        eo2 eo2Var = sn2Var.a;
        qya qyaVar = (qya) eo2Var.a;
        Rect rect = eo2Var.e;
        try {
            byte[] bArrQ0 = sfe.Q0(qyaVar, rect, sn2Var.b, eo2Var.f);
            try {
                rg8 rg8Var = new rg8(new gh8(new ByteArrayInputStream(bArrQ0)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = eo2Var.f;
                Matrix matrix = eo2Var.g;
                RectF rectF = d2m.a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new eo2(bArrQ0, rg8Var, Constants.Crypt.KEY_LENGTH, size, rect2, i, matrix2, eo2Var.h);
            } catch (IOException e) {
                throw new gwa(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (uza e2) {
            throw new gwa(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    @Override // defpackage.jz4
    public final void A(ChromiumContent chromiumContent) {
    }

    @Override // defpackage.ori
    public final boolean B() {
        b2l b2lVar = ((mrk) ((wzg) ((ev7) this.b).h).b).i.o;
        if (b2lVar != null) {
            return ((d7l) b2lVar).j.m();
        }
        return false;
    }

    public final zw5 C(zw5 zw5Var) {
        return zw5Var instanceof ush ? zw5Var : new gx(-((zdd) this.b).m(), zw5Var);
    }

    @Override // defpackage.jz4
    public final boolean D() {
        return true;
    }

    @Override // defpackage.jz4
    public final void E(ChromiumContent chromiumContent) {
        ((l2b) this.b).v.e().d1().a(SystemClock.uptimeMillis(), false);
    }

    @Override // defpackage.zun
    public final void F(tun tunVar) {
        String strD = tunVar.d();
        r2 r2Var = (r2) this.b;
        if (strD != null) {
            r2Var.invoke(new sw7(strD));
        } else {
            r2Var.invoke(new rw7(new op6(false)));
        }
    }

    @Override // defpackage.jz4
    public final void G(ChromiumContent chromiumContent) {
        E(chromiumContent);
        ((l2b) this.b).v.e().d1().g((float) Math.ceil(r2.v.e().g.a), 0.0f);
    }

    public final void H(boolean z) {
        tah tahVar = (tah) this.b;
        if (tahVar != null) {
            tahVar.H(z);
        }
    }

    @Override // defpackage.bn
    public final void I() {
    }

    @Override // defpackage.ori
    public final void J(eri eriVar) {
        ((iv7) ((ev7) this.b).g).c(eriVar);
    }

    public final StringBuilder L() {
        xzf xzfVar = (j3) this.b;
        if (!(xzfVar instanceof xzf)) {
            return null;
        }
        StringBuilder sb = xzfVar.b.b;
        if (sb.length() != 0) {
            return sb;
        }
        return null;
    }

    public final void M(int i) {
        LinearLayout linearLayout = ((hld) this.b).l;
        if (linearLayout.isLaidOut()) {
            linearLayout.animate().alpha(0.0f).setDuration(i).setInterpolator(lf1.a).setListener(new c48((byte) 4, linearLayout, this));
        } else {
            linearLayout.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.hq6
            if (r0 == 0) goto L13
            r0 = r6
            hq6 r0 = (defpackage.hq6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            hq6 r0 = new hq6
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r5 = r6.a
            goto L44
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r6)
            pv r6 = new pv
            r2 = 7
            r6.<init>(r2, r3, r5)
            r0.v = r4
            java.lang.Object r5 = zch.A(r6, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            ea8 r6 = defpackage.ea8.a
            p0i r0 = t0i.b
            boolean r0 = r5 instanceof q0i
            if (r0 == 0) goto L4d
            return r6
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.O(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.uv9 r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.rx6
            if (r0 == 0) goto L13
            r0 = r7
            rx6 r0 = (defpackage.rx6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            rx6 r0 = new rx6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r7)
            s23 r7 = new s23
            r2 = 5
            r7.<init>(r5, r6, r3, r2)
            r0.v = r4
            java.lang.Object r5 = zch.A(r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.P(uv9, nt5):java.lang.Object");
    }

    public final void Q(skg skgVar) {
        uio uioVar = (uio) this.b;
        zch.c(uioVar);
        JSONObject jSONObject = new JSONObject();
        yqo.b(jSONObject, Constants.Params.STATE, skgVar);
        uioVar.e.d("playerStateChange", jSONObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1 != (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r0 = java.util.Arrays.copyOfRange(r2, r1, r10.limit());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final eo2 R(sn2 r11, int r12) {
        /*
            r10 = this;
            eo2 r11 = r11.a
            java.lang.Object r10 = r10.b
            ga6 r10 = (defpackage.ga6) r10
            java.lang.Object r0 = r11.a
            qya r0 = (qya) r0
            java.lang.Object r10 = r10.b
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r10 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r10
            r1 = 0
            if (r10 != 0) goto L29
            pya[] r10 = r0.A0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.u()
            int r0 = r10.capacity()
            byte[] r0 = new byte[r0]
            r10.rewind()
            r10.get(r0)
        L27:
            r2 = r0
            goto L82
        L29:
            pya[] r10 = r0.A0()
            r10 = r10[r1]
            java.nio.ByteBuffer r10 = r10.u()
            int r0 = r10.capacity()
            byte[] r2 = new byte[r0]
            r10.rewind()
            r10.get(r2)
            r3 = 2
            r4 = r3
        L41:
            int r5 = r4 + 4
            r6 = -1
            if (r5 > r0) goto L66
            r5 = r2[r4]
            if (r5 != r6) goto L66
            if (r5 != r6) goto L54
            int r5 = r4 + 1
            r5 = r2[r5]
            r6 = -38
            if (r5 == r6) goto L79
        L54:
            int r5 = r4 + 2
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r6 = r4 + 3
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L41
        L66:
            int r1 = r3 + 1
            if (r1 <= r0) goto L6c
            r1 = r6
            goto L77
        L6c:
            r4 = r2[r3]
            if (r4 != r6) goto L98
            r4 = r2[r1]
            r5 = -40
            if (r4 != r5) goto L98
            r1 = r3
        L77:
            if (r1 == r6) goto L82
        L79:
            int r10 = r10.limit()
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r1, r10)
            goto L27
        L82:
            rg8 r3 = r11.b
            java.util.Objects.requireNonNull(r3)
            android.util.Size r5 = r11.d
            android.graphics.Rect r6 = r11.e
            int r7 = r11.f
            android.graphics.Matrix r8 = r11.g
            yb4 r9 = r11.h
            eo2 r1 = new eo2
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L98:
            r4 = r12
            r3 = r1
            r12 = r4
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.R(sn2, int):eo2");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(defpackage.uv9 r14, nt5 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.sx6
            if (r0 == 0) goto L13
            r0 = r15
            sx6 r0 = (defpackage.sx6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            sx6 r0 = new sx6
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uv9 r14 = r0.t
            ybh.y(r15)
            goto L44
        L29:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            r13 = 0
            return r13
        L30:
            ybh.y(r15)
            java.lang.Object r13 = r13.b
            ft6 r13 = (defpackage.ft6) r13
            yc1 r13 = r13.e
            r0.t = r14
            r0.w = r3
            java.lang.Object r15 = cs5.E(r13, r0)
            if (r15 != r1) goto L44
            return r1
        L44:
            uv9 r15 = (defpackage.uv9) r15
            if (r15 != 0) goto L4b
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        L4b:
            ebb r13 = r14.c
            ebb r0 = r15.c
            long r0 = r13.g(r0)
            float[] r12 = new float[r3]
            double r4 = r15.a
            double r6 = r15.b
            double r8 = r14.a
            double r10 = r14.b
            android.location.Location.distanceBetween(r4, r6, r8, r10, r12)
            r13 = 0
            r14 = r12[r13]
            on7 r15 = pn7.b
            un7 r15 = un7.f
            long r0 = pn7.p(r0, r15)
            float r15 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r15 = r15 * r0
            r0 = 1097859072(0x41700000, float:15.0)
            float r15 = r15 / r0
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r0 = r0 - r15
            r15 = 1120403456(0x42c80000, float:100.0)
            float r15 = java.lang.Math.max(r15, r0)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L80
            r3 = r13
        L80:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.T(uv9, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r11 != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [uu5] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [uu5] */
    /* JADX WARN: Type inference failed for: r6v6, types: [uu5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(pna r7, kotlin.jvm.functions.Function1 r8, x9m r9, java.lang.String r10, mt5 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.kyb
            if (r0 == 0) goto L13
            r0 = r11
            kyb r0 = (defpackage.kyb) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            kyb r0 = new kyb
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            ybh.y(r11)
            return r11
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r5
        L31:
            uu5 r6 = r0.t
            ybh.y(r11)     // Catch: java.lang.Throwable -> L86
            goto L7e
        L37:
            ybh.y(r11)
            s9m r9 = rih.i(r10, r9)
            x9m r10 = r9.c
            itb r11 = r10.a
            java.lang.Class<yqa> r2 = defpackage.yqa.class
            s15 r2 = uqh.a(r2)
            boolean r11 = kotlin.jvm.internal.Intrinsics.a(r11, r2)
            r2 = 0
            if (r11 == 0) goto L5d
            spa r6 = new spa
            r6.<init>()
            r8.invoke(r6)
            yqa r8 = new yqa
            r8.<init>(r6, r7, r2)
            return r8
        L5d:
            java.lang.Object r6 = r6.b
            jyb r6 = (jyb) r6
            uu5 r6 = r6.a(r9)
            if (r6 == 0) goto L99
            spa r9 = new spa     // Catch: java.lang.Throwable -> L86
            r9.<init>()     // Catch: java.lang.Throwable -> L86
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L86
            yqa r8 = new yqa     // Catch: java.lang.Throwable -> L86
            r8.<init>(r9, r7, r2)     // Catch: java.lang.Throwable -> L86
            r0.t = r6     // Catch: java.lang.Throwable -> L86
            r0.w = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r11 = r8.e(r0)     // Catch: java.lang.Throwable -> L86
            if (r11 == r1) goto L97
        L7e:
            fr6 r11 = (fr6) r11     // Catch: java.lang.Throwable -> L86
            myb r7 = new myb     // Catch: java.lang.Throwable -> L86
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L86
            goto L8d
        L86:
            r7 = move-exception
            lyb r8 = new lyb
            r8.<init>(r7)
            r7 = r8
        L8d:
            r0.t = r5
            r0.w = r3
            java.lang.Object r6 = r6.l(r7, r0)
            if (r6 != r1) goto L98
        L97:
            return r1
        L98:
            return r6
        L99:
            java.lang.String r6 = "No SuspendResponseConverter found to convert "
            defpackage.pza.i(r10, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.U(pna, kotlin.jvm.functions.Function1, x9m, java.lang.String, mt5):java.lang.Object");
    }

    public final void V(float f) {
        if (f < 0.0f || f > 1.0f) {
            qp2.o("Invalid Media volume");
            return;
        }
        uio uioVar = (uio) this.b;
        zch.c(uioVar);
        JSONObject jSONObject = new JSONObject();
        yqo.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        yqo.b(jSONObject, "deviceVolume", Float.valueOf(w5p.b().b));
        uioVar.e.d("volumeChange", jSONObject);
    }

    @Override // defpackage.jz4
    public final int a() {
        return 0;
    }

    public final ListenableFuture apply(Object obj) {
        return k1g.G(((jr9) this.b).apply(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.yxc r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cha
            if (r0 == 0) goto L13
            r0 = r6
            cha r0 = (defpackage.cha) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            cha r0 = new cha
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r6)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            ybh.y(r6)
            java.lang.Object r4 = r4.b
            tah r4 = (defpackage.tah) r4
            if (r4 == 0) goto L47
            r0.v = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            goto L48
        L47:
            r4 = 0
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe6.b(yxc, nt5):java.lang.Object");
    }

    @Override // defpackage.jz4
    public final int c() {
        return 0;
    }

    @Override // defpackage.ori
    public final void d() {
        ((ev7) this.b).c = false;
    }

    public final void e(boolean z) {
        tah tahVar = (tah) this.b;
        if (tahVar != null) {
            tahVar.e(z);
        }
    }

    @Override // defpackage.zun
    public final void f(boolean z) {
        ((r2) this.b).invoke(new rw7(new op6(z)));
    }

    @Override // defpackage.jz4
    public final int g() {
        return 0;
    }

    @Override // defpackage.jz4
    public final int h() {
        return 0;
    }

    @Override // defpackage.bn
    public final void i() {
    }

    @Override // defpackage.jz4
    public final boolean j() {
        return false;
    }

    public final void k(Object obj) {
        oh ohVar = (oh) obj;
        w wVar = (w) this.b;
        yl9 yl9Var = (yl9) wVar.H.pollLast();
        if (yl9Var != null) {
            String str = yl9Var.a;
            int i = yl9Var.b;
            Fragment fragmentC = wVar.c.c(str);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(i, ohVar.a, ohVar.b);
        }
    }

    @Override // defpackage.ori
    public final void l(eri eriVar) {
        ((ev7) this.b).k(eriVar);
    }

    @Override // defpackage.bn
    public final void m(bm bmVar) {
        ((chb) this.b).q.p(bmVar);
    }

    @Override // defpackage.jz4
    public final boolean n(ChromiumContent chromiumContent) {
        return false;
    }

    @Override // defpackage.jz4
    public final void o(ChromiumContent chromiumContent) {
    }

    @Override // defpackage.bn
    public final void onAdClicked() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    @Override // defpackage.rr9
    public final void onFailure(Throwable th) throws e22 {
        ListenableFuture listenableFuture;
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((f28) this.b).a(0, "Unable to acquire InputBuffer.", th);
                return;
            default:
                p12 p12Var = (p12) this.b;
                dnb dnbVar = new dnb(p12Var, (byte) 10);
                if (xug.n()) {
                    dnbVar.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    jpo.n("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new jri(dnbVar, countDownLatch, (byte) 29)));
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new e22(e);
                    }
                }
                wg4 wg4Var = (wg4) p12Var.e;
                if (wg4Var != null) {
                    o95.v(wg4Var.n.n, new bo3(p12Var, (byte) 16));
                    wg4 wg4Var2 = (wg4) p12Var.e;
                    synchronized (wg4Var2.b) {
                        wg4Var2.e.removeCallbacksAndMessages("retry_token");
                        int iA = vep.A(wg4Var2.p);
                        if (iA == 0) {
                            wg4Var2.p = 5;
                            listenableFuture = q0b.c;
                        } else {
                            if (iA == 1) {
                                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                            }
                            if (iA == 2 || iA == 3) {
                                wg4Var2.p = 5;
                                wg4.a(wg4Var2.r);
                                wg4Var2.q = k1g.z(new va2(wg4Var2, (byte) 26));
                            }
                            listenableFuture = wg4Var2.q;
                        }
                    }
                } else {
                    listenableFuture = q0b.c;
                }
                synchronized (p12Var.b) {
                    p12Var.c = null;
                    p12Var.d = listenableFuture;
                    ((HashMap) p12Var.g).clear();
                    ((HashSet) p12Var.h).clear();
                }
                p12Var.k(null, null);
                return;
        }
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        nh4 nh4Var = (nh4) this.b;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(new q0i(iOException));
    }

    @Override // defpackage.elf
    public final void onProgress(int i) {
        mab mabVar = (mab) this.b;
        if (i == 0) {
            mabVar.b.s(-1, 157, 236, null);
            nu5 nu5Var = mabVar.c;
            nu5Var.b.removeCallbacks(nu5Var);
            nu5Var.d = 0.8f;
            nu5Var.run();
        }
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        ((nh4) this.b).x(pzhVar, xe5.g);
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) throws MediaCodec.CryptoException {
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                a28 a28Var = (a28) obj;
                f28 f28Var = (f28) this.b;
                long jO = f28Var.p.O();
                f28 f28Var2 = a28Var.i;
                if (!f28Var2.b) {
                    jO = f28Var2.j(jO);
                }
                if (!a28Var.f.get()) {
                    byte b = 0;
                    jpo.j(jO >= 0);
                    a28Var.g = jO;
                    AtomicBoolean atomicBoolean = a28Var.f;
                    if (!atomicBoolean.get()) {
                        a28Var.h = true;
                        l94 l94Var = a28Var.e;
                        ByteBuffer byteBuffer = a28Var.c;
                        if (!atomicBoolean.getAndSet(true)) {
                            try {
                                a28Var.a.queueInputBuffer(a28Var.b, byteBuffer.position(), byteBuffer.limit(), a28Var.g, a28Var.h ? 4 : 0);
                                l94Var.b((Object) null);
                            } catch (IllegalStateException e) {
                                l94Var.d(e);
                            }
                        }
                        ListenableFuture listenableFutureO = k1g.O(a28Var.d);
                        listenableFutureO.addListener(new wr9(listenableFutureO, new d06(this), b), f28Var.g);
                        break;
                    } else {
                        qp2.n("The buffer is submitted or canceled.");
                        break;
                    }
                } else {
                    qp2.n("The buffer is submitted or canceled.");
                    break;
                }
            default:
                break;
        }
    }

    public final void p(String str) {
        bte bteVar = ((zse) this.b).G0().e;
        bteVar.getClass();
        kze kzeVar = bteVar.b;
        if (str == null) {
            str = "";
        }
        kzeVar.r(str);
    }

    @Override // defpackage.gm6
    public final void q() {
        ((mm6) ((og5) this.b).b).g(new jm6(km6.b, null));
    }

    @Override // defpackage.jz4
    public final boolean r(ChromiumContent chromiumContent, boolean z) {
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(((l2b) this.b).v.e());
        if (!selectionPopupControllerImplFromWebContents.D) {
            return false;
        }
        if (z) {
            selectionPopupControllerImplFromWebContents.r();
            return true;
        }
        if (!selectionPopupControllerImplFromWebContents.D()) {
            return false;
        }
        selectionPopupControllerImplFromWebContents.hidePopupsAndPreserveSelection();
        return true;
    }

    public final Object s(yka ykaVar) {
        Object objS;
        tah tahVar = (tah) this.b;
        return (tahVar == null || (objS = tahVar.s(ykaVar)) != px5.a) ? Unit.a : objS;
    }

    @Override // defpackage.jz4
    public final void t(boolean z) {
        jq9 jq9Var = ((l2b) this.b).u;
        if (jq9Var != null) {
            jq9Var.d(z);
        } else {
            h9o.e();
        }
    }

    @Override // defpackage.jz4
    public final void u(ChromiumContent chromiumContent, boolean z) {
    }

    public final void v(String str) {
        bte bteVar = ((zse) this.b).G0().e;
        bteVar.getClass();
        kze kzeVar = bteVar.b;
        if (str == null) {
            str = "";
        }
        kzeVar.r(str);
    }

    public final v7e w(d5o d5oVar) {
        return new v24((j06) this.b, (byte) 1);
    }

    @Override // defpackage.ori
    public final List x() {
        iv7 iv7Var = (iv7) ((ev7) this.b).g;
        List list = (List) iv7Var.d.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long id = ((eri) obj).getId();
            if (id != 9223372036854775805L && id != ((eri) iv7Var.e.g()).getId()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void y(String str) {
        tah tahVar = (tah) this.b;
        if (tahVar != null) {
            tahVar.y(str);
        }
    }

    @Override // defpackage.gm6
    public final void z() {
        ((mm6) ((og5) this.b).b).c(vb0.c, ac0.c, null);
    }
}
