package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import androidx.collection.ArrayMap;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.messagetemplates.OperaConfigBundleSheet$initializeSheetRequest$2$1;
import com.leanplum.utils.SizeUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URLEncoder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes.dex */
public class f1p implements ssf, zln, bd6, p9n, lba, qxd, ox8, rba, m82 {
    public static volatile f1p c;
    public static final char[] d = {',', '.', '-', '_', ' '};
    public static final int[] e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final f1p f;
    public Object a;
    public Object b;

    static {
        Object obj = null;
        f = new f1p(obj, obj);
    }

    public f1p(byte b) {
        switch (b) {
            case 7:
                this.a = new osh();
                this.b = c26.k(l08.a);
                break;
            case 14:
                this.a = new int[16];
                this.b = new int[16];
                break;
            case 15:
                jdj jdjVarC = ipe.c(0, 1, (h04) null, 5);
                this.a = jdjVarC;
                this.b = a26.i(jdjVarC);
                break;
            case 17:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
            case SizeUtil.textSize2 /* 24 */:
                this.a = new AtomicReference();
                this.b = new ArrayMap(0);
                break;
            default:
                this.a = new i7f();
                this.b = new HashMap();
                break;
        }
    }

    public f1p(Context context, byte b) {
        List listY;
        switch (b) {
            case 11:
                esg esgVar = new esg((byte) 12);
                this.a = context.getApplicationContext();
                this.b = esgVar;
                break;
            case 12:
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
                this.b = sharedPreferences;
                String string = sharedPreferences.getString("pref_key_recent_emoji", null);
                this.a = (string == null || (listY = StringsKt.Y(string, new String[]{","}, 0, 6)) == null) ? new ArrayList() : new ArrayList(listY);
                break;
            default:
                this.a = context.getApplicationContext();
                this.b = new xq0(new psp());
                break;
        }
    }

    public f1p(AbsSeekBar absSeekBar) {
        this.a = absSeekBar;
    }

    public /* synthetic */ f1p(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ f1p(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public f1p(o9d o9dVar) {
        this.a = new ConcurrentHashMap();
        this.b = o9dVar;
    }

    public static f1p a() {
        if (c == null) {
            synchronized (f1p.class) {
                if (c == null) {
                    f1p f1pVar = new f1p();
                    ArrayList arrayList = new ArrayList();
                    f1pVar.a = arrayList;
                    b6p b6pVar = new b6p();
                    f1pVar.b = b6pVar;
                    kxo kxoVar = new kxo((byte) 1);
                    kxo kxoVar2 = new kxo((byte) 0);
                    arrayList.add(b6pVar);
                    arrayList.add(kxoVar2);
                    arrayList.add(kxoVar);
                    c = f1pVar;
                }
            }
        }
        return c;
    }

    public static String g(String str) throws Exception {
        if (str == null) {
            return null;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e2) {
            throw new Exception("Encoding failure. Problem URL encoding input" + e2);
        }
    }

    public static f1p n(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new f1p(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public final Drawable A(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.b) == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = A(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    @Override // defpackage.ssf
    public final void H(ByteArrayOutputStream byteArrayOutputStream, rsf rsfVar) throws IOException {
        t56 t56Var = ((sc3) rsfVar).b;
        int i = xq0.d;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(2);
            xq0.c4(dataOutputStream, t56Var);
        } finally {
            dataOutputStream.close();
        }
    }

    @Override // defpackage.ssf
    public final rsf b() {
        return new sc3(this, psp.f());
    }

    @Override // defpackage.zln
    public final void c(xq3 xq3Var, hjm hjmVar) {
        xf8.F0((pde) ((qln) this.a).k.b, v08.a);
        ((OperaConfigBundleSheet$initializeSheetRequest$2$1) this.b).onFinished(hjmVar);
        if (xq3Var != pk5.m) {
            return;
        }
        pk5.m = null;
    }

    public final ed6 createDataSource() {
        return new hn6((Context) this.a, ((esg) this.b).createDataSource());
    }

    @Override // defpackage.rba
    public final void d() {
        qgf qgfVar = (qgf) ((ioc) this.b).e;
        nv6 nv6VarB = ru9.c(qgfVar.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("external_apps.page_menu_hint.shown", true);
        nv6VarB.w();
        f6l f6lVar = qgfVar.h;
        if (f6lVar == null) {
            return;
        }
        qgfVar.b.H(f6lVar);
        qgfVar.h = null;
    }

    @Override // defpackage.ox8
    public final void f(List list) {
        uqe uqeVar = (uqe) this.a;
        msh mshVar = (msh) this.b;
        uqeVar.k(mshVar, list, false);
        uqeVar.h.k(mshVar, list, true);
    }

    @Override // defpackage.lba
    public final View getView() {
        return (NestedScrollView) this.a;
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        nw7 nw7Var = (nw7) view.getTag(2131362626);
        if (nw7Var == null || ((th7) this.a).f() == null) {
            return;
        }
        this.b = nw7Var;
    }

    @Override // defpackage.lba
    public final void i(int i, int i2) {
        AppBarLayout appBarLayout = (AppBarLayout) this.b;
        if (appBarLayout != null) {
            appBarLayout.k(false, appBarLayout.isLaidOut(), true);
        }
        ((NestedScrollView) this.a).B(0, i2, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, false);
    }

    @Override // defpackage.zln
    public final void j() {
    }

    @Override // defpackage.m82
    public final void k(n82 n82Var, List list) {
        if (list.isEmpty()) {
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof msh) {
            ((bch) this.b).b((msh) obj, (uqe) this.a);
        }
    }

    public final void l(udg udgVar) {
        ((ConcurrentHashMap) this.a).put(((o9d) this.b).l(udgVar), udgVar);
    }

    public final void o(String str, String str2) {
        ((ArrayList) this.a).add(_UrlKt.canonicalizeWithCharset$default(str, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, null, 91, null));
        ((ArrayList) this.b).add(_UrlKt.canonicalizeWithCharset$default(str2, 0, 0, _UrlKt.FORM_ENCODE_SET, false, false, false, false, null, 91, null));
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.String p(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r3 = r9
            r2 = r1
        L7:
            if (r2 != 0) goto L31
            java.lang.Object r2 = r8.a     // Catch: java.lang.Exception -> L2c
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> L2c
            int r4 = r2.size()     // Catch: java.lang.Exception -> L2c
            r5 = 1
            r6 = r1
        L13:
            if (r6 >= r4) goto L2a
            java.lang.Object r7 = r2.get(r6)     // Catch: java.lang.Exception -> L2c
            int r6 = r6 + 1
            boo r7 = (defpackage.boo) r7     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = r7.b(r3)     // Catch: java.lang.Exception -> L2c
            boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> L2c
            if (r3 != 0) goto L28
            r5 = r1
        L28:
            r3 = r7
            goto L13
        L2a:
            r2 = r5
            goto L7
        L2c:
            r8 = move-exception
            r8.printStackTrace()
            goto L32
        L31:
            r0 = r3
        L32:
            java.lang.String r8 = "UTF-8"
            java.lang.String r8 = java.net.URLDecoder.decode(r0, r8)     // Catch: java.lang.Exception -> L39
            return r8
        L39:
            r8 = move-exception
            r8.printStackTrace()
            r8.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1p.p(java.lang.String):java.lang.String");
    }

    public final bx4 q(Intent intent, int i, ax4 ax4Var, String str) {
        Context context = (Context) this.a;
        iw4 iw4Var = (iw4) this.b;
        return new bx4(context, intent, i, iw4Var.b, iw4Var.c, ax4Var, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xrf r(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            ru9 r0 = (defpackage.ru9) r0
            java.lang.Object r7 = r7.b
            vx r7 = (defpackage.vx) r7
            java.lang.Object r7 = r7.get()
            d75 r7 = (defpackage.d75) r7
            java.lang.String r1 = r7.c
            o65 r2 = r7.b
            int r3 = r1.length()
            if (r3 != 0) goto L1a
            java.lang.String r1 = "wyYok20KneVh2y"
        L1a:
            android.content.SharedPreferences r3 = r0.a
            java.lang.String r4 = "cmp_consent_settings_id"
            r5 = 0
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 != 0) goto L2b
            xrf r7 = new xrf
            r7.<init>(r1, r2)
            return r7
        L2b:
            boolean r4 = r3.equals(r1)
            java.lang.String r6 = "latest"
            if (r4 != 0) goto L47
            if (r8 == 0) goto L3b
            xrf r7 = new xrf
            r7.<init>(r1, r2)
            return r7
        L3b:
            xrf r7 = new xrf
            o65 r8 = new o65
            r0 = -1
            r8.<init>(r0, r0, r0, r6)
            r7.<init>(r3, r8)
            return r7
        L47:
            android.content.SharedPreferences r0 = r0.a
            java.lang.String r3 = "cmp_consent_config_version"
            java.lang.String r0 = r0.getString(r3, r5)
            if (r0 != 0) goto L53
            java.lang.String r0 = ""
        L53:
            o65 r5 = uup.p(r0)     // Catch: java.lang.Throwable -> L57
        L57:
            if (r5 == 0) goto L91
            if (r8 != 0) goto L8d
            o65 r7 = r7.a
            java.lang.String r8 = r5.a
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L6b
            java.lang.String r7 = r7.a
            r7.equals(r6)
            goto L8e
        L6b:
            java.lang.String r8 = r7.a
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L8d
            int r8 = r5.b
            int r0 = r7.b
            if (r8 == r0) goto L7c
            if (r8 <= r0) goto L8d
            goto L8e
        L7c:
            int r8 = r5.c
            int r0 = r7.c
            if (r8 == r0) goto L85
            if (r8 <= r0) goto L8d
            goto L8e
        L85:
            int r8 = r5.d
            int r7 = r7.d
            if (r8 == r7) goto L8e
            if (r8 > r7) goto L8e
        L8d:
            r5 = r2
        L8e:
            if (r5 == 0) goto L91
            r2 = r5
        L91:
            xrf r7 = new xrf
            r7.<init>(r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1p.r(boolean):xrf");
    }

    @Override // defpackage.rba
    public final void s() {
        ((qgf) ((ioc) this.b).e).c.i = 2131363818;
        ((View) this.a).callOnClick();
    }

    @Override // defpackage.rba
    public final void t() {
    }

    public void u(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.a;
        ghf ghfVarH = ghf.H(i, 0, absSeekBar.getContext(), attributeSet, e);
        Drawable drawableU = ghfVarH.u(0);
        if (drawableU != null) {
            if (drawableU instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableU;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableA = A(animationDrawable.getFrame(i2), true);
                    drawableA.setLevel(10000);
                    animationDrawable2.addFrame(drawableA, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableU = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableU);
        }
        Drawable drawableU2 = ghfVarH.u(1);
        if (drawableU2 != null) {
            absSeekBar.setProgressDrawable(A(drawableU2, false));
        }
        ghfVarH.J();
    }

    @Override // defpackage.ssf
    public final rsf v(ByteArrayInputStream byteArrayInputStream) throws IOException {
        t56 t56VarF = psp.f();
        xq0 xq0Var = (xq0) this.b;
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            xq0Var.K2(dataInputStream);
            xq0Var.X0(dataInputStream, t56VarF, dataInputStream.readShort());
            dataInputStream.close();
            return new sc3(this, t56VarF);
        } catch (Throwable th) {
            dataInputStream.close();
            throw th;
        }
    }

    @Override // defpackage.m82
    public final void w(n82 n82Var) {
    }

    public final void x() throws IOException {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException unused) {
        }
    }

    public final Unit y(Context context, n98 n98Var) {
        q98 q98Var;
        String str;
        ((jdj) this.a).i(n98Var);
        Bundle bundle = new Bundle();
        bundle.putInt("origin", 6);
        bundle.putInt("notification_type", 9);
        bundle.putInt("notification_action_type", 9);
        bundle.putBoolean("enable_sound", true);
        bundle.putBoolean("enable_vibration", true);
        bundle.putBoolean("enable_lights", true);
        int iOrdinal = n98Var.ordinal();
        if (iOrdinal == 0) {
            q98Var = q98.g;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            q98Var = q98.h;
        }
        bundle.putInt("esim_push_notification_variant_id", q98Var.a);
        int iOrdinal2 = n98Var.ordinal();
        if (iOrdinal2 == 0) {
            wu5 wu5Var = igf.b;
            bundle.putInt("action_open_esim_destination_id", 3);
        } else if (iOrdinal2 != 1) {
            h9o.p();
            return null;
        }
        int iOrdinal3 = n98Var.ordinal();
        if (iOrdinal3 == 0) {
            str = "country_change_free_push";
        } else {
            if (iOrdinal3 != 1) {
                h9o.p();
                return null;
            }
            str = "country_change_paid_push";
        }
        bundle.putAll(ic4.m(new Pair[]{new Pair("ESIM_ATTRIBUTION_RESOLVED", Boolean.TRUE), new Pair("ESIM_SOURCE", ImagesContract.LOCAL), new Pair("ESIM_CAMPAIGN", str)}));
        oup.X(context, bundle, false);
        return Unit.a;
    }

    @Override // defpackage.rba
    public final void z() {
    }
}
