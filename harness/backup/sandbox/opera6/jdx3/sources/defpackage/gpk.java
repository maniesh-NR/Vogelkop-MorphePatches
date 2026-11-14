package defpackage;

import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.input.TextSuggestionPopupController;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class gpk implements urg, rpk, p9n, jtl, n5o, xjj, yjj, hh4, ktn, zkn, ekj {
    public final /* synthetic */ byte a;

    public /* synthetic */ gpk(byte b) {
        this.a = b;
    }

    public /* synthetic */ gpk(Object obj, byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ TopicsManager f(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return TopicsManager.class;
    }

    @Override // defpackage.rpk
    public final ook a(double d, int i, Object obj) {
        switch (this.a) {
            case 1:
                jzj jzjVar = (jzj) obj;
                String str = jzjVar.b;
                String str2 = jzjVar.a;
                return new ook("", str, str2, str2, 8, 8, i, jzjVar.d, str2);
            default:
                n8f n8fVar = (n8f) obj;
                String string = Long.toString(n8fVar.a);
                String str3 = n8fVar.d;
                String str4 = n8fVar.b;
                return new ook(string, str3, str4, n8fVar.c, 3, 3, i, n8fVar.e, str4);
        }
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        switch (this.a) {
            case 12:
                int i = q08.b;
                View viewN = j7c.n(viewGroup, 2131559413, viewGroup, false);
                OperaTextView operaTextViewJ = w1h.j(2131363897, viewN);
                if (operaTextViewJ == null) {
                    t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(2131363897)));
                    break;
                } else {
                    LinearLayout linearLayout = (LinearLayout) viewN;
                    operaTextViewJ.setText(linearLayout.getResources().getString(2132021824, linearLayout.getResources().getString(2132017591)));
                    break;
                }
            default:
                View viewN2 = j7c.n(viewGroup, 2131559414, viewGroup, false);
                if (viewN2 == null) {
                    t3p.q("rootView");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.hh4
    public final void cancel() {
    }

    @Override // defpackage.zkn
    public final lkn d(Context context, xkn xknVar, o2c o2cVar, Bitmap bitmap, int i, y1n y1nVar) {
        return new hll(context, xknVar, o2cVar, bitmap, i, y1nVar);
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new TextSuggestionPopupController(webContentsImpl);
    }

    public final Object g(Object obj) {
        smj[] smjVarArrM;
        HashSet hashSet;
        jag jagVar;
        Boolean boolB;
        switch (this.a) {
            case 7:
                try {
                    n9h n9hVar = rmj.a;
                    synchronized (n9hVar.c) {
                        smjVarArrM = n9hVar.m();
                    }
                    int iA = qbd.a(smjVarArrM.length);
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (smj smjVar : smjVarArrM) {
                        linkedHashMap.put(BrowserUtils.a(smjVar.b), smjVar.c ? kag.GRANTED : kag.DENIED);
                    }
                    return linkedHashMap;
                } catch (Exception e) {
                    ks3.D(e);
                    return n08.a;
                }
            default:
                Map map = (Map) obj;
                s9g s9gVar = s9g.h;
                lag lagVar = lag.b;
                vzk vzkVar = s9gVar.c;
                synchronized (vzkVar.a) {
                    hashSet = new HashSet();
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (!str.isEmpty() && (jagVar = (jag) ((HashMap) vzkVar.b).get(str)) != null && (boolB = jagVar.b(lagVar)) != null && boolB.booleanValue() && vzkVar.f0(str, lagVar, (kag) entry.getValue(), true)) {
                            hashSet.add(str);
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    s9gVar.n();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new loj((String) it.next(), lagVar));
                    }
                    s9gVar.l(arrayList);
                }
                return Unit.a;
        }
    }

    @Override // defpackage.p9n
    public final void h(View view) {
        view.animate().cancel();
        view.clearAnimation();
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        int i;
        switch (this.a) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((mwj) ((i) ((nwj) iVar)).itemView).b = ((r2l) obj).a;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                u2l u2lVar = (u2l) obj;
                h5l h5lVar = (h5l) iVar;
                h5lVar.h = u2lVar;
                h5lVar.g = ((d7l) u2lVar.a).j.a().d;
                h5lVar.e0();
                break;
            case 11:
                l2l l2lVar = (l2l) obj;
                kj8 kj8Var = (kj8) iVar;
                kj8Var.c = l2lVar;
                d5a d5aVar = kj8Var.d;
                if (d5aVar != null && (i = l2lVar.b) != d5aVar.a) {
                    d5aVar.a = i;
                    d5aVar.b();
                    break;
                }
                break;
            case 12:
            case 15:
            default:
                b38 b38Var = (b38) iVar;
                b38Var.getClass();
                b38Var.c = ((j2l) obj).a;
                break;
            case 13:
                g2l g2lVar = (g2l) obj;
                h85 h85Var = (h85) iVar;
                ne5 ne5Var = h85Var.j;
                if (ne5Var != null) {
                    List list = g2lVar.a;
                    if (!Intrinsics.a((List) ne5Var.d, list)) {
                        ne5Var.d = list;
                        ne5Var.n(((cyj) ((tsd) ne5Var.g).g()).h);
                    }
                }
                h85Var.i = g2lVar;
                h85Var.a0();
                h85Var.b.a.setSelected(h85Var.h.X(h85Var.i.a));
                h85Var.b0();
                break;
            case 14:
                o2l o2lVar = x2l.r;
                break;
            case 16:
                o2l o2lVar2 = x2l.r;
                break;
            case 17:
                c38 c38Var = (c38) iVar;
                c38Var.getClass();
                c38Var.b = ((k2l) obj).a;
                break;
        }
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2131362144;
        byte b = 0;
        switch (this.a) {
            case 4:
                ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131559535, viewGroup, false);
                viewGroup.addView(constraintLayoutInflate);
                if (((OperaIconedMessage) w1h.j(2131362005, constraintLayoutInflate)) == null) {
                    i = 2131362005;
                } else if (((StylingTextView) w1h.j(2131362144, constraintLayoutInflate)) != null) {
                    i = 2131362395;
                    OperaMaterialButton operaMaterialButton = (OperaMaterialButton) w1h.j(2131362395, constraintLayoutInflate);
                    if (operaMaterialButton != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131363224;
                        if (((StylingTextView) w1h.j(2131363224, constraintLayoutInflate)) != null) {
                            i = 2131365060;
                            FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) w1h.j(2131365060, constraintLayoutInflate);
                            if (fadingRecyclerView != null) {
                                break;
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                break;
            case 5:
                xtb[] xtbVarArr = xrk.t;
                ConstraintLayout constraintLayoutInflate2 = layoutInflater.inflate(2131559537, viewGroup, false);
                viewGroup.addView(constraintLayoutInflate2);
                if (((StylingTextView) w1h.j(2131362144, constraintLayoutInflate2)) != null) {
                    ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                    i = 2131363183;
                    if (((StylingImageView) w1h.j(2131363183, constraintLayoutInflate2)) != null) {
                        i = 2131364082;
                        OperaMaterialButton operaMaterialButton2 = (OperaMaterialButton) w1h.j(2131364082, constraintLayoutInflate2);
                        if (operaMaterialButton2 != null) {
                            i = 2131363525;
                            if (((StylingTextView) w1h.j(2131363525, constraintLayoutInflate2)) != null) {
                                break;
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                break;
            default:
                xtb[] xtbVarArr2 = uxk.w;
                View viewInflate = layoutInflater.inflate(2131558905, viewGroup, false);
                viewGroup.addView(viewInflate);
                int i2 = 2131362697;
                OperaListItem operaListItem = (OperaListItem) w1h.j(2131362697, viewInflate);
                if (operaListItem != null) {
                    i2 = 2131363642;
                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131363642, viewInflate);
                    if (operaListItem2 != null) {
                        i2 = 2131363791;
                        LinearLayout linearLayout = (LinearLayout) w1h.j(2131363791, viewInflate);
                        if (linearLayout != null) {
                            i2 = 2131364631;
                            View viewJ = w1h.j(2131364631, viewInflate);
                            if (viewJ != null) {
                                lwk lwkVar = new lwk((OperaIconedMessage) viewJ, b);
                                i2 = 2131364634;
                                MaterialButton materialButtonJ = w1h.j(2131364634, viewInflate);
                                if (materialButtonJ != null) {
                                    i2 = 2131364637;
                                    View viewJ2 = w1h.j(2131364637, viewInflate);
                                    if (viewJ2 != null) {
                                        lwk lwkVarA = lwk.a(viewJ2);
                                        i2 = 2131364640;
                                        OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131364640, viewInflate);
                                        if (operaListItem3 != null) {
                                            i2 = 2131364641;
                                            if (((SeparatorView) w1h.j(2131364641, viewInflate)) != null) {
                                                i2 = 2131364642;
                                                if (((SeparatorView) w1h.j(2131364642, viewInflate)) != null) {
                                                    i2 = 2131364996;
                                                    View viewJ3 = w1h.j(2131364996, viewInflate);
                                                    if (viewJ3 != null) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                break;
        }
        return null;
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        return true;
    }
}
