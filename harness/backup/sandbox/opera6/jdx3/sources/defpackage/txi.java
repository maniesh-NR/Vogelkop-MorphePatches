package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.favorites.SpeedDialDataFetcher;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class txi implements ouh, n5o, dog, h93, bcf, dcj, v0k, fv4, dkj, fkj, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ txi(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.dkj
    public final void a() {
        nv6 nv6VarB = ((hlk) this.b).j.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn_pro.kill_switch.on", true);
        nv6VarB.w();
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case SizeUtil.textSize1 /* 22 */:
                qnk qnkVar = (qnk) obj2;
                a46 a46Var = (a46) obj;
                pnk pnkVar = new pnk(a46Var.b, ir5.c(a46Var.a, a46Var.c));
                qnkVar.c.add(pnkVar);
                long j = qnkVar.j;
                if (j == -9223372036854775807L || a46Var.d >= j) {
                    qnkVar.e(pnkVar);
                    break;
                }
                break;
            default:
                ((z0b) obj2).c((a46) obj);
                break;
        }
    }

    @Override // defpackage.dcj
    public final void b(jjm jjmVar, String str) {
        juj jujVar = (juj) this.b;
        if (str == null) {
            return;
        }
        jujVar.r.add(str);
    }

    public final void c() {
        CheckableImageButton checkableImageButton = ((r3k) this.b).d;
        ic4.Q(checkableImageButton, checkableImageButton.getContentDescription());
    }

    public final void d() {
        Function2 function2 = (Function2) this.b;
        synchronized (ytj.c) {
            ytj.h = CollectionsKt.T(ytj.h, function2);
        }
    }

    @Override // defpackage.fkj
    public final void e(gkj gkjVar, hjm hjmVar) {
        ghf ghfVar = (ghf) this.b;
        if (gkjVar == ((gkj) ghfVar.d)) {
            ghfVar.d = null;
        }
        if (hjmVar == hjm.a) {
            h42 h42Var = (h42) ((plk) ghfVar.b).d;
            llk llkVar = (llk) h42Var.g();
            if (llkVar == null) {
                llkVar = new llk(new mlk(false, false), false, false);
            }
            h42Var.r(new llk(llkVar.a, llkVar.b, false));
        }
    }

    public final Iterator f(vr3 vr3Var, CharSequence charSequence) {
        return new s0k(vr3Var, charSequence, (st4) this.b, (byte) 0);
    }

    public final Object g(Object obj) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        byte b = this.a;
        int i = 0;
        Object obj2 = this.b;
        BufferedOutputStream bufferedOutputStream2 = null;
        switch (b) {
            case 2:
                zzh zzhVar = (zzh) obj2;
                List list = (List) obj;
                if (list == null) {
                    list = Collections.EMPTY_LIST;
                }
                zzhVar.run(list);
                return null;
            case 3:
                eof eofVar = (eof) obj2;
                List list2 = (List) obj;
                if (list2 == null) {
                    list2 = Collections.EMPTY_LIST;
                }
                eofVar.run(list2);
                return null;
            case 4:
            case 6:
            case 7:
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            default:
                cnk cnkVar = (cnk) obj2;
                vpb vpbVar = (vpb) obj;
                cnkVar.getClass();
                Context context = cnkVar.a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("language", orb.t(scd.w(Locale.getDefault())));
                    try {
                        jSONObject.put("date", System.currentTimeMillis());
                        try {
                            jSONObject.put("version_code", 1910404306);
                            try {
                                jSONObject.put("countries", orb.t(vpbVar));
                                nv6 nv6VarB = ru9.c(context).b();
                                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.subscription_locations_outdated", false);
                                nv6VarB.w();
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "vpn_locs")));
                                    try {
                                        try {
                                            bufferedOutputStream.write(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
                                            bufferedOutputStream.close();
                                        } catch (IOException unused) {
                                            new File(context.getFilesDir(), "vpn_locs").delete();
                                            xvg.l(bufferedOutputStream);
                                            return null;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedOutputStream2 = bufferedOutputStream;
                                        xvg.l(bufferedOutputStream2);
                                        throw th;
                                    }
                                } catch (IOException unused2) {
                                    bufferedOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xvg.l(bufferedOutputStream2);
                                    throw th;
                                }
                            } catch (JSONException e) {
                                t3p.n(e);
                            }
                        } catch (JSONException e2) {
                            t3p.n(e2);
                        }
                    } catch (JSONException e3) {
                        t3p.n(e3);
                    }
                } catch (JSONException e4) {
                    t3p.n(e4);
                }
                return null;
            case 5:
                vnj vnjVar = (vnj) obj2;
                fnj fnjVar = (fnj) obj;
                vnjVar.g = fnjVar;
                ArrayList arrayList = new ArrayList();
                o95.v(vnjVar.e, new tmi(fnjVar, vnjVar, arrayList, (byte) 4));
                vnjVar.a();
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj3;
                    ((Function1) pair.a).invoke((ifd) pair.b);
                }
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                kuj kujVar = (kuj) obj2;
                Long l = (Long) obj;
                if (l != null) {
                    kujVar.C.c = l.longValue();
                    kujVar.W();
                    kujVar.Z();
                }
                return null;
            case 11:
                uyj uyjVar = (uyj) obj2;
                Pair pair2 = (Pair) obj;
                tyj tyjVar = (tyj) pair2.a;
                boolean zBooleanValue = ((Boolean) pair2.b).booleanValue();
                TextToSpeech textToSpeech = uyjVar.d;
                String str = tyjVar.c;
                int i2 = !zBooleanValue ? 1 : 0;
                float f = uyjVar.j;
                Bundle bundle = new Bundle();
                bundle.putFloat("volume", f);
                if (textToSpeech.speak(str, i2, bundle, tyjVar.b) != 0) {
                    uyjVar.b.n(new vyj(ryj.d));
                }
                return Unit.a;
            case 12:
                ((SpeedDialDataFetcher) obj2).b.run((Bitmap) obj);
                return null;
        }
    }

    public final void h(long j, g1g g1gVar) {
        rm5.m(j, g1gVar, (hyl[]) ((ghf) this.b).c);
    }

    public final View i() {
        SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) this.b;
        boolean z = SelectionPopupControllerImpl.R;
        Boolean bool = selectionPopupControllerImpl.Q;
        if (bool != null ? bool.booleanValue() : false) {
            return null;
        }
        return selectionPopupControllerImpl.l;
    }

    public final void j() {
        wjh wjhVar = ((hqk) this.b).k;
        ((j1k) wjhVar.e).invoke();
        ((gjm) wjhVar.b).c(new hsi(new oba(3, 0, null)), (fe5) wjhVar.c, new cl4(new wg5(wjhVar, (byte) 9), (byte) 6));
    }

    public final g3o l0(View view, g3o g3oVar) {
        byte b = this.a;
        char c = 1;
        Object obj = this.b;
        switch (b) {
            case 7:
                fsj fsjVar = (fsj) obj;
                fsjVar.b.postOnAnimation(new csj(fsjVar, c == true ? 1 : 0));
                break;
            default:
                c1f c1fVar = (c1f) obj;
                ((ode) c1fVar.g).r(g3oVar);
                r9b r9bVarI = g3oVar.a.i(16);
                c1fVar.b = r9bVarI.a == 0 && r9bVarI.c == 0;
                view.onApplyWindowInsets(g3oVar.f());
                break;
        }
        return g3oVar;
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        d7h d7hVar = (d7h) ((shf) this.b).b;
        int itemId = menuItem.getItemId();
        if (itemId == 2131363167) {
            nak nakVar = (nak) d7hVar.b;
            s5h s5hVar = (s5h) nakVar.getValue();
            nil nilVar = nil.b;
            nakVar.k((Object) null, s5h.a(s5hVar, null, false, 0, 7));
            return true;
        }
        if (itemId != 2131363168) {
            return true;
        }
        nak nakVar2 = (nak) d7hVar.b;
        s5h s5hVar2 = (s5h) nakVar2.getValue();
        nil nilVar2 = nil.c;
        n8g n8gVar = n8g.f;
        n8g n8gVar2 = n8g.e;
        s5hVar2.getClass();
        nakVar2.k((Object) null, new s5h(n8gVar2, false, 1, nilVar2, true, n8gVar));
        return true;
    }

    @Override // defpackage.h93
    public final void s() {
        BrowserActivity browserActivityO = q9n.o(((ooj) this.b).requireContext());
        d8j d8jVar = browserActivityO != null ? (d8j) browserActivityO.g0.E(d8j.class) : null;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }
}
