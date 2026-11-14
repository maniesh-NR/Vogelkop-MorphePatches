package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ldh extends nr9 implements Function1 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ldh(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    public final Object invoke(Object obj) {
        String str;
        Object value;
        fum fumVar;
        int i = 0;
        switch (this.a) {
            case 0:
                mdh mdhVar = (mdh) ((z84) this).receiver;
                mdhVar.h.r((List) obj);
                mdhVar.c.e();
                break;
            case 1:
                t9f t9fVar = (t9f) ((qdh) ((z84) this).receiver).a.get();
                fvh fvhVar = new fvh();
                fvhVar.c();
                fvhVar.h((String) obj);
                break;
            case 2:
                ((OperaMaterialButton) ((z84) this).receiver).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 3:
                ((ojh) ((z84) this).receiver).d = (sx8) obj;
                break;
            case 4:
                ((ojh) ((z84) this).receiver).d = (sx8) obj;
                break;
            case 5:
                ((MaterialButton) ((z84) this).receiver).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 6:
                ((x1) ((z84) this).receiver).getClass();
                l2.a.getClass();
                break;
            case 7:
                qpb qpbVar = (qpb) ((z84) this).receiver;
                break;
            case 8:
                ((zqj) ((z84) this).receiver).getClass();
                l2.a.getClass();
                k2 k2Var = f2.b;
                List list = (List) new j2(e82.B(new l2[]{k2Var, k2Var})).b(k1g.N((String) obj)).a;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String str2 = (String) obj;
                h3i h3iVar = (t2i) ((z84) this).receiver;
                h3iVar.getClass();
                gpm gpmVarH = bwg.H(str2);
                if ((gpmVarH != null ? (t0i) h3iVar.c.a.invoke(gpmVarH, cc.c) : null) == null || !(!(r0.a instanceof q0i))) {
                    nak nakVar = h3iVar.l;
                    dum dumVar = new dum(new udk((shk) ahk.d0.getValue(), Collections.singletonList(str2)), (Throwable) null);
                    nakVar.getClass();
                    nakVar.k((Object) null, dumVar);
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                c2i c2iVar = (c2i) obj;
                h3i h3iVar2 = (t2i) ((z84) this).receiver;
                h3iVar2.d.t(new ua8(h3i.l(c2iVar), xd8.c));
                if (h3iVar2.i.getValue() == null) {
                    if (c2iVar.i == c2h.g) {
                        gz5 gz5Var = c2iVar.h;
                        if (gz5Var != null && (str = c2iVar.b) != null && h3iVar2.h.getValue() == null) {
                            na2.B(o0g.Q(h3iVar2), (CoroutineContext) null, (rx5) null, new k54(h3iVar2, c2iVar, str, gz5Var, (mt5) null, (byte) 6), 3);
                        }
                    } else {
                        ec ecVar = c2iVar.f;
                        if (ecVar != null) {
                            na2.B(o0g.Q(h3iVar2), (CoroutineContext) null, (rx5) null, new hz1(h3iVar2, c2iVar, ecVar, (mt5) null, (byte) 26), 3);
                        }
                    }
                }
                break;
            case 11:
                c2i c2iVar2 = (c2i) obj;
                h3i h3iVar3 = (t2i) ((z84) this).receiver;
                if (h3iVar3.j.add(c2iVar2.j)) {
                    h3iVar3.d.t(new cb8(h3i.l(c2iVar2)));
                }
                break;
            case 12:
                fum fumVar2 = (fum) obj;
                nak nakVar2 = ((t2i) ((z84) this).receiver).l;
                do {
                    value = nakVar2.getValue();
                    fumVar = (fum) value;
                    if (Intrinsics.a(fumVar, fumVar2)) {
                        fumVar = null;
                    }
                } while (!nakVar2.h(value, fumVar));
            case 13:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_trending_searches");
                break;
            case 14:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_product_suggestion");
                break;
            case 15:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_frequently_visited_sites");
                break;
            case 16:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_recent_searches");
                break;
            case 17:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggestion_provider_ai_recent_activity");
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggestion_provider_clipboard");
                break;
            case 19:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggestion_provider_history");
                break;
            case SizeUtil.textSize0 /* 20 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SettingsManager settingsManager = ((qsi) ((z84) this).receiver).c;
                settingsManager.V(zBooleanValue ? 1 : 0, "enable_suggestion_provider_bookmarks");
                settingsManager.V(zBooleanValue ? 1 : 0, "enable_suggestion_provider_speeddials");
                break;
            case 21:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "autocomplete_omnibar");
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_google_ai_mode");
                break;
            case 23:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggestion_provider_recommendations");
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggestion_provider_ai_prompts");
                break;
            case 25:
                ((qsi) ((z84) this).receiver).c.V(((Boolean) obj).booleanValue() ? 1 : 0, "enable_suggested_speed_dials");
                break;
            case 26:
                wcj wcjVar = (wcj) obj;
                vcj vcjVar = (vcj) ((z84) this).receiver;
                wcjVar.a(vcjVar.b.getContext());
                ((cq) vcjVar.f.b).b = wcjVar.getId();
                vcjVar.b();
                break;
            case 27:
                break;
            case 28:
                Drawable drawable = (Drawable) obj;
                w0k w0kVar = (w0k) ((z84) this).receiver;
                w0kVar.h = true;
                w0kVar.g = drawable;
                ArrayList arrayList = w0kVar.i;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Callback) obj2).run(drawable);
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                m59 m59Var = ((slk) ((z84) this).receiver).a;
                long j = zBooleanValue2 ? 14400000L : 3600000L;
                if (j != m59Var.b) {
                    m59Var.b = (int) j;
                    oml omlVar = (oml) m59Var.e;
                    if (omlVar != null) {
                        omlVar.cancel(false);
                        m59Var.e = null;
                    }
                    m59Var.i();
                }
                break;
        }
        return Unit.a;
    }
}
