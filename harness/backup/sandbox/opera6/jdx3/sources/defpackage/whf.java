package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.hype.image.editor.EditImage;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.chromium.ui.base.ViewAndroidDelegate;

/* loaded from: classes.dex */
public final /* synthetic */ class whf implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ whf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ whf(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean zG;
        caa caaVar;
        shk shkVar;
        byte b = this.a;
        zpa zpaVar = hh5.a;
        final byte b2 = 2;
        final byte b3 = 3;
        final byte b4 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                bif bifVar = (bif) obj3;
                vt9 vt9Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xf8.j(bifVar.a, (String) null, w7d.f(mpj.a), (td3) null, jr5.a, 0.0f, (kh3) null, vt9Var2, 25016, 104);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 1:
                final u2 u2Var = (u2) obj3;
                vt9 vt9Var3 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b3 b3Var = (b3) dyg.h(u2Var.o0().h, vt9Var4).getValue();
                    boolean zH = vt9Var4.h(u2Var);
                    Object objK = vt9Var4.K();
                    if (zH || objK == zpaVar) {
                        q2 q2Var = new q2(0, u2Var, u2.class, "close", "close()V", 0, (byte) 0);
                        vt9Var4.g0(q2Var);
                        objK = q2Var;
                    }
                    Function0 function0 = (mtb) objK;
                    d3 d3VarO0 = u2Var.o0();
                    boolean zH2 = vt9Var4.h(d3VarO0);
                    Object objK2 = vt9Var4.K();
                    if (zH2 || objK2 == zpaVar) {
                        q2 q2Var2 = new q2(0, d3VarO0, d3.class, "onSearchClick", "onSearchClick()V", 0, (byte) 1);
                        vt9Var4.g0(q2Var2);
                        objK2 = q2Var2;
                    }
                    Function0 function02 = (mtb) objK2;
                    d3 d3VarO02 = u2Var.o0();
                    boolean zH3 = vt9Var4.h(d3VarO02);
                    Object objK3 = vt9Var4.K();
                    if (zH3 || objK3 == zpaVar) {
                        q2 q2Var3 = new q2(0, d3VarO02, d3.class, "onUpdatesClick", "onUpdatesClick()V", 0, (byte) 2);
                        vt9Var4.g0(q2Var3);
                        objK3 = q2Var3;
                    }
                    Function0 function03 = (mtb) objK3;
                    d3 d3VarO03 = u2Var.o0();
                    boolean zH4 = vt9Var4.h(d3VarO03);
                    Object objK4 = vt9Var4.K();
                    if (zH4 || objK4 == zpaVar) {
                        objK4 = new r2(1, d3VarO03, d3.class, "onInstallationIdClickCount", "onInstallationIdClickCount(I)V", 0, (byte) 0);
                        vt9Var4.g0(objK4);
                    }
                    Function1 function1 = (mtb) objK4;
                    d3 d3VarO04 = u2Var.o0();
                    boolean zH5 = vt9Var4.h(d3VarO04);
                    Object objK5 = vt9Var4.K();
                    if (zH5 || objK5 == zpaVar) {
                        objK5 = new r2(1, d3VarO04, d3.class, "onConfigurationClickCount", "onConfigurationClickCount(I)V", 0, (byte) 1);
                        vt9Var4.g0(objK5);
                    }
                    Function1 function12 = (mtb) objK5;
                    boolean zH6 = vt9Var4.h(u2Var);
                    Object objK6 = vt9Var4.K();
                    Object obj4 = objK6;
                    if (zH6 || objK6 == zpaVar) {
                        final byte b5 = false ? (byte) 1 : (byte) 0;
                        Function0 function04 = new Function0() { // from class: p2
                            public final Object invoke() {
                                switch (b5) {
                                    case 0:
                                        u2 u2Var2 = u2Var;
                                        d3 d3VarO05 = u2Var2.o0();
                                        s2 s2Var = new s2(2, u2Var2, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 0);
                                        x5f x5fVar = (x5f) d3VarO05.e;
                                        if (x5fVar.h) {
                                            zpa zpaVar2 = x5fVar.d;
                                            x56 x56VarF = zpa.F();
                                            am2.f(zpaVar2, x56VarF).b.p(11, 1, 1L);
                                            x5fVar.U0(x56VarF);
                                        }
                                        s2Var.invoke("https://www.opera.com/legal/eula-mobile", 2132021210);
                                        break;
                                    case 1:
                                        u2 u2Var3 = u2Var;
                                        d3 d3VarO06 = u2Var3.o0();
                                        s2 s2Var2 = new s2(2, u2Var3, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 1);
                                        x5f x5fVar2 = (x5f) d3VarO06.e;
                                        if (x5fVar2.h) {
                                            zpa zpaVar3 = x5fVar2.d;
                                            x56 x56VarF2 = zpa.F();
                                            am2.f(zpaVar3, x56VarF2).b.p(12, 1, 1L);
                                            x5fVar2.U0(x56VarF2);
                                        }
                                        s2Var2.invoke("https://www.opera.com/privacy", 2132021379);
                                        break;
                                    case 2:
                                        u2 u2Var4 = u2Var;
                                        d3 d3VarO07 = u2Var4.o0();
                                        s2 s2Var3 = new s2(2, u2Var4, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 2);
                                        x5f x5fVar3 = (x5f) d3VarO07.e;
                                        if (x5fVar3.h) {
                                            zpa zpaVar4 = x5fVar3.d;
                                            x56 x56VarF3 = zpa.F();
                                            am2.f(zpaVar4, x56VarF3).b.p(16, 1, 1L);
                                            x5fVar3.U0(x56VarF3);
                                        }
                                        s2Var3.invoke("https://www.opera.com/terms", 2132021773);
                                        break;
                                    default:
                                        u2 u2Var5 = u2Var;
                                        d3 d3VarO08 = u2Var5.o0();
                                        s2 s2Var4 = new s2(2, u2Var5, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 3);
                                        x5f x5fVar4 = (x5f) d3VarO08.e;
                                        if (x5fVar4.h) {
                                            zpa zpaVar5 = x5fVar4.d;
                                            x56 x56VarF4 = zpa.F();
                                            am2.f(zpaVar5, x56VarF4).b.p(13, 1, 1L);
                                            x5fVar4.U0(x56VarF4);
                                        }
                                        s2Var4.invoke("chrome://about/", 2132021450);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function04);
                        obj4 = function04;
                    }
                    Function0 function05 = (Function0) obj4;
                    boolean zH7 = vt9Var4.h(u2Var);
                    Object objK7 = vt9Var4.K();
                    Object obj5 = objK7;
                    if (zH7 || objK7 == zpaVar) {
                        Function0 function06 = new Function0() { // from class: p2
                            public final Object invoke() {
                                switch (b4) {
                                    case 0:
                                        u2 u2Var2 = u2Var;
                                        d3 d3VarO05 = u2Var2.o0();
                                        s2 s2Var = new s2(2, u2Var2, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 0);
                                        x5f x5fVar = (x5f) d3VarO05.e;
                                        if (x5fVar.h) {
                                            zpa zpaVar2 = x5fVar.d;
                                            x56 x56VarF = zpa.F();
                                            am2.f(zpaVar2, x56VarF).b.p(11, 1, 1L);
                                            x5fVar.U0(x56VarF);
                                        }
                                        s2Var.invoke("https://www.opera.com/legal/eula-mobile", 2132021210);
                                        break;
                                    case 1:
                                        u2 u2Var3 = u2Var;
                                        d3 d3VarO06 = u2Var3.o0();
                                        s2 s2Var2 = new s2(2, u2Var3, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 1);
                                        x5f x5fVar2 = (x5f) d3VarO06.e;
                                        if (x5fVar2.h) {
                                            zpa zpaVar3 = x5fVar2.d;
                                            x56 x56VarF2 = zpa.F();
                                            am2.f(zpaVar3, x56VarF2).b.p(12, 1, 1L);
                                            x5fVar2.U0(x56VarF2);
                                        }
                                        s2Var2.invoke("https://www.opera.com/privacy", 2132021379);
                                        break;
                                    case 2:
                                        u2 u2Var4 = u2Var;
                                        d3 d3VarO07 = u2Var4.o0();
                                        s2 s2Var3 = new s2(2, u2Var4, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 2);
                                        x5f x5fVar3 = (x5f) d3VarO07.e;
                                        if (x5fVar3.h) {
                                            zpa zpaVar4 = x5fVar3.d;
                                            x56 x56VarF3 = zpa.F();
                                            am2.f(zpaVar4, x56VarF3).b.p(16, 1, 1L);
                                            x5fVar3.U0(x56VarF3);
                                        }
                                        s2Var3.invoke("https://www.opera.com/terms", 2132021773);
                                        break;
                                    default:
                                        u2 u2Var5 = u2Var;
                                        d3 d3VarO08 = u2Var5.o0();
                                        s2 s2Var4 = new s2(2, u2Var5, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 3);
                                        x5f x5fVar4 = (x5f) d3VarO08.e;
                                        if (x5fVar4.h) {
                                            zpa zpaVar5 = x5fVar4.d;
                                            x56 x56VarF4 = zpa.F();
                                            am2.f(zpaVar5, x56VarF4).b.p(13, 1, 1L);
                                            x5fVar4.U0(x56VarF4);
                                        }
                                        s2Var4.invoke("chrome://about/", 2132021450);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function06);
                        obj5 = function06;
                    }
                    Function0 function07 = (Function0) obj5;
                    boolean zH8 = vt9Var4.h(u2Var);
                    Object objK8 = vt9Var4.K();
                    Object obj6 = objK8;
                    if (zH8 || objK8 == zpaVar) {
                        Function0 function08 = new Function0() { // from class: p2
                            public final Object invoke() {
                                switch (b2) {
                                    case 0:
                                        u2 u2Var2 = u2Var;
                                        d3 d3VarO05 = u2Var2.o0();
                                        s2 s2Var = new s2(2, u2Var2, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 0);
                                        x5f x5fVar = (x5f) d3VarO05.e;
                                        if (x5fVar.h) {
                                            zpa zpaVar2 = x5fVar.d;
                                            x56 x56VarF = zpa.F();
                                            am2.f(zpaVar2, x56VarF).b.p(11, 1, 1L);
                                            x5fVar.U0(x56VarF);
                                        }
                                        s2Var.invoke("https://www.opera.com/legal/eula-mobile", 2132021210);
                                        break;
                                    case 1:
                                        u2 u2Var3 = u2Var;
                                        d3 d3VarO06 = u2Var3.o0();
                                        s2 s2Var2 = new s2(2, u2Var3, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 1);
                                        x5f x5fVar2 = (x5f) d3VarO06.e;
                                        if (x5fVar2.h) {
                                            zpa zpaVar3 = x5fVar2.d;
                                            x56 x56VarF2 = zpa.F();
                                            am2.f(zpaVar3, x56VarF2).b.p(12, 1, 1L);
                                            x5fVar2.U0(x56VarF2);
                                        }
                                        s2Var2.invoke("https://www.opera.com/privacy", 2132021379);
                                        break;
                                    case 2:
                                        u2 u2Var4 = u2Var;
                                        d3 d3VarO07 = u2Var4.o0();
                                        s2 s2Var3 = new s2(2, u2Var4, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 2);
                                        x5f x5fVar3 = (x5f) d3VarO07.e;
                                        if (x5fVar3.h) {
                                            zpa zpaVar4 = x5fVar3.d;
                                            x56 x56VarF3 = zpa.F();
                                            am2.f(zpaVar4, x56VarF3).b.p(16, 1, 1L);
                                            x5fVar3.U0(x56VarF3);
                                        }
                                        s2Var3.invoke("https://www.opera.com/terms", 2132021773);
                                        break;
                                    default:
                                        u2 u2Var5 = u2Var;
                                        d3 d3VarO08 = u2Var5.o0();
                                        s2 s2Var4 = new s2(2, u2Var5, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 3);
                                        x5f x5fVar4 = (x5f) d3VarO08.e;
                                        if (x5fVar4.h) {
                                            zpa zpaVar5 = x5fVar4.d;
                                            x56 x56VarF4 = zpa.F();
                                            am2.f(zpaVar5, x56VarF4).b.p(13, 1, 1L);
                                            x5fVar4.U0(x56VarF4);
                                        }
                                        s2Var4.invoke("chrome://about/", 2132021450);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function08);
                        obj6 = function08;
                    }
                    Function0 function09 = (Function0) obj6;
                    boolean zH9 = vt9Var4.h(u2Var);
                    Object objK9 = vt9Var4.K();
                    Object obj7 = objK9;
                    if (zH9 || objK9 == zpaVar) {
                        Function0 function010 = new Function0() { // from class: p2
                            public final Object invoke() {
                                switch (b3) {
                                    case 0:
                                        u2 u2Var2 = u2Var;
                                        d3 d3VarO05 = u2Var2.o0();
                                        s2 s2Var = new s2(2, u2Var2, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 0);
                                        x5f x5fVar = (x5f) d3VarO05.e;
                                        if (x5fVar.h) {
                                            zpa zpaVar2 = x5fVar.d;
                                            x56 x56VarF = zpa.F();
                                            am2.f(zpaVar2, x56VarF).b.p(11, 1, 1L);
                                            x5fVar.U0(x56VarF);
                                        }
                                        s2Var.invoke("https://www.opera.com/legal/eula-mobile", 2132021210);
                                        break;
                                    case 1:
                                        u2 u2Var3 = u2Var;
                                        d3 d3VarO06 = u2Var3.o0();
                                        s2 s2Var2 = new s2(2, u2Var3, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 1);
                                        x5f x5fVar2 = (x5f) d3VarO06.e;
                                        if (x5fVar2.h) {
                                            zpa zpaVar3 = x5fVar2.d;
                                            x56 x56VarF2 = zpa.F();
                                            am2.f(zpaVar3, x56VarF2).b.p(12, 1, 1L);
                                            x5fVar2.U0(x56VarF2);
                                        }
                                        s2Var2.invoke("https://www.opera.com/privacy", 2132021379);
                                        break;
                                    case 2:
                                        u2 u2Var4 = u2Var;
                                        d3 d3VarO07 = u2Var4.o0();
                                        s2 s2Var3 = new s2(2, u2Var4, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 2);
                                        x5f x5fVar3 = (x5f) d3VarO07.e;
                                        if (x5fVar3.h) {
                                            zpa zpaVar4 = x5fVar3.d;
                                            x56 x56VarF3 = zpa.F();
                                            am2.f(zpaVar4, x56VarF3).b.p(16, 1, 1L);
                                            x5fVar3.U0(x56VarF3);
                                        }
                                        s2Var3.invoke("https://www.opera.com/terms", 2132021773);
                                        break;
                                    default:
                                        u2 u2Var5 = u2Var;
                                        d3 d3VarO08 = u2Var5.o0();
                                        s2 s2Var4 = new s2(2, u2Var5, u2.class, "openInFullscreen", "openInFullscreen(Ljava/lang/String;I)V", 0, (byte) 3);
                                        x5f x5fVar4 = (x5f) d3VarO08.e;
                                        if (x5fVar4.h) {
                                            zpa zpaVar5 = x5fVar4.d;
                                            x56 x56VarF4 = zpa.F();
                                            am2.f(zpaVar5, x56VarF4).b.p(13, 1, 1L);
                                            x5fVar4.U0(x56VarF4);
                                        }
                                        s2Var4.invoke("chrome://about/", 2132021450);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        vt9Var4.g0(function010);
                        obj7 = function010;
                    }
                    jpo.a(b3Var, function0, function02, function03, function1, function12, function05, function07, function09, (Function0) obj7, (c8e) null, vt9Var4, 0);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 2:
                d4 d4Var = (d4) obj3;
                vt9 vt9Var5 = (ih5) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vt9 vt9Var6 = vt9Var5;
                if (vt9Var6.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    d4Var.a(vt9Var6, 0);
                } else {
                    vt9Var6.Q();
                }
                return Unit.a;
            case 3:
                jpi jpiVar = (jpi) obj3;
                na2.B(jpiVar.H0(), (CoroutineContext) null, (rx5) null, new y6(jpiVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 4:
                my0 my0Var = (my0) obj3;
                String str = (String) ((ekc) my0Var.d.getValue()).g();
                if (my0Var.b() && str != null) {
                    vx3 vx3VarA = ay3.a(str, lqm.I, true);
                    vx3VarA.c = 1;
                    vx3VarA.f = false;
                    am2.v(vx3VarA);
                }
                return Unit.a;
            case 5:
                o01 o01Var = (o01) obj3;
                vt9 vt9Var7 = (ih5) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vt9 vt9Var8 = vt9Var7;
                if (vt9Var8.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ijl.b(uyg.r(o01Var.a, new Object[]{o01Var.b}, vt9Var8), (c8e) null, 0L, 0L, (ki9) null, 0L, (bgl) null, (pel) null, 0L, 0, false, 0, 0, (ikl) null, vt9Var8, 0, 0, 262142);
                } else {
                    vt9Var8.Q();
                }
                return Unit.a;
            case 6:
                voh vohVarW = xvg.w((RectF) obj);
                voh vohVarW2 = xvg.w((RectF) obj2);
                switch (((gpk) obj3).a) {
                    case SizeUtil.textSize0 /* 20 */:
                        zG = vohVarW.g(vohVarW2);
                        break;
                    default:
                        zG = vohVarW2.a(vohVarW.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case 7:
                Runnable runnable = (Runnable) obj;
                pn7 pn7Var = (pn7) obj2;
                View view = ((ChromiumContent) obj3).getView();
                if (view != null) {
                    view.postOnAnimationDelayed(runnable, pn7.f(pn7Var.a));
                }
                return Unit.a;
            case 8:
                DataOutputStream dataOutputStream = (DataOutputStream) obj3;
                dataOutputStream.writeUTF((String) obj);
                byte[] bytes = ((String) obj2).getBytes(Charsets.UTF_8);
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Runnable runnable2 = (Runnable) obj;
                pn7 pn7Var2 = (pn7) obj2;
                ViewAndroidDelegate viewAndroidDelegateJ0 = ((hq3) obj3).b.e().J0();
                if (viewAndroidDelegateJ0 != null) {
                    viewAndroidDelegateJ0.b.postOnAnimationDelayed(runnable2, pn7.f(pn7Var2.a));
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                xf8.l((Long) obj3, (ih5) obj, aoh.m(1));
                return Unit.a;
            case 11:
                rxh rxhVar = new rxh(2132018566);
                z77 z77VarU = sfe.U((Context) obj3);
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = null;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = null;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 0;
                gkjVar.l = 2132019218;
                gkjVar.m = 0;
                gkjVar.n = true;
                gkjVar.o = rxhVar;
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                return Unit.a;
            case 12:
                new dd((fd) obj3).o((View) obj);
                return Unit.a;
            case 13:
                jt3 jt3Var = (jt3) obj3;
                pc pcVar = (pc) obj;
                ef efVar = (ef) obj2;
                qb7 qb7Var = jt3Var.e;
                qb7Var.getClass();
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                nt3 nt3Var = new nt3(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                qb7Var.x(nt3Var);
                Map map = (Map) ((zyk) qb7Var.b).getValue();
                Object obj8 = map.get(nt3Var);
                Object obj9 = obj8;
                if (obj8 == null) {
                    ot3 ot3Var = new ot3(nt3Var, new LinkedHashSet());
                    map.put(nt3Var, ot3Var);
                    obj9 = ot3Var;
                }
                if (((ot3) obj9).b.add(pcVar)) {
                    qb7Var.B();
                }
                x5f x5fVar = jt3Var.b;
                zpa zpaVar2 = x5fVar.d;
                hw3 hw3Var = jt3Var.d;
                x5f x5fVar2 = jt3Var.a;
                zpa zpaVar3 = x5fVar2.d;
                int iOrdinal = pcVar.ordinal();
                tk0 tk0Var = tk0.c;
                bf bfVar = bf.a;
                af afVar = af.a;
                cf cfVar = cf.a;
                switch (iOrdinal) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case SizeUtil.textSize0 /* 20 */:
                    case 21:
                    case SizeUtil.textSize1 /* 22 */:
                    case 23:
                    case SizeUtil.textSize2 /* 24 */:
                    case 25:
                    case 26:
                    case 28:
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        df dfVar = efVar.a;
                        if (dfVar.equals(cfVar) || dfVar.equals(afVar)) {
                            x5fVar2.f0(ph0.u);
                            break;
                        } else {
                            if (!dfVar.equals(bfVar)) {
                                h9o.p();
                                return null;
                            }
                            x56 x56VarF = zpa.F();
                            ((ys0) new ck0(zpaVar2, x56VarF).u.getValue()).b.p(7, 1, 1L);
                            x5fVar.U0(x56VarF);
                            break;
                        }
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        x5fVar2.f0(ph0.v);
                        break;
                    case 11:
                        x5fVar2.f0(ph0.w);
                        break;
                    case 12:
                        x5fVar2.f0(ph0.x);
                        break;
                    case 13:
                        x5fVar2.f0(ph0.y);
                        break;
                    case 14:
                        x5fVar2.f0(ph0.z);
                        break;
                    case 15:
                        x5fVar2.f0(ph0.A);
                        break;
                    case 16:
                        x5fVar2.f0(ph0.B);
                        break;
                    case 17:
                        x5fVar2.f0(ph0.C);
                        break;
                    case SizeUtil.textSize0_1 /* 18 */:
                        x5fVar2.f0(ph0.D);
                        break;
                    case 19:
                        x5fVar2.f0(ph0.E);
                        break;
                    case 27:
                        Object obj10 = null;
                        df dfVar2 = efVar.a;
                        if (!dfVar2.equals(cfVar) && !dfVar2.equals(afVar)) {
                            if (!dfVar2.equals(bfVar)) {
                                h9o.p();
                                return null;
                            }
                            boolean zBooleanValue = ((Boolean) ((mbf) hw3Var.get()).f.g()).booleanValue();
                            if (x5fVar2.h) {
                                x56 x56VarF2 = zpa.F();
                                ck0 ck0Var = new ck0(zpaVar3, x56VarF2);
                                ((pk0) ck0Var.i.getValue()).a.o(0, 1, 1);
                                ck0Var.b(new ha1((Object) qk0.i, (Object) tk0Var, obj10, zBooleanValue, (byte) 2));
                                x5fVar2.U0(x56VarF2);
                                break;
                            }
                        }
                        break;
                    case 29:
                        x5fVar2.f0(ph0.F);
                        break;
                    case 30:
                        x5fVar2.f0(ph0.G);
                        break;
                    case 31:
                        df dfVar3 = efVar.a;
                        if (!dfVar3.equals(cfVar) && !dfVar3.equals(afVar)) {
                            if (!dfVar3.equals(bfVar)) {
                                h9o.p();
                                return null;
                            }
                            boolean zBooleanValue2 = ((Boolean) ((mbf) hw3Var.get()).f.g()).booleanValue();
                            if (x5fVar2.h) {
                                x56 x56VarF3 = zpa.F();
                                ck0 ck0Var2 = new ck0(zpaVar3, x56VarF3);
                                ((pk0) ck0Var2.i.getValue()).a.o(0, 1, 1);
                                ck0Var2.b(new ha1((Object) qk0.j, (Object) tk0Var, (Object) null, zBooleanValue2, (byte) 2));
                                x5fVar2.U0(x56VarF3);
                                break;
                            }
                        }
                        break;
                    case 32:
                        df dfVar4 = efVar.a;
                        if (!dfVar4.equals(cfVar) && !dfVar4.equals(afVar)) {
                            if (!dfVar4.equals(bfVar)) {
                                h9o.p();
                                return null;
                            }
                            x56 x56VarF4 = zpa.F();
                            ((ys0) new ck0(zpaVar2, x56VarF4).u.getValue()).b.p(6, 1, 1L);
                            x5fVar.U0(x56VarF4);
                            break;
                        }
                        break;
                    case 33:
                        df dfVar5 = efVar.a;
                        if (!dfVar5.equals(cfVar) && !dfVar5.equals(afVar)) {
                            if (!dfVar5.equals(bfVar)) {
                                h9o.p();
                                return null;
                            }
                            if (x5fVar2.h) {
                                x56 x56VarF5 = zpa.F();
                                am2.f(zpaVar3, x56VarF5).b.p(46, 1, 1L);
                                x5fVar2.U0(x56VarF5);
                                break;
                            }
                        }
                        break;
                    default:
                        h9o.p();
                        return null;
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                ((ch5) obj3).a((ih5) obj, aoh.m(1));
                return Unit.a;
            case 15:
                ih5 ih5Var = (ih5) obj3;
                c8e c8eVar = (c8e) obj;
                c8e c8eVarO = (a8e) obj2;
                if (c8eVarO instanceof gh5) {
                    cr9 cr9Var = ((gh5) c8eVarO).c;
                    y9m.t(3, cr9Var);
                    c8eVarO = qyn.O(ih5Var, (c8e) cr9Var.invoke(z7e.b, ih5Var, 0));
                }
                return c8eVar.d(c8eVarO);
            case 16:
                j1c j1cVar = (j1c) obj3;
                ((Integer) obj).getClass();
                if (obj2 instanceof eg5) {
                    eg5 eg5Var = (eg5) obj2;
                    tee teeVar = (tee) j1cVar.h;
                    if (teeVar == null) {
                        tee teeVar2 = jmi.a;
                        teeVar = new tee();
                        j1cVar.h = teeVar;
                    }
                    teeVar.k(eg5Var);
                    ((dfe) j1cVar.e).c(eg5Var);
                }
                if (obj2 instanceof zt9) {
                    j1cVar.f((zt9) obj2);
                }
                if (obj2 instanceof znh) {
                    ((znh) obj2).c();
                }
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                cs5.j((dil) obj3, (ih5) obj, aoh.m(1));
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((Integer) obj2).getClass();
                vt9 vt9Var9 = (ih5) obj;
                vt9Var9.W(666084174);
                String str2 = ((sfl) obj3).b;
                vt9Var9.p(false);
                return str2;
            case 19:
                e57 e57Var = (e57) obj3;
                vt9 vt9Var10 = (ih5) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vt9 vt9Var11 = vt9Var10;
                if (vt9Var11.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ijl.b(sko.k("Country (default=", e57Var.f.a, ")"), (c8e) null, 0L, 0L, (ki9) null, 0L, (bgl) null, (pel) null, 0L, 0, false, 0, 0, (ikl) null, vt9Var11, 0, 0, 262142);
                } else {
                    vt9Var11.Q();
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((Integer) obj2).getClass();
                ((v77) obj3).a((ih5) obj, aoh.m(1));
                return Unit.a;
            case 21:
                orb orbVarP = vep.p("domain", (String) obj);
                orbVarP.o(((od7) obj2).a, "expireTime");
                ((vpb) obj3).a(orbVarP);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                EditImage editImage = (EditImage) obj3;
                Canvas canvas = (Canvas) obj;
                kk7 kk7Var = editImage.f;
                kk7Var.b = (i97) obj2;
                fz2 fz2Var = editImage.o.c;
                xtb xtbVar = qk3.d[0];
                kk7Var.c = (Bitmap) fz2Var.b;
                ArrayList arrayList = editImage.d.d;
                int size = arrayList.size();
                boolean z = false;
                int i = 0;
                while (i < size) {
                    Object obj11 = arrayList.get(i);
                    i++;
                    fya fyaVar = (fya) obj11;
                    if (fyaVar instanceof f76) {
                        z = true;
                    }
                    fyaVar.b(canvas, kk7Var);
                    z = z;
                }
                if (z) {
                    canvas.save();
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj12 = arrayList.get(i2);
                        i2++;
                        fya fyaVar2 = (fya) obj12;
                        if (fyaVar2 instanceof f76) {
                            s9i s9iVar = ((f76) fyaVar2).g;
                            if (s9iVar == null) {
                                yt7.k("Cutouts support only path drawing");
                                return null;
                            }
                            canvas.clipPath(s9iVar.P(kk7Var.b.b), Region.Op.DIFFERENCE);
                        }
                    }
                    if (kk7Var.d) {
                        canvas.drawColor(ab5.l(-16777216, 204));
                    } else {
                        canvas.drawColor(0, PorterDuff.Mode.SRC);
                    }
                    canvas.restore();
                }
                return Unit.a;
            case 23:
                EmojiPickerView emojiPickerView = (EmojiPickerView) obj3;
                nz7 nz7Var = (nz7) obj2;
                ip1 ip1Var = emojiPickerView.k;
                if (ip1Var != null) {
                    ip1Var.accept(nz7Var);
                }
                f1p f1pVar = emojiPickerView.e;
                String str3 = nz7Var.a;
                ArrayList arrayList2 = (ArrayList) f1pVar.a;
                arrayList2.remove(str3);
                arrayList2.add(0, str3);
                ((SharedPreferences) f1pVar.b).edit().putString("pref_key_recent_emoji", CollectionsKt.P(arrayList2, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62)).commit();
                emojiPickerView.f = true;
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                c29 c29Var = (c29) obj3;
                vt9 vt9Var12 = (ih5) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vt9 vt9Var13 = vt9Var12;
                if (vt9Var13.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    d29 d29Var = (d29) dyg.h(c29Var.o0().f, vt9Var13).getValue();
                    boolean zH10 = vt9Var13.h(c29Var);
                    Object objK10 = vt9Var13.K();
                    Object obj13 = objK10;
                    if (zH10 || objK10 == zpaVar) {
                        qv7 qv7Var = new qv7(0, c29Var, c29.class, "close", "close()V", 0, (byte) 2);
                        vt9Var13.g0(qv7Var);
                        obj13 = qv7Var;
                    }
                    Function0 function011 = (mtb) obj13;
                    e29 e29VarO0 = c29Var.o0();
                    boolean zH11 = vt9Var13.h(e29VarO0);
                    Object objK11 = vt9Var13.K();
                    if (zH11 || objK11 == zpaVar) {
                        ci7 ci7Var = new ci7(1, e29VarO0, e29.class, "onAskBeforeDownloadingCheckChanged", "onAskBeforeDownloadingCheckChanged(Z)V", 0, (byte) 3);
                        vt9Var13.g0(ci7Var);
                        objK11 = ci7Var;
                    }
                    Function1 function13 = (mtb) objK11;
                    e29 e29VarO02 = c29Var.o0();
                    boolean zH12 = vt9Var13.h(e29VarO02);
                    Object objK12 = vt9Var13.K();
                    if (zH12 || objK12 == zpaVar) {
                        qv7 qv7Var2 = new qv7(0, e29VarO02, e29.class, "onConcurrentDownloadsClicked", "onConcurrentDownloadsClicked()V", 0, (byte) 3);
                        vt9Var13.g0(qv7Var2);
                        objK12 = qv7Var2;
                    }
                    Function0 function012 = (mtb) objK12;
                    e29 e29VarO03 = c29Var.o0();
                    boolean zH13 = vt9Var13.h(e29VarO03);
                    Object objK13 = vt9Var13.K();
                    if (zH13 || objK13 == zpaVar) {
                        qv7 qv7Var3 = new qv7(0, e29VarO03, e29.class, "onDownloadsFolderClicked", "onDownloadsFolderClicked()V", 0, (byte) 4);
                        vt9Var13.g0(qv7Var3);
                        objK13 = qv7Var3;
                    }
                    Function0 function013 = (mtb) objK13;
                    e29 e29VarO04 = c29Var.o0();
                    boolean zH14 = vt9Var13.h(e29VarO04);
                    Object objK14 = vt9Var13.K();
                    if (zH14 || objK14 == zpaVar) {
                        qv7 qv7Var4 = new qv7(0, e29VarO04, e29.class, "onOfflinePagesFolderClicked", "onOfflinePagesFolderClicked()V", 0, (byte) 5);
                        vt9Var13.g0(qv7Var4);
                        objK14 = qv7Var4;
                    }
                    Function0 function014 = (mtb) objK14;
                    e29 e29VarO05 = c29Var.o0();
                    boolean zH15 = vt9Var13.h(e29VarO05);
                    Object objK15 = vt9Var13.K();
                    if (zH15 || objK15 == zpaVar) {
                        qv7 qv7Var5 = new qv7(0, e29VarO05, e29.class, "onSearchClick", "onSearchClick()V", 0, (byte) 6);
                        vt9Var13.g0(qv7Var5);
                        objK15 = qv7Var5;
                    }
                    z5i.f(d29Var, function011, function13, function012, function013, function014, (mtb) objK15, (c8e) null, vt9Var13, 8);
                } else {
                    vt9Var13.Q();
                }
                return Unit.a;
            case 25:
                i07 i07Var = (i07) obj3;
                Throwable th = (Throwable) obj2;
                if (th != null) {
                    cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
                    if (cancellationExceptionA == null) {
                        cancellationExceptionA = na2.a("CompletableFuture was completed exceptionally", th);
                    }
                }
                i07Var.k(cancellationExceptionA);
                return Unit.a;
            case 26:
                vt9 vt9Var14 = (ih5) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                vt9 vt9Var15 = vt9Var14;
                if (vt9Var15.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    throw null;
                }
                vt9Var15.Q();
                return Unit.a;
            case 27:
                caa caaVar2 = (caa) obj3;
                vt9 vt9Var16 = (ih5) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                vt9 vt9Var17 = vt9Var16;
                if (vt9Var17.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    daa daaVar = (daa) dyg.h(caaVar2.o0().d, vt9Var17).getValue();
                    boolean zH16 = vt9Var17.h(caaVar2);
                    Object objK16 = vt9Var17.K();
                    if (zH16 || objK16 == zpaVar) {
                        caaVar = caaVar2;
                        qv7 qv7Var6 = new qv7(0, caaVar, caa.class, "close", "close()V", 0, (byte) 9);
                        vt9Var17.g0(qv7Var6);
                        objK16 = qv7Var6;
                    } else {
                        caaVar = caaVar2;
                    }
                    Function0 function015 = (mtb) objK16;
                    eaa eaaVarO0 = caaVar.o0();
                    boolean zH17 = vt9Var17.h(eaaVarO0);
                    Object objK17 = vt9Var17.K();
                    if (zH17 || objK17 == zpaVar) {
                        qv7 qv7Var7 = new qv7(0, eaaVarO0, eaa.class, "onSearchClick", "onSearchClick()V", 0, (byte) 10);
                        vt9Var17.g0(qv7Var7);
                        objK17 = qv7Var7;
                    }
                    Function0 function016 = (mtb) objK17;
                    eaa eaaVarO02 = caaVar.o0();
                    boolean zH18 = vt9Var17.h(eaaVarO02);
                    Object objK18 = vt9Var17.K();
                    if (zH18 || objK18 == zpaVar) {
                        qv7 qv7Var8 = new qv7(0, eaaVarO02, eaa.class, "onFaqClicked", "onFaqClicked()V", 0, (byte) 11);
                        vt9Var17.g0(qv7Var8);
                        objK18 = qv7Var8;
                    }
                    Function0 function017 = (mtb) objK18;
                    eaa eaaVarO03 = caaVar.o0();
                    boolean zH19 = vt9Var17.h(eaaVarO03);
                    Object objK19 = vt9Var17.K();
                    if (zH19 || objK19 == zpaVar) {
                        qv7 qv7Var9 = new qv7(0, eaaVarO03, eaa.class, "onReportAProblemClicked", "onReportAProblemClicked()V", 0, (byte) 12);
                        vt9Var17.g0(qv7Var9);
                        objK19 = qv7Var9;
                    }
                    Function0 function018 = (mtb) objK19;
                    eaa eaaVarO04 = caaVar.o0();
                    boolean zH20 = vt9Var17.h(eaaVarO04);
                    Object objK20 = vt9Var17.K();
                    if (zH20 || objK20 == zpaVar) {
                        qv7 qv7Var10 = new qv7(0, eaaVarO04, eaa.class, "onOperaForumsClicked", "onOperaForumsClicked()V", 0, (byte) 13);
                        vt9Var17.g0(qv7Var10);
                        objK20 = qv7Var10;
                    }
                    Function0 function019 = (mtb) objK20;
                    eaa eaaVarO05 = caaVar.o0();
                    boolean zH21 = vt9Var17.h(eaaVarO05);
                    Object objK21 = vt9Var17.K();
                    if (zH21 || objK21 == zpaVar) {
                        ci7 ci7Var2 = new ci7(1, eaaVarO05, eaa.class, "onOperaSocialMediaClicked", "onOperaSocialMediaClicked(Lcom/opera/android/settings/help_feedback/OperaSocialMedia;)V", 0, (byte) 7);
                        vt9Var17.g0(ci7Var2);
                        objK21 = ci7Var2;
                    }
                    ipe.a(daaVar, function015, function016, function017, function018, function019, (mtb) objK21, (c8e) null, vt9Var17, 8);
                } else {
                    vt9Var17.Q();
                }
                return Unit.a;
            case 28:
                zca zcaVar = (zca) obj3;
                vt9 vt9Var18 = (ih5) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                vt9 vt9Var19 = vt9Var18;
                if (vt9Var19.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    int iOrdinal2 = zcaVar.ordinal();
                    if (iOrdinal2 == 0) {
                        shkVar = (shk) ahk.n0.getValue();
                    } else if (iOrdinal2 == 1) {
                        shkVar = (shk) ahk.p0.getValue();
                    } else {
                        if (iOrdinal2 != 2) {
                            h9o.p();
                            return null;
                        }
                        shkVar = (shk) ahk.q0.getValue();
                    }
                    ijl.b(uyg.q(shkVar, vt9Var19), (c8e) null, 0L, 0L, (ki9) null, 0L, (bgl) null, (pel) null, 0L, 0, false, 0, 0, (ikl) null, vt9Var19, 0, 0, 262142);
                } else {
                    vt9Var19.Q();
                }
                return Unit.a;
            default:
                mqa mqaVar = (mqa) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                mqaVar.getClass();
                return Long.valueOf(Math.max(((Number) ((nf8) obj3).invoke(mqaVar, num)).longValue(), 0L));
        }
    }
}
